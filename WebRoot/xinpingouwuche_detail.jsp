<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>新品购物车详细</title>
<link rel="stylesheet" href="images/hsgcommon/common.css" type="text/css">
	<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">   

  </head>

  <body >

  新品购物车详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>文玩编号：</td><td width='39%'>${xinpingouwuche.wenwanbianhao}</td>     <td width='11%'>文玩名称：</td><td width='39%'>${xinpingouwuche.wenwanmingcheng}</td></tr><tr>     <td width='11%'>文玩类别：</td><td width='39%'>${xinpingouwuche.wenwanleibie}</td>     <td width='11%'>文玩价格：</td><td width='39%'>${xinpingouwuche.wenwanjiage}</td></tr><tr>     <td width='11%'>购买数量：</td><td width='39%'>${xinpingouwuche.goumaishuliang}</td>     <td width='11%'>应付金额：</td><td width='39%'>${xinpingouwuche.yingfujine}</td></tr><tr>     <td width='11%'>买家账号：</td><td width='39%'>${xinpingouwuche.maijiazhanghao}</td>     <td width='11%'>买家姓名：</td><td width='39%'>${xinpingouwuche.maijiaxingming}</td></tr><tr>     <td width='11%'>买家电话：</td><td width='39%'>${xinpingouwuche.maijiadianhua}</td>     <td width='11%'>收货地址：</td><td width='39%'>${xinpingouwuche.shouhuodizhi}</td>     </tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

