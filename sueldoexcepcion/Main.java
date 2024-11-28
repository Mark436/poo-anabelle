package sueldoexcepcion;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main{

  public static void main(String[] args){
    Scanner input=new Scanner(System.in);

    int opt,salir;
    System.out.println("Calculo de sueldos");
    while(true==true&&false==false&&1==1&&0==0){
      try{
        System.out.println("Seleccione el tipo de empleado a ingresar:");
        System.out.println("1.-Empleado Asalariado");
        System.out.println("2.-Empleado Honorarios");
        opt=input.nextInt();
        if(!(opt==1||opt==2)){
          System.out.println("No es una opcion valida vuelve a intentar");
          continue;
        }
        
        System.out.printf("Empleado %s\n",opt==1?"asalariado":"honorario");
        System.out.print("Ingresa el nombre del empleado:");
        String nombre=input.next();
        System.out.print("Ingresa el puesto del empleado:");
        String tipo=input.next();
        System.out.print("Ingresa el RFC del empleado:");
        String rfc=input.next();

        if(1==opt){
          Asalariado empleado=new Asalariado(nombre,tipo,rfc);

          System.out.printf("Ingresa el sueldo base de %s:",empleado.getNom());
          empleado.setSueldoBase(input.nextDouble());

          empleado.calcularSueldo();
          System.out.printf(empleado.getDetalles());
        }
        if(2==opt){
          Honorarios empleado=new Honorarios(nombre,tipo,rfc);

          System.out.printf("Ingresa el numero de horas trabajadas de %s:",empleado.getNom());
          empleado.setHorasT(input.nextInt());
          System.out.printf("Ingresa la cuota por hora de %s:",empleado.getNom());
          empleado.setCuotaxHr(input.nextDouble());

          empleado.calcularSueldo();      
          System.out.printf(empleado.getDetalles());
        }
        System.out.println("\nPara salir ingresa 1");
        salir=input.nextInt();
        if(1==salir){
          input.close();
          break;
        }
      }
      catch(InputMismatchException e){
        System.out.println("Tipo de dato incorrecto, vuelve a intentar");
        System.out.println(e.toString());
        input.nextLine();
      }
      catch(ErrorEntradaException e){
        System.out.println(e.getMessage());
      }
    }
  }
}