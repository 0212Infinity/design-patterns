package com.example.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yu
 */
public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
        // 模拟 SpringMVC 从 request 取 handler 的对象
        HttpController controller = new HttpController();
        // AnnotationController controller = new AnnotationController();
        // SimpleController controller = new SimpleController();

        // 得到对应适配器
        HandlerAdapter adapter = getHandler(controller);
        // 通过适配器执行对应的 controller 对应方法
        adapter.handle(controller);
    }

    public HandlerAdapter getHandler(Controller controller) {
        // 遍历, 返回对应适配器
        for (HandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }
}
