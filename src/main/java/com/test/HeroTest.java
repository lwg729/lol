package com.test;

import com.dao.LolDao;
import com.pojo.Lol;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HeroTest {

    private ApplicationContext applicationContext;
    @Before
    public void before(){
         applicationContext=new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");
    }

    @Test
    public void test() {
        LolDao lolDao = applicationContext.getBean(LolDao.class);
        Lol lol=new Lol();
        lol.setHero("瞎子");
        lol.setHpower(670);
        lolDao.addHero(lol);
        List<Lol> list = lolDao.queryAllHero();

        for (Lol lolList:list) {
            System.out.println(lolList.getHero());
        }

    }

}
