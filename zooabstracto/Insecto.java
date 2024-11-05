package zooabstracto;

public class Insecto extends Animal{
  protected boolean vuela;
  public void setVuela(boolean vuela){
    this.vuela=vuela;
  }
  public boolean getVuela(){
    return this.vuela;
  }
  @Override
  public String definirClaseDeAnimalEres(){
    return "Insecto";
  }
}