public class Vendedor extends Funcionario {
//atributo
    private double comissao;
//construtor
    public Vendedor(String nome, double salarioBase, double comissao){
        super(nome, salarioBase); //superconstrutor (construtor da superclasse)
        this.comissao = comissao;
    }
//métodos
    @Override //sobreescrever, sobrepor, reescrever ...
    public double calcularPagamento(){ //getSalarioBase
        // return super.calcularPagamento() + comissao;
        return salarioBase + comissao;
    // }
    }
}
