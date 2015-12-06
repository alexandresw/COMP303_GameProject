package com.centennial.comp303.controller;

import java.util.List;

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

  @RequestMapping(value={"", "/", "index"})
  public String home(String type, Model model) {
	  List result = null;
	  if(type != null){
		  result = gamesRepository.findByType(type);
	  }
	  else{
		  result = gamesRepository.list();
	  }
		  
	  model.addAttribute("games", result);
      return "index";
  }
  
  
  
  @RequestMapping("newGame")
  public String newGameForm() {
      return "newGame";
  }
  
  @RequestMapping("addGame")
  public String newGameForm(Game game) {
	  gamesRepository.add(game);
      return "redirect:index";
  }
  
  @RequestMapping("viewGame")
  public String viewGame(Long id, Model model) {
	  model.addAttribute("game", gamesRepository.findById(id) );
      return "viewGame";
  }
  

}
