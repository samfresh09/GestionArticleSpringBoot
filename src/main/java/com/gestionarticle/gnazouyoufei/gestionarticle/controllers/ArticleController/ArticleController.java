package com.gestionarticle.gnazouyoufei.gestionarticle.controllers.ArticleController;

import com.gestionarticle.gnazouyoufei.gestionarticle.controllers.GenericControllers.GenericControllerImplements;
import com.gestionarticle.gnazouyoufei.gestionarticle.models.Articles;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.ArticleService.ArticleServiceImplementation;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.ArticleService.ArticleServiceInterface;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceImplementation;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController extends GenericControllerImplements<Articles, Long> {
    @Autowired
    private final ArticleServiceInterface articleService;

    public BaseServiceInterface<Articles, Long> getService() {
        return articleService;
    }


}
