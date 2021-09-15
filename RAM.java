import java.util.ArrayList;
public class RAM{
  private String Tipo_memoria="";
  private int tamano, RAM_disponible, RAM_ensuo, RAM_total, bloques=0;
  programa p =new programa();
  ArrayList <programa> programas=new ArrayList<programa>();
  public RAM(){

  }

  public int bloquesmemoria(int tamano){
      bloques=tamano*1024/64;
      return bloques;
  }

/*  public boolean ingresarProgramas(programa p){

}*/

  public int getRAM_disponible(){
    return RAM_disponible;
  }

  public int getRAM_ensuo(){
    return RAM_ensuo;
  }

  public int getRAM_total(){
    return RAM_total;
  }

}
