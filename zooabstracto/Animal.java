package zooabstracto;

public abstract class Animal{
  protected String especie,nombre;
  protected double pesoKg;
  protected int numeroJaula;
  public Animal(){}
  public Animal(String especie,String nombre,int numeroJaula,double peso){
    this.especie=especie;
    this.nombre=nombre;
    this.numeroJaula=numeroJaula;
    this.pesoKg=peso;
  }

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
  public String getDetalles(){
    return "Clase:"+this.definirClaseDeAnimalEres()+"\nEspecie:"+this.especie+"\nNombre:"+this.nombre+"\nNumero de Jaula:"+this.numeroJaula+"\nPeso en kg:"+this.pesoKg;
  }
  public abstract String definirClaseDeAnimalEres();

}