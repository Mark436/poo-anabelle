package libreria;

public class AudioLibro extends Libro{
  private int minReproduccion;
  private String formato;
  
  public AudioLibro(){}
  
  public void setMinReproduccion(int minReproduccion){
    this.minReproduccion=minReproduccion;
  }
  public void setFormat(String newFormat){
    this.formato=newFormat;
  }
  public int getMinReproduccion(){
    return this.minReproduccion;
  }
  public String getFormat(){
    return this.formato;
  }
}
