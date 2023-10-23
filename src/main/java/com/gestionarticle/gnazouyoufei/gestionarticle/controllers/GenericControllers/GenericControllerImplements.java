package com.gestionarticle.gnazouyoufei.gestionarticle.controllers.GenericControllers;

import java.util.List;

public abstract class GenericControllerImplements<Entity,PK> implements GenericControllerInterface<Entity,PK> {

    @Override
    public List<Entity> findAll() {
        return this.getService().findAll();
    }

    @Override
    public Entity findById(PK id) {
        return (Entity) this.getService().findById(id);
    }

    @Override
    public List<Entity> saveAll(List<Entity> entity) {
        return this.getService().saveAll(entity);
    }

    @Override
    public Entity save(Entity entity) {
        return (Entity) this.getService().save(entity);
    }

    @Override
    public boolean delete(Entity entity) {
        this.getService().delete(entity);
        return true;
    }

    @Override
    public boolean deleteById(PK id) {
        this.getService().deleteById(id);
        return true;
    }

    @Override
    public Entity update(Entity entity) {
        return (Entity) this.getService().update(entity);
    }
}
