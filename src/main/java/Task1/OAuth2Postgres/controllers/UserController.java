package Task1.OAuth2Postgres.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
	public String privateArea(@RequestBody String msg) throws Exception{
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		HttpEntity<String> entity = new HttpEntity<String>(msg, headers); 
		String response = new RestTemplate().postForObject("http://localhost:5000/sign", entity, String.class);
		
		return response;
	}
}
