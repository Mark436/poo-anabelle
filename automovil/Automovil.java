package automovil;

public class Automovil{
  private double precio,comision;
  private double impuesto=0.16;
  public Automovil(){}
  public void setPrecio(double val){
    this.precio=val;
  }
  public void setComision(double val){
    this.comision=val/100;
  }
  public void setImpuesto(double val){
    this.impuesto=val/100;
  }
  public double getPrecioFinal(){
    return this.precio+(this.getComision())+(this.precio*this.impuesto);
  }
  public double getComision(){
    return this.comision*this.precio;
  }
}