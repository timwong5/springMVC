package com.timwang5.filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    /**
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");

        response.setCharacterEncoding("utf-8");
        chain.doFilter(request, response);
    }

    /**
     *
     */
    @Override
    public void destroy() {

    }
}
