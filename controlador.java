/***************************************************
Controlador.java
Autor: Diego Morales
Fecha: 14/09/2021

Driver program. Instancia la vista y el modelo,
y los comunica de acuerdo con las elecciones del
usuario.
***************************************************/
class controlador{
	public static void main(String[] args){
    int opcion=0;
    vista v = new vista();
    archivo a = new archivo();
    programa p = new programa();
    RAM r = new RAM();
    v.bienvenida();
    a.crearchivo();
    	while (opcion != 11){
        opcion = v.menuOpciones();
        switch(opcion){
          case 1:
          break;
          case 2:
          String nombre;
          int tamano, tiempo;
          nombre = v.pedirdatosprograma();
          int[] datos= v.pedirdatosprogramaint();
          tamano=datos[0];
          tiempo=datos[1];
          p.setNombre(nombre);
          p.setEspacio(tamano);
          p.setTiempo(tiempo);
          break;
          case 3:
          int RAM_total=r.getRAM_total();
          v.MostrarRAMtotal(RAM_total);
          break;
          case 4:
          int RAM_disponible=r.getRAM_disponible();
          v.MostrarRAMdisponible(RAM_disponible);
          break;
          case 5:
          int RAM_ensuo=r.getRAM_ensuo();
          v.MostrarRAMenuso(RAM_ensuo);
          break;
          case 6:
          break;
          case 7:
          break;
          case 8:
          break;
          case 9:
          break;
          case 10:
          break;
          case 11:
          v.despedida();
          default:
          v.opcionInvalida();
          break;
      }
  }
 }
}
