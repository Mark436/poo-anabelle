package alumnos;
import java.util.Scanner;
public class Registro{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int cantidadAl=0;
    do{
    System.out.println("Bienvenido al sistema de registro de alumnos, cuantos alumnos desea registrar?");
    cantidadAl=input.nextInt();input.nextLine();
    if(0>=cantidadAl){
      System.out.println("Cantidad inválida, es necesario por lo menos un alumno");
      continue;
    }
    break;
    }while(true);
    Alumno[] alumnos=new Alumno[cantidadAl];
    for(int i=0;i<alumnos.length;i++){
      alumnos[i]=new Alumno();
      System.out.printf("Ingrese los datos del alumno numero %d",(i+1));
      System.out.print("\nNombre: ");
      alumnos[i].setNombre(input.nextLine());

      System.out.print("\nApellido paterno: ");
      alumnos[i].setApellido(input.nextLine());

      System.out.print("\nApellido materno: ");
      alumnos[i].setSegApellido(input.nextLine());

      System.out.print("\nFecha de nacimiento (dd/mm/yyyy): ");
      alumnos[i].setFechaNac(input.nextLine());

      System.out.print("\nNo. control: ");
      alumnos[i].setNoCtrl(input.nextLine());

      System.out.print("\nRFC: ");
      alumnos[i].setRFC(input.nextLine());

      for(int o=0;o<3;o++){
        System.out.printf("\nCalificacion no.%d: ",(o+1));
        alumnos[i].setCalificacion(o,input.nextDouble());
      alumnos[i].calcularPromedio();
      }input.nextLine();
      if(alumnos.length==1)break;
    }

    for(int i=0;i<alumnos.length;i++){
      System.out.printf("\nLos datos del alumno %d son:\nNombre completo: %s %s %s\nFecha de nacimiento: %s\nNo. Control: %s\nRFC: %s\nPromedio:%f\n"
      ,(i+1),alumnos[i].getNombre(),alumnos[i].getApellido(),alumnos[i].getSegApellido(),alumnos[i].getFechaNac(),alumnos[i].getNoCtrl(),alumnos[i].getRFC(),alumnos[i].getPromedio());
    }
    input.close();
  }
}