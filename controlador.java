/***************************************************
Controlador.java
Autor: Diego Morales
Fecha: 14/09/2021

Driver program. Instancia la vista y el modelo,
y los comunica de acuerdo con las elecciones del
usuario.
***************************************************/
import java.util.ArrayList;
public class controlador{
	public static void main(String[] args){
    int opcion=0, cont=0;
    vista v = new vista();
    archivo a = new archivo();
    programa p = new programa();
    RAM r = new RAM();
		String[] programas={""};
		int bloques_en_uso=0;
		int bloques=0;
		int espacio_total=0;
		double RAM_disponible=0.0, RAM_ensuo=0.0;
    v.bienvenida();
    a.crearchivo();

    while (opcion != 10){
				opcion = v.menuOpciones();
        switch(opcion){
          case 1:
					String tipo="";
					int tamano;
					tipo=v.pedirdatosRAM();
					if (tipo=="DDR") {
						tamano=4;
						r.setRAM_total(tamano);
						r.setTamano(tamano);
						bloques=r.bloquesmemoria(tamano);
						programas = new String[bloques];
						v.RAMiniciadaExitosamente();
					}else{
						tamano=v.pedirtamano();
						r.bloquesmemoria(tamano);
						r.setRAM_total(tamano);
						bloques=r.bloquesmemoria(tamano);
						programas = new String[bloques];
						v.RAMiniciadaExitosamente();
					}

          break;

          case 2:
					String nombre;
          int espacio, tiempo;
          String[] dato = v.pedirdatosprograma();
          int[] datos= v.pedirdatosprogramaint();
          espacio=datos[0];
          tiempo=datos[1];
					nombre=dato[0];
          p.setNombre(nombre);
          p.setEspacio(espacio);
          p.setTiempo(tiempo);
					bloques=r.getBloques();
					programas=r.ingresarProgramas(p, programas);
          break;
          case 3:
				  double RAM_total=0;
          RAM_total=r.getRAM_total();
          v.MostrarRAMtotal(RAM_total);
          break;
          case 4:
					for (int i=0;i<programas.length&&programas[i]!=null;i++) {
						bloques_en_uso++;
					}
					espacio_total=bloques_en_uso*64;
          RAM_disponible=r.RAM_disponible(espacio_total);
          v.MostrarRAMdisponible(RAM_disponible);
          break;
          case 5:
					for (int i=0;i<programas.length&&programas[i]!=null;i++) {
						bloques_en_uso++;
					}
					espacio_total=bloques_en_uso*64;
          RAM_ensuo=r.RAM_ensuo(espacio_total);
          v.MostrarRAMenuso(RAM_ensuo);
          break;
          case 6:
					ArrayList <String> programasejecucion=new ArrayList<String>();
					for (int i=0;i<programas.length&&programas[i]!=null;i++) {
						programasejecucion.add(programas[i]);
					}
					v.Mostrarprogramasenejecucion(programasejecucion);
          break;
          case 7:
          break;
					case 8:
					String[] memoria=new String[bloques];
					for (int i=0;i<programas.length&&programas[i]!=null||i<programas.length&&programas[i]==null;i++) {
						if (programas[i]!=null) {
							memoria[i]="Ocupado por: "+programas[i];
						}else{
							memoria[i]="Disponible";
						}
					}
					v.Estadomemoria(memoria);
          break;
          case 9:
          break;
          case 10:
					v.despedida();
          break;
          default:
          v.opcionInvalida();
          break;
      }
  }
 }
}
