package com.dao;

import com.pojo.Lol;

import java.util.List;

public interface LolDao {

        int addHero(Lol lol);

        int deleteHeroById(long hid);

        int updateHero(Lol lol);

        Lol queryById(long hid);

        List<Lol> queryAllHero();


}
