package co.unicauca.restaurant.orientalApp;

import co.unicauca.restaurant.domain.Dish;
import co.unicauca.restaurant.domain.Product;
import co.unicauca.restaurant.domain.Size;
import java.util.List;
import java.util.Vector;

/**
 *Clase OrientalDish
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class OrientalDish extends Dish {

    /**
     * Variable de tipo Product.
     */
    private Product base;
    /**
     * Lista de tipo product.
     */
    private List<Product> myOptions;
    /**
     * Variable de tipo Size.
     */
    private Size size;

    /**
     * Constructor parametrizado
     *
     * @param p
     */
    OrientalDish(double p) {
        this.price = p;
        myOptions = new Vector<>();
    }

    /**
     * Metodo encargado de calcular el precio del plato.
     *
     * @return String con el precio del plato.
     */
    public double getPrice() {
        price = base.getPrice();
        for (Product each : myOptions) {
            price = price + each.getPrice();
        }
        if (size == Size.DOUBLE) {
            price = 1.8 * price;
        }
        if (size == Size.FAMILY) {
            price = 3 * price;
        }
        return price;
    }

    /**
     * Metodo encargado de añadir opciones.
     *
     * @param option
     */
    void addOption(Product option) {
        getMyOptions().add(option);
    }

    // SETTERS AND GETTERS
    void setBase(Product base) {
        this.base = base;
    }

    public Product getBase() {
        return base;
    }

    public List<Product> getMyOptions() {
        return myOptions;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
