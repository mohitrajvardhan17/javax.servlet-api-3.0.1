package javax.servlet.http;

import java.util.Enumeration;

/**
 * @deprecated
 */
public abstract interface HttpSessionContext
{
  /**
   * @deprecated
   */
  public abstract HttpSession getSession(String paramString);
  
  /**
   * @deprecated
   */
  public abstract Enumeration<String> getIds();
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\http\HttpSessionContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */