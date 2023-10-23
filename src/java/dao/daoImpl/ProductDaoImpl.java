package dao.daoImpl;

import dao.DaoInterfaces.ProductDao;
import model.Product;
import utils.DbConnectionUtil;

import java.sql.*;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private DbConnectionUtil dbConnectionUtil;

    public Product create(Product product) {
        Connection connection = dbConnectionUtil.getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement st = connection.prepareStatement(
                    "insert into product (id, name, price, quantity, delivery_date) values (?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            st.setLong(1, product.getId());
            st.setString(2, product.getName());
            st.setFloat(3, product.getPrice());
            st.setLong(4, product.getQuantity());
            st.setDate(5, (Date) product.getDelivery_date());
            st.executeUpdate();
            ResultSet resultSet = st.getGeneratedKeys();
            resultSet.next();
            Long recordId = resultSet.getObject(1, Long.class);//resultSet.getLong(1)
            product.setId(recordId);
            connection.commit();
//            return product;
        } catch (SQLException ex) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            ex.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return product;
    }

    public Product update(Product input_product) {
        return null;
    }

    public boolean delete(long id) {
        return false;
    }

    public Product get(long id) {
        return null;
    }

    public List<Product> getAll() {
        return null;
    }
}
