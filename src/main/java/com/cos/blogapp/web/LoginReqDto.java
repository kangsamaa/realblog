package com.cos.blogapp.web;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginReqDto {
  
  @Size(min = 2, max = 20)
  @NotBlank 
  private String username;
  
  @Size(min = 4, max = 20)
  @NotBlank 
  private String password;
  
  
}