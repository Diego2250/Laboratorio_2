/******************************************************************
archivo.java
Autor: Diego Morales
Última modificación: 13/09/2021

Modelo de archivo para uso del Controlador.
******************************************************************/
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class archivo{
  vista v = new vista();
  public archivo(){
  }
  /*Metodo crear un archivo de texto
  */
  public void crearchivo() {
      try {
        File myObj = new File("RAM.txt");
        if (myObj.createNewFile()) {
          String nombre=myObj.getName();
          v.ArchivoCreado(nombre);
        } else {
        }
      } catch (IOException e) {
        v.error();
        e.printStackTrace();}
      }
      /*Metodo para leer el archivo
      */
  public void leer(){
    try {
      File myObj = new File("RAM.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        v.LeerArchivo(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      v.error();
      e.printStackTrace();
    }
  }
}
