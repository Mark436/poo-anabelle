package gasolinera;

public class Gasolina{
  private double precioLitro,galones;

  public Gasolina() {
  }
  
  public void setGalones(double galones){
    this.galones=galones;
  }
  public void setPrecioXLitro(double precio){
    this.precioLitro=precio;
  }
  public double getLitros(){
    return this.galones*3.7854118;
  }
  public double getPrecioFinal(){
    return this.getLitros()*this.precioLitro;
  }
}