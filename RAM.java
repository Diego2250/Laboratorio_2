/******************************************************************
archivo.java
Autor: Diego Morales
Última modificación: 17/09/2021

Modelo de RAM para uso del Controlador.
******************************************************************/
import java.util.ArrayList;
import java.util.Arrays;
public class RAM{
  private String Tipo_memoria="";
  private int tamano, bloques=0;
  private double RAM_disponible, RAM_ensuo, RAM_total=0;
  programa p =new programa();
  vista vista = new vista();
  ArrayList <String> cola=new ArrayList<String>();
  public RAM(){

  }
  /*Método para calcular los bloques de memoria
  @param tamaño
  @return bloques
  */
  public int bloquesmemoria(int tamano){
      bloques=tamano*1024/64;
      return bloques;
  }

  /*Método para ingresar los programas a la memoria RAM o a la cola
  @param programa y array de strings
  @return Array de strings
  */
 public String[] ingresarProgramas(programa p, String[] v){
   int espacio=p.getEspacio();
   int cont=0;
   int espaciosdisponibles=0;
   boolean programa_agregado=false;
   String nombre= p.getNombre();
   for (int i=0;i<v.length;i++) {
     if (v[i]==null) {
       espaciosdisponibles++;
     }
   }
   if (espaciosdisponibles>0) {
     if (espacio<=64) {
       for (int i=0;i<v.length && espacio<=64; i++) {
          if (v[i]==null){
          v[i]=nombre;
          cont++;
          }
          if (cont==1) {
            vista.programaAgregadoExitosamente();
            break;
          }
       }
     }else {
         for (int i=0;i<v.length && espacio>=64;i++) {
           if (v[i]==null) {
             v[i]=p.getNombre();
             espacio=espacio-64;
             programa_agregado=true;
           }
          }
          if (programa_agregado==true) {
            vista.programaAgregadoExitosamente();
          }
       }
   }else{
     vista.Sinespacio();
     cola.add(nombre);
   }

   return v;
 }
 /*Metodo para cambiar el valor de tamaño
 */
  public void setTamano(int newTamano){
    this.tamano=newTamano;
  }
  /*Metodo para cambiar el valor de RAM total
  */
  public void setRAM_total(int newRAM){
    RAM_total=newRAM;
  }
  /*Método para calcular la RAM disponible
  @param espacio
  @return RAM disponible
  */
  public double RAM_disponible(int espacio){
    double espaciod=0.0;
    double espacio_enuso=0.0;
    espaciod=espacio;
    System.out.println(espaciod);
    espacio_enuso= espaciod*0.001;
    System.out.println(espacio_enuso);
    RAM_disponible=(double)(getRAM_total()-espacio_enuso);
    return RAM_disponible;
  }
  /*Método para calcular la RAM en uso
  @param espacio
  @return RAM en uso
  */
  public double RAM_ensuo(int espacio){
    double espaciod=0;
    double RAM_ensuo=0;
    espaciod=espacio;
    RAM_ensuo= espaciod*0.001;
    return RAM_ensuo;
  }

  public void Cola(){
    vista.Mostrarprogramasenecola(cola);
  }
  /*Metodo para devolver el valor de bloques
  @return valor de bloques
  */
  public int getBloques(){
    return bloques;
  }
  /*Metodo para devolver el valor de tamaño
  @return valor de tamaño
  */
  public int getTamano(){
    return tamano;
  }
  /*Metodo para devolver el valor de RAM total
  @return valor de RAM total
  */
  public double getRAM_total(){
    return RAM_total;
  }

}
