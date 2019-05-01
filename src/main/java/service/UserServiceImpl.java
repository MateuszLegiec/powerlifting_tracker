package service;

import data.UserDao;
import data.UserDaoImpl;
import domain.User;
import dto.UserDTO;
import expection.ObjectNotFoundException;
import mapper.MapperInterface;
import mapper.UserMapper;

public class UserServiceImpl implements UserService {

    private final static UserDao userDaoImpl = new UserDaoImpl();

    private final MapperInterface<User, UserDTO> userMapper = new UserMapper();


    @Override
    public User findUserById(Long id) {
        try {
            userDaoImpl.openCurrentSession();
            User user = userDaoImpl.findUserById(id).orElse(null);
            userDaoImpl.closeCurrentSession();
            return user;
        }catch (NullPointerException e){
            throw new ObjectNotFoundException(User.class);
        }
    }

    @Override
    public UserDTO findUserByUsername(String username) throws ObjectNotFoundException {
        try {
            userDaoImpl.openCurrentSession();
            User user = userDaoImpl.findUserByUsername(username).orElse(null);
            userDaoImpl.closeCurrentSession();
            return userMapper.entityToDTO(user);
        }catch (NullPointerException e){
            throw new ObjectNotFoundException(User.class);
        }
    }

    @Override
    public void save(UserDTO userDTO) {
        userDaoImpl.openCurrentSessionWithTransaction();
        userDaoImpl.save(userMapper.dtoToEntity(userDTO));
        userDaoImpl.closeCurrentSessionWithTransaction();
    }

    @Override
    public void update(UserDTO userDTO) {
        userDaoImpl.openCurrentSessionWithTransaction();
        userDaoImpl.update(userMapper.dtoToEntity(userDTO));
        userDaoImpl.closeCurrentSessionWithTransaction();
    }

}
