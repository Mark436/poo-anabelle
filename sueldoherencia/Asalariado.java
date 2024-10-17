package sueldoherencia;

public class Asalariado extends Empleado{
  private double sueldoBase,sueldoQuincenal;

  public Asalariado(){
    this.setTipo("Asalariado");
  }
  
  public void setSueldoBase(double sueldoB){
    this.sueldoBase=sueldoB;
  }
  public double getSueldoQuincenal(){
    return this.sueldoQuincenal;
  }
  @Override
  public void calcularSueldo(){
    this.sueldoQuincenal=sueldoBase/2.0;
  }
}