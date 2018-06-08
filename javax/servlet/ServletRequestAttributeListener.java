package javax.servlet;

import java.util.EventListener;

public abstract interface ServletRequestAttributeListener
  extends EventListener
{
  public abstract void attributeAdded(ServletRequestAttributeEvent paramServletRequestAttributeEvent);
  
  public abstract void attributeRemoved(ServletRequestAttributeEvent paramServletRequestAttributeEvent);
  
  public abstract void attributeReplaced(ServletRequestAttributeEvent paramServletRequestAttributeEvent);
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\ServletRequestAttributeListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */