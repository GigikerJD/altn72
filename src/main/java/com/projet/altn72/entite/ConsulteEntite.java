package com.projet.altn72.entite;

import java.io.Serializable;

import com.projet.altn72.modele.composite.Consulte;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Consulte")
@IdClass(Consulte.class)
public class ConsulteEntite implements Serializable {
    
    @Id
    private String email;

    @Id
    private String pseudo;

    @Id
    private String titre;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "email", referencedColumnName = "email", insertable = false, updatable = false),
        @JoinColumn(name = "pseudo", referencedColumnName = "pseudo", insertable = false, updatable = false)
    })
    private UtilisateurEntite utilisateur;

    @ManyToOne
    @JoinColumn(name = "titre", referencedColumnName = "titre", insertable = false, updatable = false)
    private OutilEntite outil;
}