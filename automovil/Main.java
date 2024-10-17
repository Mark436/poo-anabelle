package automovil;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);

    Automovil auto=new Automovil();
    do{
      System.out.println("Bienvenido al sistema de valuacion de automoviles");
      System.out.print("Ingrese el precio inicial del auto:");
      auto.setPrecio(input.nextDouble());
      System.out.print("\nIngrese la comision en numeros entre 1 y 100:");
      auto.setComision(input.nextDouble());
      System.out.print("\nIngrese el impuesto que se debe aplicar al auto en numeros entre 1 y 100:");
      auto.setImpuesto(input.nextDouble());
      
      System.out.printf("%f es el precio que tiene que pagar el cliente por el auto\n%f es la comision que se lleva el vendedor"
      ,auto.getPrecioFinal(),auto.getComision());
      System.out.print("Si desea volver a ejecutar el programa ingrese 1 de lo contrario 0:");
      int opcion=input.nextInt();
      if(opcion!=1)break;
    }while(true);
    input.close();
  }
}