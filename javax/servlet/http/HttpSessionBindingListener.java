package javax.servlet.http;

import java.util.EventListener;

public abstract interface HttpSessionBindingListener
  extends EventListener
{
  public abstract void valueBound(HttpSessionBindingEvent paramHttpSessionBindingEvent);
  
  public abstract void valueUnbound(HttpSessionBindingEvent paramHttpSessionBindingEvent);
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\http\HttpSessionBindingListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */