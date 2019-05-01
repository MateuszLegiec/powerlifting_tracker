package data;

import org.hibernate.Session;

interface InterfaceDao<T , Long> {

    void openCurrentSession();

    void openCurrentSessionWithTransaction();

    void closeCurrentSession();

    void closeCurrentSessionWithTransaction();

    Session getCurrentSession();

    default void save(T entity){
        getCurrentSession().save(entity);
    }

    default void update(T entity){
        getCurrentSession().update(entity);
    }

}
