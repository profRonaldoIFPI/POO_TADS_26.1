/*
Crie uma classe ContaBancaria com os atributos privados numeroConta e saldo.
- O saldo só pode ser alterado pelos métodos depositar(double valor) e
sacar(double valor).
- Adicione um método getSaldo() para consultar o saldo atual.
*/
class ContaBancaria{
//atributos
    private int numeroConta;
    private double saldo;
//construtor
    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        depositar(saldo);
    }
    public ContaBancaria(int numeroConta){
        this(numeroConta, 0.0);
    }
//metodos
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor; //saldo = saldo + valor
        }
    }
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
}