package alumnos;
public class Alumno {
  private String nombre, apellido, segApellido, fechaNac, noCtrl, RFC;
  private double[] calificaciones=new double[3];
  private double promedio=0;
  
  public Alumno() {}

  public void setNombre(String newVal) {
    this.nombre=newVal;
  }
  public void setApellido(String newVal) {
    this.apellido=newVal;
  }
  public void setSegApellido(String newVal) {
    this.segApellido=newVal;
  }
  public void setFechaNac(String newVal) {
    this.fechaNac=newVal;
  }
  public void setNoCtrl(String newVal) {
    this.noCtrl=newVal;
  }
  public void setRFC(String newVal) {
    this.RFC=newVal;
  }
  public void setCalificacion(int indice,double calificacion) {
    this.calificaciones[indice]=calificacion;
  }

  public String getNombre() {
    return this.nombre;
  }
  public String getApellido() {
    return this.apellido;
  }
  public String getSegApellido() {
    return this.segApellido;
  }
  public String getFechaNac() {
    return this.fechaNac;
  }
  public String getNoCtrl() {
    return this.noCtrl;
  }
  public String getRFC() {
    return this.RFC;
  }
  public double[] getCalificaciones() {
    return this.calificaciones;
  }
  public double getPromedio() {
    return this.promedio;
  }
  public void calcularPromedio(){
    for(int i=0;i<3;i++)this.promedio+=(this.calificaciones[i]/3);
  }
}
