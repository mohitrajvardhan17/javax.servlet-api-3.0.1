package javax.servlet.http;

import java.util.EventListener;

public abstract interface HttpSessionActivationListener
  extends EventListener
{
  public abstract void sessionWillPassivate(HttpSessionEvent paramHttpSessionEvent);
  
  public abstract void sessionDidActivate(HttpSessionEvent paramHttpSessionEvent);
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\http\HttpSessionActivationListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */