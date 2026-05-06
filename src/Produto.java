public class Produto {
    private String nome;
    // 1. Torne o atributo preco PRIVADO [ok]
    private double preco;
    // 2. CONSTRUTOR: Complete para receber nome e preco
    
    public Produto(String nome, double preco){
        this.nome = nome;
        setPreco(preco);
    }
    // 3. Método SETTER com VALIDAÇÃO (não permite preco negativo)

    public void setPreco(double novoPreco) {
        if(novoPreco>0){
            this.preco = novoPreco;
        } else {
           System.out.println("Novo preço inválido.");
        }
    }
    // 4. Método GETTER
    public double getPreco() {
        return this.preco;
    }
}