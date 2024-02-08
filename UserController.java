package admin_user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import admin_user.dto.UserDto;
import admin_user.model.User;
import admin_user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/registration")
	public String getRegistrationPage() {
		System.out.println("registration");
		return "register";
	}
	
	
	@PostMapping("/signup")
	public String saveUser(UserDto userDto, org.springframework.ui.Model model) {
		userService.save(userDto);
		//model.addAttribute("message" , "registered successfully");
		return "successful";
		//userDto.toString()
		 
	}
	
	@GetMapping("/showusers")
	public List<User> getDetails(){
		return userService.getDetails() ;
}}
 