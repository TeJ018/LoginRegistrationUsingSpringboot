package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired(required=false)
 	private UserRepository repo;
 	
	
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
