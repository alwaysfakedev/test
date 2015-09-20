package by.owm.service.user;

import by.owm.model.User;

import java.util.List;

/**
 * Created by HaRiA on 30.07.2014.
 */
public interface UserService
{
    public void saveUser(User user);

    public List<User> userList();

    public void removeUser(long userId);

    public User returnUserByLoginPassword(String login, String password);

}
