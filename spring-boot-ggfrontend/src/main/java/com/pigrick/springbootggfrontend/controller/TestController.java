package com.pigrick.springbootggfrontend.controller;

import com.pigrick.springbootggfrontend.soupclient.GameClient;
import com.pigrick.springbootggfrontend.wsdl.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private GameClient gameClient;

    @RequestMapping("test")
    public Game doTest(){
        return gameClient.getGameByName("Warcraft 3").getGame();
    }

    @RequestMapping("test2")
    public List<Game> doTest2(){
        return gameClient.getAllGames().getGames();
    }
}
