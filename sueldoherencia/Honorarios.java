package sueldoherencia;

public class Honorarios extends Empleado {
  private double cuotaxHr,sueldo;
  private int horasT;
  
  public Honorarios(){
    this.setTipo("Honorarios");
  }

  @Override
  public void setCuotaxHr(double cuota){
    this.cuotaxHr=cuota;
  }
  @Override
  public void setHorasT(int horas){
    this.horasT=horas;
  }
  @Override
  public double getSueldo(){
    return this.sueldo;
  }
  @Override
  public void calcularSueldo(){
    this.sueldo=this.cuotaxHr*this.horasT;
  }
}