package com.zpark.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuc
 * @date 2019/8/5 13:47
 */
@Controller
@RequestMapping(value="dept")
public class DeptController {
    @RequestMapping(value="selectAll")
    public String selectAll(){
        System.out.println("查询所有部门的方法");
        return "success";
    }
}
