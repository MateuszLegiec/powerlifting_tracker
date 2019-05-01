package data;

import domain.User;

import java.util.Optional;

public class UserDaoImpl extends HibernateConnector implements UserDao {

    @Override
    public Optional<User> findUserById(Long id) {
        return getCurrentSession().createQuery("from User where id= :id").setParameter("id",id).uniqueResultOptional();
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return getCurrentSession().createQuery("from User where username= :username").setParameter("username",username).uniqueResultOptional();
    }
}
