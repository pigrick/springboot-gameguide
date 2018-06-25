package com.pigrick.springbootggbackend.mapper;

import com.pigrick.springbootggbackend.xml.game.Game;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GameMapper {

    @Select("select * from game where name = #{name}")
    Game findByName(@Param("name") String name);

    @Select("select * from game")
    List<Game> findAll();

    @Insert("insert into game(name, genre, company) values(#{name}, #{genre}, #{company})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class )
    boolean addGame(Game game);
}
