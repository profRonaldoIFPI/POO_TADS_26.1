public class App {
    public static void main(String[] args) throws Exception {
    //6ª
        Termostato termostato = new Termostato(15);
        double temp = termostato.getTemperaturaAtual();
        System.out.println(temp);
        termostato.setTemperaturaAtual(25);
    
    //4ª
        Produto p = new Produto("Cajuina Aeroporto", -50);
        p.setPreco(10);
        System.out.println(p.getPreco());

    }
}
