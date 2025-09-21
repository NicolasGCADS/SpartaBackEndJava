package br.com.sparta.controller;

import br.com.sparta.model.CotaDia;
import br.com.sparta.model.Entrada;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaxaController {

    private List<Double> ultimoResultado = new ArrayList<>();


    @PostMapping("/calcular_taxa")
    public List<Double> calcularTaxa(@RequestBody Entrada dados) {
        ultimoResultado = calcular(dados);
        return ultimoResultado;
    }


    @GetMapping("/resultado")
    public Object getResultado() {
        if (ultimoResultado.isEmpty()) {
            return new Mensagem("Nenhum cálculo foi realizado ainda.");
        }
        return ultimoResultado;
    }


    @PutMapping("/resultado")
    public List<Double> atualizarResultado(@RequestBody Entrada dados) {
        ultimoResultado = calcular(dados);
        return ultimoResultado;
    }


    @DeleteMapping("/resultado")
    public Mensagem deleteResultado() {
        ultimoResultado.clear();
        return new Mensagem("Resultado zerado com sucesso.");
    }


    private List<Double> calcular(Entrada dados) {
        double t = dados.getTaxa();
        List<CotaDia> cotas = dados.getCotas();
        int N = cotas.size();
        int M = cotas.get(0).getQuantidades().size();

        List<Double> taxas = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            taxas.add(0.0);
        }

        for (int i = 0; i < N; i++) {
            double vi = cotas.get(i).getValor();
            for (int j = 0; j < M; j++) {
                double cij = cotas.get(i).getQuantidades().get(j);
                double valor = taxas.get(j) + (cij * vi * t) / 252.0;
                taxas.set(j, valor);
            }
        }
        return taxas;
    }


    static class Mensagem {
        private String mensagem;

        public Mensagem(String mensagem) {
            this.mensagem = mensagem;
        }

        public String getMensagem() {
            return mensagem;
        }

        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }
    }
}
