package model;

import java.util.Set;

public interface CrudRepository<T ,ID> {

    T save(T object);
    
    T findById(ID id);
    
    Set<T> findAll();
    
    void delete(T object);
    
    void deleteById(ID id);
}
