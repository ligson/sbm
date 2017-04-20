package org.ligson.sbm.core.entity;

import org.ligson.sbm.core.enums.ConstraintType;

/**
 * Created by ligson on 2017/4/20.
 */
public class NullableConstraint extends Constraint {
    private boolean nullable = true;

    public NullableConstraint(String fieldName, boolean nullable) {
        super(fieldName, ConstraintType.Nullable);
        this.nullable = nullable;
    }

    @Override
    public boolean valid(Object object, Object fieldValue) {
        return false;
    }

    @Override
    public String errorTip() {
        return nullable ? "允许为空" : "不允许为空";
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }
}
