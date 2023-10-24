package com.gestionarticle.gnazouyoufei.gestionarticle.services.CategoryService;

import com.gestionarticle.gnazouyoufei.gestionarticle.dao.CategoryDao;
import com.gestionarticle.gnazouyoufei.gestionarticle.models.Category;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class CategoryServiceImplementation extends BaseServiceImplementation<Category,UUID> implements  CategoryServiceInterface
{

    @Autowired
    CategoryDao categoryDao;

    public JpaRepository<Category, UUID> getDao() {
        return categoryDao;
    }
}
