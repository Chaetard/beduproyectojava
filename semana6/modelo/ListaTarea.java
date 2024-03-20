package semana6.modelo;

import semana6.Lector;

import java.time.LocalDate;

public class ListaTarea {



    private String nombre;
    private final LocalDate fechaCreacion;



    {
        fechaCreacion = LocalDate.now();
    }

    public ListaTarea(String nombre){
        this.nombre = nombre;
    }

}
