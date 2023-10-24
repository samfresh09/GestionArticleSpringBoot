package com.gestionarticle.gnazouyoufei.gestionarticle.services.ArticleService;


import com.gestionarticle.gnazouyoufei.gestionarticle.dao.ArticleDao;
import com.gestionarticle.gnazouyoufei.gestionarticle.models.Articles;
import com.gestionarticle.gnazouyoufei.gestionarticle.models.Category;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ArticleServiceImplementation extends BaseServiceImplementation<Articles,Long> implements ArticleServiceInterface {

    @Autowired
    ArticleDao articleDao;

    public JpaRepository<Articles, Long> getDao() {
        return articleDao;
    }
    @Override
    public List<Articles> findAllByCategorie(Category category){
        return this.articleDao.findAllByCategorie(category);
    }

    @Override
    public List<Articles> findAllByCategorieId(UUID id){
        return this.articleDao.findAllByCategorieId(id);
    }

}
