package com.gestionarticle.gnazouyoufei.gestionarticle.services.BaseService;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public abstract class BaseServiceImplementation<Entity,PK> implements BaseServiceInterface<Entity, PK> {
    @Override
    public List<Entity> findAll(){
        return this.getDao().findAll();
    }
    @Override
    public Entity findById(PK id){
          return (Entity) this.getDao().findById(id);
    }

    public List<Entity> savAll(List<Entity> entity){
        return this.getDao().saveAll(entity);
    }
    @Override
    public Entity save(Entity entity){
        return  this.getDao().save(entity);
    }

    @Override
    public List<Entity> saveAll(List<Entity> entity) {
        return this.getDao().saveAll(entity);
    }

    @Override
    public Entity update(Entity entity){
        return this.getDao().save(entity);
    }

    @Override
    public boolean delete(Entity entity){
    //    boolean status=false;
    //    try {
            this.getDao().delete(entity);
            return true;

   //         status=true;
    //    }catch (Exception e){
    //        System.out.println("erreur de suppression ");
    //    }
    //    return status;
    }
    @Override
    public boolean deleteById(PK id){
        this.getDao().deleteById(id);
        return true;
    }

}
