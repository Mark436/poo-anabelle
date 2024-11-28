package atajos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atajos{
  private static final Scanner input=new Scanner(System.in); 
  public static int entradaMenu(int min,int max,String msg){
    int opt;
    while(true){
      System.out.println(msg);
      try{
        opt=input.nextInt();input.nextLine();
      }catch(InputMismatchException e){
        System.out.println("Solo se aceptan numeros");
        input.nextLine();
        System.out.println(msg);
        continue;
      }
      if(opt<min||opt>max){
        System.out.println("Ingrese una opcion valida");
        continue;
      }
      break;
    }
    return opt;
  }

}