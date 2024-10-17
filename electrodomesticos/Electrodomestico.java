package electrodomesticos;

public class Electrodomestico{
  private String tipo,marca;
  private double potencia;

  public Electrodomestico(String tipo, String marca, double potencia){
    this.tipo=tipo;
    this.marca=marca;
    this.potencia=potencia;
  }
  public void setTipo(String tipo){
    this.tipo=tipo;
  }
  public void setMarca(String marca){
    this.marca=marca;
  }
  public void setPotencia(double potencia){
    this.potencia=potencia;
  }
  public String getTipo(){
    return this.tipo;
  }
  public String getMarca(){
    return this.marca;
  }
  public double getPotencia(){
    return this.potencia;
  }
  
  public double getConsumo(int hrs){
    return this.potencia*hrs;
  }
  public double getCosteConsumo(int horas,double costeHora){
    return horas*costeHora;
  }
  protected String getDetalles(){
    return "\n"+this.tipo+"\nMarca: "+this.marca+"\nPotencia: "+this.potencia; 
  }
}