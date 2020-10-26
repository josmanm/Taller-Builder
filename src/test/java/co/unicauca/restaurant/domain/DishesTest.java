/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.domain;

import co.unicauca.restaurant.orientalApp.OrientalDishBuilder;
import co.unicauca.restaurant.services.DishBuilder;
import co.unicauca.restaurant.services.DishDirector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class DishesTest {
    
      /**
     * Test of setCore method, of class DishBuilder.
     */
    @Test
    public void testOrientalDish() {
        System.out.println("Oriental Dish");
        DishBuilder orientalBuilder = new OrientalDishBuilder();
        DishDirector director = new DishDirector(new OrientalDishBuilder());
        director.create();
        
        Dish dish = director.getDish();
        assertEquals("Arroz oriental", dish.getPrice());
        assertEquals(56000, dish.getPrice());


    }
}
