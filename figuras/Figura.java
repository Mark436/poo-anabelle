package figuras;
public class Figura{
  private double lado;
  private double radio;
  private double perimetro;
  private double area;
  public Figura(){

  }

  public void setLado(double newVal){
    this.lado=newVal;
    this.radio=0;
  }
  public void setRadio(double newVal){
    this.radio=newVal;
    this.lado=0;
  }
  public double getPerimetro(){
    return this.perimetro;
  }
  public double getArea(){
    return this.area;
  }
  
  public void calcularCuadrado(){
    this.area=this.lado*this.lado;
    this.perimetro=this.lado*4;
  }
  public void calcularCirculo(){
    this.area=Math.PI*(this.radio*this.radio);
    this.perimetro=2*(Math.PI*this.radio);
  }
}