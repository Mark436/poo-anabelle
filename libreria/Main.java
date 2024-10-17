package libreria;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    ArrayList<Object> libros=new ArrayList<>();

    System.out.println("Bienvenido a libros");

    while(true){
      System.out.println("Ingresa el tipo de libro que vas a ingresar\n1.Audio libro\n2.Libro impreso");
      int in=input.nextInt();input.nextLine();
      if(!(in<3&&in>0)){
        System.out.printf("%d No es un valor valido, ingresa 1 o 2",in);
        continue;
      }
      if(1==in){
        AudioLibro libro=new AudioLibro();
        System.out.print("Ingresa el titulo del audio libro: ");
        libro.setTitulo(input.nextLine());
        System.out.printf("\nIngrese el ISBN de %s: ",libro.getTitulo());
        libro.setISBN(input.nextLine());
        System.out.print("\nIngrese el precio: ");
        libro.setPrecio(input.nextDouble());
        System.out.print("\nIngrese el tiempo de reproduccion en minutos: ");
        libro.setMinReproduccion(input.nextInt());
        
        while(true){
        System.out.println("\nIngrese el formato \n1.-CD\n2.-mp3:\n3.-wma");
        int formatito=input.nextInt();input.nextLine();
        if(formatito>3||formatito<1){
          System.out.println("Formato invalido vuelve a intentar");
          continue;
        }
        if(1==formatito)libro.setFormat("CD");
        if(2==formatito)libro.setFormat("mp3");
        if(3==formatito)libro.setFormat("wma");
        break;
        }

        System.out.println("Ingrese 0 si de sea salir, 1 si desea volver a agregar otro libro");
        in=input.nextInt();
        libros.add(libro);
        if(0==in)break;
        continue;
      }
      LibroImpreso libro=new LibroImpreso();
      System.out.print("Ingresa el titulo del audio libro: ");
      libro.setTitulo(input.next());input.nextLine();
      System.out.printf("\nIngrese el ISBN de %s: ",libro.getTitulo());
      libro.setISBN(input.nextLine());
      System.out.print("\nIngrese el precio: ");
      libro.setPrecio(input.nextDouble());
      System.out.print("\nIngrese el numero de paginas: ");
      libro.setNumPag(input.nextInt());
      System.out.print("\nIngrese las paginas que lee por minuto: ");
      libro.setPagxMin(input.nextInt());
      libro.calcTiempoLec();
      System.out.printf("\nLeer %s le tomara %d minutos o %d horas",libro.getTitulo(),libro.getTiempoLec(),libro.getTiempoLec()/60);
        
      System.out.println("\nIngrese 0 si de sea salir, 1 si desea volver a agregar otro libro");
      in=input.nextInt();
      
      libros.add(libro);
      if(in==0)break;
    }
    for ( Object lib : libros) {
      if(lib instanceof LibroImpreso libro){
        System.out.printf("\nLibro %s\nISBN: %s\nprecio: %s\nNumero de paginas: %s\nPaginas x Minuto:%s\nTiempo de lectura(min//hrs):%s//%d\n",libro.getTitulo(),libro.getISBN(),libro.getPrecio(),libro.getNumPag(),libro.getPagXMin(),libro.getTiempoLec(),(libro.getTiempoLec()/60));
        continue;
      }
      AudioLibro libro=(AudioLibro)lib;
      System.out.printf("\nLibro %s\nISBN: %s\nprecio: %f\nTiempo de Reproduccion(Min//hrs): %s//%d\nFormato:%s\n",libro.getTitulo(),libro.getISBN(),libro.getPrecio(),libro.getMinReproduccion(),(libro.getMinReproduccion()/60),libro.getFormat());
    }
    input.close();
  }
}