package com.service;

import com.pojo.Lol;

import java.util.List;

public interface LolService {
    int addHero(Lol lol);
    int deleteHeroById(long hid);
    int updateHero(Lol lol);
    Lol queryById(long hid);
    List<Lol> queryAllHero();
}
