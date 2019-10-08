import ar.com.ada.figures.Actions;
import ar.com.ada.figures.abst.Figure;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
         /**
          * En esta solucion vamos a separar cada proceso de los casos del
          * switch en metodos estaticos de una clase nueva llamada MenuActions
          * que se crea en el package ar.com.ada.figures
          *
          * En esta forma de solucion, se usa el tema que vimos de pasar objetos por referencia
          * a un metodo, en este caso a los metodos staticos de la clase Actions (Acciones), los objetos
          * que se le pasan por referencia son el ArrayList figures y el objeto Scanner keyboard,
          * para que se pueda agregar los objetos a esa lista (que es una referencia en la memoria heap)
          * y mostar los mensajen de guia al usuario en pantalla
          *
          * Con esta forma, podemos fracmentar la solucion en pequeños fracmentos de codigo que se
          * puede leer y cambiar facilmente.
          *
          */


        ArrayList<Figure> figures = new ArrayList<Figure>();
        Scanner keyboard = new Scanner(System.in);
        int choice, i = 0;
        do {
            // el (i + 1) es para sumar 1 a i y que parezca en pantalla en numero entndible
            // por el ususario, ejemplo i = 0 en pantalla aparece 1
            // y tiene que ser entre parentesis para que haga la suma
            // si no lo tiene, hace es una concatenacion de string, ejemplo
            // " + i + 1 + " en pantalla aparece 01, 11, 21
            System.out.println("Elegí una figura # " + (i + 1) + " : (1 - Rectangulo; 2 - Circulo; 3 - Triangulo): ");
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    // se invoca el metodo estatico para crear un objeto rectangulo y añadirlo a la lista
                    Actions.makeRectangle(figures, keyboard);
                    i++;
                    break;
                case 2:
                    // se invoca el metodo estatico para crear un objeto cirdulo y añadirlo a la lista
                    Actions.makeCircle(figures, keyboard);
                    i++;
                    break;
                case 3:
                    // se invoca el metodo estatico para crear un objeto triangulo y añadirlo a la lista
                    Actions.makeTriangle(figures, keyboard);
                    i++;
                    break;
                default:
                    System.out.println("Opcion no existente");
            }

        } while (i < 3);

        /**
         * Se invoca el metodo que se encarga de mostar por pantalla el resultado de la
         * solucion del problema propuesto
         */
        Actions.printAreasOnScreen(figures);

        /**
         * Se invoca el metodo que indica si existe objetos iguales en la lista
         * ese retornará true si existe, en caso contrario falso.
         */
        boolean hasEquals = Actions.hasEquals(figures);

        if (hasEquals) {
            System.out.println("Y existen objetos iguales");
        }

    }
}
