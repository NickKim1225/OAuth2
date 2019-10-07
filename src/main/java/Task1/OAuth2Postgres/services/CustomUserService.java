package Task1.OAuth2Postgres.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Task1.OAuth2Postgres.models.User;
import Task1.OAuth2Postgres.repositories.UsersRepository;

@Service
public class CustomUserService implements UserDetailsService{

	@Autowired
    private UsersRepository repo;
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("CHECKING");
		// TODO Auto-generated method stub
		User u = repo.findByUsername(username);
				return new org.springframework.security.core.userdetails.User(u.getUsername(),
						passwordEncoder.encode(u.getPassword()),
		                u.isActive(),
		                u.isActive(),
		                u.isActive(),
		                u.isActive(),
		                AuthorityUtils.createAuthorityList("ROLE_TRUSTED_USER"));
		
	
	}

}
