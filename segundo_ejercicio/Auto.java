public class Auto extends Vehiculo {
    int puertas;

    public Auto(String marca, String modelo, int year, double dia, int puertas) {
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + year +
                ", pDia=" + dia +
                ", disponible=" + disponible +
                '}';
    }
}
