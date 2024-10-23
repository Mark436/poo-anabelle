package bancoexamen;

public class Cuenta{
  private String titular;
  private double saldoInicial;
  protected double saldo;
  public void setTitular(String name){
    this.titular=name;
  }
  public void setSaldoInicial(double saldo){
    this.saldoInicial=saldo;
    this.saldo=saldo;
  }
  public String getTitular(){
    return this.titular;
  }
  public double getSaldoInicial(){
    return this.saldoInicial;
  }
  public double getSaldo(){
    return this.saldo;
  }
  public Cuenta(){}
  public String getDetalles(){
    return "Titular: "+this.getTitular()+"\nSaldo Inicial:"+this.getSaldoInicial()+"\nSaldo:"+this.getSaldo();
     
  }
}