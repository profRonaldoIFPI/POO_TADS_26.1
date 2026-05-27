public class Termostato {
    private double temperaturaAtual;

    public Termostato(double temperaturaAtual) {
        setTemperaturaAtual(temperaturaAtual);
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double novaTemperatura) {
        if (novaTemperatura >=15 || novaTemperatura <= 30 ){
            this.temperaturaAtual = novaTemperatura;
        } else {
            System.out.println("Temperatura fora do intervalo permitido.");
        }
    }    
}
