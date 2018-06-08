package javax.servlet;

import java.io.IOException;

public abstract interface Filter
{
  public abstract void init(FilterConfig paramFilterConfig)
    throws ServletException;
  
  public abstract void doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse, FilterChain paramFilterChain)
    throws IOException, ServletException;
  
  public abstract void destroy();
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\Filter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */