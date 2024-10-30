package transporte;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    ArrayList<Transporte> transportes=new ArrayList();
    System.out.println("TRANSPORTES");
    fuera:
    while(true){
      System.out.println("Que desea rentar?\n1.-Auto\n2.-Moto");
      int vehiculo=input.nextInt();

      System.out.printf("Ingresa la marca de%s: ",vehiculo==1?"l auto":" la moto");
      String brand=input.next();
      System.out.printf("Ingresa las placas de%s: ",vehiculo==1?"l auto":" la moto");
      String placas=input.next();
      System.out.printf("Ingresa el año de%s: ",vehiculo==1?"l auto":" la moto");
      int year=input.nextInt();
      System.out.printf("Ingresa %s: ",vehiculo==1?"los dias a rentar el auto":"las horas a rentar la moto");
      int tiempo=input.nextInt();
      if(vehiculo==1){//auto
        Auto auto=new Auto();
        auto.setBrand(brand);
        auto.setPlate(placas);
        auto.setYear(year);
        auto.setDias(tiempo);
        System.out.println("Ingrese el tipo de transmisión\n1.-Automática\n2.-Manual");
        auto.setTransmision(input.nextInt());
        System.out.println("Ingresa el sub tipo del auto\n1.-Sedán\n2.-Compacto\n3.-SUV\n4.-Deportivo");
        auto.setSubType((input.nextInt()-1));
        auto.calculoPago();
        transportes.add(auto);
      }
      else{
        Motocicleta moto=new Motocicleta();
        moto.setBrand(brand);
        moto.setPlate(placas);
        moto.setYear(year);
        moto.setHoras(tiempo);
  
        System.out.println("Ingresa el sub tipo del auto\n1.-Scooters\n2.-Enduro\n3.-Trails\n4.-Cruiser");
        moto.setSubType((input.nextInt()-1));
        moto.calculoPago();
        transportes.add(moto);
      }
      boolean preguntar=true;
      while(preguntar){System.out.println("Ingresa\n1.-Para ingresar más vehiculos\n2.-Para mostrar la informacion de los agregados\n3.-Para salir");
      int option=input.nextInt();
      if(1==option)break;
      if(1!=option)for(Transporte tran:transportes)System.out.println(tran.getDetalles());
      if(3==option)break fuera;
      }
    }
  }
}