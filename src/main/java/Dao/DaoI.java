package Dao;

import java.sql.SQLException;
import java.util.List;

public interface DaoI <T>{
    T get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(long id) throws SQLException;
}
