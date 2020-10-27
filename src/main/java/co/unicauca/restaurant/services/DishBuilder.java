package co.unicauca.restaurant.services;

import co.unicauca.restaurant.domain.Dish;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public abstract class DishBuilder {

    /**
     * Variable de tipo Dish.
     */
    protected Dish myDish;

    /**
     * Metodo encargado de retornar un plato para calcular el precio.
     *
     * @return
     */
    Dish getDish() {
        return myDish;
    }

    /**
     * Metodo encargado de crear un plato.
     *
     * @return Retorna objeto de tipo DishBuilder.
     */
    public abstract DishBuilder init();

    /**
     * Metodo encargado de enviar la base.
     *
     * @return Retorna objeto de OrientalDish.
     */
    public abstract DishBuilder setCore();

    /**
     * Metodo encargado de añadir mas partes a un plato.
     *
     * @return Retorna True/False,
     */
    public abstract boolean addPart();

    /**
     * Metodo encargado de enviar 3 tamaños determinados para un plato.
     *
     * @return Objeto de tipo DishBuilder
     */
    public abstract DishBuilder setSize();

}
