package Task1.OAuth2Postgres.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Task1.OAuth2Postgres.models.User;
import Task1.OAuth2Postgres.repositories.UsersRepository;

@Service
public class UserService {
	
	@Autowired
	private UsersRepository repo;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

    public void save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }
	
	
}
