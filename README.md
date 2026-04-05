# 🏨 Sistema de Gerenciamento de Hotel (Java)

## 📌 Descrição

Este projeto consiste em um sistema de gerenciamento de hotel desenvolvido em Java, utilizando apenas **vetores, matrizes, tipos primitivos e String**, conforme as restrições da disciplina de Programação Orientada a Objetos II (POO II).

O sistema permite o controle de hóspedes, reservas de quartos, consumo do frigobar e realização de check-out, funcionando totalmente via **menu interativo no console**.

---

## 🎯 Objetivo

Simular o funcionamento básico de um sistema de hotel, permitindo que recepcionistas realizem operações como:

* Reservar quartos
* Cancelar reservas
* Consultar hóspedes
* Registrar consumo do frigobar
* Realizar check-out

---

## 🧱 Estrutura do Sistema

### 🔹 Hóspedes (Vetores)

* `nomesHospedes[]` → armazena o nome do hóspede
* `numerosReserva[]` → armazena o número da reserva

### 🔹 Quartos (Vetores)

* `statusQuartos[]` → indica se o quarto está:

  * `true` → ocupado
  * `false` → disponível

### 🔹 Frigobar (Matriz)

* `consumoFrigobar[100][4]`

Representação:

* Linhas → quartos (1 a 100)
* Colunas → produtos:

  * 0 → Água
  * 1 → Refrigerante
  * 2 → Suco
  * 3 → Chocolate

Cada posição armazena a **quantidade consumida**.

---

## ⚙️ Funcionalidades

### 1️⃣ Reservar Quarto

* Informa nome e número do quarto
* Verifica disponibilidade
* Gera número de reserva automaticamente

---

### 2️⃣ Cancelar Reserva

* Remove os dados do hóspede
* Libera o quarto
* Zera consumo do frigobar

---

### 3️⃣ Listar Reservas

* Exibe todos os quartos ocupados
* Mostra nome, número da reserva e quarto

---

### 4️⃣ Consultar Hóspede

* Consulta pelo número do quarto
* Exibe dados do hóspede

---

### 5️⃣ Editar Hóspede

* Permite alterar:

  * Nome
  * Número da reserva

---

### 6️⃣ Registrar Consumo do Frigobar

* Escolha do produto
* Registro da quantidade consumida
* Armazenamento na matriz

---

### 7️⃣ Check-out

* Calcula:

  * Valor das diárias
  * Consumo do frigobar
  * Total a pagar
* Exibe resumo da conta
* Libera o quarto
* Remove dados do hóspede
* Zera o frigobar

---

## 💰 Regras de Cálculo

* Valor da diária: definido no sistema
* Total da estadia:

  ```
  totalDiarias = quantidadeDiarias * valorDiaria
  ```
* Total do frigobar:

  ```
  soma dos produtos consumidos × seus respectivos preços
  ```
* Total final:

  ```
  total = totalDiarias + totalFrigobar
  ```

---

## 🧠 Lógica Utilizada

* Estruturas de repetição (`while`, `for`)
* Estrutura de decisão (`if`, `switch`)
* Vetores e matrizes
* Controle de estado com boolean
* Validação de entradas do usuário

---

## 🚫 Restrições do Projeto

* ❌ Não utiliza ArrayList
* ❌ Não utiliza banco de dados
* ❌ Não utiliza classes prontas de coleção
* ✔ Apenas vetores, matrizes, tipos primitivos e String

---

## 💻 Execução

1. Compile o arquivo Java:

   ```
   javac Projeto1Bim.java
   ```

2. Execute:

   ```
   java Projeto1Bim
   ```

---

## 📊 Observações

* O sistema suporta até 100 quartos
* O controle é feito diretamente pelos índices dos vetores
* Cada quarto possui seu próprio controle de consumo

---

## 👨‍💻 Autor

Projeto desenvolvido como atividade prática da disciplina de POO II.

---

## 🏁 Conclusão

Este projeto demonstra a aplicação de conceitos fundamentais de programação, como manipulação de dados em memória, controle de fluxo e organização lógica, sem o uso de estruturas avançadas.

---
