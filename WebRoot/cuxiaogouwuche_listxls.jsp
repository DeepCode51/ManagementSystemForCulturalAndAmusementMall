<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=cuxiaogouwuche.xls");
%>
<html>
  <head>
    <title>促销购物车</title>
  </head>

  <body >

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1">  
  <tr>
    <td width="30" align="center">序号</td>
    <td align='center'>文玩编号</td>    <td align='center'>文玩名称</td>    <td align='center'>文玩类别</td>    <td align='center'>原价格</td>    <td align='center'>促销折扣</td>    <td align='center'>促销价格</td>    <td align='center'>购买数量</td>    <td align='center'>应付金额</td>    <td align='center'>买家账号</td>    <td align='center'>买家姓名</td>    <td align='center'>买家电话</td>    <td align='center'>收货地址</td>    
	
    <td width="120" align="center" >添加时间</td>
    
  </tr>
   <%
    int i=0;
   String sql="select * from cuxiaogouwuche  order by id desc";
ResultSet RS_result=connDbBean.executeQuery(sql);
			while(RS_result.next())
			{
				i++;
			%>
  <tr>
    <td  align="center"><%=i %></td>
    <td><%=RS_result.getString("wenwanbianhao")%></td>    <td><%=RS_result.getString("wenwanmingcheng")%></td>    <td><%=RS_result.getString("wenwanleibie")%></td>    <td><%=RS_result.getString("yuanjiage")%></td>    <td><%=RS_result.getString("cuxiaozhekou")%></td>    <td><%=RS_result.getString("cuxiaojiage")%></td>    <td><%=RS_result.getString("goumaishuliang")%></td>    <td><%=RS_result.getString("yingfujine")%></td>    <td><%=RS_result.getString("maijiazhanghao")%></td>    <td><%=RS_result.getString("maijiaxingming")%></td>    <td><%=RS_result.getString("maijiadianhua")%></td>    <td><%=RS_result.getString("shouhuodizhi")%></td>    <td><%=RS_result.getString("iszf")%></td>    <td><%=RS_result.getString("issh")%></td>    
	
	<td><%=RS_result.getString("addtime")%></td>
   
  </tr>
  	<%
  }
   %>
   
</table>
<br>
  </body>
</html>

