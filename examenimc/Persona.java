package examenimc;

public class Persona{
  private double peso,imc,altura;

  public Persona(){}

  public void setPeso(double peso){
    this.peso=peso;
  }
  public void setAltura(double altura){
    this.altura=altura;
  }
  public double getPeso(){
    return this.peso;
  }
  public double getAltura(){
    return this.altura;
  }
  public void calcularImc(){
    this.imc=this.peso/(this.altura*this.altura);
  }
  public double getIMC(){
    return this.imc;
  }
}