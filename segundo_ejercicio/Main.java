import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Vehiculo> vehiculo = new ArrayList<>();
        List<Cliente> lstClientes = new ArrayList<>();
        boolean  stop = true;
        int menu;
        do{
            System.out.println("escoja una opcion");
            System.out.println("""
                    1. registrar un cliente
                    2. registrar un auto
                    3. realizar un alquiler
                    4. calcular el costo total del alquiler
                    5. mostrar vehiculos disponibles
                    6. registrar la devolucion de un vehiculo
                    
                    7. salir""");
            menu = input.nextInt();
            switch (menu){
                case 1 -> {
                    System.out.println("Ingrese nombre del cliente:");
                    String nombre = input.nextLine();
                    System.out.println("Ingrese cédula:");
                    String cedula = input.nextLine();
                    System.out.println("Ingrese número de licencia:");
                    String licencia = input.nextLine();
                    lstClientes.add(new Cliente(nombre, cedula, licencia));
                }
                case 2 -> {
                    System.out.println("""
                            1. carro 
                            2. camioneta""");
                    menu = input.nextInt();
                    if (menu == 1){
                        System.out.println("ingrese marca:");
                        String marca = input.next();
                        System.out.println("ingrese modelo:");
                        String modelo = input.next();
                        System.out.println("ingrese año:");
                        int year = input.nextInt();
                        System.out.println("ingrese precio por día:");
                        double dia = input.nextDouble();
                        System.out.println("ingrese número de puertas:");
                        int puertas = input.nextInt();
                        vehiculo.add(new Auto(marca, modelo, year, dia, puertas));
                    }else {
                        System.out.println("ingrese marca:");
                        String marca = input.next();
                        System.out.println("ingrese modelo:");
                        String modelo = input.next();
                        System.out.println("ingrese año:");
                        int year = input.nextInt();
                        System.out.println("ingrese precio por día:");
                        double dia = input.nextDouble();
                        System.out.println("ingrese capacidad de carga en kg:");
                        int carga = input.nextInt();
                        vehiculo.add(new Camioneta(marca, modelo, year, dia, carga));
                    }
                }
                case 3 -> {
                    System.out.println("ingrese el modelo del carro :");
                    String modelo = input.next();
                    System.out.println("ingrese los dias :");
                    int dias = input.nextInt();
                    for (Vehiculo v : vehiculo) {
                        if (v.modelo.equalsIgnoreCase(modelo)) {
                            System.out.println("toatl: " + v.calcularCosto(dias));
                            break;
                        }
                    }
                }
                case 4 -> {
                    System.out.println("nombre del cliente:");
                    String nombre = input.next();
                    System.out.println("modelo del vehículo:");
                    String modelo = input.next();
                    System.out.println("cantidad de días:");
                    int dias = input.nextInt();
                    for (Vehiculo v : vehiculo) {
                        if (v.modelo.equalsIgnoreCase(modelo) && v.isDisponible()) {
                            v.setDisponible(false);
                            System.out.println("total: " + v.calcularCosto(dias));
                            break;
                        }
                    }
                }
                case 5 -> {
                    for (Vehiculo v : vehiculo) {
                        if (v.isDisponible()) {
                            System.out.println(v.modelo);
                        }
                    }
                }
                case 6 -> {
                    System.out.println("modelo del carro a devolver:");
                    String modelo = input.next();
                    for (Vehiculo v : vehiculo) {
                        if (v.modelo.equalsIgnoreCase(modelo) && !v.isDisponible()) {
                            v.setDisponible(true);
                            System.out.println("carro disponible de nuevo ");
                            break;
                        }
                    }
                }
                case 7 -> {
                    System.out.println("saliendo");
                    stop = false;
                }
            }
        }while(stop);
    }
}