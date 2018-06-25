package com.pigrick.springbootggbackend.Controller;

import com.pigrick.springbootggbackend.service.GameService;
import com.pigrick.springbootggbackend.xml.game.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping("/add")
    public String addGame(){
        Game game = new Game();
        game.setCompany("Naughty Dogs");
        game.setName("The Last of Us");
        game.setGenre("Action Shooter");
        System.out.println(this.gameService.addGame(game));
        return "redirect:/";
    }
}
