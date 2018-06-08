/*     */ package javax.servlet;
/*     */ 
/*     */ import javax.servlet.annotation.MultipartConfig;
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
/*     */ public class MultipartConfigElement
/*     */ {
/*     */   private String location;
/*     */   private long maxFileSize;
/*     */   private long maxRequestSize;
/*     */   private int fileSizeThreshold;
/*     */   
/*     */   public MultipartConfigElement(String location)
/*     */   {
/*  63 */     if (location == null) {
/*  64 */       this.location = "";
/*     */     } else {
/*  66 */       this.location = location;
/*     */     }
/*  68 */     maxFileSize = -1L;
/*  69 */     maxRequestSize = -1L;
/*  70 */     fileSizeThreshold = 0;
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
/*     */   public MultipartConfigElement(String location, long maxFileSize, long maxRequestSize, int fileSizeThreshold)
/*     */   {
/*  85 */     if (location == null) {
/*  86 */       this.location = "";
/*     */     } else {
/*  88 */       this.location = location;
/*     */     }
/*  90 */     this.maxFileSize = maxFileSize;
/*  91 */     this.maxRequestSize = maxRequestSize;
/*  92 */     this.fileSizeThreshold = fileSizeThreshold;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public MultipartConfigElement(MultipartConfig annotation)
/*     */   {
/* 101 */     location = annotation.location();
/* 102 */     fileSizeThreshold = annotation.fileSizeThreshold();
/* 103 */     maxFileSize = annotation.maxFileSize();
/* 104 */     maxRequestSize = annotation.maxRequestSize();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getLocation()
/*     */   {
/* 113 */     return location;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getMaxFileSize()
/*     */   {
/* 122 */     return maxFileSize;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getMaxRequestSize()
/*     */   {
/* 131 */     return maxRequestSize;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getFileSizeThreshold()
/*     */   {
/* 140 */     return fileSizeThreshold;
/*     */   }
/*     */ }


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\MultipartConfigElement.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */