package zooabstracto;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class Main{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    ArrayList<Animal> inventario=new ArrayList<>();
    Function<Parametros,Animal>[] animales=new Function[3];
    animales[0]=(param)->{
      Mamifero animal=new Mamifero(param.especie,param.nombre,param.numeroJaula,param.pesoKg);
      return animal;
    };
    animales[1]=(param)->{
      Insecto animal=new Insecto(param.especie,param.nombre,param.numeroJaula,param.pesoKg);
      System.out.print("Ingresa 1 si el insecto vuela:");
      animal.setVuela(1==input.nextInt());
      return animal;
    };
    animales[2]=(param)->{
      Ave animal=new Ave(param.especie,param.nombre,param.numeroJaula,param.pesoKg);
      System.out.print("Ingresa el color del plumaje:");
      animal.setColorPlumaje(input.next());
      System.out.print("Ingresa la altura maxima a la que vuela el ave:");
      animal.setAlturaMax(input.nextDouble());
      return animal;
    };

    System.out.println("Zoologico");
    fuera:
    while(true){
      System.out.println("Ingresa el tipo de animal a ingresar\n1.-Mamifero\n2.-Insecto\n3.-Ave");
      int option=input.nextInt();
      System.out.print("Ingresa la especie del animal:");
      String especie=input.next();
      System.out.print("Ingresa el nombre del animal:");
      String nombre=input.next();
      System.out.print("Ingresa el numero de jaula del animal:");
      int numeroJaula=input.nextInt();
      System.out.print("Ingresa la especie del animal:");
      double peso=input.nextDouble();
  
      Parametros param=new Parametros(especie, nombre, numeroJaula, peso);
      inventario.add(animales[option-1].apply(param));
      while(true){
        System.out.println("Ingresa 1 para salir 2 para mostrar los animales guardados y 3 para agregar mas");
        int optSalir=input.nextInt();
        if(optSalir>3&&optSalir<1){System.out.println("opcion invalida, vuelve a intentar");continue;}
        if(3==optSalir)break;
        for (Animal anim: inventario) {
            System.out.println("\n"+anim.getDetalles());
        }
        if(1==optSalir)break fuera;
      }
    }

  }
  }
