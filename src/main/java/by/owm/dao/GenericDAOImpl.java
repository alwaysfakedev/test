package by.owm.dao;

import org.hibernate.Criteria;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@Repository
@Transactional
public abstract class GenericDAOImpl <T, PK extends Serializable> implements GenericDAO  <T,PK>
{
    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("all")
     protected Class<T> getGenericEntityClass() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        return (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }


    public void save(T obj)
    {
         getSession().save(obj);
    }

    @SuppressWarnings("all")
    public List<T> getAll() {
        Criteria cr = getSession().createCriteria(this.getGenericEntityClass());
        return (List<T>) cr.list();
    }

    @SuppressWarnings("all")
    public List<T> findByCriteria(Criterion... criterion) {
        Criteria crit = getSession().createCriteria(this.getGenericEntityClass());
        for (Criterion c : criterion) {
            crit.add(c);
        }
        return (List<T>) crit.list();
    }

    public void update(T obj)
    {
        getSession().update(obj);
    }

    @SuppressWarnings("all")
    public T findByID(PK id) {
        return (T) getSession().get(this.getGenericEntityClass(), id);
    }

    @SuppressWarnings("all")
    public void remove(PK id) {
        T persistentObject = (T) getSession().load(this.getGenericEntityClass(), id);
        try {
            getSession().delete(persistentObject);
        } catch (NonUniqueObjectException e) {
            T instance = (T) getSession().merge(persistentObject);
            getSession().delete(instance);
        }
    }

    @SuppressWarnings("all")
    public void remove(T persistentObject) {
        try {
            getSession().delete(persistentObject);
        } catch (NonUniqueObjectException e) {
            T instance = (T) getSession().merge(persistentObject);
            getSession().delete(instance);
        }
    }
}
