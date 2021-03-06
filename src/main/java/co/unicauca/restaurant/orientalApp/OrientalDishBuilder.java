package co.unicauca.restaurant.orientalApp;

import co.unicauca.restaurant.services.DishBuilder;
import co.unicauca.restaurant.accces.IProductRepository;
import co.unicauca.restaurant.accces.ProductRepositoryImplArrays;
import co.unicauca.restaurant.domain.Product;
import co.unicauca.restaurant.domain.Size;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class OrientalDishBuilder extends DishBuilder {

    /**
     * Objeto de tipo IProductRepository.
     */
    IProductRepository myRepository;

    /**
     * Objeto de tipo OrientalDish.
     */
    OrientalDish myOrientalDish;

    /**
     * Objeto para ingresar informacion por teclado.
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Lista de tipo Product.
     */
    List<Product> allProducts;
    /**
     * Lista de tipo Product.
     */
    List<Product> bases;
    /**
     * Lista de tipo Product.
     */
    List<Product> options;

    /**
     * Metodo que permite añadir la informacion del plato.
     *
     * @param myProducts
     * @param foodPart
     * @return Entero.
     */
    private Product read(List<Product> myProducts, String foodPart) {
        String input = "";
        try {
            int i = 1;
            System.out.println("Seleccione una " + foodPart);
            for (Product each : myProducts) {
                System.out.println("" + i + ". " + each.getName() + ":" + each.getPrice());
                i++;
            }
            System.out.println("Ingrese el código de la " + foodPart);
            input = br.readLine();
        } catch (IOException e) {
        }
        return myProducts.get(Integer.parseInt(input) - 1);
    }

    /**
     * Metodo que permite leer un caracter ingresado por consola.
     *
     * @param message
     * @return Retorna una cadena te texto ingresada.
     */
    private String readString(String message) {
        String input = "";
        try {
            System.out.println(message);
            input = br.readLine();
        } catch (IOException e) {
        }
        return input;
    }

    /**
     * Metodo que permite inicializar el builder de OrientalDish.
     *
     * @return objeto de tipo OrientalDish.
     */
    @Override
    public DishBuilder init() {
        myRepository = new ProductRepositoryImplArrays();
        myDish = new OrientalDish(0.0);
        myOrientalDish = (OrientalDish) myDish;
        //Obtenemos todos los productos
        allProducts = myRepository.findAll();
        // Obtenemos las bases y las opciones
        bases = new ArrayList<Product>();
        options = new ArrayList<Product>();
        for (Product each : allProducts) {
            if (each.getId() < 4) {
                bases.add(each);
            } else if (each.getId() < 7) {
                options.add(each);
            }
        }
        return this;
    }

    /**
     * Metodo encargado de enviar la base.
     *
     * @return Retorna objeto de OrientalDish.
     */
    @Override
    public DishBuilder setCore() {
        myOrientalDish.setBase(read(bases, "Base"));
        return this;
    }

    /**
     * Metodo encargado de añadir mas partes a un plato.
     *
     * @return Retorna True/False,
     */
    @Override
    public boolean addPart() {
        myOrientalDish.addOption(read(options, "Opcion"));
        return ("S".equals(readString("Presione S para más opciones")));

    }

    /**
     * Metodo encargado de enviar 3 tamaños determinados para un plato.
     *
     * @return Objeto de tipo DishBuilder
     */
    @Override
    public DishBuilder setSize() {
        String tamano = readString("Presione la letra correspondiente para el tamaño Personal(P), Doble (D), Familiar (F)");
        if (tamano.equals("F")) {
            myOrientalDish.setSize(Size.FAMILY);
        }
        if (tamano.equals("D")) {
            myOrientalDish.setSize(Size.DOUBLE);
        }
        if (tamano.equals("P")) {
            myOrientalDish.setSize(Size.PERSONAL);
        }
        return this;
    }
}
