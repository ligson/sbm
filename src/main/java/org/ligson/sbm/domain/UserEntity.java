package org.ligson.sbm.domain;

import org.ligson.sbm.core.entity.BasicEntity;

import java.util.Date;

/**
 * Created by ligson on 2017/4/19.
 */
public class UserEntity extends BasicEntity {
    private String id;
    private Date createDate;
    private String name;
    private String password;
    private Boolean sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public String primaryKey() {
        return "id";
    }

    @Override
    public Class primaryKeyType() {
        return String.class;
    }
}
