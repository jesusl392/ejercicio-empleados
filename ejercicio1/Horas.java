public class Horas extends Worker{
    protected int pago = 98000;
    protected int horas;

    public Horas(String nombre, int edad, int pago, int horas) {
        super(nombre, edad);
        this.pago = pago;
        this.horas = horas;
    }

    public int getPago() {
        return pago;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int Salario() {
        return pago * horas;
    }
    @Override
    public String toString() {
        return "Horas{" +
                "pago=" + pago +
                ", horas=" + horas +
                '}';
    }
}
