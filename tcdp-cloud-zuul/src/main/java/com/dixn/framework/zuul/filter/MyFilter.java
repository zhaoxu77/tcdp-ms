package com.dixn.framework.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter {

    Logger logger = LoggerFactory.getLogger(MyFilter.class);

    /**
     返回过滤器的类型，过滤器类型如下：
     pre：请求路由之前调用过滤
     routing：请求routing之时调用过滤
     post： 请求路由之后调用过滤
     error：发送错误时调用过滤
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            logger.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){
                logger.error(e.getMessage(), e);
            }

            return null;
        }
        logger.info("ok");

        /*RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request1 = context.getRequest();
        String method = request1.getMethod();//氢气的类型，post get ..
        Map<String, String> params = HttpUtils.getParams(request);
        String paramsStr = params.toString();//请求的参数
        long statrtTime = (long) context.get("startTime");//请求的开始时间
        Throwable throwable = context.getThrowable();//请求的异常，如果有的话
        request.getRequestURI()；//请求的uri
        HttpUtils.getIpAddress(request);//请求的iP地址
        context.getResponseStatusCode();//请求的状态
        long duration=System.currentTimeMillis() - statrtTime);//请求耗时*/


        return null;
    }
}
