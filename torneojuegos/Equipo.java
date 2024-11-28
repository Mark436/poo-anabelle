package torneojuegos;
//los jugadores no deben tener digitos en su nombre y deben ser maximo 12 letras
public class Equipo{
  private String nombre,ciudad,videojuego;
  private int posJugadores=0;// puntero
  private int maxSize;
  private int espacios=3;
  private Jugador[] jugadores={null,null,null};

  public Equipo(String nombreEquipo,String ciudad,String videojuego){
    this.nombre=nombreEquipo;
    this.ciudad=ciudad;
    this.videojuego=videojuego;
    this.maxSize=3;
  }
  public String getNombre(){
    return this.nombre;
  }
  public String getCiudad(){
    return this.ciudad;
  }
  public String getVideojuego(){
    return this.videojuego;
  }
  public int getEspaciosDisp(){
    return this.espacios;
  }
  public void addJugador(Jugador jugadorNuevo) throws ValidaDatosExcepcion{
    boolean jugadoresLleno=true;
    for(Jugador jugador: jugadores){
      if(jugador==null){jugadoresLleno=false;break;}
      this.posJugadores++;
    }
    if(jugadoresLleno)throw new ValidaDatosExcepcion("jugadores","este equipo esta completo");
    System.out.println("!"+posJugadores);
    jugadores[posJugadores==3?2:posJugadores]=jugadorNuevo;
    this.espacios--;
  }
  public static boolean validarNombreAp(String validar,String campo){
    return !((validar.length()>12&&campo.equalsIgnoreCase("nombre"))||validar.matches("[0-9]"));
  }
  public String getData(){
    return String.format("Equipo: %s\nCiudad:%s\nVideo Juego:%s\nJugadores:\n%s%s%s%s",this.nombre,this.ciudad,this.videojuego,"  "+jugadores[0].getNombreCompleto()+"\n",jugadores[1]==null?"":"  "+jugadores[1].getNombreCompleto()+"\n",jugadores[2]==null?"":"  "+jugadores[2].getNombreCompleto()+"\n",getEspaciosDisp()!=0?"Espacios disponibles:"+getEspaciosDisp():"");
  }
}