/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2024-06-21 09:29:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/E:/System_Data/Eclipse_WS/jsp_servlet_JDBC/WorkSpace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/new-jdbc/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1718962012157L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1718157657831L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1718180895437L));
    _jspx_dependants.put("jar:file:/E:/System_Data/Eclipse_WS/jsp_servlet_JDBC/WorkSpace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/new-jdbc/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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

      out.write('\r');
      out.write('\n');
      out.write("<!-- thÆ° viá»n há» trá»£ cho jsp -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Trang chủ</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("                <!-- Blog entries-->\r\n");
      out.write("                <div class=\"col-lg-8\">\r\n");
      out.write("                    <!-- Featured blog post-->\r\n");
      out.write("                    <div class=\"card mb-4\">\r\n");
      out.write("                        <a href=\"#!\"><img class=\"card-img-top\" src=\"https://dummyimage.com/850x350/dee2e6/6c757d.jpg\" alt=\"...\" /></a>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"small text-muted\">January 1, 2023</div>\r\n");
      out.write("                            <h2 class=\"card-title\">Featured Post Title</h2>\r\n");
      out.write("                            <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!</p>\r\n");
      out.write("                            <a class=\"btn btn-primary\" href=\"#!\">Read more →</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Nested row for non-featured blog posts-->\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <!-- Blog post-->\r\n");
      out.write("                            <div class=\"card mb-4\">\r\n");
      out.write("                                <a href=\"#!\"><img class=\"card-img-top\" src=\"https://dummyimage.com/700x350/dee2e6/6c757d.jpg\" alt=\"...\" /></a>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"small text-muted\">January 1, 2023</div>\r\n");
      out.write("                                    <h2 class=\"card-title h4\">Post Title</h2>\r\n");
      out.write("                                    <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla.</p>\r\n");
      out.write("                                    <a class=\"btn btn-primary\" href=\"#!\">Read more →</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Blog post-->\r\n");
      out.write("                            <div class=\"card mb-4\">\r\n");
      out.write("                                <a href=\"#!\"><img class=\"card-img-top\" src=\"https://dummyimage.com/700x350/dee2e6/6c757d.jpg\" alt=\"...\" /></a>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"small text-muted\">January 1, 2023</div>\r\n");
      out.write("                                    <h2 class=\"card-title h4\">Post Title</h2>\r\n");
      out.write("                                    <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla.</p>\r\n");
      out.write("                                    <a class=\"btn btn-primary\" href=\"#!\">Read more →</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <!-- Blog post-->\r\n");
      out.write("                            <div class=\"card mb-4\">\r\n");
      out.write("                                <a href=\"#!\"><img class=\"card-img-top\" src=\"https://dummyimage.com/700x350/dee2e6/6c757d.jpg\" alt=\"...\" /></a>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"small text-muted\">January 1, 2023</div>\r\n");
      out.write("                                    <h2 class=\"card-title h4\">Post Title</h2>\r\n");
      out.write("                                    <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla.</p>\r\n");
      out.write("                                    <a class=\"btn btn-primary\" href=\"#!\">Read more →</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Blog post-->\r\n");
      out.write("                            <div class=\"card mb-4\">\r\n");
      out.write("                                <a href=\"#!\"><img class=\"card-img-top\" src=\"https://dummyimage.com/700x350/dee2e6/6c757d.jpg\" alt=\"...\" /></a>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"small text-muted\">January 1, 2023</div>\r\n");
      out.write("                                    <h2 class=\"card-title h4\">Post Title</h2>\r\n");
      out.write("                                    <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam.</p>\r\n");
      out.write("                                    <a class=\"btn btn-primary\" href=\"#!\">Read more →</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Pagination-->\r\n");
      out.write("                    <nav aria-label=\"Pagination\">\r\n");
      out.write("                        <hr class=\"my-0\" />\r\n");
      out.write("                        <ul class=\"pagination justify-content-center my-4\">\r\n");
      out.write("                            <li class=\"page-item disabled\"><a class=\"page-link\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Newer</a></li>\r\n");
      out.write("                            <li class=\"page-item active\" aria-current=\"page\"><a class=\"page-link\" href=\"#!\">1</a></li>\r\n");
      out.write("                            <li class=\"page-item\"><a class=\"page-link\" href=\"#!\">2</a></li>\r\n");
      out.write("                            <li class=\"page-item\"><a class=\"page-link\" href=\"#!\">3</a></li>\r\n");
      out.write("                            <li class=\"page-item disabled\"><a class=\"page-link\" href=\"#!\">...</a></li>\r\n");
      out.write("                            <li class=\"page-item\"><a class=\"page-link\" href=\"#!\">15</a></li>\r\n");
      out.write("                            <li class=\"page-item\"><a class=\"page-link\" href=\"#!\">Older</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Side widgets-->\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <!-- Search widget-->\r\n");
      out.write("                    <div class=\"card mb-4\">\r\n");
      out.write("                        <div class=\"card-header\">Search</div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <input class=\"form-control\" type=\"text\" placeholder=\"Enter search term...\" aria-label=\"Enter search term...\" aria-describedby=\"button-search\" />\r\n");
      out.write("                                <button class=\"btn btn-primary\" id=\"button-search\" type=\"button\">Go!</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Categories widget-->\r\n");
      out.write("                    <div class=\"card mb-4\">\r\n");
      out.write("                        <div class=\"card-header\">Categories</div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <ul class=\"list-unstyled mb-0\">\r\n");
      out.write("                                        <li><a href=\"#!\">Web Design</a></li>\r\n");
      out.write("                                        <li><a href=\"#!\">HTML</a></li>\r\n");
      out.write("                                        <li><a href=\"#!\">Freebies</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <ul class=\"list-unstyled mb-0\">\r\n");
      out.write("                                        <li><a href=\"#!\">JavaScript</a></li>\r\n");
      out.write("                                        <li><a href=\"#!\">CSS</a></li>\r\n");
      out.write("                                        <li><a href=\"#!\">Tutorials</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Side widget-->\r\n");
      out.write("                    <div class=\"card mb-4\">\r\n");
      out.write("                        <div class=\"card-header\">Side Widget</div>\r\n");
      out.write("                        <div class=\"card-body\">You can put anything you want inside of these side widgets. They are easy to use, and feature the Bootstrap 5 card component!</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("</body>\r\n");
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
