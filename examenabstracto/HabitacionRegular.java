package examenabstracto;

public class HabitacionRegular extends Cliente{
  private int numDias;
  final private double cuotaDia=1250.00;
  public void setDias(int dias){
    this.numDias=dias;
  }
  public int getDias(){
    return this.numDias;
  }
  @Override
  public void calculoTotalPagar(){
    this.total=this.cuotaDia*this.numDias;
  }
  public HabitacionRegular(){}
  @Override
  public String mostrarInformacion(){
    return super.mostrarInformacion()+"\n  Habitacion: Regular\n  Cuota*dia:"+this.cuotaDia+"\n  Dias:"+this.numDias;
  }
}