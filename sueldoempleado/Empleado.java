package sueldoempleado;
public class Empleado{
  private String nombre;
  private int horasT;
  private double cuotaxHr,sueldo;
  
  public Empleado(){}

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