package sueldoabstracto;

public class Asalariado extends Empleado{
  private double sueldoBase,sueldoQuincenal;

  public Asalariado(){
    this.setTipo("Asalariado");
  }
  
  public void setSueldoBase(double sueldoB){
    this.sueldoBase=sueldoB;
  }
  private double getSueldoQuincenal(){
    return this.sueldoQuincenal;
  }
  public double calcAfore(){
    return 1000.0;
  }
  @Override
  public double getSueldo(){
    return this.getSueldoQuincenal()+calcAfore();
  }
  @Override
  public void calcularSueldo(){
    this.sueldoQuincenal=sueldoBase/2.0;
  }
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nSueldo base: "+this.sueldoBase+"\nSueldo quincenal: "+this.sueldoQuincenal;
  }
  
}