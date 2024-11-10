<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<!doctype html>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
<script type="text/javascript" src="js/popup.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<html class="no-js" lang="zxx">
<head>
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>买家信息</title>

    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/x-icon" href="qtimages/img/icon/favicon.png">
    <link rel="stylesheet" href="qtimages/css/bootstrap.min.css">
    <link rel="stylesheet" href="qtimages/css/owl.carousel.min.css">
    <link rel="stylesheet" href="qtimages/css/slicknav.css">
    <link rel="stylesheet" href="qtimages/css/animate.min.css">
    <link rel="stylesheet" href="qtimages/css/price_rangs.css">
    <link rel="stylesheet" href="qtimages/css/magnific-popup.css">
    <link rel="stylesheet" href="qtimages/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="qtimages/css/themify-icons.css">
    <link rel="stylesheet" href="qtimages/css/slick.css">
    <link rel="stylesheet" href="qtimages/css/nice-select.css">
    <link rel="stylesheet" href="qtimages/css/style.css">
	<link rel="stylesheet" href="./qtimages/sl_common_form.css">
</head>
<%

  String id="";


 



   %>


	
<script language=javascript >  
function hsgcheck() {
		var maijiazhanghao = $("#maijiazhanghao").val();
		if(maijiazhanghao==""||(maijiazhanghao.length<3||maijiazhanghao.length>12)){
			 $("#clabelmaijiazhanghao").html("<font color=red>买家账号不能为空且长度在3～12位之间！</font>");
			 $("input[id=maijiazhanghao]").focus();
			 $("#querenzhuce").attr("disabled","disabled");
			 return false;
		} 
		else
		{
			$("#clabelmaijiazhanghao").html("");
			$.ajax({
				url : "quchongMaijiaxinxi.do",
				type : "post",
				data : "maijiazhanghao=" + maijiazhanghao,
				dataType : "json",
				success:function(result){
				if(result.info=="ng"){
					$("#clabelmaijiazhanghao").html("<font color=red>买家账号已存在，请更换！</font>");
					$("input[id=maijiazhanghao]").focus();
					$("#querenzhuce").attr("disabled","disabled");
					return false;
				}
				else
				{
					$("#querenzhuce").removeAttr("disabled");
				}
				},
				error:function(){
					$("#clabelmaijiazhanghao").html("系统异常，请检查错误！");
					$("input[id=maijiazhanghao]").focus();
					$("#querenzhuce").attr("disabled","disabled");
					return false;
				}
			});
		}
	}
</script>
	<script language="javascript">
function checkform()
{
	var maijiazhanghaoobj = document.getElementById("maijiazhanghao"); if(maijiazhanghaoobj.value==""){document.getElementById("clabelmaijiazhanghao").innerHTML="&nbsp;&nbsp;<font color=red>请输入买家账号</font>";return false;}else{document.getElementById("clabelmaijiazhanghao").innerHTML="  "; } 	var mimaobj = document.getElementById("mima"); if(mimaobj.value==""){document.getElementById("clabelmima").innerHTML="&nbsp;&nbsp;<font color=red>请输入密码</font>";return false;}else{document.getElementById("clabelmima").innerHTML="  "; } 	var maijiaxingmingobj = document.getElementById("maijiaxingming"); if(maijiaxingmingobj.value==""){document.getElementById("clabelmaijiaxingming").innerHTML="&nbsp;&nbsp;<font color=red>请输入买家姓名</font>";return false;}else{document.getElementById("clabelmaijiaxingming").innerHTML="  "; } 	var maijiadianhuaobj = document.getElementById("maijiadianhua"); if(maijiadianhuaobj.value==""){document.getElementById("clabelmaijiadianhua").innerHTML="&nbsp;&nbsp;<font color=red>请输入买家电话</font>";return false;}else{document.getElementById("clabelmaijiadianhua").innerHTML="  "; } 	var maijiadianhuaobj = document.getElementById("maijiadianhua"); if(maijiadianhuaobj.value!=""){ if(/^(([0\+]\d{2,3}-)?(0\d{2,3})-)?(\d{7,8})(-(\d{3,}))?$/.test(maijiadianhuaobj.value) || /^1[3|4|5|6|7|8|9][0-9]\d{8,8}$/.test(maijiadianhuaobj.value)){document.getElementById("clabelmaijiadianhua").innerHTML=""; }else{document.getElementById("clabelmaijiadianhua").innerHTML="&nbsp;&nbsp;<font color=red>必需电话格式[7或8位电话，或11位手机]</font>"; return false;}}      var shouhuodizhiobj = document.getElementById("shouhuodizhi"); if(shouhuodizhiobj.value==""){document.getElementById("clabelshouhuodizhi").innerHTML="&nbsp;&nbsp;<font color=red>请输入收货地址</font>";return false;}else{document.getElementById("clabelshouhuodizhi").innerHTML="  "; } 	
}
function gow()
{
	document.location.href="maijiaxinxiadd.jsp?id=<%=id%>";
}
</script>


