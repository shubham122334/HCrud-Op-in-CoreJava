package model;

import java.util.Set;

public interface myCrud<T ,ID> {

    T save(T object);
    T findById(ID id);
    Set<T> findAll();
}
