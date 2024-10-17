package sueldoherencia;
import java.util.Scanner;


public class Main{

  public static void asalariado(){

  }
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);

    int opt,salir;
    System.out.println("Calculo de sueldos");
    do{
      System.out.println("Seleccione el tipo de empleado a ingresar:");
      System.out.println("1.-Empleado Asalariado");
      System.out.println("2.-Empleado Honorarios");
      opt=input.nextInt();
      if(!(opt==1||opt==2)){
        System.out.println("No es una opcion valida vuelve a intentar");
        continue;
      }

      if(1==opt){
        Asalariado empleado=new Asalariado();
        System.out.println("Empleado Asalariado");

        System.out.print("Ingresa el nombre del empleado:");
        empleado.setNom(input.next());
        System.out.print("Ingresa el puesto del empleado:");
        empleado.setPuesto(input.next());
        System.out.print("Ingresa el RFC del empleado:");
        empleado.setRfc(input.next());
        System.out.printf("Ingresa el sueldo base de %s:",empleado.getNom());
        empleado.setSueldoBase(input.nextDouble());
        
        empleado.calcularSueldo();
    
        System.out.printf("%s tiene un sueldo de:%f",empleado.getNom(),empleado.getSueldo());
      }
      if(2==opt){
        Honorarios empleado=new Honorarios();
        System.out.println("Empleado Honorarios");

        System.out.print("Ingresa el nombre del empleado:");
        empleado.setNom(input.next());
        System.out.print("Ingresa el puesto del empleado:");
        empleado.setTipo(input.next());
        System.out.print("Ingresa el RFC del empleado:");
        empleado.setRfc(input.next());
        System.out.printf("Ingresa el numero de horas trabajadas de %s:",empleado.getNom());
        empleado.setHorasT(input.nextInt());
        System.out.printf("Ingresa la cuota por hora de %s:",empleado.getNom());
        empleado.setCuotaxHr(input.nextDouble());
    
        empleado.calcularSueldo();
    
        System.out.printf("%s tiene un sueldo de:%f",empleado.getNom(),empleado.getSueldo());
      }
      System.out.println("Para salir ingresa 1");
      salir=input.nextInt();
      if(1==salir)break;
    }while(true);
    input.close();
  }
}