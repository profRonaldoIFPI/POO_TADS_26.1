/*
Crie uma classe Aluno com os atributos privados nome, nota1 e nota2.
- As notas devem ser validadas: só aceitam valores entre 0 e 10.
- Implemente os getters e setters.
- Crie um método media() que retorna a média das notas.
- Crie um método aprovado() que retorna true se a média for >= 7. 
*/
public class Aluno {
//atributos
    private String nome;
    private double nota1;
    private double nota2; 
//construtor
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        setNota1(nota1);
        setNota2(nota2);
    }
//metodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        if(nota1 >=0 && nota1 <=10){
            this.nota1 = nota1;
        }else{
            System.out.println("Nota inválida.");
        }
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        if(nota2 >=0 && nota2 <=10){
            this.nota2 = nota2;
        }else{
            System.out.println("Nota inválida.");
        }
    }
    public double media(){
        return (nota1 + nota2)/2;
    }
    public boolean aprovado(){
        return media() >= 7;
    } 
}
