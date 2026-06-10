public class Vendedor extends Funcionario {//subclasse
//atributos
    private double comissao;
//construtorc
    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    } 
//metodos
    @Override //sobreescrevendo o método herdado
    public double calcularPagamento(){
        return  super.salarioBase + comissao;
    }
}
