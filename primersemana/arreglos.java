import java.util.Scanner;
public class arreglos{
  public static void main(String []args){
    Scanner input=new Scanner(System.in);
    String[] nombres=new String[5];
    
    for(int i=0;i<nombres.length;i++){
      System.out.println("Ingresa el nombre "+(i+1));
      nombres[i]=input.next();
    }
    for(int i=0;i<nombres.length;i++){
      System.out.println((i+1)+".- "+nombres[i]);
    }
    for(int i=nombres.length-1;i>=0;i--){
      System.out.println((i+1)+".- "+nombres[i]);
    }
  }
  
}