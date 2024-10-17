package gasolinera;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    Gasolina gas=new Gasolina();
    
    do{
      System.out.println("Bienvenido al sistema de valuacion de gasolina");
      System.out.print("Ingrese la cantidad de galones:");
      gas.setGalones(input.nextDouble());
      System.out.print("\nIngrese el precio por litro de gasolina:");
      gas.setPrecioXLitro(input.nextDouble());
      System.out.printf("\nLos litros de gasolina consumidos son: %s\n el total a pagar es de: %s"
      ,gas.getLitros(),gas.getPrecioFinal()); 
    
      System.out.print("Si desea volver a ejecutar el programa ingrese 1 de lo contrario 0:");
      int opcion=input.nextInt();
      if(opcion!=1)break;
    }while(true);
    input.close();
  }
}