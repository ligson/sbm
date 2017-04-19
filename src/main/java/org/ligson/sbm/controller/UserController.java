package org.ligson.sbm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ligson on 2017/4/19.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/index.do")
    @ResponseBody
    public String index() {
        return "ok";
    }
}
