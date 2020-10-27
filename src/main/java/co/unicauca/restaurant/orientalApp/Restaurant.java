package co.unicauca.restaurant.orientalApp;

import co.unicauca.restaurant.services.DishDirector;
import co.unicauca.restaurant.domain.Dish;
import java.util.Scanner;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Seleccine el tipo de palto");
        System.out.println("1. para el Plato oriental");
        System.out.println("2. para el Plato italiano");
        opcion = leer.nextInt();
        if (opcion == 1) {
            DishDirector director = new DishDirector(new OrientalDishBuilder());
            director.create();
            Dish myDish = director.getDish();
            System.out.println("El plato le cuesta: " + myDish.getPrice());
        } else {
            if (opcion == 2) {
                DishDirector director = new DishDirector(new ItalianDishBuilder());
                director.create();
                Dish myDish = director.getDish();
                System.out.println("El plato le cuesta: " + myDish.getPrice());
            }
        }

    }
}
