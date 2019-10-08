import ar.com.ada.abstracts.abst.Figure;
import ar.com.ada.abstracts.subclass.Circle;
import ar.com.ada.abstracts.subclass.Rectangle;
import ar.com.ada.abstracts.subclass.Triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<Figure>();
        Scanner keyboard = new Scanner(System.in);
        int choice, i = 0;
        do {
            System.out.println("Elegí una figura (1 - Rectangulo; 2 - Circulo; 3 - Triangulo): ");
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    //instancia con constructor vacio
                    Rectangle rec = new Rectangle();
                    // pido y capturo los datos
                    System.out.println("Ingrese la base del rectangulo:");
                    Double widthR = keyboard.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo:");
                    Double heigthR = keyboard.nextDouble();
                    // seteo los attr del objeto con los setters
                    rec.setWidth(widthR);
                    rec.setHeigth(heigthR);
                    // agrego a la lista
                    figures.add(rec);
                    i++;
                    break;
                case 2:
                    // pido y capturo el dato
                    System.out.println("Ingrese el radio del circulo");
                    Double r = keyboard.nextDouble();
                    // instancio la clase con el contructor con parametro
                    Circle c = new Circle(r);
                    // agrego el objeto a la lista
                    figures.add(c);
                    i++;
                    break;
                case 3:
                    // pido y capturo los datos
                    System.out.println("Ingrese la altura del triangulo:");
                    Double heigthT = keyboard.nextDouble();
                    System.out.println("Ingrese la base del triangulo:");
                    Double widthT = keyboard.nextDouble();
                    // instancio la clase con el constructor con paranetros
                    Triangle t = new Triangle(heigthT, widthT);
                    figures.add(t);
                    i++;
                    break;
                default:
                    System.out.println("Opcion no existente");
            }

        } while (i < 3);

        for (int j = 0; j < figures.size(); j++) {
            Figure figure = figures.get(j);
            System.out.println("El area de la figura " + j + " es:" + figure.calculateArea());
            System.out.println("Y la figura es: " + figure.toString());
        }
    }
}
