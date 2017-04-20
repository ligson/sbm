package org.ligson.sbm.core.controller;

import org.ligson.sbm.core.entity.BasicEntity;
import org.ligson.sbm.core.entity.Pagination;
import org.ligson.sbm.core.service.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;

/**
 * Created by ligson on 2017/4/20.
 */
public abstract class CrudController<E extends BasicEntity, PK extends Serializable> extends BaseController {

    public abstract BaseService<E> getService();

    @RequestMapping("/add.json")
    @ResponseBody
    public E add(E e) {
        getService().add(e);
        return e;
    }

    @RequestMapping("/query.json")
    @ResponseBody
    public Pagination<E> query(E e) {
        return getService().findAllBy(e);
    }

    @RequestMapping("/get.json")
    @ResponseBody
    public E get(PK pk) {
        return getService().get(pk);
    }

    @RequestMapping("/delete.json")
    @ResponseBody
    public void delete(E e) {
        getService().delete(e);
    }

    @RequestMapping("/update.json")
    @ResponseBody
    public E update(E e) {
        getService().update(e);
        return e;
    }

}
