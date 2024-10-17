package login;
import java.util.Scanner;

public class Login{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    User user=new User("mar","cos");
    String usuario,key;
      System.out.println("Bienvenido ingresa tu usuario y contraseña");
    
    //!!
    for(int i=3;0<i;){
      System.out.print("Usuario: ");
      usuario=input.next();
      System.out.print("Contraseña: ");   
      key=input.next();

      if(user.verify(usuario,key))break;

      System.out.printf("Te quedan %d intentos.\n",--i);
    }
    
  }
}