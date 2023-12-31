package com.gestionarticle.gnazouyoufei.gestionarticle.services.ArticleService;

import com.gestionarticle.gnazouyoufei.gestionarticle.models.Articles;
import com.gestionarticle.gnazouyoufei.gestionarticle.models.Category;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceInterface;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.UUID;

public interface ArticleServiceInterface extends BaseServiceInterface<Articles,Long> {
//definir les methode specifique a la classe article

    List<Articles> findAllByCategorie(Category category);
    List<Articles> findAllByCategorieId(UUID id);

}
