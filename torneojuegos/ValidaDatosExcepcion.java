package torneojuegos;

public class ValidaDatosExcepcion extends Exception{
  public ValidaDatosExcepcion(String campo,String mensaje){
    super("El tipo de dato de "+campo+" "+mensaje);
  }
}