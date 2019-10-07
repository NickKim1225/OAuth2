package Task1.OAuth2Postgres.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Task1.OAuth2Postgres.repositories.UsersRepository;

@RestController
public class UserController {
	
	@Autowired
	private UsersRepository repo;
	
	@RequestMapping("/")
    public String index(){
        return repo.findByUsername("username").getUsername();
        
    }
	
	@GetMapping("/noCheck")
	public String noCheck() {
		return "HELLO";
	}
	
	@GetMapping("/check")
	public String privateArea() {
		return "PRIVATE AREA";
	}
}
