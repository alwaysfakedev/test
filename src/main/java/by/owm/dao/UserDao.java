package by.owm.dao;

import by.owm.model.User;

public interface UserDao extends GenericDAO<User, Long> {

	User getUserByLoginPassword(String login, String password);

}
