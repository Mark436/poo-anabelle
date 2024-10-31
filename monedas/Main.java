package monedas;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String[] tipos={"Dolares","Euros","Yenes","Soles"};
    BiFunction<Double,Boolean,Double>[] cambios=new BiFunction[4];
    cambios[0]=(dinero,inversa)->{
      Dolares cambio=new Dolares();
      if(inversa){
        return cambio.convertirInverso(dinero);
      }
      cambio.setPesos(dinero);
      return cambio.convertir();
      
    };
    cambios[1]=(dinero,inversa)->{
      Euros cambio=new Euros();
      if(inversa){
        return cambio.convertirInverso(dinero);
      }
      cambio.setPesos(dinero);
      return cambio.convertir();
      
    };
    cambios[2]=(dinero,inversa)->{
      Yenes cambio=new Yenes();
      if(inversa){
        return cambio.convertirInverso(dinero);
      }
      cambio.setPesos(dinero);
      return cambio.convertir();
      
    };
    cambios[3]=(dinero,inversa)->{
      Soles cambio=new Soles();
      if(inversa){
        return cambio.convertirInverso(dinero);
      }
      cambio.setPesos(dinero);
      return cambio.convertir();
    };
    
    System.out.println("Conversor de monedas");
    while (true) { 
      System.out.println("Ingrese lo que desea convertir\n1.Dolares\n2.Euros\n3.Yenes\n4.Soles");
      int tipo=input.nextInt();
      --tipo;//evitar out of bounds
      System.out.printf("Ingresa \n1.-para convertir pesos a %s\n2.-para convertir %s a pesos\n",tipos[tipo],tipos[tipo]);
      boolean inversa=input.nextInt()==2  ;
      System.out.printf("Ingrese la cantidad a convertir: ");
      double dinero=input.nextDouble();
      double resultado=cambios[(tipo)].apply(dinero,inversa);
      System.out.printf("Sus %s %s se convierte a %s %s",dinero,inversa?tipos[tipo]:"pesos",resultado,!inversa?tipos[tipo]:"pesos\n");
    }
  }
}