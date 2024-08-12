package hn.com.jf.models;

import lombok.Data;

@Data
public class User {
	private String name;
	private String lastname;
	private String email;

	public User() {

	}

	public User(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;
	}

	public User(String name, String lastname, String email) {
		this.name = name;
		this.lastname = lastname;
		this.email = email;
	}

}
