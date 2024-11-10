<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>


<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
<script type="text/javascript" src="js/popup.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<TITLE>买家信息查询</TITLE>
	<link rel="stylesheet" href="images/hsgcommon/common.css" type="text/css">
	<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">
	<link rel="stylesheet" href="images/bootstrap.min.css" type="text/css">
	</head>
	<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
			<tr valign="top">
				<td>
					<table width="100%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
						<tr align="left" bgcolor="#F2FDFF">
							<td colspan="17" background="images/table_header.gif">买家信息列表</td>
						</tr>
					</table>
				</td>
			</tr>
			
			<tr valign="top">
			  <td bgcolor="#FFFFFF">
			  <table width="100%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
						
					<tr align="right" bgcolor="#ebf0f7">
					  <td colspan="21">
					  <table width="100%" border="0" align="center" cellpadding="4" cellspacing="1" >
						<tr align="left" >
							<td colspan="17">
								<form action="" name="myform" method="post">
									查询   买家账号：<input name="maijiazhanghao" type="text" id="maijiazhanghao" class="form-control2" /> 性别：<select name='xingbie' id='xingbie' class="form-control2"><option value="">所有</option><option value="男">男</option><option value="女">女</option></select>
									<input type="submit" value="查询" class="btn btn-info btn-small" />
								</form>								</td>
						</tr></table>
					  </td>
			    </tr>
					
						<tr align="center">
						<td style="padding-left:0px; padding-right:0px;"><table width="100%" border="1" align="center" cellpadding="4" cellspacing="1" bordercolor="#F3F3F3" bgcolor="#ebf0f7" class="table table-striped table-bordered table-hover">
                          <tr>
                            <td width="30px" height="50" align="center" bgcolor="#ebf0f7">序号</td>
                            <td align='center' bgcolor='#ebf0f7'>买家账号</td>    <td align='center' bgcolor='#ebf0f7'>密码</td>    <td  width='90' align='center' bgcolor='#ebf0f7'>头像</td>    <td align='center' bgcolor='#ebf0f7'>买家姓名</td>    <td  width='40' align='center' bgcolor='#ebf0f7'>性别</td>    <td align='center' bgcolor='#ebf0f7'>买家电话</td>        
                            <td width="150px" height="50" align="center" bgcolor="#ebf0f7"> 添加时间 </td>
                            <td width="150px" height="50" align="center" bgcolor="#ebf0f7"> 操作 </td>
                          </tr>
                          <%
    int i=0;
   String sql="select * from maijiaxinxi where 1=1";
   if(request.getParameter("maijiazhanghao")=="" ||request.getParameter("maijiazhanghao")==null ){}else{String nmaijiazhanghao=new String(request.getParameter("maijiazhanghao").getBytes("8859_1"));if(nmaijiazhanghao.contains("?")){nmaijiazhanghao=request.getParameter("maijiazhanghao");}sql=sql+" and maijiazhanghao like '%"+nmaijiazhanghao+"%'";}if(request.getParameter("xingbie")=="" ||request.getParameter("xingbie")==null ){}else{sql=sql+" and xingbie like '%"+request.getParameter("xingbie")+"%'";}
   sql=sql+" order by id desc";
ResultSet RS_result=connDbBean.executeQuery(sql);
			while(RS_result.next())
			{
				i++;
			%>
                            <tr align="center">
                              <td height="50" align="center"><%=i%></td>
                             <td><%=RS_result.getString("maijiazhanghao")%></td>    <td><%=RS_result.getString("mima")%></td>    <td width='90' align='center' bgcolor='#ebf0f7'><a href='<%=RS_result.getString("touxiang")%>' target='_blank'><img src='<%=RS_result.getString("touxiang")%>' width=88 height=99 border=0 /></a></td>    <td><%=RS_result.getString("maijiaxingming")%></td>    <td><%=RS_result.getString("xingbie")%></td>    <td><%=RS_result.getString("maijiadianhua")%></td>    
                              <td height="50" align="center"><%=RS_result.getString("addtime")%> </td>
                              <td height="50" align="center"> <!--lianjie1--> <a class="btn btn-info btn-small" href="mjxxDetail.do?id=<%=RS_result.getString("id")%>" target="_blank">详细</a></td>
                            </tr>
                        	<%
  }
   %>
                        </table></td>
						</tr>
					</table>
					
					
			  </td>
	  </tr>
		</table>
			
	</body>
</html>
