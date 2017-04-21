package org.ligson.sbm.core.exception;

import org.ligson.sbm.core.entity.BasicEntity;

/**
 * Created by ligson on 2017/4/21.
 */
public class EntityValidException extends RuntimeException {
    private BasicEntity entity;

    public EntityValidException(BasicEntity entity) {
        super(entity.toString());
        this.entity = entity;
    }

    public BasicEntity getEntity() {
        return entity;
    }

    public void setEntity(BasicEntity entity) {
        this.entity = entity;
    }
}
