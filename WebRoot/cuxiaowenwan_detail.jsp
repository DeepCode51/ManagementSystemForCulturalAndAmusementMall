<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>促销文玩详细</title>
<link rel="stylesheet" href="images/hsgcommon/common.css" type="text/css">
	<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">   

  </head>

  <body >

  促销文玩详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%' height=44>文玩编号：</td><td width='39%'>${cuxiaowenwan.wenwanbianhao}</td><td  rowspan=7 align=center><a href=${cuxiaowenwan.wenwantupian} target=_blank><img src=${cuxiaowenwan.wenwantupian} width=228 height=215 border=0></a></td></tr><tr><td width='11%' height=44>文玩名称：</td><td width='39%'>${cuxiaowenwan.wenwanmingcheng}</td></tr><tr><td width='11%' height=44>文玩类别：</td><td width='39%'>${cuxiaowenwan.wenwanleibie}</td></tr><tr><td width='11%' height=44>库存：</td><td width='39%'>${cuxiaowenwan.kucun}</td></tr><tr><td width='11%' height=44>原价格：</td><td width='39%'>${cuxiaowenwan.yuanjiage}</td></tr><tr><td width='11%' height=44>促销折扣：</td><td width='39%'>${cuxiaowenwan.cuxiaozhekou}</td></tr><tr><td width='11%' height=44>促销价格：</td><td width='39%'>${cuxiaowenwan.cuxiaojiage}</td></tr><tr><td width='11%' height=100  >文玩简介：</td><td width='39%' colspan=2 height=100 >${cuxiaowenwan.wenwanjianjie}</td></tr><tr><td colspan=3 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

