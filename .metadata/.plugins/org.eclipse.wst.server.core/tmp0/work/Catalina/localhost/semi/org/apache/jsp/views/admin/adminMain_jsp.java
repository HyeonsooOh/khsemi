/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.72
 * Generated at: 2021-12-12 05:21:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.kh.admin.product.model.vo.BookMaster;

public final class adminMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/admin/../common/admin_end.jsp", Long.valueOf(1639212655939L));
    _jspx_dependants.put("/views/admin/../common/admin_top.jsp", Long.valueOf(1639285882287L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.admin.product.model.vo.BookMaster");
    _jspx_imports_classes.add("java.util.ArrayList");
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

	ArrayList<BookMaster> bml = (ArrayList<BookMaster>)request.getAttribute("bml");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Dashboard - SB Admin</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"sb-nav-fixed\">\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
 
	String contextPath = request.getContextPath();
	String alertMsg = (String)session.getAttribute("alertMsg");


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Dashboard - SB Admin</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    	<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    	\r\n");
      out.write("    	\r\n");
      out.write("    	\r\n");
      out.write("    	<!-- Favicon-->\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("<!-- Bootstrap icons-->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("<!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/style.css\">\r\n");
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
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"assets/demo/chart-area-demo.js\"></script>\r\n");
      out.write("<script src=\"assets/demo/chart-bar-demo.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"js/datatables-simple-demo.js\"></script>\r\n");
      out.write("    	\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"sb-nav-fixed\">\r\n");
      out.write("        <nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\r\n");
      out.write("            <!-- Navbar Brand-->\r\n");
      out.write("            <a class=\"navbar-brand ps-3\" href=\"");
      out.print( contextPath );
      out.write("/admain.ad\">북적북적</a>\r\n");
      out.write("            <!-- Sidebar Toggle-->\r\n");
      out.write("            <button class=\"btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0\" id=\"sidebarToggle\" href=\"#!\"><i class=\"fas fa-bars\"></i></button>\r\n");
      out.write("            <!-- Navbar-->\r\n");
      out.write("            <ul class=\"navbar-nav form-inline ms-auto me-0 me-md-3 my-2 my-md-0\">\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fas fa-user fa-fw\"></i></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("\"> Logout</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div id=\"layoutSidenav\">\r\n");
      out.write("            <div id=\"layoutSidenav_nav\">\r\n");
      out.write("                <nav class=\"sb-sidenav accordion sb-sidenav-dark\" id=\"sidenavAccordion\">\r\n");
      out.write("                    <div class=\"sb-sidenav-menu\">\r\n");
      out.write("                        <div class=\"nav\">\r\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">메인</div>\r\n");
      out.write("                            <a class=\"nav-link\" href=\"");
      out.print( contextPath );
      out.write("/admain.ad\">\r\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\r\n");
      out.write("                                		관리자메인페이지\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">관리메뉴</div>\r\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseLayouts\" aria-expanded=\"false\" aria-controls=\"collapseLayouts\">\r\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-columns\"></i></div>\r\n");
      out.write("                                		상품관리\r\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"collapse\" id=\"collapseLayouts\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"");
      out.print( contextPath );
      out.write("/enrollProduct.ad\">상품등록</a>\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"");
      out.print( contextPath );
      out.write("/productList.ad\">상품조회</a>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsePages\" aria-expanded=\"false\" aria-controls=\"collapsePages\">\r\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-book-open\"></i></div>\r\n");
      out.write("                               		 회원관리\r\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"collapse\" id=\"collapsePages\" aria-labelledby=\"headingTwo\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav accordion\" id=\"sidenavAccordionPages\">\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"");
      out.print( contextPath );
      out.write("/userList.ad\">회원 제재 및 탈퇴</a>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">문의관련</div>\r\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsePages2\" aria-expanded=\"false\" aria-controls=\"collapsePages\">\r\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-book-open\"></i></div>\r\n");
      out.write("                               		 문의관리\r\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"collapse\" id=\"collapsePages2\" aria-labelledby=\"headingTwo\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav accordion\" id=\"sidenavAccordionPages\">\r\n");
      out.write("                               \r\n");
      out.write("                                    <a class=\"nav-link\" href=\"");
      out.print( contextPath );
      out.write("/inquiryFormAdmin.in?currentPage=1\">문의조회 및 답변</a>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">공지사항 관리</div>\r\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsePages3\" aria-expanded=\"false\" aria-controls=\"collapsePages\">\r\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-book-open\"></i></div>\r\n");
      out.write("                               		 공지사항 관리\r\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"collapse\" id=\"collapsePages3\" aria-labelledby=\"headingTwo\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav accordion\" id=\"sidenavAccordionPages\">\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"");
      out.print( contextPath );
      out.write("/enroll.no\">공지사항 등록</a>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"layoutSidenav_content\">  \r\n");
      out.write("            \r\n");
      out.write("            <script>\r\n");
      out.write("				var msg = \"");
      out.print( alertMsg );
      out.write("\"; \r\n");
      out.write("				\r\n");
      out.write("				if(msg != \"null\") { \r\n");
      out.write("					alert(msg);\r\n");
      out.write("			\r\n");
      out.write("					");
 session.removeAttribute("alertMsg"); 
      out.write("\r\n");
      out.write("				}\r\n");
      out.write("			</script>  \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        	 <div>\r\n");
      out.write("                <main>\r\n");
      out.write("                    <div class=\"container-fluid px-4\">\r\n");
      out.write("                        <h1 class=\"mt-4\">관리자 메인 페이지</h1>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <div class=\"card mb-4\">\r\n");
      out.write("                                    <div class=\"card-header\">\r\n");
      out.write("                                        <i class=\"fas fa-chart-area me-1\"></i>\r\n");
      out.write("                                       		 판매 수량\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-body\"><canvas id=\"myAreaChart\" width=\"100%\" height=\"40\"></canvas></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <script>\r\n");
      out.write("                        // Area Chart Example\r\n");
      out.write("						var ctx = document.getElementById(\"myAreaChart\");\r\n");
      out.write("						var myLineChart = new Chart(ctx, {\r\n");
      out.write("						  type: 'bar',\r\n");
      out.write("						  data: {\r\n");
      out.write("						    labels: [\"");
      out.print( bml.get(0).getTitle() );
      out.write("\", \"");
      out.print( bml.get(1).getTitle() );
      out.write("\", \"");
      out.print( bml.get(2).getTitle() );
      out.write("\", \"");
      out.print( bml.get(3).getTitle() );
      out.write("\", \"");
      out.print( bml.get(4).getTitle() );
      out.write("\"],\r\n");
      out.write("						    datasets: [{\r\n");
      out.write("						      label: \"Sessions\",\r\n");
      out.write("						      lineTension: 0.1,\r\n");
      out.write("						      backgroundColor: \"rgba(2,117,216,0.2)\",\r\n");
      out.write("						      borderColor: \"rgba(2,117,216,1)\",\r\n");
      out.write("						      pointRadius: 5,\r\n");
      out.write("						      pointBackgroundColor: \"rgba(2,117,216,1)\",\r\n");
      out.write("						      pointBorderColor: \"rgba(255,255,255,0.8)\",\r\n");
      out.write("						      pointHoverRadius: 5,\r\n");
      out.write("						      pointHoverBackgroundColor: \"rgba(2,117,216,1)\",\r\n");
      out.write("						      pointHitRadius: 50,\r\n");
      out.write("						      pointBorderWidth: 2,\r\n");
      out.write("						      data: [");
      out.print( bml.get(0).getSaleCount() );
      out.write(',');
      out.write(' ');
      out.print( bml.get(1).getSaleCount() );
      out.write(',');
      out.write(' ');
      out.print( bml.get(2).getSaleCount() );
      out.write(',');
      out.write(' ');
      out.print( bml.get(3).getSaleCount() );
      out.write(',');
      out.write(' ');
      out.print( bml.get(4).getSaleCount() );
      out.write("],\r\n");
      out.write("						    }],\r\n");
      out.write("						  },\r\n");
      out.write("						  options: {\r\n");
      out.write("						    scales: {\r\n");
      out.write("						      xAxes: [{\r\n");
      out.write("						        time: {\r\n");
      out.write("						          unit: 'date'\r\n");
      out.write("						        },\r\n");
      out.write("						        gridLines: {\r\n");
      out.write("						          display: false\r\n");
      out.write("						        },\r\n");
      out.write("						        ticks: {\r\n");
      out.write("						          // maxTicksLimit: 7\r\n");
      out.write("						        }\r\n");
      out.write("						      }],\r\n");
      out.write("						      yAxes: [{\r\n");
      out.write("						        ticks: {\r\n");
      out.write("						          min: 0,\r\n");
      out.write("						          max: 30,\r\n");
      out.write("						          maxTicksLimit: 5\r\n");
      out.write("						        },\r\n");
      out.write("						        gridLines: {\r\n");
      out.write("						          color: \"rgba(0, 0, 0, .125)\",\r\n");
      out.write("						        }\r\n");
      out.write("						      }],\r\n");
      out.write("						    },\r\n");
      out.write("						    legend: {\r\n");
      out.write("						      display: false\r\n");
      out.write("						    }\r\n");
      out.write("						  }\r\n");
      out.write("						});\r\n");
      out.write("						\r\n");
      out.write("                        </script>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"card mb-4\">\r\n");
      out.write("                            <div class=\"card-header\">\r\n");
      out.write("                                <i class=\"fas fa-table me-1\"></i>\r\n");
      out.write("                                	매출 순위\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-body\" style=\"text-align:center\">\r\n");
      out.write("                                <table id=\"datatablesSimple\">\r\n");
      out.write("                               	\r\n");
      out.write("                               	<thead>\r\n");
      out.write("                               		<tr class=\"bookList\">\r\n");
      out.write("                               			<th class=\"title\" width=\"70\">순위</th>\r\n");
      out.write("				                            <th class=\"title\">책 제목</th>\r\n");
      out.write("				                            <th class=\"count\" width=\"130\">총 판매 수량</th>\r\n");
      out.write("				                            <th class=\"price\" width=\"130\">총 판매 가격</th>\r\n");
      out.write("				                        </tr>\r\n");
      out.write("                               	</thead>\r\n");
      out.write("                               	\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                	");
 if(bml.isEmpty()) { 
      out.write("\r\n");
      out.write("			                        	<tr>\r\n");
      out.write("					                		<td colspan=\"3\">조회된 리스트가 없습니다.</td>\r\n");
      out.write("					                	</tr>\r\n");
      out.write("			                        ");
 } else { 
      out.write("\r\n");
      out.write("			                        	");
 for(int i = 0; i < bml.size(); i++) { 
      out.write("\r\n");
      out.write("				                        <tr class=\"bookList\">\r\n");
      out.write("				                        	<td class=\"title\">");
      out.print( i + 1 );
      out.write("</td>\r\n");
      out.write("				                            <td class=\"title\">");
      out.print( bml.get(i).getTitle() );
      out.write("</td>\r\n");
      out.write("				                            <td class=\"count\">");
      out.print( bml.get(i).getSaleCount() );
      out.write("권</td>\r\n");
      out.write("				                            <td class=\"price\">");
      out.print( bml.get(i).getPrice() );
      out.write("원</td>\r\n");
      out.write("				                        </tr>\r\n");
      out.write("			                       		");
 } 
      out.write("\r\n");
      out.write("			                       	");
 } 
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </main>\r\n");
      out.write("                <footer class=\"py-4 bg-light mt-auto\">\r\n");
      out.write("                    <div class=\"container-fluid px-4\">\r\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-between small\">\r\n");
      out.write("                            <div class=\"text-muted\">Copyright &copy; Your Website 2021</div>\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <a href=\"#\">Privacy Policy</a>\r\n");
      out.write("                                &middot;\r\n");
      out.write("                                <a href=\"#\">Terms &amp; Conditions</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </footer>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <footer class=\"py-5 bg-dark\">\r\n");
      out.write("        <div class=\"container\"><p class=\"m-0 text-center text-white\">Copyright &copy; 욕심내고후회했조 2021</p></div>\r\n");
      out.write("    </footer>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
