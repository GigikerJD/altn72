package com.projet.altn72.controleur.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.projet.altn72.service.UtilisateurService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/account")
public class ConnexionControleur {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/login")
    public String LoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String Login(Model model, @RequestParam String email, @RequestParam String password){
        return utilisateurService.Login(model, email, password);
    }
    
}