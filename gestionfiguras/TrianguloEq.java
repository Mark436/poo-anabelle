package gestionfiguras;

public class TrianguloEq extends Figura{
  private double altura,base;
  public void setAltura(double value){
    this.altura=value;
  }
  public void setBase(double value){
    this.base=value;
  }
  public double getAltura(){
    return this.altura;
  }
  public double getBase(){
    return this.base;
  }
  public TrianguloEq(){
    this.nombre="Triangulo Equilatero";
    this.numLados=3;
  }
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nBase:"+this.base+"\nAltura:"+this.altura;
  }
  @Override
  public double calcularArea(){
    return this.base*(this.altura/2);
  }
  @Override
  public double calcularPerimetro(){
    return this.base*this.numLados;
  }
}