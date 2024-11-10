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
		<TITLE>修改新品购物车</TITLE>
	    
<link rel="stylesheet" href="images/hsgcommon/common.css" type="text/css">
	<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">   
       
	</head>
<%
  String id="";
 
   %>
<script language="javascript">

function gows()
{
	document.location.href="xinpingouwuche_add.jsp?id=<%=id%>";
}
function hsgxia2shxurxu(nstr,nwbk)
{
	if (eval("form1."+nwbk).value.indexOf(nstr)>=0)
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value.replace(nstr+"；", "");
	}
	else
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value+nstr+"；";
	}
}
</script>
	<body>
			<form action="updateXinpingouwuche.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="30" colspan="2" background="images/table_header.gif">修改新品购物车<input type="hidden" name="id" value="${xinpingouwuche.id}" /></td>
						</tr>
						<tr ><td width="200">文玩编号：</td><td><input name='wenwanbianhao' type='text' id='wenwanbianhao' value='' onblur='' class="form-control"  readonly='readonly' /></td></tr>		<tr ><td width="200">文玩名称：</td><td><input name='wenwanmingcheng' type='text' id='wenwanmingcheng' value='' onblur='' class="form-control"  readonly='readonly' /></td></tr>		<tr ><td width="200">文玩类别：</td><td><input name='wenwanleibie' type='text' id='wenwanleibie' value='' onblur='' class="form-control"  readonly='readonly' /></td></tr>		<tr ><td width="200">文玩价格：</td><td><input name='wenwanjiage' type='text' id='wenwanjiage' value='' onblur='' class="form-control"  readonly='readonly' /></td></tr>		<tr ><td width="200">购买数量：</td><td><input name='goumaishuliang' type='text' id='goumaishuliang' value='' onblur='checkform()' class="form-control" />&nbsp;<label id='clabelgoumaishuliang' style='margin-top:16px;' />必需数字型</td></tr>		<tr ><td width="200">应付金额：</td><td><input name='yingfujine' type='text' id='yingfujine' value='' onblur='' class="form-control" readonly='readonly' /> 此项不必填写，系统自动计算</td></tr>		<tr ><td width="200">买家账号：</td><td><input name='maijiazhanghao' type='text' id='maijiazhanghao' onblur='' class="form-control" value='<%=(String)request.getSession().getAttribute("username")%>' readonly="readonly" /></td></tr><script language="javascript">document.form1.maijiazhanghao.value='<%=connDbBean.readzd("maijiaxinxi","maijiazhanghao","maijiazhanghao",(String)request.getSession().getAttribute("username"))%>';document.form1.maijiazhanghao.setAttribute("readOnly",'true');</script>		<tr ><td width="200">买家姓名：</td><td><input name='maijiaxingming' type='text' id='maijiaxingming' value='' onblur='' class="form-control" /></td></tr><script language="javascript">document.form1.maijiaxingming.value='<%=connDbBean.readzd("maijiaxinxi","maijiaxingming","maijiazhanghao",(String)request.getSession().getAttribute("username"))%>';document.form1.maijiaxingming.setAttribute("readOnly",'true');</script>		<tr ><td width="200">买家电话：</td><td><input name='maijiadianhua' type='text' id='maijiadianhua' value='' onblur='' class="form-control" /></td></tr><script language="javascript">document.form1.maijiadianhua.value='<%=connDbBean.readzd("maijiaxinxi","maijiadianhua","maijiazhanghao",(String)request.getSession().getAttribute("username"))%>';document.form1.maijiadianhua.setAttribute("readOnly",'true');</script>		<tr 0><td width="200">收货地址：</td><td><input name='shouhuodizhi' type='text' id='shouhuodizhi' value='' onblur='' class="form-control" /></td></tr><script language="javascript">document.form1.shouhuodizhi.value='<%=connDbBean.readzd("maijiaxinxi","shouhuodizhi","maijiazhanghao",(String)request.getSession().getAttribute("username"))%>';document.form1.shouhuodizhi.setAttribute("readOnly",'true');</script>		
		
						<tr align='center'   height="22">
						    <td width="25%" height="45"  align="right">&nbsp;						    </td>
						    <td width="75%"  align="left">
						       <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();" class="btn btn-info btn-small" />
						       <input type="reset" value="重置" class="btn btn-info btn-small" />&nbsp;
						    </td>
						</tr>
						<script language="javascript">document.form1.wenwanbianhao.value='${xinpingouwuche.wenwanbianhao}';</script>	<script language="javascript">document.form1.wenwanmingcheng.value='${xinpingouwuche.wenwanmingcheng}';</script>	<script language="javascript">document.form1.wenwanleibie.value='${xinpingouwuche.wenwanleibie}';</script>	<script language="javascript">document.form1.wenwanjiage.value='${xinpingouwuche.wenwanjiage}';</script>	<script language="javascript">document.form1.goumaishuliang.value='${xinpingouwuche.goumaishuliang}';</script>	<script language="javascript">document.form1.yingfujine.value='${xinpingouwuche.yingfujine}';</script>	<script language="javascript">document.form1.maijiazhanghao.value='${xinpingouwuche.maijiazhanghao}';</script>	<script language="javascript">document.form1.maijiaxingming.value='${xinpingouwuche.maijiaxingming}';</script>	<script language="javascript">document.form1.maijiadianhua.value='${xinpingouwuche.maijiadianhua}';</script>	<script language="javascript">document.form1.shouhuodizhi.value='${xinpingouwuche.shouhuodizhi}';</script>	
					 </table>
			</form>
   </body>
</html>






<script language=javascript >  
 
 function checkform(){  
 
	    var yingfujinej=1;if(document.getElementById("wenwanjiage").value!=""){yingfujinej=yingfujinej*parseFloat(document.getElementById("wenwanjiage").value);}if(document.getElementById("goumaishuliang").value!=""){yingfujinej=yingfujinej*parseFloat(document.getElementById("goumaishuliang").value);}document.getElementById("yingfujine").value=yingfujinej;	


return true;   
}   
popheight=450;
</script>  
