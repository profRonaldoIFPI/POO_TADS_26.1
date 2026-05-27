public class Musica {
    String titulo;
    String artista;
    int duracaoSegundos;

    public Musica(String titulo, String artista, int duracaoSegundos){
        this.artista = artista;
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
    }

    public void exibirTempoMinutos(){
        int segundos    = duracaoSegundos % 60;
        int minutos     = duracaoSegundos / 60;
        System.out.println(minutos+":"+segundos); 
    }
}
