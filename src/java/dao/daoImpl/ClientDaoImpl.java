package dao.daoImpl;

import dao.DaoInterfaces.ClientDao;
import model.Client;
import utils.DbConnectionUtil;

import java.sql.*;
import java.util.List;

public class ClientDaoImpl implements ClientDao {

    private DbConnectionUtil dbConnectionUtil;
    
    public Client create(Client client) {
        Connection connection = dbConnectionUtil.getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement st = connection.prepareStatement(
                    "insert into product (id, first_name, last_name, last_activity_date, telephone_number, " +
                            "email, birthday, bonuses, isDeleted) values (?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setLong(1, client.getId());
            st.setString(2, client.getFirstName());
            st.setString(3, client.getLastName());
            st.setDate(4, (Date) client.getLastActivityDate());
            st.setString(5, client.getTelephoneNumber());
            st.setString(6, client.getEmail());
            st.setDate(7, (Date) client.getBirthday());
            st.setLong(8, client.getBonuses());
            st.setBoolean(9,client.getIsDeleted());
            st.executeUpdate();
            ResultSet resultSet = st.getGeneratedKeys();
            resultSet.next();
            Long recordId = resultSet.getObject(1, Long.class);//resultSet.getLong(1)
            client.setId(recordId);
            connection.commit();
//            return client;
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
        return client;
    }


    public Client update(Client input_client) {
        return null;
    }

    public boolean delete(long id) {
        return false;
    }

    public Client get(long id) {
        return null;
    }

    public List<Client> getAll() {
        return null;
    }
}
