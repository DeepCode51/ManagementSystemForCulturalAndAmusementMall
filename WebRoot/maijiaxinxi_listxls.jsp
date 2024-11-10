<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=maijiaxinxi.xls");
%>
<html>
  <head>
    <title>买家信息</title>
  </head>

  <body >

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1">  
  <tr>
    <td width="30" align="center">序号</td>
    <td align='center'>买家账号</td>    <td align='center'>密码</td>    <td align='center'>头像</td>    <td align='center'>买家姓名</td>    <td align='center'>性别</td>    <td align='center'>买家电话</td>    <td align='center'>收货地址</td>    
	
    <td width="120" align="center" >添加时间</td>
    
  </tr>
   <%
    int i=0;
   String sql="select * from maijiaxinxi  order by id desc";
ResultSet RS_result=connDbBean.executeQuery(sql);
			while(RS_result.next())
			{
				i++;
			%>
  <tr>
    <td  align="center"><%=i %></td>
    <td><%=RS_result.getString("maijiazhanghao")%></td>    <td><%=RS_result.getString("mima")%></td>    <td><%=RS_result.getString("touxiang")%></td>    <td><%=RS_result.getString("maijiaxingming")%></td>    <td><%=RS_result.getString("xingbie")%></td>    <td><%=RS_result.getString("maijiadianhua")%></td>    <td><%=RS_result.getString("shouhuodizhi")%></td>    
	
	<td><%=RS_result.getString("addtime")%></td>
   
  </tr>
  	<%
  }
   %>
   
</table>
<br>
  </body>
</html>

