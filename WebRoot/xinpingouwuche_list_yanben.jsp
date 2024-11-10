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
	<TITLE>新品购物车查询</TITLE>
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
							<td colspan="17" background="images/table_header.gif">新品购物车列表</td>
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
									查询   文玩编号：<input name="wenwanbianhao" type="text" id="wenwanbianhao" class="form-control2" />  文玩名称：<input name="wenwanmingcheng" type="text" id="wenwanmingcheng" class="form-control2" />  文玩类别：<input name="wenwanleibie" type="text" id="wenwanleibie" class="form-control2" />
									<input type="submit" value="查询" class="btn btn-info btn-small" />
								</form>								</td>
						</tr></table>
					  </td>
			    </tr>
					
						<tr align="center">
						<td style="padding-left:0px; padding-right:0px;"><table width="100%" border="1" align="center" cellpadding="4" cellspacing="1" bordercolor="#F3F3F3" bgcolor="#ebf0f7" class="table table-striped table-bordered table-hover">
                          <tr>
                            <td width="30px" height="50" align="center" bgcolor="#ebf0f7">序号</td>
                            <td align='center' bgcolor='#ebf0f7'>文玩编号</td>    <td align='center' bgcolor='#ebf0f7'>文玩名称</td>    <td align='center' bgcolor='#ebf0f7'>文玩类别</td>    <td align='center' bgcolor='#ebf0f7'>文玩价格</td>    <td align='center' bgcolor='#ebf0f7'>购买数量</td>    <td align='center' bgcolor='#ebf0f7'>应付金额</td>    <td align='center' bgcolor='#ebf0f7'>买家账号</td>    <td align='center' bgcolor='#ebf0f7'>买家姓名</td>    <td align='center' bgcolor='#ebf0f7'>买家电话</td>    <td align='center' bgcolor='#ebf0f7'>收货地址</td>    <td  width='80' align='center' bgcolor='#ebf0f7'>是否支付</td>    <td  width='80' align='center' bgcolor='#ebf0f7'>是否审核</td>
                            <td width="150px" height="50" align="center" bgcolor="#ebf0f7"> 添加时间 </td>
                            <td width="150px" height="50" align="center" bgcolor="#ebf0f7"> 操作 </td>
                          </tr>
                          <%
    int i=0;
   String sql="select * from xinpingouwuche where 1=1";
   if(request.getParameter("wenwanbianhao")=="" ||request.getParameter("wenwanbianhao")==null ){}else{String nwenwanbianhao=new String(request.getParameter("wenwanbianhao").getBytes("8859_1"));if(nwenwanbianhao.contains("?")){nwenwanbianhao=request.getParameter("wenwanbianhao");}sql=sql+" and wenwanbianhao like '%"+nwenwanbianhao+"%'";}if(request.getParameter("wenwanmingcheng")=="" ||request.getParameter("wenwanmingcheng")==null ){}else{String nwenwanmingcheng=new String(request.getParameter("wenwanmingcheng").getBytes("8859_1"));if(nwenwanmingcheng.contains("?")){nwenwanmingcheng=request.getParameter("wenwanmingcheng");}sql=sql+" and wenwanmingcheng like '%"+nwenwanmingcheng+"%'";}if(request.getParameter("wenwanleibie")=="" ||request.getParameter("wenwanleibie")==null ){}else{String nwenwanleibie=new String(request.getParameter("wenwanleibie").getBytes("8859_1"));if(nwenwanleibie.contains("?")){nwenwanleibie=request.getParameter("wenwanleibie");}sql=sql+" and wenwanleibie like '%"+nwenwanleibie+"%'";}
   sql=sql+" order by id desc";
ResultSet RS_result=connDbBean.executeQuery(sql);
			while(RS_result.next())
			{
				i++;
			%>
                            <tr align="center">
                              <td height="50" align="center"><%=i%></td>
                             <td><%=RS_result.getString("wenwanbianhao")%></td>    <td><%=RS_result.getString("wenwanmingcheng")%></td>    <td><%=RS_result.getString("wenwanleibie")%></td>    <td><%=RS_result.getString("wenwanjiage")%></td>    <td><%=RS_result.getString("goumaishuliang")%></td>    <td><%=RS_result.getString("yingfujine")%></td>    <td><%=RS_result.getString("maijiazhanghao")%></td>    <td><%=RS_result.getString("maijiaxingming")%></td>    <td><%=RS_result.getString("maijiadianhua")%></td>    <td><%=RS_result.getString("shouhuodizhi")%></td>    <td><%=RS_result.getString("iszf")%></td>    <td><%=RS_result.getString("issh")%></td>    
                              <td height="50" align="center"><%=RS_result.getString("addtime")%> </td>
                              <td height="50" align="center"> <!--lianjie1--> <a class="btn btn-info btn-small" href="xpgwcDetail.do?id=<%=RS_result.getString("id")%>" target="_blank">详细</a></td>
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
