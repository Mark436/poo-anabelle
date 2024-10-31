package monedas;

public class Euros implements IConvertir{
  private double pesos,euros;
  final private double referencia=21.9;
  public void setPesos(double pesos){
    this.pesos=pesos;
  }
  public double getPesos(){
    return this.pesos;
  }
  @Override
  public double convertir(){
    this.euros=this.pesos/this.referencia;
    return this.euros;
  }
  public double convertirInverso(double euros){
    this.pesos=euros*this.referencia;
    return this.pesos;
  }
}