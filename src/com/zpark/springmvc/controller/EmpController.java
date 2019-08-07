package com.zpark.springmvc.controller;

import com.zpark.springmvc.pojo.Emp;
import com.zpark.springmvc.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

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

//    @RequestMapping("findEmp")
//    public ModelAndView findEmp(@RequestParam(value="empId") Integer empId){
//        ModelAndView mv = new ModelAndView("index");
//        EmpService  empService = new EmpService();
//        Emp emp = empService.selectById(empId);
//        System.out.println(emp);
//        return mv;
//    }


}
