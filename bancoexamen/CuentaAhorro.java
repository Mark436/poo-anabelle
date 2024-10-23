package bancoexamen;

public class CuentaAhorro extends Cuenta{
  private double interes;
  public void setInteres(double interes){
    this.interes=interes;
  }
  public double getInteres(){
    return this.interes;
  }
  public double calculoInteresMensual(){
    return this.saldo*this.interes;
  }
  public void calculoSaldoMensual(){
    this.saldo+=calculoInteresMensual();
  }
  public CuentaAhorro(){}
  @Override
  public String getDetalles(){
    return super.getDetalles()+"\nInteres: "+this.interes;
  }
}