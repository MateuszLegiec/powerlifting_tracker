package data;

import domain.User;

import java.util.Optional;

public interface UserDao extends InterfaceDao<User,Long>{

    Optional<User> findUserById(Long id);
    Optional<User> findUserByUsername(String username);

}
