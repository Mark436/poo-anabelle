package sueldoherencia;
public class Empleado{
  private String nombre;
  private int horasT;
  private double cuotaxHr,sueldo;
  private String tipo,puesto,rfc;
  public Empleado(){}
  public void setRfc(String newrfc){
    this.rfc=newrfc;
  }
  public void setPuesto(String newPuesto){
    this.puesto=newPuesto;
  }
  public void setTipo(String newTipo){
    this.tipo=newTipo;
  }
  public void setNom(String nombre){
    this.nombre=nombre;
  }
  public void setHorasT(int horasT){
    this.horasT=horasT;
  }
  public void setCuotaxHr(double cuota){
    this.cuotaxHr=cuota;
  }
  public String getNom(){
    return this.nombre;
  }
  public double getSueldo(){
    return this.sueldo;
  }
  public void calcularSueldo(){
    this.sueldo=this.cuotaxHr*this.horasT;
  }
}