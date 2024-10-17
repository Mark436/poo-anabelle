package veterinariaherencia;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    ArrayList<Animal> animales=new ArrayList<>();


    System.out.println("Bienvenido a veterinaria");
    fuera:
    while(true){
      
      System.out.println("Ingresa el el tipo de servicio a ingresar\n1.-Desparasitar\n2.-Vacunar\n3.-Duchar");
      int tipoServicio=input.nextInt();
      if(!(tipoServicio<4&&tipoServicio>0)){
        System.out.println(tipoServicio+" no es una opcion valida, vuelve a intentar");
        continue;
      }
      
      System.out.print("Ingresa el nombre del propietario: ");
      String propietario=input.next();input.nextLine();
      System.out.print("Ingresa el nombre del animal: ");
      String nombre=input.next();input.nextLine();
      System.out.print("Ingresa la especie: ");
      String especie=input.next();input.nextLine();
      System.out.printf("Ingresa la edad de %s: ",nombre);
      int edad=input.nextInt();input.nextLine();
      Animal animal=new Animal(nombre,especie,edad,propietario);
      animal.setServicio(tipoServicio);

      System.out.printf("Ingrese el precio por %s a %s: ",Servicio.serv[tipoServicio-1].toLowerCase(),nombre);
      animal.setSubTotal(input.nextDouble());
      animal.calcularIva();
      animal.calcularTotal();
      animales.add(animal);
      while(true){      
        System.out.println("Ingresa 0 para salir, 1 para mostrar los animales agregados y 2 para seguir agregando ");
        tipoServicio=input.nextInt();
        
        if(2==tipoServicio)break;
        for(Animal anim: animales)System.out.println(anim.getDetalles());
        if(0==tipoServicio)break fuera;
      }
    }
    input.close();
  }

}