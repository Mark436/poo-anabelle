package gestionfiguras;

public class Rectangulo extends Figura{
  private double largo,ancho;
  public void setLargo(double value){
    this.largo=value;
  }
  public void setAncho(double value){
    this.ancho=value;
  }
  public double getLargo(){
    return this.largo;
  }
  public double getAncho(){
    return this.ancho;
  }
  public Rectangulo(){
    this.nombre="Rectangulo";
    this.numLados=4;
  }
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nLargo:"+this.largo+"\nAncho:"+this.ancho;
  }
  @Override
  public double calcularArea(){
    return this.largo*this.ancho;
  }
  @Override
  public double calcularPerimetro(){
    return this.largo*this.numLados;
  }
}