package monedas;

public class Soles implements IConvertir{
  private double pesos,soles;
  final private double referencia=5.37;
  public void setPesos(double pesos){
    this.pesos=pesos;
  }
  public double getPesos(){
    return this.pesos;
  }
  @Override
  public double convertir(){
    this.soles=this.pesos/this.referencia;
    return this.soles;
  }
  public double convertirInverso(double soles){
    this.pesos=soles*this.referencia;
    return this.pesos;
  }
}