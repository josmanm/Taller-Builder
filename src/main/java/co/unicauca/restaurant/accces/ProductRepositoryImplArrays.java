package co.unicauca.restaurant.accces;

import co.unicauca.restaurant.domain.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación por defecto. El framewok contenedor de CDI (Contexts and
 * Dependency Injection) carga la implementación por defecto.
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class ProductRepositoryImplArrays implements IProductRepository {

    /**
     * Lista de tipo Product.
     */
    public static List<Product> products;

    /**
     * Constructor por defecto.
     */
    public ProductRepositoryImplArrays() {
        products = new ArrayList<>();
        initialize();
    }

    /**
     * Agrega productos al restaurante.
     */
    private void initialize() {
        products.add(new Product(1, "Shop Suey", 5000d));
        products.add(new Product(2, "Arroz Oriental", 5500d));
        products.add(new Product(3, "Pasta con Verduras", 5000d));
        products.add(new Product(4, "Pollo Agridulce", 5800d));
        products.add(new Product(5, "Cerdo Tropical", 6900d));
        products.add(new Product(6, "Res Teriyaki", 6200d));
        products.add(new Product(7, "Pasta Carbonara", 6000d));
        products.add(new Product(8, "Pizza Margherita", 8000d));
        products.add(new Product(9, "Risotto de hongos", 7500d));
        products.add(new Product(10, "Pomodoro E Basilico", 7800d));
        products.add(new Product(11, "Pistacho Panna Cotta", 6000d));
        products.add(new Product(12, " Panettone", 4000d));
    }

    /**
     * Metodo para listar todos los productos.
     *
     * @return Lista de productos.
     */
    @Override
    public List<Product> findAll() {
        return products;
    }

    /**
     * Encuantra un producto dependiendo de su id.
     *
     * @param id
     * @return
     */
    @Override
    public Product findById(Integer id) {
        for (Product prod : products) {
            if (prod.getId() == id) {
                return prod;
            }
        }
        return null;
    }

    /**
     * Metodo encargado de crear un producto.
     *
     * @param newProduct
     * @return
     */
    @Override
    public boolean create(Product newProduct) {
        Product prod = this.findById(newProduct.getId());
        if (prod != null) {
            //Ya existe
            return false;
        }
        products.add(newProduct);
        return true;
    }

    /**
     * Metodo para cambiar algunos valores de los productos.
     *
     * @param newProduct
     * @return True si no se encuntra el producto, False si no se encuentra
     * ningun producto.
     */
    @Override
    public boolean update(Product newProduct) {
        Product prod = this.findById(newProduct.getId());
        if (prod != null) {
            prod.setName(newProduct.getName());
            prod.setPrice(newProduct.getPrice());
            return true;
        }
        return false;
    }

    /**
     * Metodo para eliminar un producto.
     *
     * @param newProduct
     * @return True si no se encuntra el producto, False si no se encuentra
     * ningun producto.
     */
    @Override
    public boolean delete(Integer id) {
        for (Product prod : products) {
            if (prod.getId() == id) {
                products.remove(prod);
                return true;
            }
        }
        return false;
    }
}
