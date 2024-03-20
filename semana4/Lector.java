package semana4;

import java.util.Scanner;

public class Lector {

    private Scanner scanner = new Scanner(System.in);


    public int escribirOpcion(){

        System.out.println("Elija la opcion: ");
        int valor = scanner.nextInt();
        return valor;

    }

}
