package conversorgrados;

public class Temperatura{
  private double celcius,farenheit;
  private char result;
  public Temperatura(){}
  public Temperatura(double cel,double far){
    if(far==0&&cel!=0){this.setCelcius(cel);}
    if(cel==0&&far!=0)this.setFarenheit(far);  
  }

  public static double convertirACelcius(double gradosF){
    return (5.0/9.0)*(gradosF-32.0);
  }
  public static double convertirAFarenheit(double gradosC){
    return (gradosC*9.0/5.0)+32.0;
  }

  public void setCelcius(double grados){
    this.celcius=grados;
    this.farenheit=Temperatura.convertirAFarenheit(grados);
    this.result='f';
  }
  public void setFarenheit(double grados){
    this.farenheit=grados;
    this.celcius=Temperatura.convertirACelcius(grados);
    System.out.println(Temperatura.convertirACelcius(grados));
    this.result='c';
  }
  public double getCelcius(){
    return this.celcius;
  }
  public double getFarenheit(){
    return this.farenheit;
  }
  public String getResult(){
    if(this.result=='c')return this.celcius+" grados celcius";
    return this.farenheit+" grados farenheit";
  }
}