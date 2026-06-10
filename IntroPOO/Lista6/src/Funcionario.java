public class Funcionario { //superclasse
//atributos
    private String nome;
    protected double salarioBase;
//construtor
    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
//metodos
    public double calcularPagamento(){
        return salarioBase;
    }
    public void exibirDados(){
        System.out.println("Nome:\t"+nome+"\nSalario:\t"+salarioBase);
    }
}
