public class Aluno{
    String nome;
    float[] notas = new float[2]; //vetor
    public Aluno(String nome){
        this.nome = nome;
    }
    public Aluno(String nome, float nota1, float nota2){
        this.nome = nome;
        this.notas[0]= nota1;
        this.notas[1]= nota2;
    }
    public float media(){
        float media = 0;
        for(float nota : notas){ // percorre o vetor atribuindo cada valor para nota
            media = media + nota; 
        }
        media = media/notas.length; //comprimento do array
        return media;
    }
}