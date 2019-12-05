package com.controller;

import com.pojo.Lol;
import com.service.LolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class LolController {
    @Autowired
    private LolService lolService;
    @RequestMapping("/allHero")
    public String list(Model model){
        List<Lol> list = lolService.queryAllHero();
        model.addAttribute("list",list);
        return "allHero";
    }

    @RequestMapping("/toAddHero")
    public String toAddHero() {
        return "addHero";
    }
    @RequestMapping("/addHero")
    public String addPaper(Lol lol) {
        lolService.addHero(lol);
        return "redirect:/allHero";
    }
    @RequestMapping("/del/{hid}")
    public String deleteHero(@PathVariable("hid") Long hid) {
        lolService.deleteHeroById(hid);
        return "redirect:/allHero";
    }

    @RequestMapping("toUpdateHero")
    public String toUpdateLol(Model model, long hid) {
        model.addAttribute("lol",lolService.queryById(hid));
        return "updateHero";
    }

    @RequestMapping("/updateHero")
    public String updateLol(Model model, Lol lol) {
        lolService.updateHero(lol);
        lol = lolService.queryById(lol.getHid());
        model.addAttribute("lol", lol);
        return "redirect:/allHero";
    }


}