<body>
   <jsp:include page="qttop.jsp"></jsp:include>
<main>
<jsp:include page="bht.jsp"></jsp:include>
   
	<div class="best-selling section-bg">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-7 col-lg-8">
                    <div class="section-tittle text-center mb-55">
                        <h2>买家信息</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-12">
					<div class="content-form">
                               
                    <link rel="stylesheet" href="images/hsgcommon/divqt.css" type="text/css">
<link rel="stylesheet" href="images/hsgcommon/commonqt.css" type="text/css">
<script src="images/hsgcommon/common.js"></script>
<script src="images/hsgcommon/bootbox.js"></script>
<% 





%>

  

				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CCCCCC" style="border-collapse:collapse" class="newsline">
						<form action="addMaijiaxinxi.do" name="form1" method="post">
						<tr ><td width="200">买家账号：</td><td><input name='maijiazhanghao' type='text' id='maijiazhanghao' value='' onblur='hsgcheck()' class="form-control" />&nbsp;*<label id='clabelmaijiazhanghao' style='margin-top:16px;' /></td></tr>		<tr ><td width="200">密码：</td><td><input name='mima' type='text' id='mima' value='' onblur='checkform()' class="form-control" />&nbsp;*<label id='clabelmima' style='margin-top:16px;' /></td></tr>		<tr ><td width="200">头像：</td><td><input name='touxiang' type='text' id='touxiang' size='50' value='' onblur=''  class="form-control" /><div style="margin-top:16px;">&nbsp;<input type='button' value='上传' onClick="up('touxiang')"/></div></td></tr>		<tr ><td width="200">买家姓名：</td><td><input name='maijiaxingming' type='text' id='maijiaxingming' value='' onblur='checkform()' class="form-control" />&nbsp;*<label id='clabelmaijiaxingming' style='margin-top:16px;' /></td></tr>		<tr ><td width="200"><tr><td>性别：</td><td><select name='xingbie' id='xingbie' class="form-control"><option value="男">男</option><option value="女">女</option></select></td></tr>		<tr ><td width="200">买家电话：</td><td><input name='maijiadianhua' type='text' id='maijiadianhua' value='' onblur='checkform()' class="form-control" />&nbsp;*<label id='clabelmaijiadianhua' style='margin-top:16px;' /></td></tr>		<tr ><td width="200">收货地址：</td><td><textarea name='shouhuodizhi' cols='50' rows='5' id='shouhuodizhi' onblur='checkform()' class="form-control" style="width:600px; height:80px;" ></textarea>&nbsp;*<label id='clabelshouhuodizhi' style='margin-top:16px;' /></td></tr>		
		
						<tr align='center'   height="22">
						    <td width="25%"  align="right">&nbsp;
						        
						    </td>
						    <td width="75%"  align="left">
						      <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();" class="content-form-signup" />
						       <input type="reset" value="重置" class="content-form-signup" />&nbsp;
						    </td>
						</tr>
						</form>
					 </table>
			
			<script language="javascript">popheight = 1050;</script>
                    
					</div>
</div>
</div>
</div>
</div>
<jsp:include page="sidebufen.jsp"></jsp:include>
</main>
<jsp:include page="qtdown.jsp"></jsp:include>
<script src="qtimages/js/vendor/modernizr-3.5.0.min.js"></script>
<script src="qtimages/js/vendor/jquery-1.12.4.min.js"></script>
<script src="qtimages/js/popper.min.js"></script>
<script src="qtimages/js/bootstrap.min.js"></script>
<script src="qtimages/js/owl.carousel.min.js"></script>
<script src="qtimages/js/slick.min.js"></script>
<script src="qtimages/js/jquery.slicknav.min.js"></script>
<script src="qtimages/js/wow.min.js"></script>
<script src="qtimages/js/jquery.magnific-popup.js"></script>
<script src="qtimages/js/jquery.nice-select.min.js"></script>
<script src="qtimages/js/jquery.counterup.min.js"></script>
<script src="qtimages/js/waypoints.min.js"></script>
<script src="qtimages/js/price_rangs.js"></script>
<script src="qtimages/js/contact.js"></script>
<script src="qtimages/js/jquery.form.js"></script>
<script src="qtimages/js/jquery.validate.min.js"></script>
<script src="qtimages/js/mail-script.js"></script>
<script src="qtimages/js/jquery.ajaxchimp.min.js"></script>
<script src="qtimages/js/plugins.js"></script>
<script src="qtimages/js/main.js"></script>

</body></html>
