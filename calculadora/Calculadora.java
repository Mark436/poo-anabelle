package calculadora;
import java.util.Scanner;
import java.lang.Runnable;
public class Calculadora{
  public static void main(String[] args){
    Operacion calculo=new Operacion();
    Scanner input=new Scanner(System.in);
    int opcion=0;
    Runnable[] operacionesList=new Runnable[]{
      calculo::suma,
      calculo::resta,
      calculo::mult,
      calculo::divi,
      calculo::residuo

    };
    System.out.print("Ingresa el primer numero: ");
    calculo.setNum1(input.nextDouble());
    System.out.print("Ingresa el segundo numero: ");
    calculo.setNum2(input.nextDouble());

    do {
      System.out.println("Ingresa la operacion que deseas realizar:\n1.-para sumar\n2.-para restar\n3.-para dividir\n4.-para multiplicar\n5.-para calcular el residuo");
      opcion=input.nextInt();
      if(calculo.getNum2()==0&&opcion==3){
        System.out.println("No se puede dividir por 0, intenta de nuevo con otra opcion para salir");
        continue;
      }
      if(6>opcion&&0<opcion)break;
      System.out.println("Opcion invalida, intenta de nuevo...\n");
    }while(true);
    operacionesList[--opcion].run();
    System.out.println("El resultado es:"+calculo.getResult());
  }
}
