/***************************************************
Vista.java
Autor: Diego Morales
Fecha: 13/09/2021

Vista. Responsable de toda interaccion con el usuario.
***************************************************/
import java.util.Scanner;
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
          "6. Ver los programas en ejecución\n" +
          "7. Ver los programas en cola\n" +
          "8. Ver los espacios que ocupa un programa\n" +
          "9. Ver estado de memoria\n" +
          "10. Ciclo de reloj\n"+
          "11. Salir";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				e.printStackTrace();
		}

		return op;
	}
	/*Metodo para pedir tipo de memoria RAM
	@return Tipo de RAM
	*/
	public String pedirdatosRAM(){
		String resultado="";
		try{
		System.out.println("Por favor ingrese si la RAM es de tipo SDR o DDR: ");
		resultado = scan.next();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

  public int pedirtamano(){
    int resultado=0;
    try{
    System.out.println("Por favor ingrese el tamaño de la memoria RAM: ");
    resultado = scan.nextInt();
  }
  catch (Exception e){
    e.printStackTrace();
  }
  return resultado;
  }
	/*Metodo para pedir datos del carro
	@return Datos del carro
	*/
	public String pedirdatosprograma(){
		String resultado="";
		try{
		System.out.println("Por favor ingrese el nombre del programa: ");
		resultado= scan.next();
		}
		catch (Exception e){
			e.printStackTrace();
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
		}
		return resultado;
	}

  public void MostrarRAMdisponible(int RAMdisponible){
    System.out.println("RAM disponible: "+RAMdisponible);
  }

  public void MostrarRAMenuso(int RAMenuso){
    System.out.println("RAM en uso: "+RAMenuso);
  }

  public void MostrarRAMtotal(int RAMtotal){
    System.out.println("RAM total: "+RAMtotal);
  }

  public void Mostrarprogramasenejecucion(String[] Programas){
    System.out.println("Los programas en ejecución son: ");
    System.out.println(Arrays.toString(Programas));
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
