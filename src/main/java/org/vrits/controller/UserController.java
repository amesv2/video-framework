package org.vrits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.vrits.model.User;

/**
 * @author BOLLAPUH
 *
 */
@Controller
public class UserController {
	
	@RequestMapping(name="/login",method=RequestMethod.GET)
	public void login(){
		
	}
	
	@RequestMapping(name="/login",method=RequestMethod.POST)
	public void registration(User user){
		
	}
}
