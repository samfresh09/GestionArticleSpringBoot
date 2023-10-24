package com.gestionarticle.gnazouyoufei.gestionarticle.controllers.ArticleController;

import com.gestionarticle.gnazouyoufei.gestionarticle.controllers.GenericControllers.GenericControllerImplements;
import com.gestionarticle.gnazouyoufei.gestionarticle.models.Articles;
import com.gestionarticle.gnazouyoufei.gestionarticle.models.Category;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.ArticleService.ArticleServiceImplementation;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.ArticleService.ArticleServiceInterface;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceImplementation;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController extends GenericControllerImplements<Articles, Long> {
    @Autowired
    public final ArticleServiceImplementation articleService;

    public BaseServiceInterface<Articles, Long> getService() {
        return articleService;
    }

    @GetMapping("/all/category")
    List<Articles> listByCategory(@RequestBody Category category){
        return  this.articleService.findAllByCategorie(category);
    }
    @GetMapping("/all/categie/{id}")
    List<Articles> listByCategorieId(@PathVariable UUID id){
        return  this.articleService.findAllByCategorieId(id);
    }



}
