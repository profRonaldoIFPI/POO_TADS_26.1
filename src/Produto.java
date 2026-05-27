public class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco){
        setPreco(preco);
        this.nome = nome;
    }
    public void setPreco(double novoPreco) { //setup = configurar ou modifica
        if(novoPreco>0){
            this.preco = novoPreco;
        } else {
           System.out.println("Novo preço inválido.");
        }
    }
    public double getPreco() { //get = pegar ou obter
        return this.preco;
    }
}