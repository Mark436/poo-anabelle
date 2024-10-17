import java.util.Scanner;

public class SueldoBonoSwitch{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String nombre;
        int horasTrabajadas,tipoEmpleado;
        double sueldo;

        System.out.print("Ingresa el nombre del trabajador: ");
        nombre=input.nextLine();
        
        System.out.print("Ingresa las horas trabajadas: ");
        horasTrabajadas=input.nextInt();input.nextLine();

        System.out.println("Ingresa el tipo de empleado");
        System.out.println("1.-Jefe de turno");
        System.out.println("2.-Jefe de linea");
        System.out.println("3.-Operador");
        tipoEmpleado=input.nextInt();input.nextLine();
        switch(tipoEmpleado){
            case 1:
                sueldo=horasTrabajadas*250;
                break;
            case 2:
                sueldo=horasTrabajadas*200;
                break;
            case 3:
                sueldo=horasTrabajadas*150;
                break;
            default:
                System.out.println(tipoEmpleado+" no es una opcion valida.");
                input.close();return;
        }
        
        System.out.println("El sueldo de "+nombre+" es "+sueldo);
        input.close();
    }
}