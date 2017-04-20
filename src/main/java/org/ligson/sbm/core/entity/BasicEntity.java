package org.ligson.sbm.core.entity;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ligso on 2016/1/27.
 * 基本类
 *
 * @author ligson
 */
//@SuppressWarnings("unused")
public class BasicEntity extends BasePageDto {

    /***
     * 是否要分页
     */
    private Boolean pageAble = true;

    /***
     * 排序字段
     */
    private String sort = "id";

    /***
     * 排序顺序
     */
    private String order = "ASC";

    private List<ErrorField> errorFields = new ArrayList<>();

    public Boolean getPageAble() {
        return pageAble;
    }

    public void setPageAble(Boolean pageAble) {
        this.pageAble = pageAble;
    }

    /***
     * 主键字段
     *
     * @return 主键名
     */
    public String primaryKey() {
        return "id";
    }

    /***
     * 主键类型
     *
     * @return 主键类型
     */
    public Class primaryKeyType() {
        return BigInteger.class;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }


    public List<Constraint> constraints() {
        return null;
    }

    public boolean validate() {
        errorFields.clear();
        List<Constraint> constraints = constraints();
        boolean validate = true;
        if (CollectionUtils.isNotEmpty(constraints)) {
            for (Constraint constraint : constraints) {
                String fieldName = constraint.getFieldName();
                Field field = ReflectionUtils.findField(this.getClass(), fieldName);
                Object fieldValue = null;
                try {
                    fieldValue = FieldUtils.readDeclaredField(this, fieldName, true);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("class " + this.getClass().getName() + " field " + fieldName + " not found");
                }
                if (!constraint.valid(this, fieldValue)) {
                    validate = false;
                    ErrorField errorField = new ErrorField();
                    errorField.setField(field);
                    errorField.setErrorMsg(constraint.errorTip());
                    errorFields.add(errorField);
                }
            }
        }
        return validate;
    }

}
