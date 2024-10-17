package examenimc;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);

    System.out.println("Indice de masa corporal");
    
    while(true){
    Persona sujeto=new Persona();
    System.out.print("Ingrese el peso de la persona en kilogramos:");
    sujeto.setPeso(input.nextDouble());    
    System.out.print("\nIngrese la altura de la persona en metros:");
    sujeto.setAltura(input.nextDouble());
    
    sujeto.calcularImc();
    
    System.out.printf("\nLa persona con un peso de: %fkg\nY altura de: %fm\nCuenta con Indice de Masa corporal(IMC) de:%f\n",sujeto.getPeso(),sujeto.getAltura(),sujeto.getIMC());
    System.out.println("Ingrese 1 para continuar, 0 para salir");
    int e=input.nextInt();
    if(0==e)break;
    }

  }
}