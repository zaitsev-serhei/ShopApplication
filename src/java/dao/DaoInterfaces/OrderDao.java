package dao.DaoInterfaces;

import model.Order;

import java.util.List;

public interface OrderDao {

    Order create(Order order);

    Order update(Order input_order);

    boolean delete(long id);

    Order get(long id);

    List<Order> getAll();
}
