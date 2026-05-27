# Diagramas de Classes e Sequência

Abaixo estão as representações das classes `Aluno`, `Smartphone` e a lógica de execução presente em `App`.

## Diagrama de Classes

Este diagrama apresenta as classes e seus membros (atributos e métodos).

```mermaid
classDiagram
    class Aluno {
        +String nome
        +String matricula
        +long telefone
        +getNome() String
        +setNome(String nome) void
    }

    class Smartphone {
        +String marca
        +String modelo
        +float bateria
        +verStatus() void
        +usarApp(int tempo) void
    }

    class App {
        +main(String[] args) void
    }

    App ..> Smartphone : instancia
```

## Diagrama de Sequência

Este diagrama mostra o fluxo de execução definido no método `main` da classe `App`.

```mermaid
sequenceDiagram
    participant App
    participant tel as Smartphone

    Note over App: Início da execução (main)
    App->>tel: new Smartphone()
    App->>tel: atribui marca, modelo e bateria
    
    App->>tel: verStatus()
    tel-->>App: exibe informações no console

    App->>tel: usarApp(15)
    Note right of tel: bateria reduzida proporcionalmente

    App->>tel: verStatus()
    tel-->>App: exibe status atualizado
```
