package com.beachliga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beachliga.model.User;
import com.beachliga.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
    
	@RequestMapping(value="/players", method=RequestMethod.GET)
    public String showPlayerList(Model model) {
		model.addAttribute("playerList", userService.getAllUsers());
        return "players_all";
    }
    
	@RequestMapping(value="/players/{id}", method=RequestMethod.GET)
    public User showUserById(@PathVariable String id) {
    	return userService.getUserById(Integer.parseInt(id));
    }
	
	@RequestMapping(value="/players", method=RequestMethod.POST)
	public void addUser(@RequestBody User user){
		userService.addUser(user);
	}
	
	@RequestMapping(value="/players/{id}", method=RequestMethod.PUT)
	public void updateUser(@RequestBody User user, @PathVariable String id){
		userService.updateUser(Integer.parseInt(id), user);
	}
	
	@RequestMapping(value="/players/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable String id){
		userService.deleteUser(Integer.parseInt(id));
	}
}
