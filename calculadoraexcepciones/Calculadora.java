package calculadoraexcepciones;
import atajos.Atajos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora{
  private static final Scanner input=new Scanner(System.in);
  private static final String ErrorPositivo = "El número tiene que ser positivo y entero.";
  private static final String ErrorEntero = "Debe ser un número entero. Intenta de nuevo.";

  public static int recibirNumero(int numero){
    int entrada=0;
    while(true){
      System.out.printf("Ingresa el %s numero:",numero==1?"primer":"segundo");
      try{
        entrada=input.nextInt();input.nextLine();
        if(entrada<0)throw new EntradaInvalidaException(ErrorPositivo);
      }catch(InputMismatchException e){
        System.out.println(ErrorEntero);
        input.nextLine();
        continue;
      }catch(EntradaInvalidaException e){
        System.out.println(e.getMessage());
        input.nextLine();
        continue;
      }
      break;
    }
    return entrada;
    
  }
  public static int recibirNumero(boolean cero){
    int entrada=0;
    boolean salir=false;
    while(true){
      System.out.print("Ingresa el segundo numero:");
      try{
        entrada=input.nextInt();input.nextLine();
        if(entrada<=0)throw new EntradaInvalidaException(ErrorPositivo+"y no puede ser 0.");
      }catch(InputMismatchException e){
        System.out.println(ErrorEntero);
        input.nextLine();
        continue;
      }catch(EntradaInvalidaException e){
        System.out.println(e.getMessage());
        System.out.println("Si quieres volver a empezar ingresa 1");
        salir=input.nextInt()==1;
        input.nextLine();
        continue;
      }
      break;
    }
    return salir?-1:entrada;
    
  }

  //Lista para el infarto profe????
  public static void main(String[] args)throws EntradaInvalidaException {
    
// así habría quedado de no ser porque le quería dar el susto :) si lo pone así tambien funciona
// public static void main(String[] args){
    String[] opciones={"sumar","restar","multiplicar","dividir"};
    System.out.println("Calculadora excepciones");
    while(true){
      Operacion operacion=new Operacion();
        operacion.setNum1(recibirNumero(1));
        operacion.setNum2(recibirNumero(2));
    
        int opcion=Atajos.entradaMenu(1, 4, "Ingresa el tipo de operacion que quieres realizar:\n1 para suma\n2 para resta\n3 para multiplicacion\n4 para division");
        try {
          operacion.operar();
        } catch (EntradaInvalidaException e) {
          System.out.println(e.getMessage());
          
          int reintentar=(Atajos.entradaMenu(1,2,"Ingresa 1 para volver a intentar ingresar el segundo numero y 2 para volver a empezar de cero"));
          if(reintentar==2)continue;
          int segundaOportunidad=(recibirNumero(false));
          if(segundaOportunidad==-1)continue;
          operacion.setNum2(segundaOportunidad);
          operacion.operar();
        }
      
      System.out.printf("El resultado de %s %s y %s es %s \n",opciones[opcion-1],operacion.getNum1(),operacion.getNum2(),operacion.getResultado());
      int salir=Atajos.entradaMenu(1, 2, "Ingresa 1 para realizar otra operacion y 2 para salir");
      if(salir==2)break;
    }
  }
}
