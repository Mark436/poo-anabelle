package electrodomesticos;

public class Refrigerador extends Electrodomestico{
  private double precio;
  private boolean hielera;

  public Refrigerador(String marca,double potencia){
    super("Refrigerador", marca, potencia);
  }
  public Refrigerador(String marca,double potencia,double precio,boolean hielera){
    super("lavadora",marca,potencia);
    this.precio=precio;
    this.hielera=hielera;
  }
  public void setPrecio(double precio){
    this.precio=precio;
  }
  public void setHielera(boolean hielera){
    this.hielera=hielera;
  }
  public double getPrecio(){
    return this.precio;
  }
  public boolean getHielera(){
    return this.hielera;
  }
  @Override
  public double getConsumo(int horas){
    return horas*(this.getPotencia()*(this.hielera?2.2:1));
  }
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nPrecio:"+this.precio+(this.hielera?"\nCon hielera":"\nSin hielera");
  }
}
