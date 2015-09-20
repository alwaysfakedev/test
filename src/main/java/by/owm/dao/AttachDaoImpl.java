package by.owm.dao;

import java.util.List;

import by.owm.model.Attach;
import by.owm.model.Mail;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

   public class AttachDaoImpl extends GenericDAOImpl<Attach, Long> implements AttachDao
{

	public List<Attach> getAttachsDaoToMail(Mail mail) {
		Criteria criteria = getSession().createCriteria(this.getGenericEntityClass());
		criteria.add(Restrictions.eq(Attach.MAIL_FIELD, mail));
		return criteria.list();
	}

}
