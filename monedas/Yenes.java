package monedas;

public class Yenes implements IConvertir{
  private double pesos,yenes;
  final private double referencia=.13;
  public void setPesos(double pesos){
    this.pesos=pesos;
  }
  public double getPesos(){
    return this.pesos;
  }
  @Override
  public double convertir(){
    this.yenes=this.pesos/this.referencia;
    return this.yenes;
  }
  public double convertirInverso(double yenes){
    this.pesos=yenes*this.referencia;
    return this.pesos;
  }
}