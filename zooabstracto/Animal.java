package zooabstracto;

public abstract class Animal{
  protected String especie,nombre;
  protected double pesoKg;
  protected int numeroJaula;
  public void setEspecie(String newval){
    this.especie=newval;
  }
  public void setNombre(String newval){
    this.nombre=newval;
  }
  public void setPeso(double newval){
    this.pesoKg=newval;
  }
  public void setNumeroJaula(int newval){
    this.numeroJaula=newval;
  }
  public String getEspecie(){
    return this.especie;
  }
  public String getNombre(){
    return this.nombre;
  }
  public double getPeso(){
    return this.pesoKg;
  }
  public int getNumeroJaula(){
    return this.numeroJaula;
  }
  public abstract String definirClaseDeAnimalEres();

}