public class Funcionario { //superclasse
//atributos
    private String nome;
    protected double salarioBase;
//construtor
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }    
//métodos
    public double calcularPagamento(){ //getSalarioBase
        return salarioBase;
    }
    public void exibirDados(){
        System.out.println(
            "Funcionário:\t"+ nome +
            "\nSalário:\t"+ salarioBase
        );
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalarioBase(double novoSalario) {
        if(novoSalario > salarioBase){
            this.salarioBase = novoSalario;
        } else {
            System.out.println("Por lei, salário não pode ser reduzido.");
        }
    }
}
