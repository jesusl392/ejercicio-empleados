public class Camioneta extends Vehiculo {
    int carga;

    public Camioneta(String marca, String modelo, int year, double dia, int carga) {

    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + year +
                ", pDia=" + dia +
                ", disponible=" + disponible +
                '}';
    }
}
