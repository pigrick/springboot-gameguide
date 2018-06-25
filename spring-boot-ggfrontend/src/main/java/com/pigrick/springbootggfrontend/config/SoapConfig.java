package com.pigrick.springbootggfrontend.config;

import com.pigrick.springbootggfrontend.soupclient.GameClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    @Value("${soupServicePort}")
    private String soupServicePort;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.pigrick.springbootggfrontend.wsdl");
        return marshaller;
    }
    @Bean
    public GameClient gameClient(Jaxb2Marshaller marshaller) {
        GameClient client = new GameClient();
        client.setDefaultUri("http://localhost:" + soupServicePort + "/ws/gameDetailsWsdl.wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}

