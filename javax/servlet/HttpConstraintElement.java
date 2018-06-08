/*     */ package javax.servlet;
/*     */ 
/*     */ import javax.servlet.annotation.ServletSecurity.EmptyRoleSemantic;
/*     */ import javax.servlet.annotation.ServletSecurity.TransportGuarantee;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class HttpConstraintElement
/*     */ {
/*     */   private ServletSecurity.EmptyRoleSemantic emptyRoleSemantic;
/*     */   private ServletSecurity.TransportGuarantee transportGuarantee;
/*     */   private String[] rolesAllowed;
/*     */   
/*     */   public HttpConstraintElement()
/*     */   {
/*  63 */     this(ServletSecurity.EmptyRoleSemantic.PERMIT);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public HttpConstraintElement(ServletSecurity.EmptyRoleSemantic semantic)
/*     */   {
/*  72 */     this(semantic, ServletSecurity.TransportGuarantee.NONE, new String[0]);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public HttpConstraintElement(ServletSecurity.TransportGuarantee guarantee, String... roleNames)
/*     */   {
/*  86 */     this(ServletSecurity.EmptyRoleSemantic.PERMIT, guarantee, roleNames);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public HttpConstraintElement(ServletSecurity.EmptyRoleSemantic semantic, ServletSecurity.TransportGuarantee guarantee, String... roleNames)
/*     */   {
/* 102 */     if ((semantic == ServletSecurity.EmptyRoleSemantic.DENY) && (roleNames.length > 0)) {
/* 103 */       throw new IllegalArgumentException("Deny semantic with rolesAllowed");
/*     */     }
/*     */     
/* 106 */     emptyRoleSemantic = semantic;
/* 107 */     transportGuarantee = guarantee;
/* 108 */     rolesAllowed = roleNames;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ServletSecurity.EmptyRoleSemantic getEmptyRoleSemantic()
/*     */   {
/* 123 */     return emptyRoleSemantic;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ServletSecurity.TransportGuarantee getTransportGuarantee()
/*     */   {
/* 134 */     return transportGuarantee;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String[] getRolesAllowed()
/*     */   {
/* 157 */     return rolesAllowed;
/*     */   }
/*     */ }


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\HttpConstraintElement.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */