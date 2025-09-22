
# ☕  API de Taxa de Administração - Java (Spring Boot)


## 📖 Sobre o Projeto
Este projeto foi desenvolvido como solução para o Desafio Desenvolvedor BackEnd Júnior, que consiste em calcular o valor da taxa de administração de cada cotista em um fundo de investimento em Java

## ▶️ Como rodar localmente
1.Clone o repositório:
git clone https://github.com/NicolasGCADS/SpartaBackEndJava

```bash

Rode no Intellj
Apenas inicializar e http://localhost:8080/swagger-ui/index.html#/

Rodou em outro lugar 
mvn spring-boot:run
http://localhost:8080/swagger-ui/index.html#/

```

## Exemplos em Json para testar a Aplicação (Copie e cole dessa forma abaixo)
```bash
1.
{
  "taxa": 0.01,
  "cotas": [
    {
      "valor": 95.50,
      "quantidades": [50.0, 30.0]
    },
    {
      "valor": 96.25,
      "quantidades": [50.0, 30.0]
    }
  ]
}

2.
{
  "taxa": 0.015,
  "cotas": [
    {
      "valor": 100.00,
      "quantidades": [20.0, 40.0]
    },
    {
      "valor": 101.50,
      "quantidades": [25.0, 35.0]
    }
  ]
}


3.
{
  "taxa": 0.008,
  "cotas": [
    {
      "valor": 80.75,
      "quantidades": [10.0, 50.0]
    },
    {
      "valor": 82.00,
      "quantidades": [15.0, 45.0]
    }
  ]
}
```


## Principais Decisões
1. Escolhi Java pois é uma linguagem muito versátil, segura, confiável e que eu possuo conhecimento 
2. Utilizei SpringBoot pois é um framework que me facilita fazer aplicações
3. Utilizei Swagger por conta de conhecer a plataforma 



