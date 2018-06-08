package javax.servlet.descriptor;

import java.util.Collection;

public abstract interface JspConfigDescriptor
{
  public abstract Collection<TaglibDescriptor> getTaglibs();
  
  public abstract Collection<JspPropertyGroupDescriptor> getJspPropertyGroups();
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\descriptor\JspConfigDescriptor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */