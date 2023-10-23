package dao.daoImpl;

import dao.DaoInterfaces.UserDao;
import model.User;
import utils.DbConnectionUtil;

import java.sql.*;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private DbConnectionUtil dbConnectionUtil;

    public User create(User user) {
        Connection connection = dbConnectionUtil.getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement st = connection.prepareStatement(
                    "insert into user (id, login, first_name, last_name, password, last_activity_date, isDeleted)" +
                            " values (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setLong(1, user.getId());
            st.setString(2, user.getLogin());
            st.setString(3, user.getFirstName());
            st.setString(4, user.getLastName());
            st.setString(5, user.getPassword());
            st.setDate(6, (Date) user.getLastActivityDate());
            st.setBoolean(7, user.getIsDeleted());
            st.executeUpdate();
            ResultSet resultSet = st.getGeneratedKeys();
            resultSet.next();
            Long recordId = resultSet.getObject(1, Long.class);//resultSet.getLong(1)
            user.setId(recordId);
            connection.commit();
//            return user;
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
        return user;
    }

    public User update(User input_user) {
        return null;
    }

    public boolean delete(long id) {
        return false;
    }

    public User get(long id) {
        return null;
    }

    public List<User> getAll() {
        return null;
    }
}
