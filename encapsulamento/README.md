# Encapsulamento em Java

Este projeto aborda o pilar do **Encapsulamento** na Programação Orientada a Objetos (POO).

O encapsulamento consiste em ocultar os detalhes de implementação internos de uma classe e expor apenas uma interface pública segura para o mundo externo. Isso protege o estado do objeto contra acessos indevidos e inconsistências.

---

## 📂 Estrutura de Arquivos no `src/`

O projeto é composto por duas classes simples:

### 1. `Pessoa.java`
Demonstra a proteção dos atributos da classe.
- **Atributos:** `private String nome;`. A palavra-chave `private` restringe o acesso ao atributo apenas a métodos dentro da própria classe `Pessoa`.
- **Métodos Acessores (Getters/Setters):**
  - `getNome()`: Método público para recuperar com segurança o valor de `nome`.
  - `setNome(...)`: Método para alterar o valor de `nome`. *(Nota: Em aula, a assinatura desse método foi criada de forma simplificada/esboçada para discussão teórica sobre o fluxo de encapsulamento).*

### 2. `App.java`
Contém a lógica de execução (`main`) para ilustrar as regras do encapsulamento.
- Tenta atribuir diretamente um valor ao atributo (`p.nome = "Rafael"`), o que geraria um **erro de compilação** por conta da visibilidade `private`.
- Apresenta o uso de métodos acessores públicos para interagir com o objeto encapsulado.

---

## 🔑 Conceitos-Chave Explicados

1. **Modificadores de Acesso:**
   - `private`: O membro (atributo ou método) só é visível dentro da própria classe.
   - `public`: O membro é visível para qualquer outra classe do projeto.
2. **Métodos Getters e Setters:** São as portas de entrada e saída controladas para a manipulação dos atributos de uma classe:
   - **Getter:** Retorna o valor atual do atributo.
   - **Setter:** Altera ou atualiza o valor do atributo, permitindo realizar validações futuras (como impedir nomes vazios, valores negativos, etc.).
