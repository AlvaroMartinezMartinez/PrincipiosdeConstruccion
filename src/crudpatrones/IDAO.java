package crudpatrones;

import java.sql.ResultSet;

/**
 *
 * @author equipo6
 */
public interface IDAO<T> {
    
    boolean insert(T t);
    boolean delete(T t);
    boolean update(T t);
    ResultSet readOne(T t);
    ResultSet readAll();
    
}
