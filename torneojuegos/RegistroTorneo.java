package torneojuegos;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroTorneo {
  private static final Scanner input=new Scanner(System.in);

  public static String recibirNombreApellido(String campo,Jugador newJugador){
    boolean intentar=true;
    String dato="";
    while(intentar){
      System.out.printf("Ingresa %s del jugador:",campo.equalsIgnoreCase("nombre")?"el nombre":"los apellidos");
      dato=input.nextLine();
      intentar=!Equipo.validarNombreAp(dato, campo);
      
      if(!intentar)break;
      System.out.printf("%s no debe incluir numeros ni superar los 12 caracteres\n",campo.equalsIgnoreCase("nombre")?"El nombre":"Los apellidos");      
    }
    return dato;
  }
  public static int entradaMenu(int min,int max,String msg){
    int opt;
    while(true){
      try{
        opt=input.nextInt();input.nextLine();
      }catch(InputMismatchException e){
        System.out.println("Solo se aceptan numeros");
        input.nextLine();
        System.out.println(msg);
        continue;
      }
      if(opt<min||opt>max){
        System.out.println("Ingrese una opcion valida");
        System.out.println(msg);
        continue;
      }
      break;
    }
    return opt;
  }
  public static void main(String[] args){
    ArrayList<Equipo> equipos=new ArrayList<>();
    System.out.println("Torneo videojuegos");
    salir:
    while(true){
      System.out.println("Ingresa el nombre del equipo");
      String nombreEquipo=input.nextLine();
      System.out.println("Ingresa la ciudad del equipo");
      String ciudad=input.nextLine();
      System.out.println("Ingresa el videojuego del equipo");
      String videoJuego=input.nextLine();

      Equipo equipo=new Equipo(nombreEquipo, ciudad, videoJuego);
      System.out.println("Ingrese los jugadores:");
      while(true){
        Jugador newJugador=new Jugador();
        newJugador.setNombre(recibirNombreApellido("nombre", newJugador));
        newJugador.setApellidos(recibirNombreApellido("apellido", newJugador));
        try{
          equipo.addJugador(newJugador);
        }catch(ValidaDatosExcepcion e){
          System.out.println(e.getMessage());
          continue;
        }
        if(equipo.getEspaciosDisp()==0)break;
        String msg=String.format("Desea ingresar otro jugador? le quedan %s espacios\n1.-Si\n2.-No\n",equipo.getEspaciosDisp());
        System.out.print(msg);
        int opt=entradaMenu(1, 2, msg);
        if(opt==2)break;
      }
      
      int opt;
      equipos.add(equipo);
      while(true){
        String msg="que desea hacer?\n1.-Ingresar otro equipo\n2.-salir\n3.-mostrar la informacion de los equipos\n";
        System.out.println(msg);
        opt=entradaMenu(1,3,msg);
        if(opt!=1)for(Equipo equipoView : equipos)System.out.println(equipoView.getData()+"\n");
        if(opt==1)break;
        if(opt==2)break salir;
      } 
    }
  }
}