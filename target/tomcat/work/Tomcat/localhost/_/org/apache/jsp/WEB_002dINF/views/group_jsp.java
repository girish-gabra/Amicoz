/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-04-28 19:04:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class group_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Amicoz</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("  <script src=\"js/dropdown.js\"></script>\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("  <script src=\"js/form.js\"></script>\r\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=PT+Sans' rel='stylesheet' type='text/css'>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("<!--     <a href=\"/index\"><div id=\"logo\">Amicoz</div></a> -->\r\n");
      out.write("<a href=\"/frontPage\"><div id=\"logo\">Amicoz</div></a>\r\n");
      out.write("    <div id=\"user\">\r\n");
      out.write("      <div id=\"img\"></div>\r\n");
      out.write("      <div class=\"dropdown\">\r\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"dropbtn\" onclick=\"dropLink()\">\r\n");
      out.write("          <img src=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s_imgsrc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" class=\"userpic\" />\r\n");
      out.write("          ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s_fullname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("        <div class=\"dropdown-content\" id=\"profiledrop\">\r\n");
      out.write("          <a href=\"/profile?userid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s_userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">My Profile</a>\r\n");
      out.write("          <a href=\"/profile_settings\">Settings</a>\r\n");
      out.write("          <a href=\"/logout\" class=\"logout\">Logout</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div id=\"search\">\r\n");
      out.write("\t\t<input type=\"text\" class=\"searchbox\"\r\n");
      out.write("\t\t\tplaceholder=\"Search.. ( [firstname] [lastname] ) ex. John Smith\"\r\n");
      out.write("\t\t\tmaxlength=\"32\"></input>\r\n");
      out.write("\t</div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"groupbar\">\r\n");
      out.write("\t\t\t<div id=\"groupinformation\">\r\n");
      out.write("\t\t\t\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${groupName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t\t\t\t<div class=\"bio\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${groupDescription}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t<p id=\"admin\"></p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"box\" class=\"profileposts\">\r\n");
      out.write("\t\t\t<div class=\"title\">Group Members</div>\r\n");
      out.write("\t\t\t<ul id=\"members\" class=\"friends\">\r\n");
      out.write("<!--\t\t\t\t<li><a href=\"#\"><img src=\"imgs/profilepic.jpg\" class=\"userpic\" />Anand Karandikar</a></li>-->\r\n");
      out.write("<!--\t\t\t\t<li><a href=\"#\"><img src=\"imgs/profilepic.jpg\" class=\"userpic\" />Girish Gabra</a></li>-->\r\n");
      out.write("<!--\t\t\t\t<li><a href=\"#\"><img src=\"imgs/profilepic.jpg\" class=\"userpic\" />Rohan Ingle</a></li>-->\r\n");
      out.write("<!--\t\t\t\t<li><a href=\"#\"><img src=\"imgs/profilepic.jpg\" class=\"userpic\" />Yueyang Wu</a></li>-->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"box\" class=\"profileposts\">\r\n");
      out.write("\t\t\t<div class=\"title\">Write a post</div>\r\n");
      out.write("\t\t\t<textarea class=\"statusbox\" id=\"grouppostbox\" placeholder=\"Post something on the group page!\"></textarea>\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"statusbutton\" id=\"grouppostbutton\">Post</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"box\" class=\"profileposts\">\r\n");
      out.write("\t\t\t<div class=\"title\" style=\"margin-bottom: 5px;\">Group Timeline</div>\r\n");
      out.write("\t\t\t<ul id=\"timelineposts\" class=\"timelineposts\">\r\n");
      out.write("<!--\t\t\t\t<li>-->\r\n");
      out.write("<!--\t\t\t\t\t<div class=\"userinfo\">-->\r\n");
      out.write("<!--\t\t\t\t\t\t<img src=\"imgs/profilepic.jpg\" class=\"profilepic\" /> <span class=\"username\"><a href=\"#profilelink\">Munir Safi</a></span><br/><span class=\"datetime\">April 12, 2016</span><br/><span class=\"datetime\">7:35PM</span>-->\r\n");
      out.write("<!--\t\t\t\t\t</div>-->\r\n");
      out.write("<!--\t\t\t\t\t<div class=\"post\">-->\r\n");
      out.write("<!--\t\t\t\t\t\tLorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nunc libero, euismod eget nibh et, elementum efficitur libero. Fusce egestas imperdiet arcu, nec maximus turpis ornare at. Morbi porttitor nulla nisi, eu pretium elit ullamcorper pretium. <p>Aenean quis risus a turpis sagittis euismod sed quis mauris. Sed et faucibus quam. Sed eget risus turpis. Nullam sit amet neque gravida libero feugiat sagittis eu congue est. Donec a mauris rutrum, gravida ante non, egestas lacus. Nam lorem ex, pulvinar nec eros a, placerat ullamcorper diam.</p>-->\r\n");
      out.write("<!--\t\t\t\t\t</div>-->\r\n");
      out.write("<!--\t\t\t\t\t<div class=\"likebar\">-->\r\n");
      out.write("<!--\t\t\t\t\t\t<a href=\"#likes\">10 likes <img src=\"imgs/like.png\"/ class=\"like\"></a>-->\r\n");
      out.write("<!--\t\t\t\t\t\t<a href=\"#dislikes\">2 dislikes <img src=\"imgs/dislike.png\"/ class=\"like\"></a>-->\r\n");
      out.write("<!--\t\t\t\t\t</div>-->\r\n");
      out.write("<!--\t\t\t\t\t<ul class=\"comments\">-->\r\n");
      out.write("<!--\t\t\t\t\t\t<li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t<img src=\"imgs/profilepic.jpg\" class=\"friendcommentpic\" />-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t<div class=\"usercomment\">Etiam aliquam ligula pharetra ligula luctus, nec consectetur turpis ornare. Morbi at leo ornare, luctus odio eget, eleifend lorem. Mauris auctor vestibulum varius. Quisque commodo sollicitudin purus pulvinar interdum.</div>-->\r\n");
      out.write("<!--\t\t\t\t\t\t</li>-->\r\n");
      out.write("<!--\t\t\t\t\t</ul>-->\r\n");
      out.write("<!--\t\t\t\t\t<img src=\"imgs/profilepic.jpg\" class=\"mycommentpic\" /><textarea class=\"commentbox\" placeholder=\"Say something!\"></textarea>-->\r\n");
      out.write("<!--\t\t\t\t</li>-->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\tvar uid = 1; //");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s_userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar gid = 1; //");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s_groupid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\tvar admin = JSON.parse('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${groupAdmin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t\tconsole.log(admin.userId);\r\n");
      out.write("\t\t\tconsole.log(admin.firstName);\r\n");
      out.write("\t\t\t$(\"#admin\").append(admin.firstName);\r\n");
      out.write("\t\t\tvar members = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${groupMembers}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\tconsole.log(\"members: \" + members);\r\n");
      out.write("\t\t\t$.each(members,function(index,data){\r\n");
      out.write("\t\t\t\tvar fullName = data.firstName + \" \" + data.lastName;\r\n");
      out.write("\t\t\t\t$(\"#members\").append(\"<li><a href='profile?userid=\"+data.userId+\"'> <img src=\"+data.profilePicUrl+\" class='userpic' />\" + fullName + \"</a></li>\");\r\n");
      out.write("\t\t\t\tconsole.log(\"member ka user id\" + data.userId);\r\n");
      out.write("\t\t\t\tconsole.log(data.firstName);\r\n");
      out.write("\t\t\t\tconsole.log(data.lastName);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t);\t\r\n");
      out.write("\t\t\tconsole.log(\"admin: \" + admin);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar posts = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${groupPosts}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\tconsole.log(\"posts: \" + posts);\r\n");
      out.write("\t\t\t$.each(posts,function(index,data){\r\n");
      out.write("\t\t\t\tvar pid = data.postID;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar userInfo = '<div class=\"userinfo\"><img src=\"'+data.profilePicUrl+'\" class=\"profilepic\" /> <span class=\"username\"><a href=\"profile?userid='+data.userID+'\">'+data.userName+'</a></span><br/><span class=\"datetime\">'+data.time+'</span><br/></div>';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar postContent = '<div class=\"post\">'+data.postText+'</div>';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar likesDislikes = '<div class=\"likebar\" hidden><a href=\"#likes\">'+data.likeCount+'<img src=\"imgs/like.png\"/ class=\"like\"></a><a href=\"#dislikes\">'+data.dislikeCount+'<img src=\"imgs/dislike.png\"/ class=\"like\"></a></div>';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tconsole.log(\"posts id\" + data.postID);\r\n");
      out.write("\t\t\t\tconsole.log(\"posts by: \"+data.userName);\r\n");
      out.write("\t\t\t\tconsole.log(\"post time: \"+data.time);\r\n");
      out.write("\t\t\t\tvar comments = data.comments;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar commentsList = \"<ul id='comments\"+data.postID+\"' class='comments'>\";\r\n");
      out.write("\t\t\t\t$.each(comments,function(index2,data2){\r\n");
      out.write("\t\t\t\t\tcommentsList += '<li><img src=\"'+data2.profilePicUrl+'\" class=\"friendcommentpic\" /> <span class=\"username\"><a href=\"profile/'+data.userId+'\">'+data.userName+'</a></span><div class=\"usercomment\">'+data2.comment+'</div></li>';\r\n");
      out.write("\t\t\t\t\tconsole.log(\"comment id\"+data2.commentId);\r\n");
      out.write("\t\t\t\t\tconsole.log(\"comment\"+data2.comment);\r\n");
      out.write("\t\t\t\t\tconsole.log(\"timestamp\"+data2.timeStamp);\r\n");
      out.write("\t\t\t\t\tconsole.log(\"username\"+data2.userName);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tcommentsList += \"</ul>\";\r\n");
      out.write("\t\t\t\tcommentsList += '<img src=\"https://www.accrinet.com/clientuploads/authorship_profile.jpg\" class=\"mycommentpic\" /><textarea id=\"commentbox\" class=\"commentbox\" placeholder=\"Say something!\"></textarea>';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#timelineposts\").append(userInfo+postContent+likesDislikes+commentsList);\r\n");
      out.write("\t\t\t\t\t\t\t\t$('.commentbox').keypress(function (e) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar comment = $(this).val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\tconsole.log(\"keypress\");\r\n");
      out.write("\t\t\t\t\t\t\t\t    if (e.which == 13) {\r\n");
      out.write("\t\t\t\t\t\t\t\t      if (comment.length < 1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t        alert(\"Your comment must have at least 1 character in order to be valid!\");\r\n");
      out.write("\t\t\t\t\t\t\t\t      } else if (comment.length > 250) {\r\n");
      out.write("\t\t\t\t\t\t\t\t        alert(\"Your comment cannot exceed 250 characters!\");\r\n");
      out.write("\t\t\t\t\t\t\t\t      } else {\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t   comment = $(this).val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   console.log(comment);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t    \t  $.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t  \t\r\n");
      out.write("\t\t\t\t\t\t\t\t \t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        url:\"/commentSave\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        dataType: \"json\", \t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        data : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\"userId\" :  uid,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\"comment\" : comment,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\"postId\" : pid\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        },\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsuccess: function(data3){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"commentSave returns :\"+data3);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//window.location.href = \"/group.jsp\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//alert(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//$(\"#success_message\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"data.userid\"+data.userID);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif(data3==1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#comments\"+data.postID).append('<li><img src=\"\" class=\"friendcommentpic\" /> <span class=\"username\"><a href=\"profile?userid='+data.userId+'\">'+data.userName+'</a></span><div class=\"usercomment\">' + comment + '</div></li>');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"in else\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  });\r\n");
      out.write("\t\t\t\t\t\t\t    \t \r\n");
      out.write("\t\t\t\t\t\t\t       \r\n");
      out.write("\t\t\t\t\t\t\t        //alert($(this).parent().parent().get(0).tagName + \" \" + $(this).parent().parent().attr('class'));\r\n");
      out.write("\t\t\t\t\t\t\t        // Returns successful data submission message when the entered information is stored in database.\r\n");
      out.write("\t\t\t\t\t\t\t        console.log(\"In comment enter\");\r\n");
      out.write("\t\t\t\t\t\t\t    \t   \r\n");
      out.write("\t\t\t\t\t\t\t      }\r\n");
      out.write("\t\t\t\t\t\t\t      return false;    //<---- Add this line\r\n");
      out.write("\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t  });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#grouppostbutton\").click(function(e) {\r\n");
      out.write("\t\t\t    e.preventDefault()\r\n");
      out.write("\t\t\t    var grouppost = $(\"#grouppostbox\").val();\r\n");
      out.write("\t\t\t    if (grouppost == '') {\r\n");
      out.write("\t\t\t      alert(\"Your post must have at least 1 character in order to be valid!\");\r\n");
      out.write("\t\t\t    } else {\r\n");
      out.write("\t\t\t      // Returns successful data submission message when the entered information is stored in database.\r\n");
      out.write("\t\t\t    \t$.ajax({\r\n");
      out.write("\t\t\t    \t  \t\r\n");
      out.write("\t\t\t \t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\t\t        url:\"postSave\",\r\n");
      out.write("\t\t\t\t        dataType: \"json\", \t\r\n");
      out.write("\t\t\t\t        data : {\r\n");
      out.write("\t\t\t\t        \t\"userID\" :  uid,\r\n");
      out.write("\t\t\t\t        \t\"postText\" : grouppost\r\n");
      out.write("\t\t\t\t        \t//\"groupId\" : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s_groupid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t        \t\r\n");
      out.write("\t\t\t\t        },\t\r\n");
      out.write("\t\t\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(\"postSave returns :\"+data);\r\n");
      out.write("\t\t\t\t\t\t\t//window.location.href = \"/group.jsp\";\r\n");
      out.write("\t\t\t\t\t\t\t//alert(data);\r\n");
      out.write("\t\t\t\t\t\t\t//$(\"#success_message\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\tif(data == 1){\r\n");
      out.write("\t\t\t\t\t\t\t\tlocation.reload();\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\t\t\t\tconsole.log(\"failed saving the post\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t      }\r\n");
      out.write("\t\t\t  });\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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