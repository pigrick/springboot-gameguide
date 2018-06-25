package com.pigrick.springbootggbackend.service;

import com.pigrick.springbootggbackend.mapper.GameGuideMapper;
import com.pigrick.springbootggbackend.mapper.GameMapper;
import com.pigrick.springbootggbackend.xml.game.Game;
import com.pigrick.springbootggbackend.xml.game.GameGuide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private GameMapper gameMapper;
    private GameGuideMapper gameGuideMapper;

    public GameService(GameMapper gameMapper, GameGuideMapper gameGuideMapper) {
        this.gameMapper = gameMapper;
        this.gameGuideMapper = gameGuideMapper;
    }

    public List<Game> findAll(){
        return this.gameMapper.findAll();
    }

    public Game findByName(String name) {
        Game game = this.gameMapper.findByName(name);
        for (GameGuide gameGuide : this.gameGuideMapper.findByGameId(game.getId())){
            game.getGuides().add(gameGuide);
        }
        return game;
    }

    public boolean addGame(Game game){
        return this.gameMapper.addGame(game);
    }
}
