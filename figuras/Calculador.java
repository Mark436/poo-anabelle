package figuras;
import java.util.Scanner;

public class Calculador{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    Figura figura=new Figura();
    do{
    System.out.println("Que figura deseas crear?\n1.- para cuadrado\n2.- para ciruculo");
    int opcion=input.nextInt();

    if(opcion!=1&&opcion!=2){
      System.out.println("Opcion invalida, vuelve a intentar");
      continue;
    }
    
    if(1==opcion){
      System.out.println("Ingresa la medida del lado para tu cuadrado");
      double valor=input.nextDouble();
      figura.setLado(valor);
      figura.calcularCuadrado();
    }else{
      System.out.println("Ingresa la medida del radio para tu circulo");
      double valor=input.nextDouble();
      figura.setRadio(valor);
      figura.calcularCirculo();
    }
    
    System.out.printf("El area de tu figura es: %f y su perimetro es: %f\n",figura.getArea(),figura.getPerimetro());
    System.out.println("Si desesas volver a ejecutar el programa ingresa 1");
    int salir=input.nextInt();
    if(salir!=1)break;
    }while(true);
    input.close();
  }
}
