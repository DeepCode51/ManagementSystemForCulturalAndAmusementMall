<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>新品文玩详细</title>
<link rel="stylesheet" href="images/hsgcommon/common.css" type="text/css">
	<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">   

  </head>

  <body >

  新品文玩详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%' height=44>文玩编号：</td><td width='39%'>${xinpinwenwan.wenwanbianhao}</td><td  rowspan=5 align=center><a href=${xinpinwenwan.wenwantupian} target=_blank><img src=${xinpinwenwan.wenwantupian} width=228 height=215 border=0></a></td></tr><tr><td width='11%' height=44>文玩名称：</td><td width='39%'>${xinpinwenwan.wenwanmingcheng}</td></tr><tr><td width='11%' height=44>文玩类别：</td><td width='39%'>${xinpinwenwan.wenwanleibie}</td></tr><tr><td width='11%' height=44>库存：</td><td width='39%'>${xinpinwenwan.kucun}</td></tr><tr><td width='11%' height=44>文玩价格：</td><td width='39%'>${xinpinwenwan.wenwanjiage}</td></tr><tr><td width='11%' height=100  >文玩简介：</td><td width='39%' colspan=2 height=100 >${xinpinwenwan.wenwanjianjie}</td></tr><tr><td colspan=3 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

