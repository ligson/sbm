package org.ligson.sbm.service.impl;

import org.ligson.sbm.core.dao.BaseDao;
import org.ligson.sbm.core.service.impl.BaseServiceImpl;
import org.ligson.sbm.dao.UserDao;
import org.ligson.sbm.domain.UserEntity;
import org.ligson.sbm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ligson on 2017/4/20.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserEntity> implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public BaseDao<UserEntity> getDao() {
        return this.userDao;
    }
}
