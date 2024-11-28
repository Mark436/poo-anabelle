package sueldoexcepcion;
public abstract class Empleado{
  private String nombre;
  protected int horasT;
  protected double cuotaxHr,sueldo;
  private String tipo,puesto,rfc;
  public Empleado(){}
  public void setRfc(String newrfc){
    this.rfc=newrfc;
  }
  public void setPuesto(String puesto){
    this.puesto=puesto;
  }
  public void setTipo(String tipo){
    this.tipo=tipo;
  }
  public void setNom(String nombre)throws ErrorEntradaException{
    if(nombre.length()<1||nombre.length()>50)throw new ErrorEntradaException("nombre","invalido, debe tener una longitud de 1 a 50");
    this.nombre=nombre;
  }
  public void setHorasT(int horasT)throws ErrorEntradaException{
    if(horasT<1)throw new ErrorEntradaException("horas trabajadas","invalido, debe ser un numero entero y positivo");
    this.horasT=horasT;

  }
  public void setCuotaxHr(double cuota)throws ErrorEntradaException{
    if(cuota<=0)throw new ErrorEntradaException("cuota por hora","invalido, debe ser un numero positivo");
    this.cuotaxHr=cuota;
  }
  public String getNom(){
    return this.nombre;
  }
  public double getSueldo(){
    return this.sueldo;
  }
  public String getDetalles(){
    return "\nNombre: "+this.nombre+"\nTipo: "+this.tipo+"\nPuesto: "+this.puesto+"RFC: "+this.rfc;
  }
  public abstract double calcularAfore();
  public abstract void calcularSueldo();
}