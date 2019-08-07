package com.zpark.springmvc.service;

import com.zpark.springmvc.pojo.Emp;

/**
 * @author wuc
 * @date 2019/8/6 18:10
 */
public class EmpService {
    public Emp selectById(Integer empId){
        Emp emp = new Emp();
        emp.setEmpId(empId);
        emp.setEmpName("Tom");
        emp.setEmpSalary(5000.00);
        emp.setEmpDept(100);
        return emp;
    }
}
