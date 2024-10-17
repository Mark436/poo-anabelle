package conversorgrados;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    Temperatura temperatura=new Temperatura();

    do{
      System.out.println("Bienvenido al conversor de temperaturas");
      System.out.print("Ingresa 1 si deseas convertir celcius a farenheitl, de lo contrario 0:");
      int opcion=input.nextInt();
      System.out.print("\nIngresa la temperatura a convertir:");
      if(opcion!=1)temperatura.setFarenheit(input.nextDouble());
      else{temperatura.setCelcius(input.nextDouble());}
      System.out.println("\nTu temperatura ha sido convertida a "+temperatura.getResult());

      System.out.print("Si desea volver a ejecutar el programa ingrese 1 de lo contrario 0:");
      int salir=input.nextInt();
      if(salir!=1)break;
    }while(true);

  }
}