package semana6;

import semana6.modelo.ListaTarea;
import semana6.modelo.Tarea;
import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private Lector lector = new Lector();
    private final List<Tarea> tareas = new ArrayList<>();
    public void creaUnaLista() {
        System.out.println("crea una lista de Tareas");
        String nombre = lector.leeCadena();
        Tarea lista = new Tarea(nombre);
        tareas.add(lista);
    }

    public void verListaTareas(){
        System.out.println("ver tareas de lista");
        System.out.println("hay estas tareas "+getTareas());
        System.out.println("numero total de tareas " + numeroTareas());
    }

    public void verTareasDeLista() {
        System.out.println("ver lista de tareas");
        int lista = lector.escribirOpcion();


    }



    public void actualizarListaTareas() {
        System.out.println("lista de tareas a actualizar");
        int lista = lector.escribirOpcion();
    }


    public void eliminarListaTareas() {
        System.out.println("elimina una lista");
        int lista = lector.escribirOpcion();
        eliminarTarea(lista);
    }


    public Tarea eliminarTarea(int index){
        if(index > tareas.size()){
            System.out.println("esa tarea no existe");
            return null;
        }else{
            System.out.println("tarea eliminada correctamente");
            return tareas.remove(index - 1);
        }

    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public int numeroTareas(){
        return tareas.size();
    }


}
