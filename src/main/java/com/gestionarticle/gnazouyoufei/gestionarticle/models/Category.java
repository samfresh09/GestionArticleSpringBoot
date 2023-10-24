package com.gestionarticle.gnazouyoufei.gestionarticle.models;


import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Table(name ="category" )
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @NotBlank
    private UUID id;

    @Column(name="titre",nullable = false,length = 25)
    private String titre;

    @Column(name = "description", nullable = false, length = 220)
    private  String description;

}
