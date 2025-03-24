public class Vehiculo {
    String marca;
    String modelo;
    int year;
    double dia;
    boolean disponible;

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public double calcularCosto(int dias) {
        double total = dia * dias;
        if (dias > 7) {
            total *= 0.9; // Aplica un descuento del 10% si se alquila más de 7 días
        }
        return total;
    }

}
