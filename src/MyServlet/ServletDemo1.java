package MyServlet;

import javax.servlet.*;
import java.io.IOException;
/*
  构造器
  初始化--init
  (前两步是创建servlet程序就被执行)
  service
  destroy
 */

public class ServletDemo1 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        //获取servlet名---servlet1
        System.out.println(servletConfig.getServletName());
        //获取初始化参数值---root
        System.out.println(servletConfig.getInitParameter("username"));

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet!");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
