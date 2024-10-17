import java.util.Scanner;

public class Sueldo{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String nombre;
        int horasTrabajadas;
        double precioHora,sueldo;
        System.out.print("Ingresa el nombre del trabajador: ");
        nombre=input.nextLine();
        
        System.out.print("Ingresa las horas trabajadas: ");
        horasTrabajadas=input.nextInt();input.nextLine();

        System.out.print("Ingresa la cuota por hora del trabajador: ");
        precioHora=input.nextDouble();input.nextLine();
        sueldo=horasTrabajadas*precioHora;
        System.out.println("El sueldo de "+nombre+" es "+sueldo);
        input.close();
    }
}