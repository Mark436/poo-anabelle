package transporte;

public class Auto extends Transporte {
  private String subType;//sedán, compactos, SUV, deportivo
  private String transmision;//automatico, manual
  private double costoDia,rentaTotal;
  private int dias;
  public Auto(){
    super("Auto","","",0);
  }
  public void setSubType(int sub){
    String[] tipos={"Sedan","Compacto","Suv","Deportivo"};
    this.subType=tipos[sub];
    this.setCostoDia(sub);
  }
  public void setCostoDia(int costo){
    int[] precios={400,350,450,500};
    this.costoDia=precios[costo];
  }
  public void setTransmision(int tipo){
    this.transmision="Automatico";
    if(tipo==2)this.transmision="Manual";
  }
  public void setDias(int dias){
    this.dias=dias;
  }
  @Override
  public double calculoPago(){
    this.rentaTotal=this.costoDia*dias;
    return this.rentaTotal;
  }
  @Override
  public String gps(){
    return "29°05'28.6 N 110°56'26.1 W";
  }
}