package torneojuegos;

public class Jugador{
  private String nombre,apellidos;
  public Jugador(String nombre,String apellidos){
    this.nombre=nombre;
    this.apellidos=apellidos;
  }
  public Jugador(){}
  public void setNombre(String nom){
    this.nombre=nom;
  }
  public void setApellidos(String apellidos){
    this.apellidos=apellidos;
  }
  public String getNombreCompleto(){
    return nombre+" "+apellidos;
  }

}