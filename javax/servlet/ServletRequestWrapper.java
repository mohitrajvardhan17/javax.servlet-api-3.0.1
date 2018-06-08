/*     */ package javax.servlet;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
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
/*     */ public class ServletRequestWrapper
/*     */   implements ServletRequest
/*     */ {
/*     */   private ServletRequest request;
/*     */   
/*     */   public ServletRequestWrapper(ServletRequest request)
/*     */   {
/*  88 */     if (request == null) {
/*  89 */       throw new IllegalArgumentException("Request cannot be null");
/*     */     }
/*  91 */     this.request = request;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ServletRequest getRequest()
/*     */   {
/*  99 */     return request;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRequest(ServletRequest request)
/*     */   {
/* 108 */     if (request == null) {
/* 109 */       throw new IllegalArgumentException("Request cannot be null");
/*     */     }
/* 111 */     this.request = request;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object getAttribute(String name)
/*     */   {
/* 120 */     return request.getAttribute(name);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Enumeration<String> getAttributeNames()
/*     */   {
/* 129 */     return request.getAttributeNames();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCharacterEncoding()
/*     */   {
/* 138 */     return request.getCharacterEncoding();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCharacterEncoding(String enc)
/*     */     throws UnsupportedEncodingException
/*     */   {
/* 148 */     request.setCharacterEncoding(enc);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getContentLength()
/*     */   {
/* 157 */     return request.getContentLength();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getContentType()
/*     */   {
/* 166 */     return request.getContentType();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ServletInputStream getInputStream()
/*     */     throws IOException
/*     */   {
/* 175 */     return request.getInputStream();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getParameter(String name)
/*     */   {
/* 184 */     return request.getParameter(name);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Map<String, String[]> getParameterMap()
/*     */   {
/* 193 */     return request.getParameterMap();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Enumeration<String> getParameterNames()
/*     */   {
/* 202 */     return request.getParameterNames();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String[] getParameterValues(String name)
/*     */   {
/* 211 */     return request.getParameterValues(name);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getProtocol()
/*     */   {
/* 220 */     return request.getProtocol();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getScheme()
/*     */   {
/* 229 */     return request.getScheme();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getServerName()
/*     */   {
/* 238 */     return request.getServerName();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getServerPort()
/*     */   {
/* 247 */     return request.getServerPort();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public BufferedReader getReader()
/*     */     throws IOException
/*     */   {
/* 256 */     return request.getReader();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getRemoteAddr()
/*     */   {
/* 265 */     return request.getRemoteAddr();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getRemoteHost()
/*     */   {
/* 274 */     return request.getRemoteHost();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAttribute(String name, Object o)
/*     */   {
/* 283 */     request.setAttribute(name, o);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void removeAttribute(String name)
/*     */   {
/* 292 */     request.removeAttribute(name);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Locale getLocale()
/*     */   {
/* 301 */     return request.getLocale();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Enumeration<Locale> getLocales()
/*     */   {
/* 310 */     return request.getLocales();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSecure()
/*     */   {
/* 319 */     return request.isSecure();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RequestDispatcher getRequestDispatcher(String path)
/*     */   {
/* 328 */     return request.getRequestDispatcher(path);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   /**
/*     */    * @deprecated
/*     */    */
/*     */   public String getRealPath(String path)
/*     */   {
/* 340 */     return request.getRealPath(path);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getRemotePort()
/*     */   {
/* 351 */     return request.getRemotePort();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getLocalName()
/*     */   {
/* 362 */     return request.getLocalName();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getLocalAddr()
/*     */   {
/* 373 */     return request.getLocalAddr();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getLocalPort()
/*     */   {
/* 384 */     return request.getLocalPort();
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
/*     */   public ServletContext getServletContext()
/*     */   {
/* 398 */     return request.getServletContext();
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
/*     */   public AsyncContext startAsync()
/*     */     throws IllegalStateException
/*     */   {
/* 422 */     return request.startAsync();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse)
/*     */     throws IllegalStateException
/*     */   {
/* 454 */     return request.startAsync(servletRequest, servletResponse);
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
/*     */   public boolean isAsyncStarted()
/*     */   {
/* 469 */     return request.isAsyncStarted();
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
/*     */   public boolean isAsyncSupported()
/*     */   {
/* 484 */     return request.isAsyncSupported();
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
/*     */ 
/*     */   public AsyncContext getAsyncContext()
/*     */   {
/* 508 */     return request.getAsyncContext();
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
/*     */   public boolean isWrapperFor(ServletRequest wrapped)
/*     */   {
/* 524 */     if (request == wrapped)
/* 525 */       return true;
/* 526 */     if ((request instanceof ServletRequestWrapper)) {
/* 527 */       return ((ServletRequestWrapper)request).isWrapperFor(wrapped);
/*     */     }
/* 529 */     return false;
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
/*     */   public boolean isWrapperFor(Class wrappedType)
/*     */   {
/* 550 */     if (!ServletRequest.class.isAssignableFrom(wrappedType)) {
/* 551 */       throw new IllegalArgumentException("Given class " + wrappedType.getName() + " not a subinterface of " + ServletRequest.class.getName());
/*     */     }
/*     */     
/*     */ 
/* 555 */     if (wrappedType.isAssignableFrom(request.getClass()))
/* 556 */       return true;
/* 557 */     if ((request instanceof ServletRequestWrapper)) {
/* 558 */       return ((ServletRequestWrapper)request).isWrapperFor(wrappedType);
/*     */     }
/* 560 */     return false;
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
/*     */   public DispatcherType getDispatcherType()
/*     */   {
/* 575 */     return request.getDispatcherType();
/*     */   }
/*     */ }


/* Location:              C:\Users\emorajv\Downloads\javax.servlet-api-3.0.1.jar!\javax\servlet\ServletRequestWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */