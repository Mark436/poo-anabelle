import java.util.Scanner;
public class controlEscolar{
  static String[] materias=new String[2];
  static Scanner input=new Scanner(System.in);
  static String[] alumnos=new String[2];
  static Integer[][] calificaciones=new Integer[2][2];

  public static void capAlumnos(){
    System.out.println("Capturando alumnos...");
    for(int i=0;i<alumnos.length;i++){
      System.out.printf("Ingresa el nombre del alumno %d: ",(i+1));
      alumnos[i]=input.nextLine();
    }
  }
  public static void capMaterias(){
    System.out.println("Capturando materias...");
    for(int i=0;i<materias.length;i++){
      System.out.printf("Ingresa la materia %d: ",(i+1));
      materias[i]=input.nextLine();
    }
  }
  public static void capCalificaciones(){
    System.out.println("Capturando calificaciones...");
    for(int i=0;i<calificaciones.length;i++){
      for(int o=0;o<calificaciones[i].length;o++){
        System.out.printf("Ingresa la calificacion de %s en %s: ",alumnos[i],materias[o]);
        calificaciones[i][o]=input.nextInt();input.nextLine();
      }
    }
  }
  public static void main(String[]args){
    capAlumnos();
    capMaterias();
    capCalificaciones();
    for(int i=0;i<calificaciones.length;i++)
      for(int o=0;o<calificaciones[i].length;o++)
        System.out.printf("%s tuvo calificacion de %d en %s\n",
        alumnos[i],calificaciones[i][o],materias[o]);
      
    
}
}
