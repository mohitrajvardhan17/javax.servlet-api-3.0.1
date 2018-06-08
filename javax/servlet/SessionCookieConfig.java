package javax.servlet;

public abstract interface SessionCookieConfig
{
  public abstract void setName(String paramString);
  
  public abstract String getName();
  
  public abstract void setDomain(String paramString);
  
  public abstract String getDomain();
  
  public abstract void setPath(String paramString);
  
  public abstract String getPath();
  
  public abstract void setComment(String paramString);
  
  public abstract String getComment();
  
  public abstract void setHttpOnly(boolean paramBoolean);
  
  public abstract boolean isHttpOnly();
  
  public abstract void setSecure(boolean paramBoolean);
  
  public abstract boolean isSecure();
  
  public abstract void setMaxAge(int paramInt);
  
  public abstract int getMaxAge();
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\SessionCookieConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */