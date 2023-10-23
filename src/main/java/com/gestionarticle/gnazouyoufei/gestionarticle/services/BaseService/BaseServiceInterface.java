package com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaseServiceInterface<Entity, PK> {
    JpaRepository<Entity,PK> getDao();

    List<Entity> findAll();
    Entity findById(PK id);
    List<Entity>saveAll(List<Entity> entity);
    Entity save(Entity entity);
    Entity update(Entity entity);

    boolean delete(Entity entity);
    boolean deleteById(PK id);

}
