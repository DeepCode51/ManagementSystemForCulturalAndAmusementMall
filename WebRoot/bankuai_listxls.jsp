<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="bankuaihsgb" scope="page" class="com.bean.BankuaiBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=bankuai.xls");
%>
<html>
  <head>
    <title>°æ¿é</title>
  </head>

  <body >
 <%
			String sql="select * from bankuai  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">ÐòºÅ</td>
    <td align='center'>±àºÅ</td>    <td align='center'>Ãû³Æ</td>    <td align='center'>¼ò½é</td>    <td align='center'>°æÖ÷</td>    
	
    <td width="120" align="center" bgcolor="CCFFFF">Ìí¼ÓÊ±¼ä</td>
    
  </tr>
   <%		
				List pagelist3=bankuaihsgb.getAllBankuai(6);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.bianhao}</td>    <td>${u.mingcheng}</td>    <td>${u.jianjie}</td>    <td>${u.banzhu}</td>    
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

