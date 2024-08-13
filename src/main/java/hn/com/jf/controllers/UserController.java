package hn.com.jf.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import hn.com.jf.models.User;

@Controller
public class UserController {

	@GetMapping("/details")
	public String details(Model model) {
		model.addAttribute("title", "Hola mundo con Srping Boot!");
		model.addAttribute("name", "Názareth");
		model.addAttribute("lastname", "Figueroa");

		User user = new User("David", "Figueroa");
		model.addAttribute("message", "Hola mundo con Spring Boot!");
		model.addAttribute("user", user);

		return "details";
	}

	@GetMapping("/list")
	public String list(Model model) {
		User user = new User("Karla", "Figueroa");
		User user1 = new User("Juan", "Figueroa", "jfigueroa@correo.com");
		User user2 = new User("Monserrath", "Figueroa", "mfigueroa@correo.com");
		User user3 = new User("Aby", "Figueroa");

		List<User> users = Arrays.asList(user, user1, user2, user3);

		model.addAttribute("users", users);
		model.addAttribute("title", "Estado de Usuarios");

		return "list";
	}

	@ModelAttribute("users")
	public List<User> usersModel() {
		User user = new User("Karla", "Figueroa");
		User user1 = new User("Juan", "Figueroa", "jfigueroa@correo.com");
		User user2 = new User("Monserrath", "Figueroa", "mfigueroa@correo.com");
		User user3 = new User("Aby", "Figueroa");

		return Arrays.asList(user, user1, user2, user3);
	}
}
