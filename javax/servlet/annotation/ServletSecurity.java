/*    */ package javax.servlet.annotation;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.annotation.Documented;
/*    */ import java.lang.annotation.Inherited;
/*    */ import java.lang.annotation.Retention;
/*    */ import java.lang.annotation.RetentionPolicy;
/*    */ import java.lang.annotation.Target;
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
/*    */ @Inherited
/*    */ @Documented
/*    */ @Target({java.lang.annotation.ElementType.TYPE})
/*    */ @Retention(RetentionPolicy.RUNTIME)
/*    */ public @interface ServletSecurity
/*    */ {
/*    */   HttpConstraint value() default @HttpConstraint;
/*    */   
/*    */   HttpMethodConstraint[] httpMethodConstraints() default {};
/*    */   
/*    */   public static enum EmptyRoleSemantic
/*    */   {
/* 74 */     PERMIT, 
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 79 */     DENY;
/*    */     
/*    */ 
/*    */ 
/*    */     private EmptyRoleSemantic() {}
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static enum TransportGuarantee
/*    */   {
/* 90 */     NONE, 
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 95 */     CONFIDENTIAL;
/*    */     
/*    */     private TransportGuarantee() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\annotation\ServletSecurity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */