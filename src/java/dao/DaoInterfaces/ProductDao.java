package dao.DaoInterfaces;

import model.Product;

import java.util.List;

public interface ProductDao {

    Product create(Product input_product);

    Product update(Product input_product);

    boolean delete(long id);

    Product get(long id);

    List<Product> getAll();
}
