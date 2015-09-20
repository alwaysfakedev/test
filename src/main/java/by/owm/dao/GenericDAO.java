package by.owm.dao;

import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

/**
 * Created by HaRiA on 05.08.2014.
 */
public interface GenericDAO <T, PK extends Serializable>
{
    public void save(T obj);

    public void update(T obj);

    List<T> getAll();

    List<T> findByCriteria(Criterion... criterion);

    public T findByID(PK id);

    public void remove(PK id);

    void remove(T persistantObject);



}
