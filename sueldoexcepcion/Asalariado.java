package sueldoexcepcion;

public class Asalariado extends Empleado{
  private double sueldoBase,sueldoQuincenal;

  public Asalariado(){
    this.setTipo("Asalariado");
  }
  public Asalariado(String nombre,String tipo,String rfc)throws ErrorEntradaException{
    this.setTipo("Asalariado");
    this.setNom(nombre);
    this.setPuesto(tipo);
    this.setRfc(rfc);
  }
  public void setSueldoBase(double sueldoB){
    this.sueldoBase=sueldoB;
  }
  private double getSueldoQuincenal(){
    return this.sueldoQuincenal;
  }
  @Override
  public double calcularAfore(){
    return 1000.0;
  }
  @Override
  public double getSueldo(){
    return this.getSueldoQuincenal()+calcularAfore();
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