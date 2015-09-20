package by.owm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name= User.ENTITY_NAME)
@Table(name = "user",uniqueConstraints = { @UniqueConstraint(columnNames = {"id"})})
public class User 
{
	
	protected static final String ENTITY_NAME = "UserController";
	
	public static final String FIRST_NAME_FIELD ="firstName";
	public static final String LAST_NAME_FIELD ="lastName";
	public static final String LOGIN_FIELD ="login";
	public static final String PASSWORD_FIELD ="password";
	public static final String EMAIL_FIELD = "email";
	
	private Long id;
	private String firstName;
	private String lastName;
	private String login;
	private String password;
	private String email;
	
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
	@Column(name ="first_name")
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	@Column(name = "last_name")
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	@Column(name = "login")
	public String getLogin()
	{
		return login;
	}
	
	public void setLogin(String login)
	{
		this.login = login;
	}
	
	@Column(name = "password")
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
