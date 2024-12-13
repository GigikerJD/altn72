package com.projet.altn72.entite;

import java.io.Serializable;
import java.time.LocalDate;

import com.projet.altn72.modele.composite.Feedback;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(Feedback.class)
@Table(name = "Feedback")
public class FeedbackEntite implements Serializable{

    @Id
    @Column(name = "idFeedback", length = 100)
    private String idFeedback;

    @Column(name = "textFeedback", length = 50)
    private String textFeedback;

    @Column(name = "dateFeedback")
    private LocalDate dateFeedback;
}