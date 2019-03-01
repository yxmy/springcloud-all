package com.test.gatewayserver;

import com.netflix.zuul.ZuulFilter;
import org.springframework.stereotype.Component;

@Component
public class LoggerFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run(){
        return null;
    }
}
