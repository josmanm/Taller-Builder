
package co.unicauca.restaurant.orientalApp;

import co.unicauca.restaurant.services.DishDirector;
import co.unicauca.restaurant.domain.Dish;

/**
 *
 * @author ahurtado
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DishDirector director = new DishDirector(new OrientalDishBuilder());
        director.create();
        Dish myDish = director.getDish();
        System.out.println("El plato le cuesta: "+ myDish.getPrice());
  } 
}
