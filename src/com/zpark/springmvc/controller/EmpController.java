package com.zpark.springmvc.controller;

import com.zpark.springmvc.pojo.Emp;
import com.zpark.springmvc.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//注意是servlet 下的modelandview 包  不是protler下面的包
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author wuc
 * @date 2019/8/5 13:46
 */
@Controller
@RequestMapping(value="emp")
public class EmpController {

    @RequestMapping("selectAll")
    public String selectAll(){
        System.out.println("查询所有员工的方法");
        return "success";
    }

    /**
     * 功能描述 添加员工信息，验证pojo的使用
     * @author wuc
     * @date 2019/8/6 19:55
     * @param emp
     * @return java.lang.String
     */
    @RequestMapping("addEmp")
    public String add(Emp emp){
        System.out.println(emp);
        return "success";
    }

    /**
     * 功能描述: ModelAndView 方法一
     * @author wuc
     * @date 2019/8/7 14:24
     * @param empId
     * @return org.springframework.web.portlet.ModelAndView
     */
    @RequestMapping("findEmp")
    public ModelAndView findEmp(@RequestParam(value="empId") Integer empId){
        System.out.println("findEmp");
        ModelAndView mv = new ModelAndView();
        EmpService  empService = new EmpService();
        Emp emp = empService.selectById(empId);
        System.out.println(emp);
        mv.addObject("Emp",emp);
//        直接构造器指定view 名称也可以 setviewName 也可以
        mv.setViewName("modelMessage");
        return mv;
    }

    /**
     * 功能描述 Map 用法
     * @author wuc
     * @date 2019/8/7 19:57
     * @param empId
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("findEmpMap")
    public String findEmpMap(Map<String,Emp> map, @RequestParam(value="empId") Integer empId){

        EmpService  empService = new EmpService();
        Emp emp = empService.selectById(empId);
       map.put("FindEmp",emp);

        return "modelMessage";
    }


}
