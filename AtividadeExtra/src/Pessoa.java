import java.time.LocalDate;

public class Pessoa {
//atributos
    private String nome;
    private int idade;
    private Date nascimento;
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
// modificar atributos (setup)
    public void setNascimento(int dia, int mes, int ano){
        if (dia >1 && dia <=31){
            nascimento = new Date(ano, mes, dia);
        }
    }
//recuperar atributos (get)
    public Date getNascimento(){
        return nascimento;
    }
}
