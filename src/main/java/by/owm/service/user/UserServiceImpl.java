package by.owm.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.owm.dao.UserDao;
import by.owm.model.User;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public List<User> userList() {
        return userDao.getAll();
    }

    public void removeUser(long userId) {
       userDao.remove(userId);
    }

    public User returnUserByLoginPassword(String login, String password)
    {
        User user = userDao.getUserByLoginPassword(login,password);
        return user;
    }

}
