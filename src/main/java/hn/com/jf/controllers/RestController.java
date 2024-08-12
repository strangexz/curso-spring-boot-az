package hn.com.jf.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hn.com.jf.models.User;
import hn.com.jf.models.dto.UserDTO;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

	@GetMapping("/details-map")
	public Map<String, Object> restDetail() {
		User user = new User("David", "Figueroa");
		Map<String, Object> response = new HashMap<>();

		response.put("message", "Hola mundo con Spring Boot");
		response.put("user", user);

		return response;
	}

	@GetMapping("/details")
	public UserDTO userDTO() {
		User user = new User("Clara", "Aguilar");
		UserDTO userDto = new UserDTO();

		userDto.setTitle("Hola mundo con Spring Boot y DTOs");
		userDto.setUser(user);

		return userDto;
	}

	@GetMapping("/list")
	public List<User> list() {
		User user = new User("Karla", "Figueroa");
		User user1 = new User("Juan", "Figueroa");
		User user2 = new User("Monserrath", "Figueroa");

		List<User> users = new ArrayList<>();

		users.add(user);
		users.add(user1);
		users.add(user2);

		return users;
	}

	@GetMapping("/asList")
	public List<User> asList() {
		User user = new User("Karla", "Figueroa");
		User user1 = new User("Juan", "Figueroa");
		User user2 = new User("Monserrath", "Figueroa");

		List<User> users = Arrays.asList(user, user1, user2);

		return users;
	}

}
