/*     */ package javax.servlet;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.HashSet;
/*     */ import javax.servlet.annotation.HttpConstraint;
/*     */ import javax.servlet.annotation.HttpMethodConstraint;
/*     */ import javax.servlet.annotation.ServletSecurity;
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
/*     */ public class ServletSecurityElement
/*     */   extends HttpConstraintElement
/*     */ {
/*     */   private Collection<String> methodNames;
/*     */   private Collection<HttpMethodConstraintElement> methodConstraints;
/*     */   
/*     */   public ServletSecurityElement()
/*     */   {
/*  63 */     methodConstraints = new HashSet();
/*  64 */     methodNames = Collections.emptySet();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ServletSecurityElement(HttpConstraintElement constraint)
/*     */   {
/*  76 */     super(constraint.getEmptyRoleSemantic(), constraint.getTransportGuarantee(), constraint.getRolesAllowed());
/*     */     
/*     */ 
/*  79 */     methodConstraints = new HashSet();
/*  80 */     methodNames = Collections.emptySet();
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
/*     */   public ServletSecurityElement(Collection<HttpMethodConstraintElement> methodConstraints)
/*     */   {
/*  97 */     this.methodConstraints = (methodConstraints == null ? new HashSet() : methodConstraints);
/*     */     
/*  99 */     methodNames = checkMethodNames(this.methodConstraints);
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
/*     */   public ServletSecurityElement(HttpConstraintElement constraint, Collection<HttpMethodConstraintElement> methodConstraints)
/*     */   {
/* 117 */     super(constraint.getEmptyRoleSemantic(), constraint.getTransportGuarantee(), constraint.getRolesAllowed());
/*     */     
/*     */ 
/* 120 */     this.methodConstraints = (methodConstraints == null ? new HashSet() : methodConstraints);
/*     */     
/* 122 */     methodNames = checkMethodNames(this.methodConstraints);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ServletSecurityElement(ServletSecurity annotation)
/*     */   {
/* 134 */     super(annotation.value().value(), annotation.value().transportGuarantee(), annotation.value().rolesAllowed());
/*     */     
/*     */ 
/* 137 */     methodConstraints = new HashSet();
/*     */     
/* 139 */     for (HttpMethodConstraint constraint : annotation.httpMethodConstraints()) {
/* 140 */       methodConstraints.add(new HttpMethodConstraintElement(constraint.value(), new HttpConstraintElement(constraint.emptyRoleSemantic(), constraint.transportGuarantee(), constraint.rolesAllowed())));
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */     methodNames = checkMethodNames(methodConstraints);
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
/*     */   public Collection<HttpMethodConstraintElement> getHttpMethodConstraints()
/*     */   {
/* 162 */     return Collections.unmodifiableCollection(methodConstraints);
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
/*     */   public Collection<String> getMethodNames()
/*     */   {
/* 176 */     return Collections.unmodifiableCollection(methodNames);
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
/*     */   private Collection<String> checkMethodNames(Collection<HttpMethodConstraintElement> methodConstraints)
/*     */   {
/* 191 */     Collection<String> methodNames = new HashSet();
/*     */     
/* 193 */     for (HttpMethodConstraintElement methodConstraint : methodConstraints) {
/* 194 */       String methodName = methodConstraint.getMethodName();
/* 195 */       if (!methodNames.add(methodName)) {
/* 196 */         throw new IllegalArgumentException("Duplicate HTTP method name: " + methodName);
/*     */       }
/*     */     }
/*     */     
/* 200 */     return methodNames;
/*     */   }
/*     */ }


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\ServletSecurityElement.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */