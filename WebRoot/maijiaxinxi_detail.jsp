<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>买家信息详细</title>
<link rel="stylesheet" href="images/hsgcommon/common.css" type="text/css">
	<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">   

  </head>

  <body >

  买家信息详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%' height=44>买家账号：</td><td width='39%'>${maijiaxinxi.maijiazhanghao}</td><td  rowspan=5 align=center><a href=${maijiaxinxi.touxiang} target=_blank><img src=${maijiaxinxi.touxiang} width=228 height=215 border=0></a></td></tr><tr><td width='11%' height=44>密码：</td><td width='39%'>${maijiaxinxi.mima}</td></tr><tr><td width='11%' height=44>买家姓名：</td><td width='39%'>${maijiaxinxi.maijiaxingming}</td></tr><tr><td width='11%' height=44>性别：</td><td width='39%'>${maijiaxinxi.xingbie}</td></tr><tr><td width='11%' height=44>买家电话：</td><td width='39%'>${maijiaxinxi.maijiadianhua}</td></tr><tr><td width='11%' height=100  >收货地址：</td><td width='39%' colspan=2 height=100 >${maijiaxinxi.shouhuodizhi}</td></tr><tr><td colspan=3 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

