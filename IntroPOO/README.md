# IntroPOO - Introdução à Programação Orientada a Objetos

Este projeto reúne os exemplos iniciais trabalhados em sala de aula para introduzir os conceitos fundamentais da **Programação Orientada a Objetos (POO)** com Java.

O foco aqui é compreender a transição do pensamento estruturado para o orientado a objetos: o que são classes, como instanciar objetos na memória heap e como esses objetos se comunicam por meio de métodos.

---

## 📂 Estrutura de Arquivos no `src/`

O diretório de códigos-fonte (`src/`) contém as seguintes classes de exemplo:

### 1. `Aluno.java`
Uma classe simples que modela a entidade de um estudante.
- **Atributos:** `nome` (String), `matricula` (String) e `telefone` (long).
- **Conceito:** Mostra a definição básica de uma classe que funciona como um molde para instanciar alunos. Possui também uma introdução aos métodos acessores simples `getNome()` e `setNome(String nome)`.

### 2. `Smartphone.java`
Simula o funcionamento básico de um smartphone.
- **Atributos:** `marca` (String), `modelo` (String) e `bateria` (float).
- **Métodos:** 
  - `verStatus()`: Imprime no console os detalhes e o nível de carga atual.
  - `usarApp(int tempo)`: Simula a descarga da bateria em $0.1\%$ a cada minuto de uso através de uma estrutura de repetição (`for`).

### 3. `Musica.java`
Representa uma faixa musical.
- **Atributos:** `titulo` (String), `artista` (String) e `duracaoSegundos` (int).
- **Método:**
  - `exibirTempoMinutos()`: Converte a duração de segundos para o formato legível `MM:SS` aplicando os operadores matemáticos de divisão (`/`) e resto da divisão (`%`).
- **Conceito:** Introduz o uso de **construtores parametrizados** para inicializar o estado de um objeto no momento da instanciação (`new`).

### 4. `App.java`
Classe executável (contém o método `main`) que atua como o ponto de entrada da aplicação. Nela, criamos objetos das classes explicadas acima e testamos suas interações.

### 5. `Diagramas.md`
Um arquivo auxiliar com representações visuais das classes e de sua sequência de execução em sala, descritas utilizando a sintaxe **Mermaid** (para renderização de diagramas no próprio GitHub ou VS Code).

---

## 💡 Conceitos de POO Demonstrados

1. **Classe vs. Objeto:** A classe (ex: `Smartphone`) define a estrutura de dados e comportamentos, enquanto o objeto é a instância física criada em memória (ex: `Smartphone tel = new Smartphone()`).
2. **Estado e Comportamento:** Atributos representam o estado (bateria, marca) e os métodos definem o comportamento (usarApp, verStatus).
3. **Instanciação com Construtores:** O construtor é o método especial chamado com o operador `new` para inicializar a memória do objeto, como visto em `Musica`.
