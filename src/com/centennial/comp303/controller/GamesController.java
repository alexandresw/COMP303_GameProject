package com.centennial.comp303.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.centennial.comp303.domain.Game;
import com.centennial.comp303.repository.GamesRepository;

@Transactional
@Controller
public class GamesController {
	
	@Autowired
	private GamesRepository gamesRepository;

  @RequestMapping("/")
  public String home(Model model) {
	  model.addAttribute("games", gamesRepository.list());
      return "index";
  }
  
  @RequestMapping("newGame")
  public String newGameForm() {
      return "newGame";
  }
  
  @RequestMapping("addGame")
  public String newGameForm(Game game) {
	  gamesRepository.add(game);
      return "index";
  }
  

}
