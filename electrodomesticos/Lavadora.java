package electrodomesticos;

public class Lavadora extends Electrodomestico{
  private double precio;
  private boolean aguaCaliente;

  public Lavadora(String marca,double potencia){
    super("lavadora",marca,potencia);
    aguaCaliente=false;
  }
  public Lavadora(String marca,double potencia,double precio,boolean aguaCaliente){
    super("Lavadora",marca,potencia);
    this.precio=precio;
    this.aguaCaliente=aguaCaliente;
  }
  public void setPrecio(double precio){
    this.precio=precio;
  }
  public void setAguaCaliente(boolean agua){
    this.aguaCaliente=agua;
  }
  public double getPrecio(){
    return this.precio;
  }
  public boolean getAguaCaliente(){
    return this.aguaCaliente;
  }
  @Override
  public double getConsumo(int horas){
    return horas*(this.getPotencia()*(this.aguaCaliente?2.2:1));
  }
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nPrecio: "+this.precio+"\nCon agua "+(this.aguaCaliente?"caliente":"fria");
  }
}