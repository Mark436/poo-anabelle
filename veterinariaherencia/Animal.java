package veterinariaherencia;

public class Animal extends Servicio{ 
  private String nombre,especie,owner;
  private int edad;

  public String getNombre(){
    return this.nombre;
  }
  public String getEspecie(){
    return this.especie;
  }
  public String getPropietario(){
    return this.owner;
}
  public Animal(String nombre,String especie,int edad,String propietario){
    this.nombre=nombre;
    this.especie=especie;
    this.edad=edad;
    this.owner=propietario;
  }
  @Override
  public String getDetalles(){
    return "\nPropietario: "+this.owner+"\nNombre: "+this.nombre+"\nEspecie: "+this.especie+"\nEdad: "+this.edad+"\nServicio:\n"+super.getDetalles();
  }
  }