package com.pigrick.springbootggbackend;

import com.pigrick.springbootggbackend.xml.game.Game;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.pigrick.springbootggbackend.mapper")
@SpringBootApplication
public class SpringBootGgbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGgbackendApplication.class, args);
    }
}
