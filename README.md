# 🔍 Teste Automatizado - Autocomplete Amazon

Este projeto contém um teste automatizado com Selenium WebDriver e JUnit 5 que valida o funcionamento do campo de **autocomplete da Amazon Brasil**.

---

## 🧪 Funcionalidade testada

- Sugestões automáticas após digitação no campo de busca.

---

## 🚀 Tecnologias

- Java 11+
- Selenium WebDriver
- JUnit 5
- ChromeDriver

---

## 🛠️ Instalação


1. Adicione o `chromedriver` ao seu `PATH` ou use o WebDriverManager.

2. Execute o teste com Maven ou diretamente pela IDE:

```bash
mvn test

🧾 Estrutura do projeto:
src/
├── pages/
│   └── HomePage.java
└── testCases/
    └── AutocompletePage.java

📈 Resultado Esperado
O teste deve abrir o site da Amazon, digitar "livro" e validar que sugestões de pesquisa são exibidas corretamente....


