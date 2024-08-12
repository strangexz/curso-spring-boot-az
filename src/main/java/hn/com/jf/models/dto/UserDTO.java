package hn.com.jf.models.dto;

import hn.com.jf.models.User;
import lombok.Data;

@Data
public class UserDTO {
	private String title;
	private User user;
}
