package javax.servlet;

import java.io.IOException;

public abstract interface FilterChain
{
  public abstract void doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse)
    throws IOException, ServletException;
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\FilterChain.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */