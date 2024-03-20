package semana5;


public class postwork5 {

    public static void main(String[] args) {

        Lector lector = new Lector();
        Menu menu = new Menu();
        ListaTareas lista = new ListaTareas();

        int opcion;


        do {
            menu.muestraMenu();

            opcion = lector.escribirOpcion();

            System.out.println("Seleccionaste la opcion: " + opcion);


            switch (opcion){
                case 1:
                    lista.crearLista();
                    break;
                case 2:
                    lista.verListaTareas();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actualizarListaTareas();
                    break;
                case 5:
                    lista.eliminarListaTareas();
                    break;
                case 6:
                    System.out.println("saliste");
                    break;
                default:
                    System.out.println("opción desconocida");
            }

            }while(opcion != 6);






        }








    }



