//Selecciona un IDE de tu preferencia (Visual Studio Code o NetBeans por ejemplo) y desarrolla un
//programa que lea el nombre y la edad de una persona, convierta la edad en días y mande el resultado a
//pantalla. Sube el codigo.
import java.util.Scanner;

public class Diagnostico{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);

    System.out.println("Ingrese por favor su nombre");
    String nombre=input.nextLine();
    int edad,edadDias;
    while(true){
      System.out.println("Ingrese por favor su edad en años, si tiene meses indique 0");
      edad=input.nextInt();input.nextLine();
      
      if(!(edad<0)){
        System.out.println("Ingrese en meses su edad:)");
        edad=input.nextInt();input.nextLine();
        edadDias=edad*30;
        break;
      }
      System.out.println("Por favor ingrese su edad en numeros positivos");
    }


    System.out.println("Su edad en dias es "+edadDias+" "+nombre);
  }

}