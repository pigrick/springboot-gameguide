//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.25 at 03:50:19 PM PDT 
//


package com.pigrick.springbootggbackend.xml.game;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pigrick.springbootggbackend.xml.game package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pigrick.springbootggbackend.xml.game
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllGameDetailsResponse }
     * 
     */
    public AllGameDetailsResponse createAllGameDetailsResponse() {
        return new AllGameDetailsResponse();
    }

    /**
     * Create an instance of {@link Game }
     * 
     */
    public Game createGame() {
        return new Game();
    }

    /**
     * Create an instance of {@link GameDetailsResponse }
     * 
     */
    public GameDetailsResponse createGameDetailsResponse() {
        return new GameDetailsResponse();
    }

    /**
     * Create an instance of {@link AddGameRequest }
     * 
     */
    public AddGameRequest createAddGameRequest() {
        return new AddGameRequest();
    }

    /**
     * Create an instance of {@link AddGameResponse }
     * 
     */
    public AddGameResponse createAddGameResponse() {
        return new AddGameResponse();
    }

    /**
     * Create an instance of {@link GameDetailsRequest }
     * 
     */
    public GameDetailsRequest createGameDetailsRequest() {
        return new GameDetailsRequest();
    }

    /**
     * Create an instance of {@link AllGameDetailsRequest }
     * 
     */
    public AllGameDetailsRequest createAllGameDetailsRequest() {
        return new AllGameDetailsRequest();
    }

    /**
     * Create an instance of {@link GameGuide }
     * 
     */
    public GameGuide createGameGuide() {
        return new GameGuide();
    }

}
