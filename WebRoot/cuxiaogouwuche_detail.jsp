<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>促销购物车详细</title>
<link rel="stylesheet" href="images/hsgcommon/common.css" type="text/css">
	<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">   

  </head>

  <body >

  促销购物车详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>文玩编号：</td><td width='39%'>${cuxiaogouwuche.wenwanbianhao}</td>     <td width='11%'>文玩名称：</td><td width='39%'>${cuxiaogouwuche.wenwanmingcheng}</td></tr><tr>     <td width='11%'>文玩类别：</td><td width='39%'>${cuxiaogouwuche.wenwanleibie}</td>     <td width='11%'>原价格：</td><td width='39%'>${cuxiaogouwuche.yuanjiage}</td></tr><tr>     <td width='11%'>促销折扣：</td><td width='39%'>${cuxiaogouwuche.cuxiaozhekou}</td>     <td width='11%'>促销价格：</td><td width='39%'>${cuxiaogouwuche.cuxiaojiage}</td></tr><tr>     <td width='11%'>购买数量：</td><td width='39%'>${cuxiaogouwuche.goumaishuliang}</td>     <td width='11%'>应付金额：</td><td width='39%'>${cuxiaogouwuche.yingfujine}</td></tr><tr>     <td width='11%'>买家账号：</td><td width='39%'>${cuxiaogouwuche.maijiazhanghao}</td>     <td width='11%'>买家姓名：</td><td width='39%'>${cuxiaogouwuche.maijiaxingming}</td></tr><tr>     <td width='11%'>买家电话：</td><td width='39%'>${cuxiaogouwuche.maijiadianhua}</td>     <td width='11%'>收货地址：</td><td width='39%'>${cuxiaogouwuche.shouhuodizhi}</td>     </tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

