package com.gestionarticle.gnazouyoufei.gestionarticle.dao;

import com.gestionarticle.gnazouyoufei.gestionarticle.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryDao extends JpaRepository<Category, UUID> {
    //ecrire nos methode personnaliser ici
}
