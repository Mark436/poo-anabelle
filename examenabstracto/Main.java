package examenabstracto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    ArrayList<Cliente> habitaciones=new ArrayList();

    System.out.println("Hoteles");
    cerrar:
    while(true){
      System.out.println("Elige un tipo de habitacion:\n1.-Habitacion Regular\n2.-Habitacion Suite");
      int tipoHabitacion=input.nextInt();
  
      if(!(1==tipoHabitacion||2==tipoHabitacion)){
        System.out.println("Ingrese una opcion valida");
        continue;
      }
      
      System.out.println("Habitacion "+(tipoHabitacion==1?"Regular":"Suite"));
      System.out.print("Ingrese el nombre del cliente:");
      String nombre=input.next();
      System.out.print("Ingrese el correo del cliente:");
      String correo=input.next();
  
      if(1==tipoHabitacion){
        HabitacionRegular habitacion=new HabitacionRegular();
        System.out.print("Ingrese los dias de estancia:");
        habitacion.setDias(input.nextInt());
        habitacion.setNombre(nombre);
        habitacion.setCorreo(correo);
        habitacion.calculoTotalPagar();
        habitaciones.add(habitacion);
      }else{
        HabitacionSuite habitacion=new HabitacionSuite();
        System.out.print("Ingrese los dias de estancia:");
        habitacion.setDias(input.nextInt());
        System.out.print("Ingrese el consumo de minibar del cliente:");
        habitacion.setConsumoMinibar(input.nextDouble());
        habitacion.setNombre(nombre);
        habitacion.setCorreo(correo);
        habitacion.calculoTotalPagar();
        habitaciones.add(habitacion);
      }
  
      while (true) { 
        System.out.println("Ingrese\n1.-para ingresar mas clientes\n2.-para ver los agregados\n3.-para salir");
        int menuOpt=input.nextInt();
        if(menuOpt>3||menuOpt<1)System.out.println("Opcion invalida, vuelve a intentar");
        if(1==menuOpt)break;
        for (Cliente hab : habitaciones)System.out.println(hab.mostrarInformacion()+"\n"+hab.mostrarTotal());
        if(3==menuOpt)break cerrar;
      }
    }
    
  }
}