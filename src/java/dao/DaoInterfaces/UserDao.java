package dao.DaoInterfaces;

import model.User;

import java.util.List;

public interface UserDao {

    User create(User user);

    User update(User input_user);

    boolean delete(long id);

    User get(long id);

    List<User> getAll();
}
