package Task1.OAuth2Postgres.models;

import javax.persistence.*;


@Entity
@Table(name="people")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="username", nullable=false, updatable=false)
	private String username;
	
	@Column(name="password", nullable=false)
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public boolean isActive() {
		return true;
	}
	
}
