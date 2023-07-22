package com.example.adapter.springmvc;

/**
 * 多种适配器实现
 *
 * @author Yu
 */
public interface HandlerAdapter {

    /**
     * 是否支持
     *
     * @param handler HandlerAdapter
     * @return boolean
     */
    boolean supports(Object handler);

    /**
     * 执行
     *
     * @param handler HandlerAdapter
     */
    void handle(Object handler);
}

class SimpleHandlerAdapter implements HandlerAdapter {

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimplerHandler();
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }
}

class HttpHandlerAdapter implements HandlerAdapter {

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }
}

class AnnotationHandlerAdapter implements HandlerAdapter {

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }

    @Override
    public boolean supports(Object handler) {

        return (handler instanceof AnnotationController);
    }
}