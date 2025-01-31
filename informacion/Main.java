package informacion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
// "1.-Agrega contenido al archivo\n2.-Lee el archivo\n3.-Terminar"
// "1.-Escribe en el archivo"
private static final Scanner input=new Scanner(System.in);
public static int entradaMenu(int min,int max,String msg,String msg1,boolean primer){
  int opt;
  while(true){
    System.out.println(primer?msg1:msg);
    primer=false;
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
  public static void main(String[] args){
    boolean primera=true;
    Archivo file=new Archivo("./archivo.txt");

    while(true){
      int opcion=entradaMenu(1,3,"1.-Agrega contenido al archivo\n2.-Lee el archivo\n3.-Terminar",
      "1.-Escribe en el archivo\n2.-Lee el archivo\n3.-Terminar",primera); 
      primera = false;
      if(opcion==1){
        System.out.println("Ingresa lo que vas a escribir en el archivo");
        String mensaje=input.nextLine();
        if(primera)file.escribeMensaje(mensaje);
        else{file.agregaContenido(mensaje);}
        continue;
      }
      if(opcion!=2){break;}
      file.leerArchivo();
    }
    input.close();
  }
}
