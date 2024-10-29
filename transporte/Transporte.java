package transporte;

public class Transporte{
  protected String type,brand,plate;
  protected int year;

  public void setType(String newVal){
    this.type=newVal;
  }
  public void setBrand(String newVal){
    this.brand=newVal;
  }
  public void setPlate(String newVal){
    this.plate=newVal;
  }
  public void setYear(int newVal){
    this.year=newVal;
  }
  public String getType(){
    return this.type;
  }
  public String getBrand(){
    return this.brand;
  }
  public String getPlate(){
    return this.plate;
  }
  public int getYear(){
    return this.year;
  }
  public Transporte(String type,String brand,String plate, int year){
    this.type=type;
    this.brand=brand;
    this.plate=plate;
    this.year=year;
  }

  public double calculoPago(){return 0;}
  public String gps(){return "0°00'00.0N 0°00'00.0E";}
}