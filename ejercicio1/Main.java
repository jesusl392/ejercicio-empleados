import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean stop = true;
        int menu;
        List<Worker> lstTrabajadores = new ArrayList<>();


        do {
            System.out.println("""
                    MENU
                    opciones disponibles: 
                    1. registrar empleado por horas
                    2. registrar empleado de planta
                    3. mostrar y calcular el sueldo de un empleado
                    4. mostrar todos los empleados
                    5. salir """);
            menu = input.nextInt();
            switch (menu){
                case 1 -> {
                    System.out.println("ingrese el nombre del empleado");
                    String Nombre = input.next();
                    System.out.println("ingrese su edad");
                    int Edad = input.nextInt();
                    System.out.println("ingrese las horas trabajadas");
                    int Horas = input.nextInt();
                    lstTrabajadores.add(new Horas(Nombre,Edad,98000,Horas));
                }
                case 2 ->{
                    System.out.println("ingrese el nombre del empleado");
                    String Nombre = input.next();
                    System.out.println("ingrese su edad");
                    int Edad = input.nextInt();
                    System.out.println("ingrese los dias trabajados");
                    int Dias = input.nextInt();
                    lstTrabajadores.add(new Planta(Nombre,Edad,2100000,Dias));
                }
                case 3 ->{
                    System.out.println("ingrese el nombre del empleado");
                    String nombre = input.next();
                    for (Worker worker : lstTrabajadores) {
                        if (worker instanceof Planta) {
                            System.out.println("Salario de " + nombre + ": " + ((Planta) worker).Salario());
                        } else if (worker instanceof Horas) {
                            System.out.println("Salario de " + nombre + ": " + ((Horas) worker).Salario());
                        }
                        break;
                    }
                }
                case 4 ->{
                    System.out.println(lstTrabajadores);
                }
                case 5 ->{
                    stop = false;
                }
            }
        } while (stop);
    }
}