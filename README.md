# 💸 Sistema de Desconto Progressivo
 
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-concluído-brightgreen?style=for-the-badge)
![Dependencies](https://img.shields.io/badge/dependencies-none-success?style=for-the-badge)
 
Programa em Java que calcula automaticamente o desconto e o valor final de uma compra em uma loja online, com base em regras progressivas de desconto conforme o valor total gasto.
 
---
 
## 📋 Sobre o projeto
 
Este projeto foi desenvolvido como atividade prática do curso de **Desenvolvimento de Sistemas (ETEC)**, com o objetivo de aplicar os conceitos de **entrada de dados, estruturas condicionais, e operações matemáticas** em Java.
 
O sistema simula uma funcionalidade real de e-commerce: aplicar diferentes percentuais de desconto de acordo com faixas de valor da compra, calculando tanto o desconto quanto o valor final a ser pago pelo cliente.
 
---
 
## Regras de desconto
 
| Valor da compra | Desconto aplicado |
|---|---|
| Menor que R$ 200,00 | 5% |
| Entre R$ 200,00 e R$ 300,00 (exclusive) | 10% |
| Maior ou igual a R$ 300,00 | 15% |
 
---
 
## Como funciona o cálculo
 
```
desconto = valorCompra × (percentual / 100)
valorFinal = valorCompra − desconto
```
 
O percentual utilizado na fórmula varia de acordo com a faixa de valor em que a compra se enquadra, definida pela estrutura condicional do programa.
 
---
 
## ✅ Requisitos

- **Java**
- **JDK (Java Development Kit)** instalado na máquina
- Nenhuma biblioteca externa é necessária — o projeto utiliza apenas recursos nativos do Java (`java.util.Scanner`)

---
 
## 🚀 Como executar
 
1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/sistema-desconto-progressivo.git
```
 
2. Acesse a pasta do projeto:
```bash
cd sistema-desconto-progressivo
```
 
3. Compile o arquivo:
```bash
javac Main.java
```
 
4. Execute o programa:
```bash
java Main
```
 
---
 
## 💻 Exemplo de uso
 
**Entrada:**
```
Qual o valor da compra? 250.0
```
 
**Saída:**
```
Desconto: 25.0
Valor final: 225.0
```
 
---
 
## 🛠️ Tecnologias utilizadas
 
- **Java** (JDK) — linguagem principal do projeto
- **Scanner** — classe nativa utilizada para capturar a entrada de dados do usuário via terminal
---
 
Desenvolvido por **Bruno Tanchela**
📌 Estudante de Desenvolvimento de Sistemas
 
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/brunotanchela)