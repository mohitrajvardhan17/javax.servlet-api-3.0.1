package javax.servlet;

import java.io.IOException;

public abstract interface Servlet
{
  public abstract void init(ServletConfig paramServletConfig)
    throws ServletException;
  
  public abstract ServletConfig getServletConfig();
  
  public abstract void service(ServletRequest paramServletRequest, ServletResponse paramServletResponse)
    throws ServletException, IOException;
  
  public abstract String getServletInfo();
  
  public abstract void destroy();
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\Servlet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */