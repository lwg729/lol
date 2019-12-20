package com.test;

import com.dao.LolDao;
import com.pojo.Lol;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class mantisTest {

    @Autowired
    private  LolDao lolDao;

    @Test
    public void test() {
        Lol lol=new Lol();

        lolDao.deleteHeroById(4);
        List<Lol> list = lolDao.queryAllHero();

        for (Lol lolList:list) {
            System.out.println(lolList.getHero());
        }

    }
}
