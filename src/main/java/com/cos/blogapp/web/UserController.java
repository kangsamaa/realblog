package com.cos.blogapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.blogapp.domain.user.User;
import com.cos.blogapp.domain.user.UserRepository;
import com.cos.blogapp.util.SHA;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {

private final HttpSession session;

@PostMapping("/login")
  public String login(LoginReqDto dto) {
    
    String encPassword = SHA.encrypt(dto.getPassword());
    User principal =  userRepository.mLogin(dto.getUsername(), encPassword);
    
    if(principal == null) {
      return "redirect:/loginForm";
    }else {
      session.setAttribute("principal", principal);
      return "redirect:/";
    }
  }

	 //DI 의존성
	private final UserRepository userRepository;
	
	@RequestMapping("/")
	public String root() throws Exception{
		return "index";
	}
	
	@RequestMapping("/hello")
	public String Hello() {
		return "user/hello";
		
	}
	
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
