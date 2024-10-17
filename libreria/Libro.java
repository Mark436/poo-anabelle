package libreria;

public class Libro {
  private String titulo,ISBN;
  private double precio;

  public void setTitulo(String newTit){
    this.titulo=newTit;
  }
  public void setISBN(String newID){
    this.ISBN=newID;
  }
  public void setPrecio(double newPrecio){
    this.precio=newPrecio;
  }
  public String getTitulo(){
    return this.titulo;
  }
  public String getISBN(){
    return this.ISBN;
  }
  public double getPrecio(){
    return this.precio;
  }
}

