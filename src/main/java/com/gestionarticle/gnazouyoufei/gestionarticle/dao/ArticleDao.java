package com.gestionarticle.gnazouyoufei.gestionarticle.dao;

import com.gestionarticle.gnazouyoufei.gestionarticle.models.Articles;
import com.gestionarticle.gnazouyoufei.gestionarticle.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ArticleDao extends JpaRepository<Articles, Long> {
    //ecrire nos methode personnaliser ici
    List<Articles> findAllByCategorie(Category category);
    List<Articles>  findAllByCategorieId(UUID id);

}
