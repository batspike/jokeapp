package com.samcancode.joke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samcancode.joke.services.JokeService;

@Controller
public class JokeController {
	private JokeService jokeService;
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		model.addAttribute("other", jokeService.getOtherJoke());
		return "chucknorris";
	}
}
