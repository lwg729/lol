package com.service.impl;

import com.dao.LolDao;
import com.pojo.Lol;
import com.service.LolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class LolServiceImpl implements LolService {
    @Autowired
    private LolDao lolDao;

    @Override
    public int addHero(Lol lol) {
        return lolDao.addHero(lol);
    }

    @Override
    public int deleteHeroById(long hid) {
        return lolDao.deleteHeroById(hid);
    }

    @Override
    public int updateHero(Lol lol) {
        return lolDao.updateHero(lol);
    }

    @Override
    public Lol queryById(long hid) {
        return lolDao.queryById(hid);
    }

    @Override
    public List<Lol> queryAllHero() {
        return lolDao.queryAllHero();
    }
}
