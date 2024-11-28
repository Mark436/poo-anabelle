package sueldoexcepcion;

public class ErrorEntradaException extends Exception{
  public ErrorEntradaException(String campo,String mensaje){
    super("El tipo de dato de "+campo+" "+mensaje);
  }
}