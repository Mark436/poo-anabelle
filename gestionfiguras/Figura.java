package gestionfiguras;

public abstract class Figura{
  protected String nombre;
  protected int numLados;
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setNumLados(int lados){
    this.numLados=lados;
  }
  public String getNombre(){
    return this.nombre;
  }
  public int getNumLados(){
    return this.numLados;
  }
  public Figura(){}
  public Figura(String nombre,int lados){
    this.nombre=nombre;
    this.numLados=lados;
  }
  public String getDetalles(){
    return ""+this.nombre+"\nLados:"+this.numLados+"\nArea:"+this.calcularArea()+"\nPerimetro:"+this.calcularPerimetro();
  }
  public abstract double calcularArea();
  public abstract double calcularPerimetro();
}