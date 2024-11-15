package examenabstracto;

public abstract class Cliente implements IClienteHotel{
  protected String nombre,correo;
  protected double total;
  public void setTotal(double total){
    this.total=total;
  }
  public double getTotal(){
    return this.total;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setCorreo(String correo){
    this.correo=correo;
  }
  public String getNombre(){
    return this.nombre;
  }
  public String getCorreo(){
    return this.correo;
  }
  @Override
  public String mostrarInformacion(){
    return "Cliente:\n Nombre:"+this.nombre+"\n Correo:"+this.correo;
  }
  @Override 
  public String mostrarTotal(){
    return "El total es: "+this.total;
  }
  public abstract void calculoTotalPagar();
}