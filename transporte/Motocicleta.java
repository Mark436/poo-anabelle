package transporte;


public class Motocicleta extends Transporte {
  private String subType;//scooters, enduro, trails, cruiser
  private double costoHoras, rentaTotal;
  private int horas;

  public Motocicleta() {
    super("Motocicleta", "", "", 0);
  }
  public void setSubType(int subType) {
    String[] subtipoMotos={"Scooter","Enduro","Trails","Cruiser"};
    this.subType=subtipoMotos[subType];
    setCostoHoras(subType);
  }
  public void setHoras(int horas) {
    this.horas = horas;
  }
  public void setCostoHoras(int costo) {
    int[] precios={70,75,80,85};
    this.costoHoras = precios[costo];
  }
  public void setRentaTotal(double rentaTotal) {
    this.rentaTotal = rentaTotal;
  }

  public double getCostoHoras() {
    return costoHoras;
  }
  public String getSubType() {
    return subType;
  }
  public double getRentaTotal() {
    return rentaTotal;
  }
  public int getHoras() {
    return horas;
  }

  @Override
  public String gps(){
    return "0°00'10.0N 0°10'10.0E";
  }
  @Override
  public double calculoPago(){
    this.rentaTotal=costoHoras*horas;
    return this.rentaTotal;
  }
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nSub tipo: "+this.subType+"\nCosto x Hora: "+this.costoHoras+"\nHoras: "+this.horas+"\nPrecio Total: "+this.rentaTotal;
  }
}

