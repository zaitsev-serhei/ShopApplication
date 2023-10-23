package dao.DaoInterfaces;

import model.Client;

import java.util.List;

public interface ClientDao {

    Client create(Client client);

    Client update(Client input_client);

    boolean delete(long id);

    Client get(long id);

    List<Client> getAll();
}
