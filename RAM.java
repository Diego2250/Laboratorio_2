import java.util.ArrayList;
import java.util.Arrays;
public class RAM{
  private String Tipo_memoria="";
  private int tamano, bloques=0;
  private double RAM_disponible, RAM_ensuo, RAM_total=0;
  programa p =new programa();
  vista vista = new vista();
  ArrayList <programa> cola=new ArrayList<programa>();
  public RAM(){

  }

  public int bloquesmemoria(int tamano){
      bloques=tamano*1024/64;
      return bloques;
  }

 public String[] ingresarProgramas(programa p, String[] v){
   int espacio=p.getEspacio();

   int cont=0;
   String nombre= p.getNombre();
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
           vista.programaAgregadoExitosamente();
         }
        }
     }
   return v;
 }

  public void setTamano(int newTamano){
    this.tamano=newTamano;
  }

  public void setRAM_total(int newRAM){
    RAM_total=newRAM;
  }

  public double RAM_disponible(int espacio){
    double espaciod=espacio;
    double espacio_enuso= espacio*0.001;
    RAM_disponible=(double)(getRAM_total()-espacio_enuso);
    return RAM_disponible;
  }

  public double RAM_ensuo(int espacio){
    double espaciod=espacio;
    double RAM_ensuo= espacio*0.001;
    return RAM_ensuo;
  }

  public int getBloques(){
    return bloques;
  }

  public int getTamano(){
    return tamano;
  }

  public double getRAM_total(){
    return RAM_total;
  }

}
