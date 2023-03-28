package net.codejava;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {
	
	@Autowired //by default it is true
 	private UserRepository repo;
	
	/*
	 * @Bean UserService userservice() { if (repo == null) { return new
	 * UserService(new Userrepository("repo")); } return new UserService(repo); }
	 */
	
//	@RequestMapping(value = "/", method = RequestMethod.GET) /* check this */
//	public String getHomePage(){
//	    return "index.html";
//	}
	
	@GetMapping("") 
	public String viewHomePage() { 
		return "index"; 
	}	 
    
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		
		repo.save(user);
		return "register_success";
	}
	
	
}
