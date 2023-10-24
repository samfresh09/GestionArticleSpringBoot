package com.gestionarticle.gnazouyoufei.gestionarticle.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Table(name ="Category" )
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @NotBlank
    private UUID id;

    @Column(name="titre",nullable = false,length = 25)
    private String titre;

    @Column(name = "description", nullable = false, length = 220)
    private  String description;

}
