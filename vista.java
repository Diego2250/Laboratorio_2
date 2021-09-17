/***************************************************
Vista.java
Autor: Diego Morales
Fecha: 13/09/2021

Vista. Responsable de toda interaccion con el usuario.
***************************************************/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class vista{
	private Scanner scan;

	public vista(){
		scan = new Scanner(System.in);
	}
  /*Metodo para elegír una opción
  @return número de opción
  */
	public int menuOpciones(){
		int op=0;
				try{
			String s = "¿Que desea hacer?\n" +
					"1. Inicializar\n" +
					"2. Ingresar programas\n" +
					"3. Ver cantidad de memoria RAM total\n" +
					"4. Ver cantidad de memoria RAM disponible\n" +
					"5. Ver cantidad de memoria RAM en uso\n"+
          "6. Ver los programas en ejecución y los espacios que ocupa un programa\n" +
          "7. Ver los programas en cola\n" +
          "8. Ver estado de memoria\n" +
          "9. Ciclo de reloj\n"+
          "10. Salir";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

	/*Metodo para pedir tipo de memoria RAM
	@return Tipo de RAM
	*/
	public String pedirdatosRAM(){
		String resultado="";
		int tipo=0;
		try{
		System.out.println("Por favor ingrese el número del tipo de memoria RAM\n");
		System.out.println(" 1. SDR\n 2. DDR ");
		tipo = scan.nextInt();
		if (tipo==1) {
			resultado="SDR";
		}else if (tipo==2) {
			resultado="DDR";
		}else{
			System.out.println("Opcion invalida");
		}
	}
	catch (Exception e){
		e.printStackTrace();
		scan.next();
	}
	return resultado;
	}

  public int pedirtamano(){
    int resultado=0;
    try{
    System.out.println("Por favor ingrese el tamaño de la memoria RAM en GB: ");
    resultado = scan.nextInt();
  }
  catch (Exception e){
    e.printStackTrace();
		scan.next();
  }
  return resultado;
  }
	/*Metodo para pedir nombre del programa
	@return nombre del programa
	*/
	public String[] pedirdatosprograma(){
		String[] resultado={""};
		try{
		System.out.println("Por favor ingrese el nombre del programa: ");
		scan.nextLine();
		resultado[0]= scan.nextLine();
		}	  catch (Exception e){
		    e.printStackTrace();
				scan.next();
		  }
		return resultado;
	}
	/*Metodo para pedir datos del parqueo
	@return Datos del parqueo
	*/
	public int[] pedirdatosprogramaint(){
		int[] resultado={0, 0};
		try{
		System.out.println("Por favor ingrese el espacio que utilizará el programa: ");
		resultado[0] = scan.nextInt();
		System.out.println("Por favor ingrese el tiempo que utilizará la memoria (En ciclos de relój): ");
		resultado[1] = scan.nextInt();
		}
		catch (Exception e){
			e.printStackTrace();
			scan.next();
		}
		return resultado;
	}

  public void MostrarRAMdisponible(double RAMdisponible){
    System.out.println("RAM disponible: "+RAMdisponible+" GB");
  }

  public void MostrarRAMenuso(double RAMenuso){
    System.out.println("RAM en uso: "+RAMenuso+" GB");
  }

  public void MostrarRAMtotal(double RAMtotal){
    System.out.println("RAM total: "+RAMtotal+" GB");
  }

  public void Mostrarprogramasenejecucion(ArrayList<String> P){
    System.out.println("Los programas en ejecución son: ");
    for (int i=0; i<P.size(); i++) {
			System.out.println("Bloque "+(i+1));
    	System.out.println(P.get(i));
    }
  }

	public void Estadomemoria(String[] p){
		System.out.println("El estado de memoria es: ");
		for (int i=0; i<p.length; i++) {
			System.out.println("Bloque "+(i+1));
			System.out.println(p[i]);
			}
		}

  public void Mostrarprogramasenecola(String[] Programas){
    System.out.println("Los programas en cola son: "+ Arrays.toString(Programas));
  }
	/*Metodo para mostrar mensaje de despedida al usuario
	*/
	public void despedida(){
		System.out.println("Gracias por usar este programa, adios");
	}
	/*Metodo para mostrar mensaje de bienvenida al usuario
	*/
	public void bienvenida(){
		System.out.println("Bienvendi@!");
	}
	/*Metodo para mostrar mensaje
	*/
	public void programaAgregadoExitosamente(){
		System.out.println("El programa ha sido ingresado con éxito");
	}
	/*Metodo para mostrar mensaje
	*/
	public void RAMiniciadaExitosamente(){
		System.out.println("La RAM ha sido inicializada con éxito");
	}
	/*Metodo para mostrar mensaje
	*/
	public void opcionInvalida(){
		System.out.println("Ha elegido una opción inválida.");
	}

	/*Metodo para mostrar mensaje
	*/
	public void Sinespacio(){
		System.out.println("No hay más espacio en la RAM, se agregará el programa a la cola");
	}

  public void error(){
    System.out.println("Ha ocurrido un error");
  }

  public void ArchivoCreado(String nombre){
    System.out.println("Archivo creado: "+nombre);
  }

  public void LeerArchivo(String data){
    System.out.println(data);
  }
}
