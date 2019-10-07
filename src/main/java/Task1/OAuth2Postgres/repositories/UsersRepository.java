package Task1.OAuth2Postgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Task1.OAuth2Postgres.models.User;

public interface UsersRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);
}
