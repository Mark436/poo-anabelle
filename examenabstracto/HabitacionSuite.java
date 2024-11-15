package examenabstracto;

public class HabitacionSuite extends Cliente{
  private int numDias;
  final private double cuotaDia=5590.00;
  private double consumoMinibar;
  public void setConsumoMinibar(double consumo){
    this.consumoMinibar=consumo;
  }
  public double getMinibar(){
    return this.consumoMinibar;
  }
  public void setDias(int dias){
    this.numDias=dias;
  }
  public int getDias(){
    return this.numDias;
  }
  @Override
  public void calculoTotalPagar(){
    this.total=this.consumoMinibar+(this.cuotaDia*this.numDias);
  }
  public HabitacionSuite(){}
  @Override
  public String mostrarInformacion(){
    return super.mostrarInformacion()+"\n  Habitacion: Suite\n  Cuota*dia:"+this.cuotaDia+"\n  Dias:"+this.numDias;
  }
}