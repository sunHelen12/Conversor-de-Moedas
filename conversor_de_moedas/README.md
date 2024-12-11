# Conversor de Moedas

Este é um projeto desenvolvido como parte do desafio da **ONE (Oracle Next Education)** em parceria com a **Alura**. O objetivo do projeto é criar um sistema que permita a conversão de valores em reais (BRL) para diferentes moedas, utilizando conceitos de **Java** e **Programação Orientada a Objetos (POO)**.

---

## ✅ Funcionalidades

### Conversão de Moedas

- O projeto permite converter valores de **Real (BRL)** para as seguintes moedas:
  - Peso Argentino (ARS)
  - Boliviano (BOB)
  - Peso Chileno (CLP)
  - Peso Colombiano (COP)
  - Dólar Americano (USD)

### Histórico de Conversões

- O sistema armazena e exibe o histórico de todas as conversões realizadas durante a execução do programa.

### Registro de Logs

- Cada conversão realizada é registrada em logs, contendo informações como:
  - Valor em BRL convertido
  - Valor na moeda de destino
  - Moeda de origem e destino
  - Data e hora da operação

### Interação Simples

- Um menu interativo no terminal permite ao usuário selecionar a moeda desejada e inserir o valor a ser convertido de maneira intuitiva.

---

## 🌍 Importância do Projeto

### Aprendizado em Java

Este projeto é essencial para consolidar conhecimentos em **Java** e **POO**, abordando temas como:

- Consumo de APIs externas para obter dados dinâmicos (taxas de câmbio).
- Criação de classes e métodos para organização do código.
- Manipulação de dados utilizando bibliotecas como **Gson**.

### Relevância Prática

O conversor de moedas é uma ferramenta útil no dia a dia para:

- Planejamento financeiro e orçamento em viagens internacionais.
- Conversão de valores para transações comerciais em diferentes moedas.
- Estudo do impacto das taxas de câmbio no mercado.

---

## 🚀 Como Executar o Projeto

### Requisitos

- **Java 17** ou superior.
- **Maven** para gerenciamento de dependências.
- Acesso à Internet para consumir a API de câmbio.

### Passos para Execução

1. Clone o repositório:

   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd conversor_de_moedas
   ```

2. Instale as dependências do projeto usando Maven:

   ```bash
   mvn clean install
   ```

3. Execute o programa:

   ```bash
   java -cp target/conversor-moedas-1.0-SNAPSHOT.jar code.helen.java.aplicacao.AplicacaoConversaoMoeda
   ```

---

## ⚡ Tecnologias Utilizadas

### Linguagem de Programação

- **Java 17**

### Frameworks e Bibliotecas

- **Maven** para gerenciamento de dependências.
- **Gson** para manipulação de dados JSON da API de câmbio.

### APIs Externas

- Uma API de câmbio foi utilizada para buscar as taxas de conversão em tempo real.

---

## 🌟 Destaques do Projeto

- **Organização do Código:** O projeto foi desenvolvido seguindo boas práticas de POO, como encapsulamento e separação de responsabilidades.
- **Interação Dinâmica:** Integração com uma API de câmbio em tempo real.

---

**ONE + Alura**  |  *Desenvolvido por Helen Santos*

