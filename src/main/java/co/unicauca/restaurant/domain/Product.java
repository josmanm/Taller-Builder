package co.unicauca.restaurant.domain;

/**
 *CLASE PRODUCTO.
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class Product {

    /**
     * variable es tipo entero.
     */
    private int id;
    /**
     * Variable de tipo String.
     */
    private String name;
    /**
     * Variable de tipo double.
     */
    private double price;

    /**
     * Constructor parametrizado.
     *
     * @param id
     * @param name
     * @param price
     */
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Constructor por defecto.
     */
    public Product() {
    }

    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Metodo que sobrescribe la forma de impresion de un producto.
     *
     * @return Cadena de texto con la informacion del producto.
     */
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }

}
