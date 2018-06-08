/*    */ package javax.servlet.http;
/*    */ 
/*    */ import java.util.EventObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HttpSessionEvent
/*    */   extends EventObject
/*    */ {
/*    */   public HttpSessionEvent(HttpSession source)
/*    */   {
/* 73 */     super(source);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public HttpSession getSession()
/*    */   {
/* 80 */     return (HttpSession)super.getSource();
/*    */   }
/*    */ }


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\http\HttpSessionEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */