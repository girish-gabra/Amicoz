/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-04-28 09:51:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Amicoz</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/dropdown.js\"></script>\r\n");
      out.write("<script src=\"js/searchbox.js\"></script>\r\n");
      out.write("<!-- <script src=\"js/tooltip.js\"></script> -->\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=PT+Sans'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("<!-- \t\t<a href=\"/index\"><div id=\"logo\">Amicoz</div></a> -->\r\n");
      out.write("<a href=\"/frontPage\"><div id=\"logo\">Amicoz</div></a>\r\n");
      out.write("\t\t<div id=\"user\">\r\n");
      out.write("\t\t\t<div id=\"img\"></div>\r\n");
      out.write("\t\t\t<div class=\"dropdown\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0)\" class=\"dropbtn\" onclick=\"dropLink()\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s_imgsrc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"userpic\" /> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s_fullname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown-content\" id=\"profiledrop\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/profile?userid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s_userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">My Profile</a> <a\r\n");
      out.write("\t\t\t\t\t\thref=\"/profile_settings\">Settings</a> <a href=\"/logout\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"logout\">Logout</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"search\">\r\n");
      out.write("\t\t\t<input type=\"text\" class=\"searchbox\"\r\n");
      out.write("\t\t\t\tplaceholder=\"Search.. ( [firstname] [lastname] ) ex. John Smith\"\r\n");
      out.write("\t\t\t\tmaxlength=\"32\"></input>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"left\">\r\n");
      out.write("\t\t\t<div id=\"box\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\tGroups<input type=\"submit\" class='add' onclick=\"createGroup() \"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"Create new.\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul id=\"glist\">\r\n");
      out.write("\t\t\t\t\t<!--           <li><a href=\"#\">B465 Group</a></li>\r\n");
      out.write("          <li><a href=\"#\">Computer Science is awesome!</a></li>\r\n");
      out.write("          <li><a href=\"#\">Java tutorials</a></li>\r\n");
      out.write("          <li><a href=\"#\">Indiana University</a></li>\r\n");
      out.write("          <li><a href=\"#\">Best Tech Gadgets</a></li>\r\n");
      out.write("          <li><a href=\"#\">Tesla</a></li>\r\n");
      out.write("          <li><a href=\"#\">Web Developers Unite</a></li> -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"box\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">Friend Suggestions</div>\r\n");
      out.write("\t\t\t\t<ul class=\"friends\" id=\"friendSuggestionsList\">\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"right\">\r\n");
      out.write("\t\t\t<div id=\"box\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\tMy Friends <b>|</b> Chat\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"friends\" id=\"friendsList\">\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"box\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">Pending Requests</div>\r\n");
      out.write("\t\t\t\t<ul class=\"friends\" id=\"pendingReqFromFriendsList\">\r\n");
      out.write("\t\t\t\t\t<!--  <li ><a href=\"#\"><img src='<c:url value='/resources/images/profilepic.jpg'/>' class='userpic' />Elon Musk1</a><a href=\"#\"><div class=\"add\">Add Friend</div></a></li>-->\r\n");
      out.write("\t\t\t\t\t<!--  <li ><a href=\"#\"><img src='<c:url value='/resources/images/profilepic.jpg'/>' class='userpic' />Elon Musk2</a><a href=\"#\"><div class=\"add\">Add Friend</div></a></li> -->\r\n");
      out.write("\t\t\t\t\t<!-- <li><a href=\"#\"><img src=\"<c:url value=\"/resources/images/profilepic.jpg\"/>\" class=\"userpic\" />Bill Gates</a><a href=\"#\"><div class=\"add\">Add Friend</div></a></li>\r\n");
      out.write("          <li><a href=\"#\"><img src=\"<c:url value=\"/resources/images/profilepic.jpg\"/>\" class=\"userpic\" />Tim Cook</a><a href=\"#\"><div class=\"add\">Add Friend</div></a></li>\r\n");
      out.write("          <li><a href=\"#\"><img src=\"<c:url value=\"/resources/images/profilepic.jpg\"/>\" class=\"userpic\" />Mark Zuckerberg</a><a href=\"#\"><div class=\"add\">Add Friend</div></a></li>\r\n");
      out.write("          <li><a href=\"#\"><img src=\"<c:url value=\"/resources/images/profilepic.jpg\"/>\" class=\"userpic\" />Jack Dorsey</a><a href=\"#\"><div class=\"add\">Add Friend</div></a></li> -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"center\">\r\n");
      out.write("\t\t\t<div id=\"box\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">Update Status</div>\r\n");
      out.write("\t\t\t\t<textarea class=\"statusbox\" placeholder=\"What's on your mind?\" id=\"postText\"></textarea>\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"statusbutton\" id=\"statusSubmit\">Post</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"box\">\r\n");
      out.write("\t\t\t\t<div class=\"title\" style=\"margin-bottom: 5px;\">Timeline</div>\r\n");
      out.write("\t\t\t\t<ul class=\"timelineposts\" id=\"timelineposts\">\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document)\r\n");
      out.write("\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"this is the script.\");\r\n");
      out.write("\t\t\t\t\t\tvar list = JSON.parse('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${groups}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t\t\t\t\t//console.log(\"listobject: \"+ list);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$.each(list, function(index, data) {\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log('inside function');\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(data.groupId);\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#glist\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\"<li><a href='group?groupid=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ data.groupId + \"' >\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ data.groupName + \"</a></li>\");\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t//console.log(listarr[0] +\" \"+ listarr[1] +\" \"+ listarr[2]);\r\n");
      out.write("\t\t\t\t\t\tvar fglist = JSON.parse('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${friendSuggestion}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t\t\t\t\t//console.log(\"end\");\r\n");
      out.write("\t\t\t\t\t\t//\"'><img src=\"+\"'<c:url value='/resources/images/profilepic.jpg\"+\"'/>' class='userpic' />\"\r\n");
      out.write("\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t.each(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfglist,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(index, data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"these are suggestions \"+data.userId);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//console.log(data.userId);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#friendSuggestionsList\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"<li><a href='profile?userid=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.userId\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"'><img src=\"+data.profilePicUrl+\" class='userpic' />\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.firstName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.lastName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</a>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<input type = submit value='Add Friend' class='add' style = 'cursor:pointer;' id = 'friendButton' onclick = 'manageFriend(\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.userId\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \",\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ index\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \")'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar pendingList = JSON\r\n");
      out.write("\t\t\t\t\t\t\t\t.parse('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pendingReqFromFriends}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t.each(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpendingList,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(index, data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(data.userId);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#pendingReqFromFriendsList\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"<li><a href='profile?userid=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.userId\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"'><img src=\"+data.profilePicUrl+\" class='userpic' />\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.firstName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.lastName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</a>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<input type = submit value='Confirm Friend' class='add' style = 'margin-top:5px; cursor:pointer;' id = 'friendButton' onclick = 'manageFriend(\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.userId\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \",\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ index\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \")'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar friendsList = JSON.parse('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${friends}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t.each(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfriendsList,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(index, data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(data.userId);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#friendsList\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"<li><a href='profile?userid=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.userId\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"'><img src=\"+data.profilePicUrl+\" class='userpic' />\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.firstName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.lastName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</a><a href='chat?withid=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.userId\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"&withname=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.firstName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"'>[Chat]</a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction manageFriend(user, liId) {\r\n");
      out.write("\r\n");
      out.write("\t\t//alert(\"inside manageFriend\");\r\n");
      out.write("\t\t//alert(\"data: \"+user);\r\n");
      out.write("\t\t//alert(\"list id\"+ liId);\r\n");
      out.write("\t\tvar buttonValue = document.getElementById(\"friendButton\").value;\r\n");
      out.write("\t\t//alert(buttonValue);\r\n");
      out.write("\t\tconsole.log('inside addFriend');\r\n");
      out.write("\t\tconsole.log(buttonValue);\r\n");
      out.write("\t\t//alert(\"inside addFriend\");\r\n");
      out.write("\t\tif (buttonValue == 'Add Friend') {\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\t\turl : 'addFriend',\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\tuser : user\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess : function(data1) {\r\n");
      out.write("\t\t\t\t\tif (data1 != \"-1\") {\r\n");
      out.write("\t\t\t\t\t\tconsole.log('inside if success');\r\n");
      out.write("\t\t\t\t\t\t$('#friendButton').prop('value',\r\n");
      out.write("\t\t\t\t\t\t\t\t'Cancel Friend Request');\r\n");
      out.write("\t\t\t\t\t\t// $('#blockButton').hide();\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"remove list with id:\" + liId);\r\n");
      out.write("\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\"#friendSuggestionsList li:nth-child(\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ (liId + 1) + \")\").remove();\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t//$(\"#friendSuggestionsList li:nth-child(\"+ (liId + 1) + \")\").remove();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif (buttonValue == 'Confirm Friend') {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\t\turl : '/confirmFriend',\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\tuser : user\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\t//alert(\"success\");\r\n");
      out.write("\t\t\t\t\tif (data != \"-1\") {\r\n");
      out.write("\t\t\t\t\t\tconsole.log('inside if success');\r\n");
      out.write("\t\t\t\t\t\t$('#friendButton').prop('value', 'Friends');\r\n");
      out.write("\t\t\t\t\t\t// $('#blockButton').show();\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t'#pendingReqFromFriendsList li:nth-child('\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ (liId + 1) + ')').remove();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction createGroup() {\r\n");
      out.write("\t\tconsole.log('inside create group');\r\n");
      out.write("\t\tvar user = '1'\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\turl : 'groupcreate',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"User\" : user\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tif (data == 1) {\r\n");
      out.write("\t\t\t\t\tconsole.log('in success');\r\n");
      out.write("\t\t\t\t\twindow.location.href = 'groupcreate';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script> \r\n");
      out.write("\r\n");
      out.write("\t$(\"#statusSubmit\")\r\n");
      out.write("\t\t\t.click(\r\n");
      out.write("\t\t\t\t\tfunction(e) {\r\n");
      out.write("\t\t\t\t\t\te.preventDefault()\r\n");
      out.write("\t\t\t\t\t\tvar posttext = $(\"#postText\").val();\r\n");
      out.write("\t\t\t\t\t\tif (posttext.length < 1) {\r\n");
      out.write("\t\t\t\t\t\t\talert(\"Please make sure your post is at least 1 characters.\");\r\n");
      out.write("\t\t\t\t\t\t} else if (posttext.length > 500) {\r\n");
      out.write("\t\t\t\t\t\t\talert(\"Your post cannot exceed 500 characters!\");\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\talert(posttext)\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(posttext);\r\n");
      out.write("\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\turl : \"postSave\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"postText\" : posttext\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.log(\"Post successfully saved!!! :\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\".statusbox\").val('');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"<p>Your comment was successfully added to your profile!</p>\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.insertAfter(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"button#statussubmit\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.delay(5000)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.fadeOut('slow');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//window.location.href = \"/group.jsp\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//alert(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//$(\"#success_message\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//location.reload();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t// Returns successful data submission message when the entered information is stored in database.\r\n");
      out.write("\t\t\t\t\t\t\t/*$.post(\"/includes/passwordreset.inc.php\", {\r\n");
      out.write("\t\t\t\t\t\t\t  postText: posttext,\r\n");
      out.write("\t\t\t\t\t\t\t}, function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t  $('h1').empty().html('Settings Successfully Updated!<br/><br/>');\r\n");
      out.write("\t\t\t\t\t\t\t  window.setTimeout(function() {\r\n");
      out.write("\t\t\t\t\t\t\t    window.location.href = '/settings/';\r\n");
      out.write("\t\t\t\t\t\t\t  }, 10000);\r\n");
      out.write("\t\t\t\t\t\t\t  $('#settings').hide();\r\n");
      out.write("\t\t\t\t\t\t\t});*/\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$('#likeButton').click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar postid = 1;\r\n");
      out.write("\t\tvar liketype = 'L';\r\n");
      out.write("\t\talert(postid);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\turl : 'updateLike',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"postID\" : postid,\r\n");
      out.write("\t\t\t\t\"Liketype\" : liketype\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess : function(data1) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//console.log(data1);\r\n");
      out.write("\t\t\t\t//alert(\"success\");\r\n");
      out.write("\t\t\t\tif (data1 != \"-1\") {\r\n");
      out.write("\t\t\t\t\tconsole.log('inside if success');\r\n");
      out.write("\t\t\t\t\t//$('#friendButton').prop('value','Add Friend');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t$('#disLikeButton').click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar postid = 1;\r\n");
      out.write("\t\tvar liketype = 'D';\r\n");
      out.write("\t\talert(postid);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\turl : 'updateLike',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"postID\" : postid,\r\n");
      out.write("\t\t\t\t\"Liketype\" : liketype\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess : function(data1) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//console.log(data1);\r\n");
      out.write("\t\t\t\t//alert(\"success\");\r\n");
      out.write("\t\t\t\tif (data1 != \"-1\") {\r\n");
      out.write("\t\t\t\t\tconsole.log('inside if success');\r\n");
      out.write("\t\t\t\t\t///$('#friendButton').prop('value','Add Friend');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tvar posts = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${friendsPosts}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("/* \tif(posts.length == 0)\r\n");
      out.write("\t\treturn \r\n");
      out.write("\telse */\r\n");
      out.write("\t\t$.each(posts, function(index, data) {\r\n");
      out.write("\t\t\t\t\t\tvar pid = data.postID;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar userInfo = '<div class=\"userinfo\"><img src=\"'+data.profilePicUrl+'\" class=\"profilepic\" /> <span class=\"username\"><a href=\"profile?userid='+data.userID+'\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ data.userName\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '</a></span><br/><span class=\"datetime\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ data.time + '</span><br/></div>';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar postContent = '<div class=\"post\">' + data.postText\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '</div>';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar likesDislikes = '<div class=\"likebar\" hidden><input id = \"likeButton\" type = \"image\" src=\"imgs/like.png\"><a href=\"#dislikes\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ data.dislikeCount\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<img src=\"imgs/dislike.png\"/ class=\"like\"></a></div>';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"posts id\" + data.postID);\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"posts by: \" + data.userName);\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"post time: \" + data.time);\r\n");
      out.write("\t\t\t\t\t\tvar commentsList = \"<ul id='comments\"+data.postID+\"' class='comments'>\";\r\n");
      out.write("\t\t\t\t\t\tif(typeof data.comments !== 'undefined') {\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar comments = data.comments;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.each(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcomments,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction(index2, data2) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcommentsList += '<li><img src=\"'+data2.profilePicURL+'\" class=\"friendcommentpic\" /> <span class=\"username\"><a href=\"profile/'+data.userId+'\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.userName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</a></span><div class=\"usercomment\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data2.comment\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</div></li>';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"comment id\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data2.commentId);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"comment\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data2.comment);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"timestamp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data2.timeStamp);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"username\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data2.userName);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tcommentsList += \"</ul>\";\r\n");
      out.write("\t\t\t\t\t\tcommentsList += '<img src=\"https://www.accrinet.com/clientuploads/authorship_profile.jpg\" class=\"mycommentpic\" /><textarea id=\"commentbox\" class=\"commentbox\" placeholder=\"Say something!\"></textarea>';\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"user info------\"+userInfo);\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"Post content----\"+postContent);\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"Likes----\"+likesDislikes);\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"comments-----\"+commentsList);\r\n");
      out.write("\t\t\t\t\t\t$(\"#timelineposts\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\tuserInfo + postContent + likesDislikes\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ commentsList);\r\n");
      out.write("\t\t\t\t\t\t$('.commentbox')\r\n");
      out.write("\t\t\t\t\t\t\t\t.keypress(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(e) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar comment = $(this).val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"keypress\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (e.which == 13) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif (comment.length < 1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"Your comment must have at least 1 character in order to be valid!\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} else if (comment.length > 250) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"Your comment cannot exceed 250 characters!\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcomment = $(this).val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(comment);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.ajax({\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\turl : \"/commentSave\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"userId\" : uid,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"comment\" : comment,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"postId\" : pid\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsuccess : function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata3) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tconsole\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.log(\"commentSave returns :\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data3);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t//window.location.href = \"/group.jsp\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t//alert(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t//$(\"#success_message\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (data3 == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#comments\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.postID)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'<li><img src=\"\" class=\"friendcommentpic\" /> <span class=\"username\"><a href=\"profile/'+data.userId+'\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.userName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</a></span><div class=\"usercomment\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ comment\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</div></li>');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tconsole\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.log(\"in else\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//alert($(this).parent().parent().get(0).tagName + \" \" + $(this).parent().parent().attr('class'));\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t// Returns successful data submission message when the entered information is stored in database.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tconsole\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.log(\"In comment enter\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\treturn false; //<---- Add this line\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
