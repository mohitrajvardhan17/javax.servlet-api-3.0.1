package javax.servlet;

import java.util.Collection;
import java.util.EnumSet;

public abstract interface FilterRegistration
  extends Registration
{
  public abstract void addMappingForServletNames(EnumSet<DispatcherType> paramEnumSet, boolean paramBoolean, String... paramVarArgs);
  
  public abstract Collection<String> getServletNameMappings();
  
  public abstract void addMappingForUrlPatterns(EnumSet<DispatcherType> paramEnumSet, boolean paramBoolean, String... paramVarArgs);
  
  public abstract Collection<String> getUrlPatternMappings();
  
  public static abstract interface Dynamic
    extends FilterRegistration, Registration.Dynamic
  {}
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\FilterRegistration.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */