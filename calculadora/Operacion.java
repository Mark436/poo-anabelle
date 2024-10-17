package calculadora;

public class Operacion{
  private double num1;
  private double num2;
  private double result;

  public void setNum1(double num){
    this.num1=num;
  }
  public void setNum2(double num){
    this.num2=num;
  }
  public void setResult(double result){
    this.result=result;
  }
  public double getNum1(){
    return this.num1;
  }
  public double getNum2(){
    return this.num2;
  }
  public double getResult(){
    return this.result;
  }

  public void suma(){
    this.result=num1+num2;
  }
  public void resta(){
    this.result=num1-num2;
  }
  public void mult(){
    this.result=num1*num2;
  }
  public void divi(){
    this.result=num1/num2;
  }
  public void residuo(){
    this.result=num1%num2;
  }
}