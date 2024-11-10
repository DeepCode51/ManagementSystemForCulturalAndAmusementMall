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
    <title>用户详细</title>
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
<%
  String id=request.getParameter("id");
%>
<body>
   <jsp:include page="qttop.jsp"></jsp:include>
<main>
<jsp:include page="bht.jsp"></jsp:include>
   
	<div class="best-selling section-bg">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-7 col-lg-8">
                    <div class="section-tittle text-center mb-55">
                        <h2>用户详细</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-12">
					<div class="content-form">
                               
                    <table width="80%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='17%' height=44>用户名：</td>
     <td width='53%'>${yonghuzhuce.yonghuming}</td>
<td width="30%"  rowspan=10 align=center><a href=${yonghuzhuce.touxiang} target=_blank><img src=${yonghuzhuce.touxiang} width=228 height=215 border=0></a></td>
   </tr><tr>
<td width='17%' height=44>密码：</td>
<td width='53%'>${yonghuzhuce.mima}</td>
</tr><tr>
<td width='17%' height=44>姓名：</td>
<td width='53%'>${yonghuzhuce.xingming}</td>
</tr><tr>
<td width='17%' height=44>性别：</td>
<td width='53%'>${yonghuzhuce.xingbie}</td>
</tr><tr>
<td width='17%' height=44>出生年月：</td>
<td width='53%'>${yonghuzhuce.chushengnianyue}</td>
</tr><tr>
<td width='17%' height=44>QQ：</td>
<td width='53%'>${yonghuzhuce.QQ}</td>
</tr><tr>
<td width='17%' height=44>邮箱：</td>
<td width='53%'>${yonghuzhuce.youxiang}</td>
</tr><tr>
<td width='17%' height=44>手机：</td>
<td width='53%'>${yonghuzhuce.shouji}</td>
</tr><tr>
<td width='17%' height=44>身份证：</td>
<td width='53%'>${yonghuzhuce.shenfenzheng}</td>
</tr><tr>

<td width='17%' height=44>地址：</td>
<td width='53%'>${yonghuzhuce.dizhi}</td>
</tr><tr>

<td width='17%' height=100  >备注：</td>
<td colspan=2 height=100 >${yonghuzhuce.beizhu}</td>
</tr><tr><td colspan=3 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>
                    
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