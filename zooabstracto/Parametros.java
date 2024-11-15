package zooabstracto;
class Parametros extends Animal{
  public Parametros(String especie,String nombre,int numeroJaula,double peso){
    this.especie=especie;
    this.nombre=nombre;
    this.numeroJaula=numeroJaula;
    this.pesoKg=peso;
  }
  @Override
  public String definirClaseDeAnimalEres(){return "";};
}