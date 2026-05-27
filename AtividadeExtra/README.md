# Atividade Extra - Prática de Construtores e Coleções

Este projeto apresenta a resolução de questões práticas de fixação de Programação Orientada a Objetos. O foco é a manipulação prática de múltiplos **construtores** (sobrecarga), inicialização de estados e a utilização básica de **vetores (arrays)** para armazenamento de atributos de um objeto.

---

## 📂 Estrutura de Arquivos no `src/`

O projeto contém as seguintes implementações:

### 1. `Pessoa.java`
Representa um exercício de modelagem simples de dados pessoais com foco em inicialização de estado.
- **Atributos:** `String nome` e `int idade`.
- **Sobrecarga de Construtores:**
  - `Pessoa()`: Construtor sem argumentos (padrão).
  - `Pessoa(String nome, int idade)`: Construtor parametrizado que exige o preenchimento de dados iniciais obrigatórios.
- **Comportamento:**
  - `apresentar()`: Imprime uma saudação informando o nome e a idade da pessoa. Se o construtor sem argumentos for usado e os campos não forem preenchidos, os atributos serão exibidos como nulo/zero.

### 2. `Aluno.java`
Desenvolve o conceito de arrays como atributos internos de um objeto.
- **Atributos:** `String nome` e um vetor de notas de tamanho fixo `float[] notas = new float[2]`.
- **Sobrecarga de Construtores:**
  - `Aluno(String nome)`: Inicializa apenas o nome.
  - `Aluno(String nome, float nota1, float nota2)`: Inicializa o nome e já preenche as duas posições do array com as notas fornecidas.
- **Comportamento:**
  - `media()`: Calcula e retorna a média aritmética simples do aluno iterando o vetor através do laço **for-each** (`for (float nota : notas)`).

### 3. `App.java`
Classe executável contendo o ponto de partida do sistema.
- **Questão 1:** Demonstra a criação de duas instâncias de `Pessoa` (uma via construtor padrão e outra parametrizada) para destacar a diferença entre atributos nulos e atributos inicializados.
- **Questão 4:** Demonstra as duas maneiras de criar e preencher notas para a classe `Aluno` (atribuição direta no array externo vs. passagem direta via parâmetros do construtor) e exibe as médias correspondentes.

---

## 🧠 Conceitos de POO Consolidados nesta Atividade

1. **Sobrecarga de Construtores (Overloading):** A capacidade de definir mais de um construtor na mesma classe, mudando apenas os parâmetros recebidos. Permite diferentes formas de instanciar e inicializar objetos.
2. **Ciclo de Vida de Variáveis Locais vs. Atributos:** Uso do `this` para diferenciar atributos de classe de variáveis de parâmetro com nomes iguais.
3. **Iteração Avançada (For-Each):** O uso de `for (Tipo variavel : array)` simplifica a leitura de vetores em Java, reduzindo chances de erros relacionados ao limite do índice do array (`ArrayIndexOutOfBoundsException`).
