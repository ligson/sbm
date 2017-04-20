package org.ligson.sbm.core.service;


import org.ligson.sbm.core.entity.BasicEntity;
import org.ligson.sbm.core.entity.Pagination;

/**
 * Created by ligson on 2016/3/21.
 * 通用接口代码
 */
public interface BaseService<T extends BasicEntity> {

    T get(Object primaryKey);

    Pagination<T> findAllBy(T t);

    T findBy(T t);

    int countBy(T t);

    void delete(T t);

    void update(T t);

    void add(T t);
}
