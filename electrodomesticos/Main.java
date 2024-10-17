package electrodomesticos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main{
  
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    BiFunction<String,Double,Electrodomestico>[] electros=new BiFunction[2];
    electros[0]=(modelo,potencia)->{
      Lavadora lavadora=new Lavadora(modelo,potencia);
      
      System.out.print("\nIngrese el precio:");
      lavadora.setPrecio(input.nextDouble());
      System.out.print("\nIngrese si tiene agua caliente\n1.-Si\n2.-No:");
      lavadora.setAguaCaliente(1==input.nextInt());

      return lavadora;
    };
    electros[1]=(modelo,potencia)->{
      Refrigerador refri=new Refrigerador(modelo,potencia);
      
      System.out.print("\nIngrese el precio:");
      refri.setPrecio(input.nextDouble());
      System.out.print("\nIngrese si tiene hielera\n1.-Si\n2.-No:");
      refri.setHielera(1==input.nextInt());
      
      return refri;
    };
    ArrayList<Electrodomestico> electrodomesticos=new ArrayList<>();


    System.out.println("Bienvenido a electrodomesticos");
    while(true){
      System.out.println("Ingresa el el tipo de electrodomestico a ingresar\n1.-Lavadra\n2.-Refrigerador\n");
      int tipoElec=input.nextInt();
      if(!(tipoElec<3&&tipoElec>0)){
        System.out.println(tipoElec+" no es una opcion valida, vuelve a intentar");
      }
      System.out.print("Ingresa la marca: ");
      String marca=input.next();
      System.out.print("Ingresa la potencia:");
      double potencia=input.nextDouble();
      electrodomesticos.add(electros[tipoElec-1].apply(marca,potencia));
      
      System.out.println("Ingresa 0 para salir, 1 para mostrar los electrodomesticos agregados y 2 para seguir agregando ");
      tipoElec=input.nextInt();
      
      if(1==tipoElec||0==tipoElec)
        for(Electrodomestico electrodomestico: electrodomesticos)
          System.out.println(electrodomestico.getDetalles());
        
      if(0==tipoElec)break;
    }
    input.close();
  }

}