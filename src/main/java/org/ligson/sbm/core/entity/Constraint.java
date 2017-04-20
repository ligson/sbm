package org.ligson.sbm.core.entity;

import org.ligson.sbm.core.enums.ConstraintType;

/**
 * Created by ligson on 2017/4/20.
 */
public abstract class Constraint {
    private String fieldName;
    private ConstraintType constraintType;

    public Constraint(String fieldName, ConstraintType constraintType) {
        this.fieldName = fieldName;
        this.constraintType = constraintType;
    }

    public abstract boolean valid(Object object,Object fieldValue);

    public abstract String errorTip();

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public ConstraintType getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(ConstraintType constraintType) {
        this.constraintType = constraintType;
    }
}
