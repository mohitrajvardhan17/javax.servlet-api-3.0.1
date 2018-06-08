package javax.servlet.http;

import java.util.EventListener;

public abstract interface HttpSessionAttributeListener
  extends EventListener
{
  public abstract void attributeAdded(HttpSessionBindingEvent paramHttpSessionBindingEvent);
  
  public abstract void attributeRemoved(HttpSessionBindingEvent paramHttpSessionBindingEvent);
  
  public abstract void attributeReplaced(HttpSessionBindingEvent paramHttpSessionBindingEvent);
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\http\HttpSessionAttributeListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */