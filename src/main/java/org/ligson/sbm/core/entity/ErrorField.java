package org.ligson.sbm.core.entity;

import java.lang.reflect.Field;

/**
 * Created by ligson on 2017/4/20.
 */
public class ErrorField {
    private Field field;
    private String errorMsg;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
