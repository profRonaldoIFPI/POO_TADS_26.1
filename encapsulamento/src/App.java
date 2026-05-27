public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        //p.nome = "Rafael"; //não podemos acessar diretamente pois é private
        p.setNome("Rafael");
        System.out.println(p.getNome());
    }
}
