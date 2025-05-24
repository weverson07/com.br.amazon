# Selenium Java CI Project

Este projeto executa testes automatizados com Selenium WebDriver e JUnit em um pipeline GitHub Actions com relatórios HTML e XML.

## 📋 Funcionalidade testada

- Campo de busca com sugestões (autocomplete) no site da Casas Bahia

## 🚀 Tecnologias

- Java 17
- Selenium WebDriver
- JUnit 5
- Maven
- GitHub Actions

## ▶️ Executando os testes

```bash
mvn clean test site
```

## 📊 Relatórios

Relatórios são gerados automaticamente em:

- `target/surefire-reports/` (JUnit XML)
- `target/site/` (HTML com detalhes dos testes)

## 🛠️ CI com GitHub Actions

Veja o workflow em `.github/workflows/test.yml`