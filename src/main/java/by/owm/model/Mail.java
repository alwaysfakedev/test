package by.owm.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = Mail.ENTITY_NAME)
@Table(name="mail")
public class Mail implements Serializable
{
	protected static final String ENTITY_NAME = "Mail";
	
	public static final String MAIL_HEAD_FIELD = "mailHead";
	public static final String MAIL_TEXT_FIELD = "mailText";
	public static final String RECEIVER_FIELD = "receiver";
	public static final String SENDER_FIELD = "sender";
	public static final String ATTACHES_LIST_FIELD = "attachesList";
	public static final String MAIL_TYPE = "type";
	public static final String MAIL_FOLDER = "folder";
	
	private Long id;
	private String mailSubject;
	private String mailText;
	private String receiver;
	private String sender;
	private List<Attach> attachesList;
	private String folder;
	private String date;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	@Column(name = "mail_subject")
	public String getMailSubject() 
	{
		return mailSubject;
	}
	
	public void setMailSubject(String mailSubject)
	{
		this.mailSubject = mailSubject;
	}
	
	@Column(name = "mail_text")
	public String getMailText() 
	{
		return mailText;
	}
	
	public void setMailText(String mailText)
	{
		this.mailText = mailText;
	}

	@Column(name = "receiver")
	public String getReceiver() 
	{
		return receiver;
	}
	
	public void setReceiver(String receiver) 
	{
		this.receiver = receiver;
	}
	
	@Column(name = "sender")
	public String getSender() 
	{
		return sender;
	}
	
	public void setSender(String sender) 
	{
		this.sender = sender;
	}

	@OneToMany
	@JoinColumn(name = "attache")
	public List<Attach> getAttachesList() {
		return attachesList;
	}

	public void setAttachesList(List<Attach> attachesList) {
		this.attachesList = attachesList;
	}
	
	@Column(name = "date")
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Column(name = "mail_folder")
	public String getFolder() {
		return folder;
	}
	public void setFolder(String folder) {
		this.folder = folder;
	}

	
	
}
