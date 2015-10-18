package by.owm.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import by.owm.model.User;

@Repository
@Transactional
public class UserDaoImpl extends GenericDAOImpl<User, Long> implements UserDao
{
	   /* public User getUserByLoginPassword(String login, String password) {
	Criteria cr = getSession()
			.createCriteria(User.class, "UserController")
			.add(Restrictions.eq(User.LOGIN_FIELD, login))
			.add(Restrictions.eq(User.PASSWORD_FIELD, password));
	return (User) cr.uniqueResult();
}*/
	   public User getUserByLoginPassword(String login, String password) {

		   
		   return null;
	   }
}
