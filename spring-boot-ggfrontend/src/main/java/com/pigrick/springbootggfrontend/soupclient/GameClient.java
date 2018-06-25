package com.pigrick.springbootggfrontend.soupclient;

import com.pigrick.springbootggfrontend.wsdl.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class GameClient extends WebServiceGatewaySupport {

    @Value("${soupServicePort}")
    private String soupServicePort;

    public GameDetailsResponse getGameByName(String gameName) {
        GameDetailsRequest request = new GameDetailsRequest();
        request.setName(gameName);
        GameDetailsResponse response = (GameDetailsResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:" + soupServicePort + "/ws"));
        return response;
    }

    public AllGameDetailsResponse getAllGames() {
        AllGameDetailsRequest request = new AllGameDetailsRequest();
        AllGameDetailsResponse response = (AllGameDetailsResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:" + soupServicePort + "/ws"));
        return response;
    }

    public AddGameResponse addGame(Game game){
        AddGameRequest request = new AddGameRequest();
        request.setGame(game);
        AddGameResponse response = (AddGameResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:" + soupServicePort + "/ws"));
        return response;
    }

}
