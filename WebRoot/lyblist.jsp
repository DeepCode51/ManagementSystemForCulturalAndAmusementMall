<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<!doctype html>
<html class="no-js" lang="zxx">
<head>
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>在线留言</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/x-icon" href="qtimages/img/icon/favicon.png">
    <link rel="stylesheet" href="qtimages/css/bootstrap.min.css">
    <link rel="stylesheet" href="qtimages/css/owl.carousel.min.css">
    <link rel="stylesheet" href="qtimages/css/slicknav.css">
    <link rel="stylesheet" href="qtimages/css/animate.min.css">
    <link rel="stylesheet" href="qtimages/css/price_rangs.css">
    <link rel="stylesheet" href="qtimages/css/magnific-popup.css">
    <link rel="stylesheet" href="qtimages/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="qtimages/css/themify-icons.css">
    <link rel="stylesheet" href="qtimages/css/slick.css">
    <link rel="stylesheet" href="qtimages/css/nice-select.css">
    <link rel="stylesheet" href="qtimages/css/style.css">
	<link rel="stylesheet" href="./qtimages/sl_common_form.css">
</head>
<body>
   <jsp:include page="qttop.jsp"></jsp:include>
<main>
<jsp:include page="bht.jsp"></jsp:include>
   
	<div class="best-selling section-bg">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-7 col-lg-8">
                    <div class="section-tittle text-center mb-55">
                        <h2>在线留言</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-12">
					<div class="content-form">
                               
                      <%
					int i=0;
				%>
                          <c:forEach items="${list }" var="u">
                            <%
					i++;
				%>
						<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#1E8EF4" class="newsline">
                            <tr>
                              <td width="85" rowspan="4" align="center" valign="middle" bgcolor="#FFFFFF"><img width='70'height='70' src=img/${u.xingbie}.gif border=0> </td>
                              <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">&nbsp; &nbsp; 留言于:${u.addtime} &nbsp;</td>
                            </tr>
                            <tr>
                              <td height="78" align="left" valign="top" bgcolor="#FFFFFF">&nbsp;${u.neirong}</td>
                            </tr>
                            <tr>
                              <td align="left" valign="middle" bgcolor="#FFFFFF" style="height: 25px">&nbsp; &nbsp;昵称：${u.cheng} &nbsp; &nbsp;电话：${u.shouji}&nbsp;&nbsp;邮 箱:${u.youxiang} &nbsp; QQ:${u.QQ}&nbsp; &nbsp; </td>
                            </tr>
                            <tr>
                              <td align="left" valign="middle" bgcolor="#FFFFFF" style="height: 25px">&nbsp; &nbsp;管理员回复：${u.huifuneirong}</td>
                            </tr>
                          </table>
						    </c:forEach>
							
							<p align="center"> <c:if test="${sessionScope.p==1 }">
		 <c:if test="${page.page>1}">
              <a href="lybList.do?page=1" >首页</a>
             <a href="lybList.do?page=${page.page-1 }"> 上一页</a></c:if>
    	     <c:if test="${page.page<page.totalPage}">
			<a href="lybList.do?page=${page.page+1 }">下一页</a>
			<a href="lybList.do?page=${page.totalPage }">末页</a></c:if>		
	</c:if>
	</p>
                    
					</div>
</div>
</div>
</div>
</div>
<jsp:include page="sidebufen.jsp"></jsp:include>
</main>
<jsp:include page="qtdown.jsp"></jsp:include>
<script src="qtimages/js/vendor/modernizr-3.5.0.min.js"></script>
<script src="qtimages/js/vendor/jquery-1.12.4.min.js"></script>
<script src="qtimages/js/popper.min.js"></script>
<script src="qtimages/js/bootstrap.min.js"></script>
<script src="qtimages/js/owl.carousel.min.js"></script>
<script src="qtimages/js/slick.min.js"></script>
<script src="qtimages/js/jquery.slicknav.min.js"></script>
<script src="qtimages/js/wow.min.js"></script>
<script src="qtimages/js/jquery.magnific-popup.js"></script>
<script src="qtimages/js/jquery.nice-select.min.js"></script>
<script src="qtimages/js/jquery.counterup.min.js"></script>
<script src="qtimages/js/waypoints.min.js"></script>
<script src="qtimages/js/price_rangs.js"></script>
<script src="qtimages/js/contact.js"></script>
<script src="qtimages/js/jquery.form.js"></script>
<script src="qtimages/js/jquery.validate.min.js"></script>
<script src="qtimages/js/mail-script.js"></script>
<script src="qtimages/js/jquery.ajaxchimp.min.js"></script>
<script src="qtimages/js/plugins.js"></script>
<script src="qtimages/js/main.js"></script>
</body>
</html>