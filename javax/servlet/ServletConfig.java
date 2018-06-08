package javax.servlet;

import java.util.Enumeration;

public abstract interface ServletConfig
{
  public abstract String getServletName();
  
  public abstract ServletContext getServletContext();
  
  public abstract String getInitParameter(String paramString);
  
  public abstract Enumeration<String> getInitParameterNames();
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\ServletConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */