package com.gestionarticle.gnazouyoufei.gestionarticle.controllers.CategoryController;

import com.gestionarticle.gnazouyoufei.gestionarticle.controllers.GenericControllers.GenericControllerImplements;
import com.gestionarticle.gnazouyoufei.gestionarticle.models.Category;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceInterface;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.CategoryService.CategoryServiceImplementation;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.CategoryService.CategoryServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController extends GenericControllerImplements<Category, UUID> {

    @Autowired
    private final CategoryServiceInterface categoryService;

    public BaseServiceInterface<Category,UUID> getService() {
        return categoryService;
    }
}
