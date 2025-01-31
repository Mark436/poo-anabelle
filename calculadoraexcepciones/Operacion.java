package calculadoraexcepciones;

import java.util.HashMap;
import java.util.function.Supplier;

public class Operacion {
  private int num1,num2;
  private double resultado;
  private char operador;
  private HashMap<Character,Supplier<Double>> operaciones=new HashMap<>();
  public Operacion(){
    this.operaciones.put('+',()->{return num1+(double)num2;});
    this.operaciones.put('-',()->{return num1-(double)num2;});
    this.operaciones.put('*',()->{return num1*(double)num2;});
    this.operaciones.put('/',()->{return num1/(double)num2;});
  }
  public void setNum1(int newNum){
    this.num1=newNum;
  }
  public void setNum2(int newNum){
    this.num2=newNum;
  }
  public double getResultado(){
    return this.resultado;
  }
  public void operar()throws EntradaInvalidaException{
    if(num2==0&&operador=='/')throw new EntradaInvalidaException("No se puede dividir por 0");
    this.resultado=operaciones.get(this.operador).get();
  }
  public int getNum1(){
    return this.num1;
  }
  public int getNum2(){
    return this.num2;
  }
}
