package zooabstracto;

public class Insecto extends Animal{
  protected boolean vuela;
  public void setVuela(boolean vuela){
    this.vuela=vuela;
  }
  public boolean getVuela(){
    return this.vuela;
  }
  public Insecto(){}
  public Insecto(String especie,String nombre,int numeroJaula,double peso){
    super(especie,nombre,numeroJaula,peso);
  }
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nVuela?:"+(this.vuela?"Si":"No");
  }
  @Override
  public String definirClaseDeAnimalEres(){
    return "Insecto";
  }
}