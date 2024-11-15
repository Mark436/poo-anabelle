package gestionfiguras;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    ArrayList<Figura> inventario=new ArrayList<>();
    Supplier<Figura>[] tipoFigura=new Supplier[3];
    tipoFigura[0]=()->{
      Rectangulo figura=new Rectangulo();
      System.out.print("Ingresa el largo:");
      figura.setLargo(input.nextDouble());
      System.out.print("Ingresa el ancho:");
      figura.setAncho(input.nextDouble());
      return figura;
    };
    tipoFigura[1]=()->{
      TrianguloEq figura=new TrianguloEq();
      System.out.print("Ingresa la base:");
      figura.setBase(input.nextDouble());
      System.out.print("Ingresa la altura:");
      figura.setAltura(input.nextDouble());
      return figura;
    };
    tipoFigura[2]=()->{
      Circunferencia figura=new Circunferencia();
      System.out.print("Ingresa el radio de la circunferencia:");
      figura.setRadio(input.nextDouble());
      return figura;
    };

    System.out.println("Zoologico");
    fuera:
    while(true){
      System.out.println("Ingresa el tipo de figura a ingresar\n1.-Rectangulo\n2.-Triangulo equilatero\n3.-Circunferencia");
      int option=input.nextInt();
  
      inventario.add(tipoFigura[option-1].get());
      while(true){
        System.out.println("Ingresa 1 para salir 2 para mostrar las figuras guardadas y 3 para agregar mas");
        int optSalir=input.nextInt();
        if(optSalir>3&&optSalir<1){System.out.println("opcion invalida, vuelve a intentar");continue;}
        if(3==optSalir)break;
        for (Figura figura: inventario) {
            System.out.println("\n"+figura.getDetalles());
        }
        if(1==optSalir)break fuera;
      }
    }

  }
  }
