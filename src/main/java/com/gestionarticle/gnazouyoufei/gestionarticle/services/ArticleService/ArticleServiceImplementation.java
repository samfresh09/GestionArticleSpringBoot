package com.gestionarticle.gnazouyoufei.gestionarticle.services.ArticleService;


import com.gestionarticle.gnazouyoufei.gestionarticle.dao.ArticleDao;
import com.gestionarticle.gnazouyoufei.gestionarticle.models.Articles;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArticleServiceImplementation extends BaseServiceImplementation<Articles,Long> implements ArticleServiceInterface {

    @Autowired
    ArticleDao articleDao;

    public JpaRepository<Articles, Long> getDao() {
        return articleDao;
    }

}
