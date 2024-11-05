package zooabstracto;

public class Ave extends Animal{
  protected String colorPlumaje;
  protected double alturaMaxima;
  public void setColorPlumaje(String color){
    this.colorPlumaje=color;
  }
  public void setAlturaMax(double altura){
    this.alturaMaxima=altura;
  }
  public String getColorPlumaje(){
    return this.colorPlumaje;
  }
  public double getAlturaMax(){
    return this.alturaMaxima;
  }
  @Override
  public String definirClaseDeAnimalEres(){
    return "Ave";
  }
}