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
		<TITLE>修改促销文玩</TITLE>
	    
<link rel="stylesheet" href="images/hsgcommon/common.css" type="text/css">
	<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">   
       
	</head>
<%
  String id="";
 
   %>
<script language="javascript">

function gows()
{
	document.location.href="cuxiaowenwan_add.jsp?id=<%=id%>";
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
			<form action="updateCuxiaowenwan.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="30" colspan="2" background="images/table_header.gif">修改促销文玩<input type="hidden" name="id" value="${cuxiaowenwan.id}" /></td>
						</tr>
						<tr ><td width="200">文玩编号：</td><td><input name='wenwanbianhao' type='text' id='wenwanbianhao' value='' onblur='hsgcheck()' class="form-control" />&nbsp;*<label id='clabelwenwanbianhao' style='margin-top:16px;' /></td></tr>		<tr ><td width="200">文玩名称：</td><td><input name='wenwanmingcheng' type='text' id='wenwanmingcheng' value='' onblur='checkform()' class="form-control" />&nbsp;*<label id='clabelwenwanmingcheng' style='margin-top:16px;' /></td></tr>		<tr ><td width="200"><tr><td>文玩类别：</td><td><select name='wenwanleibie' id='wenwanleibie' class="form-control"><%=connDbBean.hsggetoption("leibie","wenwanleibie")%></select></td></tr>		<tr ><td width="200">文玩图片：</td><td><input name='wenwantupian' type='text' id='wenwantupian' size='50' value='' onblur=''  class="form-control" /><div style="margin-top:16px;">&nbsp;<input type='button' value='上传' onClick="up('wenwantupian')"/></div></td></tr>		<tr ><td width="200">库存：</td><td><input name='kucun' type='text' id='kucun' value='' onblur='checkform()' class="form-control" />&nbsp;<label id='clabelkucun' style='margin-top:16px;' />必需数字型</td></tr>		<tr ><td width="200">原价格：</td><td><input name='yuanjiage' type='text' id='yuanjiage' value='' onblur='checkform()' class="form-control" />&nbsp;*<label id='clabelyuanjiage' style='margin-top:16px;' /></td></tr>		<tr ><td width="200">促销折扣：</td><td><input name='cuxiaozhekou' type='text' id='cuxiaozhekou' value='' onblur='checkform()' class="form-control" />&nbsp;*<label id='clabelcuxiaozhekou' style='margin-top:16px;' /></td></tr>		<tr ><td width="200">促销价格：</td><td><input name='cuxiaojiage' type='text' id='cuxiaojiage' value='' onblur='checkform()' class="form-control" />&nbsp;*<label id='clabelcuxiaojiage' style='margin-top:16px;' /></td></tr>		<tr ><td width="200">文玩简介：</td><td><textarea name='wenwanjianjie' cols='50' rows='5' id='wenwanjianjie' onblur='' class="form-control" style="width:600px; height:80px;" ></textarea></td></tr>		
		
						<tr align='center'   height="22">
						    <td width="25%" height="45"  align="right">&nbsp;						    </td>
						    <td width="75%"  align="left">
						       <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();" class="btn btn-info btn-small" />
						       <input type="reset" value="重置" class="btn btn-info btn-small" />&nbsp;
						    </td>
						</tr>
						<script language="javascript">document.form1.wenwanbianhao.value='${cuxiaowenwan.wenwanbianhao}';</script>	<script language="javascript">document.form1.wenwanmingcheng.value='${cuxiaowenwan.wenwanmingcheng}';</script>	<script language="javascript">document.form1.wenwanleibie.value='${cuxiaowenwan.wenwanleibie}';</script>	<script language="javascript">document.form1.wenwantupian.value='${cuxiaowenwan.wenwantupian}';</script>	<script language="javascript">document.form1.kucun.value='${cuxiaowenwan.kucun}';</script>	<script language="javascript">document.form1.yuanjiage.value='${cuxiaowenwan.yuanjiage}';</script>	<script language="javascript">document.form1.cuxiaozhekou.value='${cuxiaowenwan.cuxiaozhekou}';</script>	<script language="javascript">document.form1.cuxiaojiage.value='${cuxiaowenwan.cuxiaojiage}';</script>	<script language="javascript">document.form1.wenwanjianjie.value='${cuxiaowenwan.wenwanjianjie}';</script>	
					 </table>
			</form>
   </body>
</html>






<script language=javascript >  
 
 function checkform(){  
 
	var wenwanbianhaoobj = document.getElementById("wenwanbianhao"); if(wenwanbianhaoobj.value==""){document.getElementById("clabelwenwanbianhao").innerHTML="&nbsp;&nbsp;<font color=red>请输入文玩编号</font>";return false;}else{document.getElementById("clabelwenwanbianhao").innerHTML="  "; } 	var wenwanmingchengobj = document.getElementById("wenwanmingcheng"); if(wenwanmingchengobj.value==""){document.getElementById("clabelwenwanmingcheng").innerHTML="&nbsp;&nbsp;<font color=red>请输入文玩名称</font>";return false;}else{document.getElementById("clabelwenwanmingcheng").innerHTML="  "; } 	    var yuanjiageobj = document.getElementById("yuanjiage"); if(yuanjiageobj.value==""){document.getElementById("clabelyuanjiage").innerHTML="&nbsp;&nbsp;<font color=red>请输入原价格</font>";return false;}else{document.getElementById("clabelyuanjiage").innerHTML="  "; } 	    var cuxiaozhekouobj = document.getElementById("cuxiaozhekou"); if(cuxiaozhekouobj.value==""){document.getElementById("clabelcuxiaozhekou").innerHTML="&nbsp;&nbsp;<font color=red>请输入促销折扣</font>";return false;}else{document.getElementById("clabelcuxiaozhekou").innerHTML="  "; } 	var cuxiaojiageobj = document.getElementById("cuxiaojiage"); if(cuxiaojiageobj.value==""){document.getElementById("clabelcuxiaojiage").innerHTML="&nbsp;&nbsp;<font color=red>请输入促销价格</font>";return false;}else{document.getElementById("clabelcuxiaojiage").innerHTML="  "; } 	    


return true;   
}   
popheight=450;
</script>  
