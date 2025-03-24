public class Planta extends Worker{
    protected int sueldo = 2100000;
    protected int dias;

    public Planta(String nombre, int edad, int sueldo, int dias) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.dias = dias;
    }

    public int getSueldo() {
        return sueldo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    public int Salario(){
        return (sueldo * dias);
    }
    @Override
    public String toString() {
        return "Planta{" +
                "sueldo=" + sueldo +
                ", dias=" + dias +
                '}';
    }
}
