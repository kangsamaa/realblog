package com.cos.blogapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.blogapp.domain.user.User;
import com.cos.blogapp.domain.user.UserRepository;
import com.cos.blogapp.util.SHA;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {
	 //DI 의존성
	private final UserRepository userRepository;
	
	@PostMapping("/join")
	public String join(JoinReqDto dto) {
		
		String encPassword = SHA.encrypt(dto.getPassword());
		dto.setPassword(encPassword);
		User user = dto.toEntity();
		userRepository.save(user);
		
		return "redirect:/loginForm";
		
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	
	@GetMapping("/joinForm")
		public String joinForm() {
			return "user/joinForm";
		}
	
	
	@GetMapping("/user/{id}")
	public String userInfo(@PathVariable int id) {
		return "user/updateForm";
	}
}
