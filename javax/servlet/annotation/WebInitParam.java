package javax.servlet.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebInitParam
{
  String name();
  
  String value();
  
  String description() default "";
}


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\annotation\WebInitParam.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */