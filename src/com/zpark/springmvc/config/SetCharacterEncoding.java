package com.zpark.springmvc.config;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

/**
 * 功能描述: 过滤器解决字符编码乱码问题
 * @author wuc
 * @date 2019/8/6 14:42
 * @param null
 * @return
 */
public class SetCharacterEncoding implements javax.servlet.Filter {

    private String encoding;


    public void init(FilterConfig filterConfig) throws ServletException {
// TODO Auto-generated method stub
        this.encoding = filterConfig.getInitParameter("encoding");
        System.out.println(this.encoding);
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
// TODO Auto-generated method stub
        request.setCharacterEncoding(this.encoding);
        response.setCharacterEncoding(this.encoding);
        chain.doFilter(request, response);
    }

    public void destroy() {
// TODO Auto-generated method stub

    }

}
