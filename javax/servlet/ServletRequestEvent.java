/*    */ package javax.servlet;
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
/*    */ 
/*    */ 
/*    */ public class ServletRequestEvent
/*    */   extends EventObject
/*    */ {
/*    */   private final transient ServletRequest request;
/*    */   
/*    */   public ServletRequestEvent(ServletContext sc, ServletRequest request)
/*    */   {
/* 77 */     super(sc);
/* 78 */     this.request = request;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public ServletRequest getServletRequest()
/*    */   {
/* 85 */     return request;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public ServletContext getServletContext()
/*    */   {
/* 92 */     return (ServletContext)super.getSource();
/*    */   }
/*    */ }


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\ServletRequestEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */