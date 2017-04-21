package org.ligson.sbm.core.service.impl;


import org.ligson.sbm.core.dao.BaseDao;
import org.ligson.sbm.core.entity.BasicEntity;
import org.ligson.sbm.core.entity.Pagination;
import org.ligson.sbm.core.exception.EntityValidException;
import org.ligson.sbm.core.service.BaseService;

/**
 * Created by ligson on 2016/3/21.
 * 接口实现
 */
public abstract class BaseServiceImpl<T extends BasicEntity> implements BaseService<T> {

    public abstract BaseDao<T> getDao();

    @Override
    public T get(Object primaryKey) {
        return getDao().get(primaryKey);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public Pagination<T> findAllBy(T o) {
        return getDao().getPaginationList(o);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public int countBy(T t) {
        return getDao().countBy(t);
    }

    @Override
    public void delete(T t) {
        getDao().delete(t);
    }

    @Override
    public void update(T t) {
        int n = getDao().update(t);
        if (n < 0) {
            throw new EntityValidException(t);
        }
    }

    @Override
    public void add(T t) {
        Integer integer = getDao().insert(t);
        if (integer < 0) {
            throw new EntityValidException(t);
        }
    }

    @Override
    public T findBy(T t) {
        return getDao().findBy(t);
    }
}
