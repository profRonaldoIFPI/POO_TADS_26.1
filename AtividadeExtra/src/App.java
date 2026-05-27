public class App {
    public static void main(String[] args) throws Exception {
//questão 1
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Ronaldo", 44);
        p1.apresentar(); //atributos nulos
        p2.apresentar();
//questão 4
        Aluno a = new Aluno("Keilane");
        a.notas[0] = 9.5f;
        a.notas[1] = 8.5f;
        System.out.println(a.media());
        Aluno a2 = new Aluno("Viviany", 9.5f, 8.5f);
        System.out.println(a2.media());
    }
}
