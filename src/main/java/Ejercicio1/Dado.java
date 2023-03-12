package Ejercicio1;

public class Dado {
    private int caras;
    private int ultimaCara;

    public Dado(int caras) {

        this.caras = caras;
    }

    public Dado() {

        this.caras = 6;
    }

    public int getCaras() {

        return caras;
    }

    public int getUltimaCara() {
        return ultimaCara;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public int tirar() {
        ultimaCara = (int) (Math.random() * caras + 1);
        return ultimaCara;
    }
}
