package com.pigrick.springbootggbackend.Controller;

import com.pigrick.springbootggbackend.service.GameService;
import com.pigrick.springbootggbackend.xml.game.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private GameService gameService;

    @RequestMapping("/")
    public List<Game> Test(){
        return gameService.findAll();
    }

    @RequestMapping("/{name}")
    public Game Test(@PathVariable("name") String name){
        return gameService.findByName(name);
    }

}
