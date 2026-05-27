# Atividade Extra - Construtores e Encapsulamento

Este diretório contém resoluções práticas e materiais de referência baseados nas listas de exercícios de fixação **5.1** e **5.2**. 

Os arquivos PDF originais contendo todas as especificações estão anexados a esta pasta:
- [**`Lista Exercícios 5.1.pdf`**](./Lista%20Exercícios%205.1.pdf) - Foco em **Métodos Construtores** (básicos, com lógica e interativos).
- [**`Lista Exercícios 5.2.pdf`**](./Lista%20Exercícios%205.2.pdf) - Foco em **Encapsulamento** (atributos privados, getters, setters e validações de regras de negócio).

---

## 📂 Mapeamento de Resoluções neste Diretório

Os códigos na pasta `src/` resolvem diretamente partes do **Exercício 5.1 (Construtores)**:

### 1. `Pessoa.java` (Resolvendo a Questão 1 do Exercício 5.1)
* **Objetivo:** Criar construtores básicos.
* **Implementação:**
  * Atributos de pacote: `String nome` e `int idade`.
  * **Sobrecarga de Construtores:** Um construtor padrão vazio `Pessoa()` (inicializa com nulo/zero) e um construtor parametrizado `Pessoa(String nome, int idade)`.
  * **Método:** `apresentar()` exibindo a mensagem padronizada no console.

### 2. `Aluno.java` (Resolvendo a Questão 4 do Exercício 5.1)
* **Objetivo:** Construtores com lógica e armazenamento de notas.
* **Implementação:**
  * Atributos: `String nome` e um array de notas `float[] notas` com tamanho fixo para duas notas.
  * **Sobrecarga de Construtores:**
    * Um construtor que aceita apenas o `nome` (inicializando as notas com `0` por padrão).
    * Outro que aceita `nome`, `nota1` e `nota2` de forma direta.
  * **Método:** `media()` que faz a iteração do array de notas usando o loop *for-each* para computar a média aritmética simples.

### 3. `App.java` (Ponto de Teste)
* Executa a instanciação das classes `Pessoa` e `Aluno` passando parâmetros diferentes para testar o comportamento dos múltiplos construtores no console.

---

## 🧠 Tabela Comparativa de Conceitos: Lista 5.1 vs. Lista 5.2

| Recurso | Exercício 5.1 (Construtores) | Exercício 5.2 (Encapsulamento) |
| :--- | :--- | :--- |
| **Visibilidade dos Atributos** | Geralmente padrão (*package-private*) ou pública para facilitar a inicialização. | Obrigatoriamente **`private`**, ocultando o estado interno do objeto. |
| **Acesso a Atributos** | Direto (ex: `objeto.atributo = valor`). | Indireto e controlado via **Getters e Setters** (ex: `objeto.setAtributo(valor)`). |
| **Integridade de Dados** | Garantida no "nascimento" do objeto por meio dos **Construtores**. | Garantida ao longo de toda a vida do objeto por meio de regras nos **Setters**. |
