package dao;

import Models.Model;
import java.util.List;

public interface dao <T extends Model>{

    T create(T t);
    T get(Long id);
    List<T> getAll();
    T update(T t);
    boolean delete(Long id);

}
