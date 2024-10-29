package transporte;

public class Motocicleta extends Transporte {
  private String subType;
  private double costoHoras, rentaTotal;
  private int horas;

  public Motocicleta() {
    super("Motocicleta", "", "", 0);
  }
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }
  public double getCostoHoras() {
    return costoHoras;
  }

  public void setCostoHoras(double costoHoras) {
    this.costoHoras = costoHoras;
  }
  public double getRentaTotal() {
    return rentaTotal;
  }

  public void setRentaTotal(double rentaTotal) {
    this.rentaTotal = rentaTotal;
  }
  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }
}

