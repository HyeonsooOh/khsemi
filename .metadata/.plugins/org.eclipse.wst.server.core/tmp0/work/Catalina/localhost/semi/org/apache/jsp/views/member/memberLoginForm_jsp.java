/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.72
 * Generated at: 2021-12-11 10:16:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.member.model.vo.Member;

public final class memberLoginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/member/../common/main_end.jsp", Long.valueOf(1638543132000L));
    _jspx_dependants.put("/views/member/../common/main_top.jsp", Long.valueOf(1639217625350L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <style>\r\n");
      out.write("    #etc  {\r\n");
      out.write("    	padding-left: 20px ;\r\n");
      out.write("   		margin:0 auto; \r\n");
      out.write("        dispaly : inline-block;\r\n");
      out.write("        width :65%;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>?????????</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
	
	String contextPath = request.getContextPath(); 
	Member loginUser = (Member)session.getAttribute("loginUser");
	String alertMsg = (String)session.getAttribute("alertMsg");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"author\" content=\"\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- Favicon-->\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("<!-- Bootstrap icons-->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Navigation-->\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"");
      out.print(contextPath);
      out.write("\">????????????</a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("				<ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"");
      out.print(contextPath);
      out.write("\">Home</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"");
      out.print(contextPath);
      out.write("/PwdForm.me\">MyPage</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"");
      out.print( contextPath );
      out.write("/faqForm.fa\">????????????</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"");
      out.print( contextPath );
      out.write("/noticeList.ad\">????????????</a></li>\r\n");
      out.write("					<li class=\"nav-item dropdown\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\"\r\n");
      out.write("						role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Category</a>\r\n");
      out.write("						<ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=1\">??????</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=2\">?????????</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=3\">??????</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=4\">??????</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=5\">??????</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=6\">?????????</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<form class=\"d-flex\">\r\n");
      out.write("				<a href=\"");
      out.print( contextPath );
      out.write("/list.ba\" class=\"btn btn-outline-light\"\r\n");
      out.write("					type=\"submit\"> <i class=\"bi-cart-fill me-1\"></i> Cart <span\r\n");
      out.write("					class=\"badge bg-dark text-white ms-1 rounded-pill\"></span>\r\n");
      out.write("				</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("				");
 if(loginUser == null) { 
      out.write("\r\n");
      out.write("				<!-- ????????? ??? -->\r\n");
      out.write("\r\n");
      out.write("				<button class=\"btn btn-outline-light\" type=\"button\"\r\n");
      out.write("					onclick=\"location.href = '");
      out.print( contextPath );
      out.write("/loginForm.me'\">\r\n");
      out.write("\r\n");
      out.write("					Login</button>\r\n");
      out.write("				<!-- ????????? ??? -->\r\n");
      out.write("				");
 } else { 
      out.write("\r\n");
      out.write("				<button class=\"btn btn-outline-light\" type=\"button\"\r\n");
      out.write("					onclick=\"location.href = '");
      out.print( contextPath );
      out.write("/logout.me'\">\r\n");
      out.write("\r\n");
      out.write("					Logout</button>\r\n");
      out.write("				&nbsp;&nbsp;&nbsp;\r\n");
      out.write("				<button style=\"color: withe;\" class=\"btn btn-outline-light\"\r\n");
      out.write("					type=\"button\">\r\n");
      out.write("					");
      out.print(loginUser.getUserName() );
      out.write("????????? ???????????????.\r\n");
      out.write("				</button>\r\n");
      out.write("				");
 } 
      out.write("\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<!-- Header-->\r\n");
      out.write("	<header>\r\n");
      out.write("		<div class=\"container px-4 px-lg-5 my-5\">\r\n");
      out.write("			<div class=\"text-center text-white\">\r\n");
      out.write("				<div class=\"container\">\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("/main.mi\"><img\r\n");
      out.write("						src=\"/semi/resources/logo.png\" title=\"??????\"></a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<!-- ?????? ????????? -->\r\n");
      out.write("	<script>\r\n");
      out.write("		var msg = \"");
      out.print( alertMsg );
      out.write("\"; \r\n");
      out.write("		\r\n");
      out.write("		if(msg != \"null\") { \r\n");
      out.write("			alert(msg);\r\n");
      out.write("	\r\n");
      out.write("			");
 session.removeAttribute("alertMsg"); 
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"text-center font-weight-light my-1\" >??????????????? ?????? ?????? ???????????????.</h1>\r\n");
      out.write(" <div id=\"layoutSidenav_content\">\r\n");
      out.write("                <main>\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row justify-content-center\">\r\n");
      out.write("                            <div class=\"col-lg-11\">\r\n");
      out.write("                                <div class=\"card border-1 rounded-lg mt-5\">\r\n");
      out.write("                                    <div class=\"card-header\"><h4 class=\"text-center font-weight-light my-1\">?????????</h4></div>\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <form id=\"login-form\" action=\"");
      out.print( contextPath );
      out.write("/login.me\" method=\"post\" >\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        	<!-- ID -->\r\n");
      out.write("                                          \r\n");
      out.write("                                           \r\n");
      out.write("                                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                                <input class=\"form-control\" name=\"id\" type=\"text\" placeholder=\"????????? ??????\" maxlength=\"15\" required />\r\n");
      out.write("                                                <label >????????? ??????</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <!-- PW -->\r\n");
      out.write("                                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                                <input class=\"form-control\" name=\"pw\" type=\"password\" placeholder=\"???????????? ??????\" maxlength=\"15\" required />\r\n");
      out.write("                                                <label >???????????? ??????</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                           \r\n");
      out.write("                                 \r\n");
      out.write("                                        \r\n");
      out.write("                                            <!-- Login Btn -->\r\n");
      out.write("                                            <div class=\"mt-4 mb-3\">\r\n");
      out.write("                                                <div class=\"d-grid\"><button class=\"btn btn-dark btn-block\" type=\"submit\">Login</button></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <div id=\"etc\"  class=\"row mb-3\">\r\n");
      out.write("                                            	<!-- ???????????? -->\r\n");
      out.write("                                               <div class=\"col-md-4\">\r\n");
      out.write("                                                    <div class=\"form-floating\">\r\n");
      out.write("                                                    <button type=\"button\"class=\"btn btn-dark btn-block\" onclick=\"changePage(0)\">????????????</button>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <!-- ID?????? -->\r\n");
      out.write("                                                <div class=\"col-md-4\">\r\n");
      out.write("                                                    <div class=\"form-floating\">\r\n");
      out.write("                                                    <button type=\"button\"class=\"btn btn-dark btn-block\" onclick=\"changePage(1)\" >ID ??????</button>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <!-- PW?????? -->\r\n");
      out.write("                                                <div class=\"col-md-4\">\r\n");
      out.write("                                                    <div class=\"form-floating\">\r\n");
      out.write("                                                    <button type=\"button\"class=\"btn btn-dark btn-block\" onclick=\"changePage(2)\" >PW ??????</button>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                         \r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </main>\r\n");
      out.write("            </div>\r\n");
      out.write("    <script>\r\n");
      out.write("	        	function changePage(num) {\r\n");
      out.write("	        		switch(num){\r\n");
      out.write("	        		case 0:\r\n");
      out.write("	        			location.href = \"");
      out.print( contextPath );
      out.write("/enrollForm.me\";\r\n");
      out.write("	        			break;\r\n");
      out.write("	        		case 1:\r\n");
      out.write("	        			location.href = \"");
      out.print( contextPath );
      out.write("/findIdForm.me\";\r\n");
      out.write("	        			break;\r\n");
      out.write("	        		default:\r\n");
      out.write("	        			location.href = \"");
      out.print( contextPath );
      out.write("/findPwForm.me\";\r\n");
      out.write("	        			\r\n");
      out.write("	        		}\r\n");
      out.write("	        		\r\n");
      out.write("	        	}\r\n");
      out.write("	 </script>  \r\n");
      out.write("	  ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	    <!-- Footer-->\r\n");
      out.write("        <footer class=\"py-5 bg-dark\">\r\n");
      out.write("            <div class=\"container\"><p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2021</p></div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- Bootstrap core JS-->\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- Core theme JS-->\r\n");
      out.write("        <script src=\"js/scripts.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
