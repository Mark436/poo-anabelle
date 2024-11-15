package zooabstracto;

public class Mamifero extends Animal{
  public Mamifero(){}
  public Mamifero(String especie,String nombre,int numeroJaula,double peso){
    super(especie,nombre,numeroJaula,peso);
  }
  @Override
  public String definirClaseDeAnimalEres(){
    return "Mamifero";
  }
}