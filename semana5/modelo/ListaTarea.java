package semana5.modelo;

import semana5.Lector;

import java.time.LocalDate;

public class ListaTarea {


    private Lector lector = new Lector();
    private String nombre;
    private final LocalDate fechaCreacion;


    public void creaUnaLista() {
        System.out.println("crea una lista de Tareas");
        String nombre = lector.leeCadena();
        ListaTarea lista = new ListaTarea(nombre);
    }

    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");
        int lista = lector.escribirOpcion();
    }


    public void actualizarListaTareas() {
        System.out.println("lista de tareas a actualizar");

        int lista = lector.escribirOpcion();
    }


    public void eliminarListaTareas() {
        System.out.println("elimina una lista");
        int lista = lector.escribirOpcion();
    }


    {
        fechaCreacion = LocalDate.now();
    }

    public ListaTarea(String nombre){
        this.nombre = nombre;
    }

}
