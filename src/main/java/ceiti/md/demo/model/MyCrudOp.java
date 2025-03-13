package ceiti.md.demo.model;

import java.util.List;

public interface MyCrudOp<T> {
    List<T> findAll();
    T findById(int id);
    void save (T object);
    void update(T object);
    void delete(T object);
}
