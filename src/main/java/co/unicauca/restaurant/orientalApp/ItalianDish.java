package co.unicauca.restaurant.orientalApp;

import co.unicauca.restaurant.domain.Dish;
import co.unicauca.restaurant.domain.Product;
import co.unicauca.restaurant.domain.Size;
import java.util.List;
import java.util.Vector;

/**
 * CLASE ItalianDish.
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class ItalianDish extends Dish {

    /**
     * variable de tipo product.
     */
    private Product base;
    /**
     * Lista de tipo producto.
     */
    private List<Product> myOptions;
    /**
     * variable de tipo Size.
     */
    private Size size;

    /**
     * Constructor parametrizado.
     *
     * @param p
     */
    ItalianDish(double p) {
        this.price = p;
        myOptions = new Vector<>();
    }

    /**
     * Metodo para añadir una opcion al plato.
     *
     * @param option
     */
    void addOption(Product option) {
        getMyOptions().add(option);
    }

    //SETTERS AND GETTERS.
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

}
