package com.gestionarticle.gnazouyoufei.gestionarticle.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;


import javax.validation.constraints.NotBlank;

@Entity
@Table(name= "article")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Articles {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private long id;

    @Column(name= "libelle", nullable=false, length= 20)
    private String libelle;

    @Column(name= "prix", nullable= false)
    private double prix;

    @Column(name= "description", nullable= false, length= 200)
    private String description;

    @Column(name= "status", nullable= false)
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "categorie", nullable = true)
    private Category categorie;
}