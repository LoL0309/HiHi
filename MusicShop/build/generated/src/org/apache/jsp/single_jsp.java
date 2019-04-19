package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import get.BrandGet;
import model.Brand;
import get.CategoryGet;
import model.Category;
import get.ReviewGet;
import model.Review;
import model.Product;
import get.ProductGet;
import get.ProductGet;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HUTECH ACOUSTIC SHOP - THÔNG TIN ĐƠN PHẨM</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Classic Style Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/easyzoom.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/starability-all.min.css\">\n");
      out.write("\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<!-- cart -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<script src=\"js/formatmoney.js\"></script>\n");
      out.write("<!-- cart -->\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<!-- animation-effect -->\n");
      out.write("<link href=\"css/animate.min.css\" rel=\"stylesheet\"> \n");
      out.write("<script src=\"js/wow.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.priceformat.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write(" new WOW().init();\n");
      out.write("</script>\n");
      out.write("<!-- //animation-effect -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Cabin:400,500,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta property=\"fb:app_id\" content=\"Your_App_ID\"/>\n");
      out.write("<meta property=\"fb:admins\" content=\"User_ID\"/>\n");
      out.write("</head>\n");
      out.write("<div id=\"fb-root\"></div>\n");
      out.write("<script>(function(d, s, id) {\n");
      out.write("  var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("  if (d.getElementById(id)) return;\n");
      out.write("  js = d.createElement(s); js.id = id;\n");
      out.write("  js.src = \"//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.3&appId=Your_App_ID\";\n");
      out.write("  fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("}(document, 'script', 'facebook-jssdk'));\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta property=\"fb:app_id\" content=\"396733747363745\"/>\n");
      out.write("<meta property=\"fb:admins\" content=\"100002505084014\"/>\n");
      out.write("    </head>\n");
      out.write("    <div id=\"fb-root\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("<div id=\"fb-root\"></div>\n");
      out.write("<script>(function(d, s, id) {\n");
      out.write("  var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("  if (d.getElementById(id)) return;\n");
      out.write("  js = d.createElement(s); js.id = id;\n");
      out.write("  js.src = \"//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.8&appId=396733747363745\";\n");
      out.write("  fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("}(document, 'script', 'facebook-jssdk'));</script>\n");
      out.write("\n");

     ProductGet productGet = new ProductGet();
     BrandGet brandget = new BrandGet();
     Product product = new Product();
     String productID = "";
     if (request.getParameter("productID") != null) {
          productID = request.getParameter("productID");
          product = productGet.getProduct(Long.parseLong(productID));
     }
     ReviewGet reviewGet = new ReviewGet();
     long category_id = product.getCategoryID();
     Review review = new Review();
     CategoryGet categoryget = new CategoryGet();
     String category_id_1 = "1";
     DecimalFormat formatter = new DecimalFormat("###,###,###");
     
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"banner-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h2 class=\"animated wow fadeInLeft\" data-wow-delay=\".5s\">Đơn Phẩm</h2>\n");
      out.write("\t\t<h3 class=\"animated wow fadeInRight\" data-wow-delay=\".5s\"><a href=\"index.html\">Trang Chủ</a><label>/</label>Đơn Phẩm</h3>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("        \t\t<div class=\"product\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-3 product-bottom \">\n");
      out.write("\t\t\t<!--categories-->\n");
      out.write("\t\t\t<div class=\"categories animated wow fadeInUp animated\" data-wow-delay=\".5s\" >\n");
      out.write("\t\t\t\t\t<h3>Loại Sản Phẩm</h3>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<ul class=\"cate\">\n");
      out.write("                                            ");

                       for (Category c : categoryget.getListCategory()) {
                                              
      out.write("\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-menu-right\" ></i><a href=\"products.jsp?category=");
      out.print(c.getCategoryID());
      out.write('"');
      out.write('>');
      out.print(c.getCategoryName());
      out.write("</a></li>\t\n");
      out.write("\t\t\t\t\t ");
 } 
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                       \n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                      \n");
      out.write("\t\t<!--//menu-->\n");
      out.write("\t\t<!--price-->\n");
      out.write("\t\t\t\t<div class=\"price animated wow fadeInUp animated\" data-wow-delay=\".5s\" >\n");
      out.write("\t\t\t\t\t<h3>Khoảng Giá</h3>\n");
      out.write("\t\t\t\t\t<div class=\"price-head\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 price-head1\">\n");
      out.write("                                        <div class=\"price-top1\">\n");
      out.write("                                            <span class=\"price-top\">$</span>\n");
      out.write("                                            <input type=\"text\"  value=\"0\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-6 price-head2\">\n");
      out.write("                                        <div class=\"price-top1\">\n");
      out.write("                                            <span class=\"price-top\">$</span>\n");
      out.write("                                            <input type=\"text\"  value=\"500\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t<!--//price-->\n");
      out.write("\t\t\t<!--colors-->\n");
      out.write("\t\t\t<div class=\"colors animated wow fadeInLeft animated\" data-wow-delay=\".5s\" >\n");
      out.write("\t\t\t\t\t<h3>Màu Sắc</h3>\n");
      out.write("\n");
      out.write("                                        <div class=\"color-top\">\n");
      out.write("                                            <ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color1\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color2\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color3\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color4\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color5\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color6\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color7\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                 \n");
      out.write("\t\t\t<!--//colors-->\n");
      out.write("\t\t\t<div class=\"sellers animated wow fadeInDown\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"best\">Bán Chạy Nhất</h3>\n");
      out.write("\t\t\t\t\t<div class=\"product-head\">\n");
      out.write("                                            ");

                                for (Product p : productGet.getList3ProductByCategory(Long.parseLong(category_id_1))) {
                                
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"product-go\">\n");
      out.write("\t\t\t\t\t\t<div class=\" fashion-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><img class=\"img-responsive \" src=\"");
      out.print(p.getProductImageForward());
      out.write("\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\" fashion-grid1\">\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"best2\"><a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h6>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\" price-in1\">");
      out.print(formatter.format(p.getProductPrice()));
      out.write(" VNĐ</span>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" data-text=\"Thêm vào giỏ\" class=\"but-hover1 item_add\">Thêm vào giỏ</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                ");
 } 
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!---->\n");
      out.write(" \t</div>\n");
      out.write("\t\t\t<div class=\"col-md-9 animated wow fadeInRight\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\n");
      out.write("                            <div class=\"col-md-5 grid-im\">\n");
      out.write("                                \n");
      out.write("\t\t<div class=\"flexslider\">\n");
      out.write("\t\t\t   <ul class=\"slides\">\n");
      out.write("\t\t\t    <li data-thumb=\"");
      out.print(product.getProductImage());
      out.write("\">\n");
      out.write("\t\t\t        <div class=\"thumb-image\"> <img src=\"");
      out.print(product.getProductImage());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t    </li>\n");
      out.write("                            <li data-thumb=\"");
      out.print(product.getProductImageForward());
      out.write("\">\n");
      out.write("\t\t\t        <div class=\"thumb-image\"> <img src=\"");
      out.print(product.getProductImageForward());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t    </li>\n");
      out.write("                            <li data-thumb=\"");
      out.print(product.getProductImageBack());
      out.write("\">\n");
      out.write("\t\t\t        <div class=\"thumb-image\"> <img src=\"");
      out.print(product.getProductImageBack());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t    </li>\n");
      out.write("\t\t\t  </ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\n");
      out.write("                           \n");
      out.write("                            <div class=\"col-md-7 single-top-in\">\n");
      out.write("\t\t\t\t\t\t<div class=\"span_2_of_a1 simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t<h3>");
      out.print(product.getProductName());
      out.write("</h3>\n");
      out.write("                      \n");
      out.write("\t\t\t    <div class=\"price_single\">\n");
      out.write("                                \t<form>\n");
      out.write("                                    <fieldset class=\"starability-basic\">\n");
      out.write("                                    \n");
      out.write("                                    <input type=\"radio\" id=\"rate5\" name=\"rating\" value=\"5\" checked=\"checked\"/>\n");
      out.write("                                    <label for=\"rate5\" title=\"Amazing\">5 stars</label>\n");
      out.write("                                    <input type=\"radio\" id=\"rate4\" name=\"rating\" value=\"4\" />\n");
      out.write("                                    <label for=\"rate4\" title=\"Very good\">4 stars</label>\n");
      out.write("                                    <input type=\"radio\" id=\"rate3\" name=\"rating\" value=\"3\" />\n");
      out.write("                                    <label for=\"rate3\" title=\"Average\">3 stars</label>\n");
      out.write("                                     <input type=\"radio\" id=\"rate2\" name=\"rating\" value=\"2\" />\n");
      out.write("                                    <label for=\"rate2\" title=\"Not good\">2 stars</label>\n");
      out.write("                                    <input type=\"radio\" id=\"rate1\" name=\"rating\" value=\"1\" />\n");
      out.write("                                    <label for=\"rate1\" title=\"Terrible\">1 star</label>\n");
      out.write("                                    <h5>Nhấn vào <span><i class=\"glyphicon glyphicon-edit\" ></i> Đánh Giá</span> để đánh giá sản phẩm</h5>\n");
      out.write("                                    </fieldset>\n");
      out.write("                                    </form>\n");
      out.write("                                <br>\n");
      out.write("                                <span class=\"reducedfrom item_price\" >");
      out.print(formatter.format(product.getProductPrice()));
      out.write(" VNĐ</span>\n");
      out.write("\t\t\t\t <a href=\"CartServlet?command=plus&productID=");
      out.print(product.getProductID());
      out.write("\" data-text=\"Thêm vào giỏ\" class=\"but-hover1 item_add\">Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t   \n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t   <!----- tabs-box ---->\n");
      out.write("\t\t<div class=\"sap_tabs\">\t\n");
      out.write("\t\t\t\t     <div id=\"horizontalTab\" style=\"display: block; width: 100%; margin: 0px;\">\n");
      out.write("\t\t\t\t\t\t  <ul class=\"resp-tabs-list\">\n");
      out.write("\t\t\t\t\t\t  \t  <li class=\"resp-tab-item \" aria-controls=\"tab_item-0\" role=\"tab\"><span>Mô Tả Sản Phẩm</span></li>\n");
      out.write("\t\t\t\t\t\t\t  <li class=\"resp-tab-item\" aria-controls=\"tab_item-1\" role=\"tab\"><span><i class=\"glyphicon glyphicon-info-sign\" ></i> Thông Tin Chi Tiết</span></li>\n");
      out.write("\t\t\t\t\t\t\t  <li class=\"resp-tab-item\" aria-controls=\"tab_item-2\" role=\"tab\"><span><i class=\"glyphicon glyphicon-edit\" ></i> Đánh Giá</span></li>\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t  </ul>\t\t\t\t  \t \n");
      out.write("\t\t\t\t\t\t\t<div class=\"resp-tabs-container\">\n");
      out.write("\t\t\t\t\t\t\t    <h2 class=\"resp-accordion resp-tab-active\" role=\"tab\" aria-controls=\"tab_item-0\"><span class=\"resp-arrow\"></span>Mô Tả Sản Phẩm</h2><div class=\"tab-1 resp-tab-content resp-tab-content-active\" aria-labelledby=\"tab_item-0\" style=\"display:block\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"facts\">\n");
      out.write("\t\t\t\t\t\t\t\t\t  <p>");
      out.print(product.getProductDescription());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("                                                                                    <li><h4>ƯU ĐÃI KHÁCH HÀNG :</h4></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>Sản phẩm chính hãng</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>Khuyến mãi đặt biệt</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>GIAO HÀNG MIỄN PHÍ VỚI HÓA ĐƠN TRÊN 2.000.000 Đ</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>Vận chuyển nhanh</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>Bảo hành sản phẩm trọn đời</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>Hỗ trợ trực tuyến dành cho khách hàng VIP</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>         \n");
      out.write("\t\t\t\t\t\t\t        </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t    \t</div>\n");
      out.write("\t\t\t\t\t\t\t      <h2 class=\"resp-accordion\" role=\"tab\" aria-controls=\"tab_item-1\"><span class=\"resp-arrow\"></span>Additional Information</h2><div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"facts1\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"color\"><p>Màu sắc</p>\n");
      out.write("\t\t\t\t\t\t\t<span >Blue, Black, Red</span>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"color\">\n");
      out.write("\t\t\t\t\t\t\t<p>Kích thước</p>\n");
      out.write("\t\t\t\t\t\t\t<span >S, M, L, XL</span>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t        \n");
      out.write("\t\t\t </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t      <h2 class=\"resp-accordion\" role=\"tab\" aria-controls=\"tab_item-2\"><span class=\"resp-arrow\"></span>Reviews</h2><div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t <div class=\"comments-top-top\">\n");
      out.write("\t\t\t\t");

                                for (Review r : reviewGet.getListReviewByProduct(Long.parseLong(productID))) {
                                
      out.write("\n");
      out.write("                                                                             <div class=\"top-comment-left\">\n");
      out.write("\t\t\t\t\t<img class=\"img-responsive\" src=\"images/co.png\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"top-comment-right\">\n");
      out.write("\t\t\t\t\t<h6><a href=\"#\">");
      out.print(r.getReviewName());
      out.write("</a> - Đánh giá sản phẩm : ");
      out.print(r.getReviewStar());
      out.write("/5</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>");
      out.print(r.getReviewMessage());
      out.write("</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                <div class=\"clearfix\"> </div>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<a class=\"add-re\" href=\"review.jsp?command=insert&product_id=");
      out.print(product.getProductID());
      out.write("\"><i class=\"glyphicon glyphicon-comment\" ></i> Viết Đánh Giá</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t <script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t    <script type=\"text/javascript\">\n");
      out.write("\t\t\t    $(document).ready(function () {\n");
      out.write("\t\t\t        $('#horizontalTab').easyResponsiveTabs({\n");
      out.write("\t\t\t            type: 'default', //Types: default, vertical, accordion           \n");
      out.write("\t\t\t            width: 'auto', //auto or any width like 600px\n");
      out.write("\t\t\t            fit: true   // 100% fit in a container\n");
      out.write("\t\t\t        });\n");
      out.write("\t\t\t    });\n");
      out.write("\t\t\t   </script>\t\n");
      out.write("<!---->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("</div>\n");
      out.write(" <div class='fb-comments' data-num-posts='5' data-width='100%' expr:href='data:post.canonicalUrl'/></div>\n");
      out.write("<!----->\n");
      out.write("<div class=\"clearfix\"> </div>\n");
      out.write("<div class=\"page-header\">\n");
      out.write("        <h3>SẢN PHẨM LIÊN QUAN</h3>\n");
      out.write("      </div>\n");
      out.write("<div class=\" col-md-si\">\n");
      out.write("     ");

                                for (Product p : productGet.getListProductRelated(category_id, Long.parseLong(productID))) {
                                
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5 item-grid simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                   \n");
      out.write("                                                    <div class=\"grid-pro\">\n");
      out.write("\t\t\t\t\t\t\t\t<div  class=\" grid-product \" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure>\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"grid-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img  src=\"");
      out.print(p.getProductImageBack());
      out.write("\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"grid-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img  src=\"");
      out.print(p.getProductImageForward());
      out.write("\" class=\"img-responsive\"  alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</figure>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"women\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/ll.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6><a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p ><em class=\"item_price\">");
      out.print(formatter.format(p.getProductPrice()));
      out.write(" VNĐ</em></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" data-text=\"Thêm vào giỏ\" class=\"but-hover1 item_add\">Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                                                </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t</div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        <div class=\"social animated wow fadeInUp\" data-wow-delay=\".1s\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">FACEBOOK</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">TWITTER</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">GOOGLE+</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">PINTEREST</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\t\t\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <script src=\"js/imagezoom.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Can also be used with $(document).ready()\n");
      out.write("$(window).load(function() {\n");
      out.write("  $('.flexslider').flexslider({\n");
      out.write("    animation: \"slide\",\n");
      out.write("    controlNav: \"thumbnails\"\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
