package hn.com.jf.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import hn.com.jf.models.User;

@RequestMapping("/api/var")
public class PathVariableController {
	@Value("${config.username}")
	private String username;

	@Value("${config.message}")
	private String message;

	@Value("${config.listOfValue}")
	private Integer[] arrayOfValues;

	@Value("${config.listOfValue}")
	private List<String> listOfValues;

	@Value("#{'${config.listOfValue}'.toUpperCase()}")
	private String stringValues;

	@Value("#{'${config.listOfValue}'.split(',')}")
	private String listOfValuesManual;

	@Value("${config.code}")
	private String code;

	@Value("#{${config.valuesMap}}")
	private Map<String, Object> valuesMap;

	@GetMapping("/mix/{product}/{id}")
	public Map<String, Object> mix(@PathVariable String product, @PathVariable Long id) {
		Map<String, Object> json = new HashMap<>();
		
		json.put("product", product);
		json.put("id", id);

		return json;
	}
	
	@PostMapping("/create")
	public User create(@RequestBody User user) {
		return user;
	}
	
	@GetMapping("/values")
	public Map<String, Object> values(){
		Map<String, Object> json = new HashMap<>();
		
		json.put("username", username);
		json.put("message", message);
		json.put("code", code);
		json.put("listOfValues", listOfValues);
		json.put("arrayOfValues", arrayOfValues);
		json.put("stringValues", stringValues);
		json.put("listOfValuesManual", listOfValuesManual);
		json.put("valuesMap", valuesMap);
		
		return json;
	}
	

}
