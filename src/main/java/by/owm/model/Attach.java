package by.owm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = Attach.ENTITY_NAME)
public class Attach 
{
	protected static final String ENTITY_NAME = "Attach";
	
	public static final String MAIL_FIELD = "mail";
	public static final String REFERENCE_FIELD = "reference";
	
	private Long id;
	private Mail mail;
	private String reference;
	
	
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
	@ManyToOne
	@JoinColumn(name = "mail")
	public Mail getMail()
	{
		return mail;
	}
	
	public void setMail(Mail mail)
	{
		this.mail = mail;
	}
	
	@Column(name = "reference")
	public String getReference() 
	{
		return reference;
	}
	
	public void setReference(String reference) 
	{
		this.reference = reference;
	}

}
