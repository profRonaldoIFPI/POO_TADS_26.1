public class App {
    public static void main(String[] args) throws Exception {
    //4    
        Aluno a = new Aluno("Ronaldo", 7, 9);
        System.out.println(a.media());
        System.out.println(a.aprovado());
        a.setNota1(4);
        System.out.println(a.media());
        System.out.println(a.aprovado());
        a.setNota1(11);
        System.out.println(a.getNota1());


    }
}
