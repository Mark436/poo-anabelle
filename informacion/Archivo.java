package informacion;

import java.io.*;

public class Archivo {
  private File archivo;

  public Archivo(String route){
    this.archivo=new File(route);
  }
  public void escribeMensaje(String mensaje){
    try(BufferedWriter escribe=new BufferedWriter(new FileWriter(this.archivo))){
      escribe.write(mensaje+"\n");
      System.out.println("El mensaje se ha escrito exitosamente\n");
    }catch(IOException e){
      System.out.println("Error al escribir el archivo: "+e.getMessage());
    }
  }
  public void leerArchivo(){
    try(BufferedReader leer=new BufferedReader(new FileReader(this.archivo))){
      String linea;
      //System.out.println("ENTRO AQUI");
      while((linea=leer.readLine())!=null)System.out.println(linea);
    }catch(IOException e){
      System.out.println("Error al leer el archivo: "+e.getMessage());
    }
  }
  public void agregaContenido(String contenido){
    try(BufferedWriter escritor=new BufferedWriter(new FileWriter(this.archivo,true))){
      escritor.newLine();
      escritor.write(contenido);
      System.out.println("se ha añadido correctamente el archivo\n"); 
    }catch(IOException e){
      System.out.println("Error al añadir contenido al archivo: "+e.getMessage());
    }
  }

}