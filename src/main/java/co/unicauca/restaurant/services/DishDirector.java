package co.unicauca.restaurant.services;

import co.unicauca.restaurant.domain.Dish;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class DishDirector {

    /**
     * Objeto de tipo DishBuilder.
     */
    private DishBuilder builder;

    /**
     * Constructor parametrizado.
     *
     * @param builder
     */
    public DishDirector(DishBuilder builder) {
        this.builder = builder;
    }

    /**
     * Constructor por defecto.
     */
    public DishDirector() {
    }

    //Getters
    public Dish getDish() {
        return builder.getDish();
    }

    /**
     * Metodo encargado de realizar los respectivos llamados a funciones para
     * crear un plato.
     */
    public void create() {
        boolean masPartes = true;
        builder.init();
        builder.setCore();
        while (masPartes) {
            masPartes = builder.addPart();
        }
        builder.setSize();
    }
}
