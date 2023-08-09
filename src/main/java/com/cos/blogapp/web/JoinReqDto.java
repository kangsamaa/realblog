package com.cos.blogapp.web;

import com.cos.blogapp.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JoinReqDto {

		private String username;
		private String password;
		private String email;
		
		public User toEntity() {
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
			return user;
		}
	
}
