package Aula11.Exercicio3.model;

public class model {
    private int volume;
    private int grama;
    private String doce;

    // Construtor
    public model(String doce, int grama, int volume) {
        this.doce = doce;
        this.grama = grama;
        this.volume = volume;
    }

    // Métodos getters
    public String getDoce() {
        return doce;
    }

    public int getGramas() {
        return grama;
    }

    public int getVolume() {
        return volume;
    }

    // Método toString
    @Override
    public String toString() {
        return "Chocolate [o volume da barra ==>" + volume + ", que da um total aproximadamente de " + grama +
                "  gramas " + "que serve para o doce  " + doce + "]";
    }
}
