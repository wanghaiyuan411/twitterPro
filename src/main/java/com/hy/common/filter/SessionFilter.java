package com.hy.common.filter;

import org.apache.commons.lang.StringUtils;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author wanghaiyuan
 * Date 2019/1/8 17:04.
 */
public class SessionFilter implements Filter {
    private static final List<String> NOT_FILTERS = new ArrayList<String>(Arrays.asList("/index.jsp","/register.jsp","/user/login"));
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        String servletPath = httpServletRequest.getServletPath();
        System.out.println("servletPath = " + servletPath);
        if (isNotFilterUrl(servletPath)){
            chain.doFilter(request, response);
            return;
        }
        HttpSession session = httpServletRequest.getSession();
        if (session != null){
            Object obj = session.getAttribute("userSession");
            if (obj != null){
                chain.doFilter(request, response);
                return;
            }
        }
        System.out.println("this is a filter...");
        response((HttpServletResponse) response);
        return;
    }

    public void destroy() {

    }
    private boolean isNotFilterUrl(String servletUri){
        boolean isNotFilterUrl = false;
        if (StringUtils.isEmpty(servletUri)){
            isNotFilterUrl = true;
        }
        if (NOT_FILTERS.contains(servletUri)){
            isNotFilterUrl = true;
        }
        if (servletUri.contains(".css") || servletUri.contains(".js") || servletUri.contains(".png") || servletUri.contains(".html") || servletUri.equals("/user/getById")){
            isNotFilterUrl = true;
        }
        return isNotFilterUrl;
    }
    private void response(HttpServletResponse response) {
        StringBuffer stringBuffer = new StringBuffer("<html>");
        stringBuffer.append("Error page").append("</html>");
        try {
            response.getWriter().write(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
