package com.pigrick.springbootggbackend.mapper;

import com.pigrick.springbootggbackend.xml.game.Game;
import com.pigrick.springbootggbackend.xml.game.GameGuide;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GameGuideMapper {

    @Select("select * from game_guide where name = #{name}")
    GameGuide findByName(@Param("name") String name);

    @Select("select * from game_guide where game_id = #{id}")
    List<GameGuide> findByGameId(@Param("id") int id);

    @Select("select * from game_guide")
    List<GameGuide> findAll();

//    @Insert("insert into game(name, genre, company) values(#{name}, #{genre}, #{company})")
//    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class )
//    void addGame(Game game);
}
