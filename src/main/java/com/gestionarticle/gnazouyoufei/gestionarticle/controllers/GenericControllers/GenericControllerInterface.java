package com.gestionarticle.gnazouyoufei.gestionarticle.controllers.GenericControllers;

import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceImplementation;
import com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService.BaseServiceInterface;

import java.util.List;

public interface GenericControllerInterface<Entity, PK> {

    BaseServiceInterface<Entity,PK> getService();
    List<Entity> All();
    Entity findById(PK id);
    List<Entity> saveAll(List<Entity> entity);
    Entity save(Entity entity);
    Entity update(Entity entity);
    boolean delete(Entity entity);
    boolean deleteById(PK id);

}
