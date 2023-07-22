package com.example.adapter.springmvc;

/**
 * 实现多种类型 Controller
 *
 * @author Yu
 */
public interface Controller {

}

class HttpController implements Controller {
    public void doHttpHandler() {
        System.out.println("HttpController doHttpHandler");
    }
}

class SimpleController implements Controller {
    public void doSimplerHandler() {
        System.out.println("SimpleController doSimplerHandler");
    }
}

class AnnotationController implements Controller {
    public void doAnnotationHandler() {
        System.out.println("AnnotationController doAnnotationHandler");
    }
}
