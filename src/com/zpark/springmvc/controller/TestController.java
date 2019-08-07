package com.zpark.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/**
 * @author wuc
 * @date 2019/8/5 11:34
 */
@Controller
public class TestController {

    @RequestMapping(value = "index")
    public String index() {
        System.out.println("访问了test方法");
        return "success";
    }

    /**
     * 功能描述: 带参数的方法
     *
     * @param
     * @return java.lang.String
     * @author wuc
     * @date 2019/8/6 19:48
     */
    @RequestMapping(value = "first", method = RequestMethod.GET, params = {"username=vecher", "age!=20"})
    public String test() {
        System.out.println("访问了带参数方法");
        return "success";
    }

    /**
     * 功能描述 ： 获取url 中参数的方法
     *
     * @param userId
     * @return java.lang.String
     * @author wuc
     * @date 2019/8/6 19:51
     */
    @RequestMapping(value = "testVariable/{userId}")
    public String testVariable(@PathVariable("userId") Integer userId) {
        System.out.println("UserId: " + userId);
        return "success";
    }
    /**
     * 功能描述： @RequestParam多参数传递方法
     * @author wuc
     * @date 2019/8/6 19:54
     * @param userName
     * @param userPwd
     * @return java.lang.String
     */
    @RequestMapping(value = "testLogin")
    public String login(@RequestParam(value = "username", required = false, defaultValue = "000")
                                String userName, @RequestParam(value = "userpsd") String userPwd) {
        try {
            String str = new String(userName.getBytes("iso-8859-1"), "UTF-8");
            System.out.println("UserName: " + str + " userPassword: " + userPwd);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * 功能描述 验证servlet 原生API
     * @author wuc
     * @date 2019/8/6 19:56
     * @param request
     * @param writer
     * @return java.lang.String
     */
    @RequestMapping(value = "testServletAPI")
    public String testServlet(HttpServletRequest request, Writer writer) throws IOException {
        String userName = request.getParameter("userName");
        String userPwd = request.getParameter("userPwd");

        writer.write("<html>");
        writer.write("<body>");
        writer.write("<font color='red'>UserName=" + userName + ",PassWord=" + userPwd + "</font>");
        writer.write("</body>");
        writer.write("</html>");
        writer.flush();
        writer.close();
        return "success";
    }

    @RequestMapping(value = "toModel")
    public ModelAndView toModelMessage() {
        ModelAndView modelAndView = new ModelAndView("modelMessage");
        return modelAndView;
    }

}
