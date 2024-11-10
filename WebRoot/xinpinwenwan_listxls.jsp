<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=xinpinwenwan.xls");
%>
<html>
  <head>
    <title>新品文玩</title>
  </head>

  <body >

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1">  
  <tr>
    <td width="30" align="center">序号</td>
    <td align='center'>文玩编号</td>    <td align='center'>文玩名称</td>    <td align='center'>文玩类别</td>    <td align='center'>文玩图片</td>    <td align='center'>库存</td>    <td align='center'>文玩价格</td>    <td align='center'>文玩简介</td>    
	
    <td width="120" align="center" >添加时间</td>
    
  </tr>
   <%
    int i=0;
   String sql="select * from xinpinwenwan  order by id desc";
ResultSet RS_result=connDbBean.executeQuery(sql);
			while(RS_result.next())
			{
				i++;
			%>
  <tr>
    <td  align="center"><%=i %></td>
    <td><%=RS_result.getString("wenwanbianhao")%></td>    <td><%=RS_result.getString("wenwanmingcheng")%></td>    <td><%=RS_result.getString("wenwanleibie")%></td>    <td><%=RS_result.getString("wenwantupian")%></td>    <td><%=RS_result.getString("kucun")%></td>    <td><%=RS_result.getString("wenwanjiage")%></td>    <td><%=RS_result.getString("wenwanjianjie")%></td>    
	
	<td><%=RS_result.getString("addtime")%></td>
   
  </tr>
  	<%
  }
   %>
   
</table>
<br>
  </body>
</html>

