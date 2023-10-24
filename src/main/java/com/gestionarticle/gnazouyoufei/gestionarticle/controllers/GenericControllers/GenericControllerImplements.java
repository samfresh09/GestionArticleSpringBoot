package com.gestionarticle.gnazouyoufei.gestionarticle.controllers.GenericControllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class GenericControllerImplements<Entity,PK> implements GenericControllerInterface<Entity,PK> {

    @Override
    @GetMapping("/all")
    public List<Entity> All() {
        return this.getService().findAll();
    }

    @Override
    @GetMapping("/findBy/{id}")
    public Entity findById(@PathVariable PK id) {
        return (Entity) this.getService().findById(id);
    }

    @Override
    @PostMapping("/saveAll")
    public List<Entity> saveAll(@RequestBody List<Entity> entity) {
        return this.getService().saveAll(entity);
    }

    @Override
    @PostMapping("/save")
    public Entity save(@RequestBody Entity entity) {
        return (Entity) this.getService().save(entity);
    }

    @Override
    @DeleteMapping("/delete")
    public boolean delete(@RequestBody Entity entity) {
        this.getService().delete(entity);
        return true;
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public boolean deleteById(@PathVariable PK id) {
        this.getService().deleteById(id);
        return true;
    }

    @Override
    @PutMapping("/update")
    public Entity update(@RequestBody Entity entity) {
        return (Entity) this.getService().update(entity);
    }
}
