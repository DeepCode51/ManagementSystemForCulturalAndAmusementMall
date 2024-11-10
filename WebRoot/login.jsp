<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:useBean id="code" scope="page" class="com.util.CheckCode" />
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="shortcut icon" href="img/favicon.png">
  <title>文玩商城</title>
  <link href="images/css/bootstrap-theme.css" rel="stylesheet">
  <link href="images/css/elegant-icons-style.css" rel="stylesheet" />
  <link href="images/css/style.css" rel="stylesheet">
<style type="text/css">
<!--
#Layer1 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:1;
	left: 45%;
	top: 121px;
}
-->
</style>
</head>
<script type="text/javascript">
function hsgchecklogin() {
if(document.f11.username.value=="" || document.f11.pwd.value=="" || document.f11.pagerandom.value=="")
{
	alert("请输入完整");
	return false;
}
}
// function loadimage(){
// document.getElementById("randImage").src = "image.jsp?"+Math.random();
// }
</script>
<body class="login-img3-body">
  <div class="container">
	 <form name="f11"  method="post" action="hsgloginyanzheng.jsp" class="login-form"  >
      <div class="login-wrap">
        <p class="login-img"><i class="icon_lock_alt"></i></p>
        <div id="Layer1"> <div style="font-family:宋体; color:#FFFFFF; filter:Glow(Color=#000000,Strength=2); WIDTH: 100%; FONT-WEIGHT: bold; FONT-SIZE: 19pt; margin-top:5pt">
                  <div align="center">文玩商城</div>
              </div></div>
        <div class="input-group">
          <span class="input-group-addon"><i class="icon_profile"></i></span>
          <input type="text" class="form-control" id="username" name="username" placeholder="Username" autofocus>
        </div>
        <div class="input-group">
          <span class="input-group-addon"><i class="icon_hsg32"></i></span>
          <input type="password" class="form-control" id="pwd" name="pwd"  placeholder="Password">
        </div>
		<div class="input-group">
          <span class="input-group-addon"><i class="icon_hsg29"></i></span>
         <select name="cx" id="cx" class="form-control" >
             <option value="管理员">管理员</option>
<option value="买家">买家</option>

          </select>
        </div>
		<%--<div class="input-group">
          <span class="input-group-addon"><i class="icon_hsg27"></i></span>
          <input type="text" id="pagerandom" name="pagerandom" class="form-control" placeholder="验证码" style="width:100px; ">
		  <a href="javascript:loadimage();"><img alt="看不清请点我！" name="randImage" id="randImage" src="image.jsp" style="cursor:pointer; width:100px; height:40px;"> </a>
        </div> --%>

        <button class="btn btn-primary btn-lg btn-block" type="submit" onClick="return hsgchecklogin();" >Login</button>

      </div>
    </form>
    <div class="text-right">
    </div>
  </div>
</body>
</html>
