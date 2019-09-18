package Task1.OAuth2Postgres.models;

import javax.persistence.*;

@Entity
@Table(name="people")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="username", nullable=false, updatable=false)
	private String username;
	
	
}
