package com.projet.altn72.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.altn72.entite.OutilEntite;
import com.projet.altn72.modele.OutilRepository;

@Service
public class OutilService {

    @Autowired
    private OutilRepository outilRepository;

    public List<OutilEntite> getOutils(){
        return outilRepository.findAll();
    }

    public String getDetailledDescFrom(String titre){
        return outilRepository.findById(titre).get().getDetailledDesc();
    }

    public OutilEntite getOutilParTitre(String titre){
        return outilRepository.findById(titre).get();
    }
}