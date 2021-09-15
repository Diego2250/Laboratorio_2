public class programa{
  String nombre="";
  int espacio, tiempo=0;
  public programa(){

  }

  public int getEspacio(){
    return espacio;
  }

  public String getNombre(){
    return nombre;
  }

  public int getTiempo(){
    return tiempo;
  }

  public void setNombre(String newnombre){
    this.nombre=newnombre;
  }

  public void setEspacio(int newespacio){
    this.espacio=newespacio;
  }

  public void setTiempo(int newtiempo){
    this.tiempo=newtiempo;
  }
}
