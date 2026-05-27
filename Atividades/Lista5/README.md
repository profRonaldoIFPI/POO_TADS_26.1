# Atividades - Lista de Exercícios 5

Este projeto contém a resolução de exercícios práticos da **Lista 5** da disciplina de Programação Orientada a Objetos (POO). 

O foco principal desta lista é consolidar o uso do **encapsulamento** para garantir a consistência do estado dos objetos, aplicando **regras de validação** nos métodos modificadores (*setters*) de forma que valores inválidos sejam rejeitados.

---

## 📂 Conteúdo do Projeto

O diretório contém os seguintes componentes:

- **`Lista Exercícios 5.pdf`**: Enunciado original contendo todas as questões propostas.
- **`src/Produto.java`** (Questão 4):
  - Modela um produto com atributos encapsulados: `nome` e `preco`.
  - A regra de negócio exige que o preço de um produto nunca seja negativo ou nulo.
  - O método `setPreco(double novoPreco)` implementa essa validação:
    ```java
    public void setPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("Novo preço inválido.");
        }
    }
    ```
- **`src/Termostato.java`** (Questão 6):
  - Modela um termostato responsável pelo controle de temperatura de um ambiente.
  - A regra exige manter a temperatura entre $15^\circ\text{C}$ e $30^\circ\text{C}$.
  - O método `setTemperaturaAtual(double novaTemperatura)` realiza essa checagem de intervalo permitido.
  - *Nota Técnica:* No código original desenvolvido, foi utilizado o operador lógico OU (`||`), o que torna a condição logicamente sempre verdadeira (qualquer temperatura é maior ou igual a 15 OR menor ou igual a 30). Em um cenário real de produção, o correto seria utilizar o operador lógico E (`&&`).
- **`src/App.java`**:
  - Ponto de entrada que testa os limites das regras criadas para `Produto` e `Termostato`, enviando valores válidos e inválidos para validar os retornos.

---

## ⚙️ Conceitos Demonstrados

1. **Proteção do Estado do Objeto (Consistência):** Sem o encapsulamento, uma classe externa poderia atribuir um preço negativo ou uma temperatura absurda diretamente no atributo do objeto. Com atributos privados, as alterações obrigatoriamente passam por validações.
2. **Uso de Setters no Construtor:** Em vez de repetir a regra de validação dentro do construtor, o construtor chama o método `setPreco()` / `setTemperaturaAtual()`, garantindo que a validação seja aplicada também no momento de criação do objeto.
