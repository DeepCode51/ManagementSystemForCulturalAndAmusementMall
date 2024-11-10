<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>文玩商城</title>
  <link href="images/css/bootstrap-theme.css" rel="stylesheet">
  <link href="images/css/elegant-icons-style.css" rel="stylesheet" />
  <link href="images/css/style.css" rel="stylesheet">
</head>
<body>
  <section id="container" class="">
    <header class="header dark-bg">
      <div class="toggle-nav">
        <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
      </div>
      <a href="index.do" class="logo">文玩商城 </a>
      <div class="nav search-row" id="top_menu">
        <ul class="nav top-menu">
          <li></li>
        </ul>
      </div>
      <div class="top-nav notification-row">
        <ul class="nav pull-right top-menu">
          <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="images/img/avatar1_small.jpg"></span>
                            <span class="username">当前用户：${sessionScope.username}（${sessionScope.cx}）</span>
                            <b class="caret"></b></a>
            <ul class="dropdown-menu extended logout">
              <div class="log-arrow-up"></div>
              <li class="eborder-top">
                <a href="sy/sy.jsp"><i class="icon_profile"></i>主页</a></li>
              <li>
                <a href="logout.jsp" target="_parent"><i class="icon_mail_alt"></i> 退出</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </header>
    <aside>
      <div id="sidebar" class="nav-collapse ">
        <ul class="sidebar-menu">
   <%
if (request.getSession().getAttribute("cx").equals("超级管理员") || request.getSession().getAttribute("cx").equals("普通管理员")){%><jsp:include page="left_guanliyuan.jsp"></jsp:include><%}if (request.getSession().getAttribute("cx").equals("买家")){%><jsp:include page="left_maijia.jsp"></jsp:include><%}
%>
        </ul>
      </div>
    </aside>
    <section id="main-content">
       <iframe frameborder="1" style="margin-top: 0px; " width="100%"  id="hsgmain" name="hsgmain" src="sy/sy.jsp"></iframe>
      <div class="text-right"></div>
    </section>
  </section>
  <script src="images/js/jquery.js"></script>
  <script src="images/js/bootstrap.min.js"></script>
  <script src="images/js/jquery.nicescroll.js" type="text/javascript"></script>
  <script src="images/js/scripts.js"></script>
</body>
</html>
  <script type="text/javascript">
window.onload=function(){
	document.getElementById('hsgmain').height=window.innerHeight-60;
}
</script>