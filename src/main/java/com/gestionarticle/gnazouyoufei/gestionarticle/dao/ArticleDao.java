package com.gestionarticle.gnazouyoufei.gestionarticle.dao;

import com.gestionarticle.gnazouyoufei.gestionarticle.models.Articles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDao extends JpaRepository<Articles, Long> {
}
