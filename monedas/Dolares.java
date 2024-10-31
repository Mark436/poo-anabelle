package monedas;

public class Dolares implements IConvertir{
  private double pesos,dolares;
  final private double referencia=20.18;
  public void setPesos(double pesos){
    this.pesos=pesos;
  }
  public double getPesos(){
    return this.pesos;
  }
  @Override
  public double convertir(){
    this.dolares=this.pesos/this.referencia;
    return this.dolares;
  }
  public double convertirInverso(double dolares){
    this.pesos=dolares*this.referencia;
    return this.pesos;
  }
}