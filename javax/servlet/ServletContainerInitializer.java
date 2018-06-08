package javax.servlet;

import java.util.Set;

public abstract interface ServletContainerInitializer
{
  public abstract void onStartup(Set<Class<?>> paramSet, ServletContext paramServletContext)
    throws ServletException;
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\ServletContainerInitializer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */