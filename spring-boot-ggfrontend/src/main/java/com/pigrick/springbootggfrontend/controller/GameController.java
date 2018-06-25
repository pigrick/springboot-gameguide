package com.pigrick.springbootggfrontend.controller;

import com.pigrick.springbootggfrontend.soupclient.GameClient;
import com.pigrick.springbootggfrontend.wsdl.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class GameController {

    @Autowired
    private GameClient gameClient;

    @RequestMapping("add")
    public String addGame(){
        Game game = new Game();
        game.setName("Battlefield V");
        game.setCompany("EA");
        game.setGenre("Action Shooter");
        this.gameClient.addGame(game);
        return "redirect:/";
    }

    @RequestMapping("/")
    public String getHome(Model model){
        model.addAttribute("title", "Home");
        return "welcome";
    }

}
