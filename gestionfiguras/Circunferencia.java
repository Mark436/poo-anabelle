package gestionfiguras;

public class Circunferencia extends Figura{
  private double radio;
  public void setRadio(double value){
    this.radio=value;
  }
  public double getRadio(){
    return this.radio;
  }
  public Circunferencia(){
    this.nombre="Circunferencia";
    this.numLados=1;
  }
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nRadio:"+this.radio;
  }
  @Override
  public double calcularArea(){
    return this.radio*this.radio*Math.PI;
  }
  @Override
  public double calcularPerimetro(){
    return this.radio*Math.PI*2;
  }
}