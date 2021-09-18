/******************************************************************
programa.java
Autor: Diego Morales
Última modificación: 17/09/2021

Modelo de programa para uso del Controlador.
******************************************************************/
public class programa{
  String nombre="";
  int espacio, tiempo=0;
  public programa(){

  }
  /*Metodo para devolver el valor de espacio
  @return valor de espacio
  */
  public int getEspacio(){
    return espacio;
  }
  /*Metodo para devolver el valor de nombre
  @return valor de nombre
  */
  public String getNombre(){
    return nombre;
  }
  /*Metodo para devolver el valor de tiempo
  @return valor de tiempo
  */
  public int getTiempo(){
    return tiempo;
  }
  /*Metodo para cambiar el valor de nombre
  */
  public void setNombre(String newnombre){
    this.nombre=newnombre;
  }
  /*Metodo para cambiar el valor de espacio
  */
  public void setEspacio(int newespacio){
    this.espacio=newespacio;
  }
  /*Metodo para cambiar el valor de tiempo
  */
  public void setTiempo(int newtiempo){
    this.tiempo=newtiempo;
  }
}
