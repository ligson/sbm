package org.ligson.sbm.controller;

import org.ligson.sbm.core.controller.CrudController;
import org.ligson.sbm.core.service.BaseService;
import org.ligson.sbm.domain.UserEntity;
import org.ligson.sbm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ligson on 2017/4/19.
 */
@Controller
@RequestMapping("/user")
public class UserController extends CrudController<UserEntity, String> {

    @Autowired
    private UserService userService;

    @RequestMapping("/index.do")
    @ResponseBody
    public String index() {
        return "ok";
    }


    @Override
    public BaseService getService() {
        return userService;
    }
}
