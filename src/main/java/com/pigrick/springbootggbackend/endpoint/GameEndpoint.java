package com.pigrick.springbootggbackend.endpoint;

import com.pigrick.springbootggbackend.service.GameService;
import com.pigrick.springbootggbackend.xml.game.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GameEndpoint{
    private static final String NAMESPACE_URI = "http://pigrick.com/springbootggbackend/xml/game";

    private GameService gameService;

    @Autowired
    public GameEndpoint(GameService gameService) {
        this.gameService = gameService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "gameDetailsRequest")
    @ResponsePayload
    public GameDetailsResponse getGame(@RequestPayload GameDetailsRequest request) {
        GameDetailsResponse response = new GameDetailsResponse();
        response.setGame(gameService.findByName(request.getName()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "allGameDetailsRequest")
    @ResponsePayload
    public AllGameDetailsResponse getGame(@RequestPayload AllGameDetailsRequest request) {
        AllGameDetailsResponse response = new AllGameDetailsResponse();
        for(Game game: gameService.findAll() ) {
            response.getGames().add(game);
        }
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addGameRequest")
    @ResponsePayload
    public AddGameResponse addGame(@RequestPayload AddGameRequest request) {
        AddGameResponse response = new AddGameResponse();
        boolean inserted = this.gameService.addGame(request.getGame());
        response.setInserted(inserted);
        return response;
    }
}

