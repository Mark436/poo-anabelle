package sueldoabstracto;

public class Honorarios extends Empleado {
  
  public Honorarios(){
    this.setTipo("Honorarios");
  }
  @Override
  public double calcularAfore(){
    return 40<this.horasT?500.0:100.0;
  }
  @Override
  public void calcularSueldo(){
    double montoAfore=calcularAfore();
    this.sueldo=(this.cuotaxHr*this.horasT)+montoAfore;
  }
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nSueldo: "+this.sueldo+"\nCuota por hora: "+this.cuotaxHr+"\nHoras trabajadas: "+this.horasT;
  }
}