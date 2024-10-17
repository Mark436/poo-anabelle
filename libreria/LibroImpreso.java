package libreria;

public class LibroImpreso extends Libro{
  private int numPaginas,pagxMin,tiempoLec;

  public LibroImpreso(){}
  
  
  public void setNumPag(int newPags){
    this.numPaginas=newPags;
  }
  public void setPagxMin(int newPagsXM){
    this.pagxMin=newPagsXM;
  }
  public void setTiempoLec(int newTiempo){
    this.tiempoLec=newTiempo;
  }
  public int getNumPag(){
    return this.numPaginas;
  }
  public int getPagXMin(){
    return this.pagxMin;
  }
  public int getTiempoLec(){
    return this.tiempoLec;
  }
  public void calcTiempoLec(){
    this.tiempoLec=(int) Math.floor(numPaginas/pagxMin);
  }
}
