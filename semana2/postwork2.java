package semana2;

public class postwork2 {
    public static void main(String[] args) {
        int opcion = 5 ;
        String mensaje;

        System.out.println("1. Crear lista de tareas");
        System.out.println("2. ver listas de tareas");
        System.out.println("3. ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas.");
        System.out.println("5. Eliminar lista de tareas");


        switch (opcion) {
            case 1:
                mensaje = "Crear nueva lista de tareas.";
                break;
            case 2:
                mensaje = "Ver listas de tareas.";
                break;
            case 3:
                mensaje = "Ver tareas de lista.";
                break;
            case 4:
                mensaje = "Actualizar lista de tareas.";
                break;
            case 5:
                mensaje = "Eliminar lista de tareas.";
                break;
            default:
                mensaje = "Opción desconocida.";
        }

        System.out.println("\n\nopción seleccionada: " + opcion + " " + mensaje);
        System.out.println("En construcción.");
    }
}
