package dao.daoImpl;

import dao.DaoInterfaces.OrderDao;
import dao.DaoInterfaces.UserDao;
import model.Order;
import utils.DbConnectionUtil;

import java.sql.*;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    private DbConnectionUtil dbConnectionUtil;

    public Order create(Order order) {
        Connection connection = dbConnectionUtil.getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement st = connection.prepareStatement(
                    "insert into product (id, name, price, quantity, delivery_date) values (?, ?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            st.setLong(1, order.getId());
            st.setDate(2, (Date) order.getDate());
            st.setLong(3, order.getTotal_price());
            st.setLong(4, order.getClient_id());
            st.setLong(5, order.getProduct_id());
            st.setBoolean(6, order.getIsDeleted());
            st.executeUpdate();
            ResultSet resultSet = st.getGeneratedKeys();
            resultSet.next();
            Long recordId = resultSet.getObject(1, Long.class);//resultSet.getLong(1)
            order.setId(recordId);
            connection.commit();
//            return order;
        } catch (SQLException ex) {
            if(connection != null){
                try {
                    connection.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            ex.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return order;
    }

    public Order update(Order input_order) {
        return null;
    }

    public boolean delete(long id) {
        return false;
    }

    public Order get(long id) {
        return null;
    }

    public List<Order> getAll() {
        return null;
    }
}
