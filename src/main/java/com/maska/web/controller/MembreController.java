package com.maska.web.controller;

import com.maska.web.model.Membre;
import com.maska.web.services.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;


@Controller
public class MembreController {



    private MembreService membreService;

    public MembreController(MembreService membreService) {
        this.membreService = membreService;
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Membre> list = membreService.findAll();
        model.addAttribute("list", list);
        return "index";
    }




}
