package by.owm.dao;

import java.util.List;

import by.owm.dao.GenericDAO;
import by.owm.model.Attach;
import by.owm.model.Mail;

public interface AttachDao extends GenericDAO<Attach, Long>
{

	List<Attach> getAttachsDaoToMail(Mail mail);

}
