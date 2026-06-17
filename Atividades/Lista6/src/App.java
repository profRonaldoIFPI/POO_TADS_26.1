public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f = new Funcionario("Emanuele", 5000);
        Vendedor v = new Vendedor("Keilane", 2000, 3000);
        f.exibirDados();
        System.out.println(f.calcularPagamento());
        v.exibirDados();
        System.out.println(v.calcularPagamento());
    }
}
