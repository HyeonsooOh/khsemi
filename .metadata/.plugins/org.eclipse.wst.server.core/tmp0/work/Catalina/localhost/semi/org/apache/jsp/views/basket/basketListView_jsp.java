/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.72
 * Generated at: 2021-12-12 05:03:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.basket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.kh.basket.model.vo.Basket;
import com.kh.admin.product.model.vo.Attachment;
import com.kh.admin.product.model.vo.BookMaster;
import com.kh.member.model.vo.Member;

public final class basketListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/basket/../common/mypage.jsp", Long.valueOf(1639277504225L));
    _jspx_dependants.put("/views/basket/../common/main_top.jsp", Long.valueOf(1639217625350L));
    _jspx_dependants.put("/views/basket/../common/main_end.jsp", Long.valueOf(1638543132000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.basket.model.vo.Basket");
    _jspx_imports_classes.add("com.kh.admin.product.model.vo.BookMaster");
    _jspx_imports_classes.add("com.kh.admin.product.model.vo.Attachment");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("\r\n");

	ArrayList<Basket> list = (ArrayList<Basket>)request.getAttribute("list");

	ArrayList<Basket> atList = (ArrayList<Basket>)request.getAttribute("atList");

	ArrayList<Attachment> atlist = (ArrayList<Attachment>)request.getAttribute("list");
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- Favicon-->\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("<!-- Bootstrap icons-->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("<!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script> <!-- 온라인 방식 -->\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .bookList>td {\r\n");
      out.write("        text-align : center;\r\n");
      out.write("        vertical-align : middle;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
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
      out.write("\">북적북적</a>\r\n");
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
      out.write("/faqForm.fa\">고객센터</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"");
      out.print( contextPath );
      out.write("/noticeList.ad\">공지사항</a></li>\r\n");
      out.write("					<li class=\"nav-item dropdown\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\"\r\n");
      out.write("						role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Category</a>\r\n");
      out.write("						<ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=1\">소설</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=2\">에세이</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=3\">역사</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=4\">과학</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=5\">정치</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\"\r\n");
      out.write("								href=\"");
      out.print( contextPath );
      out.write("/main.mi?category=6\">로맨틱</a></li>\r\n");
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
      out.write("				<!-- 로그인 전 -->\r\n");
      out.write("\r\n");
      out.write("				<button class=\"btn btn-outline-light\" type=\"button\"\r\n");
      out.write("					onclick=\"location.href = '");
      out.print( contextPath );
      out.write("/loginForm.me'\">\r\n");
      out.write("\r\n");
      out.write("					Login</button>\r\n");
      out.write("				<!-- 로그인 후 -->\r\n");
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
      out.write("회원님 환영합니다.\r\n");
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
      out.write("						src=\"/semi/resources/logo.png\" title=\"로고\"></a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<!-- 알터 출력용 -->\r\n");
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
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <style>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        #wrap{\r\n");
      out.write("            float: left;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            width: 15%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #nav{\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 1000px;\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .a{\r\n");
      out.write("            list-style: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #nav a{\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color : black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #nav>ul>li {\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #nav>li {\r\n");
      out.write("            font-size: large;\r\n");
      out.write("            font-family: Verdana, Geneva, Tahoma, sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("        <nav id=\"nav\">\r\n");
      out.write("            <li class=\"a\">My정보</li>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"");
      out.print(contextPath);
      out.write("/MyPageForm.me\">조회 및 수정</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.print(contextPath);
      out.write("/deleteForm.me\">회원탈퇴</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("    \r\n");
      out.write("            <li class=\"a\">My쇼핑</li>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"");
      out.print(contextPath);
      out.write("/list.ba\">장바구니</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.print(contextPath);
      out.write("/order.me\">주문/배송 조회</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.print(contextPath);
      out.write("/cancellist.me\">취소/반품 조회</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("    \r\n");
      out.write("            <li class=\"a\">My문의</li>\r\n");
      out.write("            <ul>\r\n");
      out.write("         \r\n");
      out.write("                <li><a href=\"");
      out.print(contextPath);
      out.write("/inquiryForm.in?currentPage=1\">1대1 문의</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Header-->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row justify-content-center\">\r\n");
      out.write("			<div class=\"container px-lg-5\">\r\n");
      out.write("				<div class=\"text-center\">\r\n");
      out.write("					<h1>장바구니</h1>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<div class=\"p-4 p-lg-5 bg-light rounded-3 text-center\">\r\n");
      out.write("					<table id=\"table\" class=\"table text-center\">\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th style=\"width: 16%;\">책 이미지</th>\r\n");
      out.write("							<th>책 제목</th>\r\n");
      out.write("							<th>가격</th>\r\n");
      out.write("							<th>수량</th>\r\n");
      out.write("							<th>소계</th>\r\n");
      out.write("							<th>비교</th>\r\n");
      out.write("							<!-- <th>주문 여부 선택</th> -->\r\n");
      out.write("						</tr>\r\n");
      out.write("\r\n");
      out.write("						");

							if (list.isEmpty()) {
							;
						
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"7\">조회된 리스트가 없습니다.</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<script>\r\n");
      out.write("		                		function(){\r\n");
      out.write("		                			$(\"#buy\").attr(\"disabled\",true);\r\n");
      out.write("		                		}\r\n");
      out.write("		                	</script>\r\n");
      out.write("						");

							} else {
						
      out.write("\r\n");
      out.write("						");

							for (Basket b : atList) {
						
      out.write("\r\n");
      out.write("						<tr class=\"bookList\">\r\n");
      out.write("							<td><img class=\"card-img-top\" style=\"width: 80%;\"\r\n");
      out.write("								src=\"");
      out.print(request.getContextPath());
      out.write('/');
      out.print(b.getTitleImg());
      out.write("\"></td>\r\n");
      out.write("							<td class=\"title\">");
      out.print(b.getBookTitle());
      out.write("</td>\r\n");
      out.write("							<td class=\"price\">");
      out.print(b.getPrice());
      out.write("</td>\r\n");
      out.write("							<td class=\"count\">");
      out.print(b.getCount());
      out.write("</td>\r\n");
      out.write("							<td class=\"priceSum\">");
      out.print(b.getSumPrice());
      out.write("</td>\r\n");
      out.write("							<td><a\r\n");
      out.write("								href=\"");
      out.print(request.getContextPath());
      out.write("/delBasket.ba?bano=");
      out.print(b.getBasketSeq());
      out.write("\"\r\n");
      out.write("								class=\"btn btn-danger delete\"\r\n");
      out.write("								style=\"padding-top: 0px; padding-bottom: 0px;\"> 삭제 </a></td>\r\n");
      out.write("							<!-- <td><input type=\"checkbox\" class=\"check\"></td> -->\r\n");
      out.write("							<!-- 시간 부족하니 빼자 -->\r\n");
      out.write("						</tr>\r\n");
      out.write("						");

							}
						
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td></td>\r\n");
      out.write("							<td></td>\r\n");
      out.write("							<td>총계</td>\r\n");
      out.write("							<td id=\"allCount\"></td>\r\n");
      out.write("							<td id=\"allSum\"></td>\r\n");
      out.write("							<td>\r\n");
      out.write("								<button class=\"btn btn-danger\"\r\n");
      out.write("									style=\"padding-top: 0px; padding-bottom: 0px;\"\r\n");
      out.write("									onclick=\"allSum(); allCount();\">총계확인</button>\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<script>\r\n");
      out.write("	                        function(){\r\n");
      out.write("	                			$(\"#buy\").attr(\"disabled\",false);\r\n");
      out.write("	                		}\r\n");
      out.write("		                	</script>\r\n");
      out.write("						");

							}
						
      out.write("\r\n");
      out.write("					</table>\r\n");
      out.write("\r\n");
      out.write("					<table style=\"width: 100%;\">\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td><a href=\"");
      out.print(request.getContextPath());
      out.write("/main.mi\"><button\r\n");
      out.write("										class=\"btn btn-secondary\" style=\"text-align: left;\">\r\n");
      out.write("										계속 쇼핑하기</button></a></td>\r\n");
      out.write("							<td>\r\n");
      out.write("								<button id=\"buy\" class=\"btn btn-success\" onclick=\"buys()\">주문하기</button>\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("\r\n");
      out.write("						<!-- 주문버튼 활성화 유무 -->\r\n");
      out.write("						<script>\r\n");
      out.write("                        	function buys() {\r\n");
      out.write("                        		location.href= \"");
      out.print(request.getContextPath());
      out.write("/basket.pb\";\r\n");
      out.write("                        	}\r\n");
      out.write("                        </script>\r\n");
      out.write("\r\n");
      out.write("					</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<!-- <button id=\"buy\" class=\"btn btn-outline-success\">주문하기</button> -->\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<!-- \r\n");
      out.write("            <a href=\"####\"><button class=\"btn btn-secondary\" style=\"margin-left:12%\">\r\n");
      out.write("                계속 쇼핑하기\r\n");
      out.write("            </button></a>\r\n");
      out.write("             -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- 장바구니 삭제 및 주문버튼 클릭시 jQuery 시작 -->\r\n");
      out.write("        <script>\r\n");
      out.write("            function allSum() {\r\n");
      out.write("                var table = document.getElementById('table');\r\n");
      out.write("\r\n");
      out.write("                var sum = 0;\r\n");
      out.write("                for(var i =1; i < table.rows.length - 1; i++) {\r\n");
      out.write("                    sum += parseInt(table.rows[i].cells[4].innerHTML);\r\n");
      out.write("                    console.log(\"sum : \" + sum);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                document.getElementById('allSum').innerHTML = parseInt(sum);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function allCount() {\r\n");
      out.write("                var table = document.getElementById('table');\r\n");
      out.write("\r\n");
      out.write("                var sum = 0;\r\n");
      out.write("                for(var i =1; i < table.rows.length - 1; i++) {\r\n");
      out.write("                    sum += parseInt(table.rows[i].cells[3].innerHTML);\r\n");
      out.write("                    console.log(\"sum : \" + sum);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                document.getElementById('allCount').innerHTML = parseInt(sum);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $(function() {\r\n");
      out.write("                $(\".delete\").click(function() {\r\n");
      out.write("                	\r\n");
      out.write("                	\r\n");
      out.write("                    var clickedRow = $(this).parent().parent();\r\n");
      out.write("                    var cls = clickedRow.attr(\"class\");\r\n");
      out.write("                 \r\n");
      out.write("                    // 각 항목의 첫번째 row를 삭제한 경우 다음 row에 td 하나를 추가해 준다.\r\n");
      out.write("                    if( clickedRow.find(\"td:eq(0)\").attr(\"rowspan\") ){\r\n");
      out.write("                        if( clickedRow.next().hasClass(cls) ){\r\n");
      out.write("                         clickedRow.next().prepend(clickedRow.find(\"td:eq(0)\"));\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write(" \r\n");
      out.write("                    clickedRow.remove();\r\n");
      out.write(" \r\n");
      out.write("                    // rowspan 조정\r\n");
      out.write("                    resizeRowspan(cls);\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- 장바구니 삭제 및 주문버튼 클릭시 jQuery 끝 -->\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("        $(function() {\r\n");
      out.write("        	");
 if(list.isEmpty()) { 
      out.write("\r\n");
      out.write("      			$(function() {\r\n");
      out.write("      				$(\"#buy\").attr(\"disabled\", true);\r\n");
      out.write("      			});\r\n");
      out.write("         	");
 } else { 
      out.write("\r\n");
      out.write("	         	$(function() {\r\n");
      out.write("					$(\"#buy\").attr(\"disabled\", false);\r\n");
      out.write("				});\r\n");
      out.write("         	");
 } 
      out.write("\r\n");
      out.write("        })\r\n");
      out.write("       \r\n");
      out.write("        </script>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	");
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
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>	\r\n");
      out.write("\r\n");
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