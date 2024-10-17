package sueldoempleado;
import java.util.Scanner;

public class SueldoEmpleado{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
  //Instancia
    Empleado empleado=new Empleado();

    System.out.println("Calculo de sueldos");
    System.out.print("Ingresa el nombre del empleado: ");
    empleado.setNom(input.nextLine());
    System.out.printf("Ingresa el numero de horas trabajadas de %s: ",empleado.getNom());
    empleado.setHorasT(input.nextInt());
    System.out.printf("Ingresa la cuota por hora de %s: ",empleado.getNom());
    empleado.setCuotaxHr(input.nextDouble());

    empleado.calcularSueldo();

    System.out.printf("%s tiene un sueldo de: %d",empleado.getNom(),empleado.getSueldo());
    input.close();
  }
}