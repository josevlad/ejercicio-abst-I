package ar.com.ada.figures;

import ar.com.ada.figures.abst.Figure;
import ar.com.ada.figures.subclass.Circle;
import ar.com.ada.figures.subclass.Rectangle;
import ar.com.ada.figures.subclass.Triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class Actions {

    /**
     * Este metodo pide los datos al usuario con el objetos que recibe por referencia (keyboard): radio
     * Crea una instancia de la clase Circle llamando al constructor con parametros
     * Agrega la instancia creada a la lista (que es una referencia) que recibe por parametros: figures
     *
     * @param figures : Lista de objetos de tipo {@link Figure}
     * @param keyboard :
     */
    public static void makeCircle(ArrayList<Figure> figures, Scanner keyboard) {
        // pido y capturo el dato
        System.out.println("Ingrese el radio del circulo:");
        Double radio = keyboard.nextDouble();

        // instancio la clase con el contructor con parametro
        Circle circle = new Circle(radio);

        // agrego el objeto a la lista
        figures.add(circle);
    }

    /**
     * Este metodo pide los datos al usuario con el objetos que recibe por referencia (keyboard): width y heigth
     * Crea una instancia de la clase Rectangle llamando al constructor con parametros
     * Agrega la instancia creada a la lista (que es una referencia) que recibe por parametros: figures
     *
     * @param figures
     * @param keyboard
     */
    public static void makeRectangle(ArrayList<Figure> figures, Scanner keyboard) {
        //instancia con constructor vacio
        Rectangle rectangle = new Rectangle();

        // pido y capturo los datos
        System.out.println("Ingrese la base del rectangulo:");
        Double width = keyboard.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        Double heigth = keyboard.nextDouble();

        // seteo los attr del objeto con los setters
        rectangle.setWidth(width);
        rectangle.setHeigth(heigth);

        // agrego a la lista
        figures.add(rectangle);
    }

    /**
     * Este metodo pide los datos al usuario con el objetos que recibe por referencia (keyboard): width y heigth
     * Crea una instancia de la clase Triangle llamando al constructor con parametros
     * Agrega la instancia creada a la lista (que es una referencia) que recibe por parametros: figures
     *
     * @param figures
     * @param keyboard
     */
    public static void makeTriangle(ArrayList<Figure> figures, Scanner keyboard) {
        // pido y capturo los datos
        System.out.println("Ingrese la altura del triangulo:");
        Double heigth = keyboard.nextDouble();

        System.out.println("Ingrese la base del triangulo:");
        Double width = keyboard.nextDouble();

        // instancio la clase con el constructor con paranetros
        Triangle triangle = new Triangle(heigth, width);

        // agrego a la lista
        figures.add(triangle);
    }

    /**
     * Este metodo recorre la lista (que es una referencia) que recibe por parametro
     *
     * Extrae cada elemento en cada iteraccion del for y lo almacena en una variable llamada
     * figure
     *
     * Con esa referencia guardada en figure, invoca el metodo calculateArea() y lo muestra por pantalla
     * Tambien muesta el estado del objeto con el metodo toString()
     *
     * @param figures
     */
    public static void printAreasOnScreen(ArrayList<Figure> figures) {
        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);

            // el (i + 1) es para sumar 1 a i y que parezca en pantalla en numero entndible
            // por el ususario, ejemplo i = 0 en pantalla aparece 1
            // y tiene que ser entre parentesis para que haga la suma
            // si no lo tiene, hace es una concatenacion de string, ejemplo
            // " + i + 1 + " en pantalla aparece 01, 11, 21
            System.out.println("El area de la figura " + (i + 1) + " es:" + figure.calculateArea());
            System.out.println("Y la figura es: " + figure.toString());
            System.out.println();
        }
    }

    /**
     * Se crea una variable local de tipo boolean llamada "hasEquals" y se inicializa a false
     *
     * Este metodo recorre la lista (que es una referencia) que recibe por parametro
     *
     * Extrae cada elemento en cada iteraccion del for y lo almacena en una variable llamada
     * "assess"
     *
     * Dentro del primer for, se crea otro for, y extrae cada elemento en cada iteraccion del 2do for
     * y lo almacena en una variable "compare" y hace la evaluacion si "assess" es igual a "compare"
     *
     * Si esa comapracion es correcta, cambia el valos de "hasEquals" a true
     *
     * Al terminar los 2 for, retorna el "hasEquals" que puede tener false (valor inicial)
     * o true (valor que se cambio al encontrar elementos iguales en la lista)
     *
     * @param figures
     * @return
     */
    public static Boolean hasFiguresEquals(ArrayList<Figure> figures) {
        boolean hasEquals = false;
        for (int j = 0; j < figures.size(); j++) {
            // Se elije un elemento de la lista y lo guardo en assess (evaluar)
            Figure assess = figures.get(j);

            for (int k = 0; k < figures.size(); k++) {
                // Recorro la lista y guardo cada elemento en compare
                Figure compare = figures.get(k);

                // pregunto si assess es igual a compare y si j es distinto de k
                // el j distinto de k, hago que no compare el mismo elemnto de la lista consigo mismo
                if (assess.equals(compare) && j != k)
                    hasEquals = true;
            }
        }
        return hasEquals;
    }
}
