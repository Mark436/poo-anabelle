package veterinariaherencia;

public class Servicio{
  private int tipoServicio;//1.parasitos,2.vacunas,3.baño
  private double subtotal,iva,total;
  public static String[] serv={"Desparasitar","Vacunar","Duchar"};

  public Servicio(){}
  public void setSubTotal(double subtotal){
    this.subtotal=subtotal;
  }
  public void setServicio(int tipoServicio){
    this.tipoServicio=tipoServicio;
  }

  public double getTotal(){
    return this.total;
  }
  public double getSubtotal(){
    return this.subtotal;
  }
  public double getIva(){
    return this.iva;
  }
  public int getServicio(){
    return this.tipoServicio;
  }

  public void calcularIva(){
    this.iva=this.subtotal*0.16;
  }
  public void calcularTotal(){
    this.total=this.subtotal+this.iva;
  }

  protected String getDetalles(){
    
    return "Servicio: "+Servicio.serv[this.tipoServicio-1]+"\nSubtotal: "+this.subtotal+"\nIVA: "+this.iva+"\nTotal: "+this.total;
  }
}