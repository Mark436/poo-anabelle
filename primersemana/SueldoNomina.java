import java.util.Scanner;

public class SueldoNomina{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String nombre;
        int horasTrabajadas,tipoEmpleado;
        double sueldo;
        double nomina=0;
        System.out.println("Programa de calculo de sueldos");
        for(int i=0;i<3;i++){
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
                    sueldo=0;
          }
        
          System.out.println("El sueldo de "+nombre+" es: "+sueldo+"\n");
          nomina+=sueldo;
        }
        System.out.println("El saldo de nomina es: "+nomina);
        input.close();
    }
}