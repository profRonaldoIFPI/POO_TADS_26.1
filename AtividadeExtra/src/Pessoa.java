public class Pessoa {
    //atributos
    String nome;
    int idade;
    //construtores
    public Pessoa(){} //padrão (não é uma boa prática)
    public Pessoa(String nome, int idade){ //Parametrizado
        this.nome = nome;
        this.idade = idade;
    }
    //métodos
    public void apresentar(){
        System.out.println("Olá, meu nome é "+ nome + " e tenho " + idade +" anos.");
    }
}
