public class Smartphone {
    String marca;
    String modelo;
    float bateria;

    public void verStatus(){
        System.out.println("Marca:"+marca);
        System.out.println("Modelo:"+modelo);
        System.out.println("Baxteria:"+bateria+"%");
    }
    public void usarApp(int tempo){// 0,1% por minuto
        for(int i = 0; i<=tempo; i++){
            bateria = bateria - bateria*0.001f;
        }
    }
}
