package transporte;

public class Auto extends Transporte {
  private String subType;//sedán, compactos, SUV, deportivo
  private String transmision="Automático";//automatico, manual
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
    if(tipo==2)this.transmision="Manual";//default automatica
  }
  public void setDias(int dias){
    this.dias=dias;
  }
  @Override
  public double calculoPago(){
    this.rentaTotal=this.costoDia*this.dias;
    return this.rentaTotal;
  }
  @Override
  public String gps(){
    return "29°05'28.6 N 110°56'26.1 W";
  }
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nTransmisión: "+this.transmision+"\nSub tipo: "+this.subType+"\nCosto x Día: "+this.costoDia+"\nDías: "+this.dias+"\nPrecio Total: "+this.rentaTotal;
  }
}