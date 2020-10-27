package co.unicauca.restaurant.accces;

import co.unicauca.restaurant.domain.Product;
import java.util.List;

/**
 * INTERFACE DE PRODUCT.
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public interface IProductRepository {

    /**
     * Metodo para listar todos los productos.
     *
     * @return Lista de productos.
     */
    List<Product> findAll();

    /**
     * Encuantra un producto dependiendo de su id.
     *
     * @param id
     * @return
     */
    Product findById(Integer id);

    /**
     * Metodo encargado de crear un producto.
     *
     * @param newProduct
     * @return
     */
    boolean create(Product newProduct);

    /**
     * Metodo para cambiar algunos valores de los productos.
     *
     * @param newProduct
     * @return True si no se encuntra el producto, False si no se encuentra
     * ningun producto.
     */
    boolean update(Product newProduct);

    /**
     * Metodo para eliminar un producto.
     *
     * @param id
     * @return True si no se encuntra el producto, False si no se encuentra
     * ningun producto.
     */
    boolean delete(Integer id);
}
