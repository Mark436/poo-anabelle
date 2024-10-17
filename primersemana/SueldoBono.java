import java.util.Scanner;

public class SueldoBono{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String nombre;
        int horasTrabajadas,tipoEmpleado;
        double precioHora,sueldo;

        System.out.print("Ingresa el nombre del trabajador: ");
        nombre=input.nextLine();
        
        System.out.print("Ingresa las horas trabajadas: ");
        horasTrabajadas=input.nextInt();input.nextLine();

        System.out.print("Ingresa la cuota por hora del trabajador: ");
        precioHora=input.nextDouble();input.nextLine();
        sueldo=horasTrabajadas*precioHora;

        System.out.print("Ingresa el tipo de empleado 1 para jefe y 2 para operador: ");
        tipoEmpleado=input.nextInt();input.nextLine();
        if(tipoEmpleado==1){
            sueldo+=5000;
        }else{
            sueldo+=10000;
        }
        
        System.out.println("El sueldo de "+nombre+" es "+sueldo);
        input.close();
    }
}