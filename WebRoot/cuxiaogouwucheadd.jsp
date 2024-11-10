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
    <title>促销购物车</title>

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
if(request.getSession().getAttribute("username")==null)
{
	out.print("<script>alert('对不起,请您先登陆!');location.href='index.do';</script>");
	return;
}
  String id="";


 



   %>


	
	<script language="javascript">
function checkform()
{
	var goumaishuliangobj = document.getElementById("goumaishuliang"); if(goumaishuliangobj.value!=""){ if(/^[0-9]+.?[0-9]*$/.test(goumaishuliangobj.value)){document.getElementById("clabelgoumaishuliang").innerHTML=""; }else{document.getElementById("clabelgoumaishuliang").innerHTML="&nbsp;&nbsp;<font color=red>必需数字型</font>"; return false;}}      var yingfujinej=1;if(document.getElementById("cuxiaojiage").value!=""){yingfujinej=yingfujinej*parseFloat(document.getElementById("cuxiaojiage").value);}if(document.getElementById("goumaishuliang").value!=""){yingfujinej=yingfujinej*parseFloat(document.getElementById("goumaishuliang").value);}document.getElementById("yingfujine").value=yingfujinej;	
}
function gow()
{
	document.location.href="cuxiaogouwucheadd.jsp?id=<%=id%>";
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
                        <h2>促销购物车</h2>
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
						<form action="addCuxiaogouwuche.do" name="form1" method="post">
						<tr ><td width="200">文玩编号：</td><td><input name='wenwanbianhao' type='text' id='wenwanbianhao' value='' onblur='' class="form-control"  readonly='readonly' /></td></tr><script language="javascript">document.form1.wenwanbianhao.value='<%=connDbBean.readzd("cuxiaowenwan","wenwanbianhao","id",request.getParameter("id"))%>';document.form1.wenwanbianhao.setAttribute("readOnly",'true');</script>		<tr ><td width="200">文玩名称：</td><td><input name='wenwanmingcheng' type='text' id='wenwanmingcheng' value='' onblur='' class="form-control"  readonly='readonly' /></td></tr><script language="javascript">document.form1.wenwanmingcheng.value='<%=connDbBean.readzd("cuxiaowenwan","wenwanmingcheng","id",request.getParameter("id"))%>';document.form1.wenwanmingcheng.setAttribute("readOnly",'true');</script>		<tr ><td width="200">文玩类别：</td><td><input name='wenwanleibie' type='text' id='wenwanleibie' value='' onblur='' class="form-control"  readonly='readonly' /></td></tr><script language="javascript">document.form1.wenwanleibie.value='<%=connDbBean.readzd("cuxiaowenwan","wenwanleibie","id",request.getParameter("id"))%>';document.form1.wenwanleibie.setAttribute("readOnly",'true');</script>		<tr ><td width="200">原价格：</td><td><input name='yuanjiage' type='text' id='yuanjiage' value='' onblur='' class="form-control"  readonly='readonly' /></td></tr><script language="javascript">document.form1.yuanjiage.value='<%=connDbBean.readzd("cuxiaowenwan","yuanjiage","id",request.getParameter("id"))%>';document.form1.yuanjiage.setAttribute("readOnly",'true');</script>		<tr ><td width="200">促销折扣：</td><td><input name='cuxiaozhekou' type='text' id='cuxiaozhekou' value='' onblur='' class="form-control"  readonly='readonly' /></td></tr><script language="javascript">document.form1.cuxiaozhekou.value='<%=connDbBean.readzd("cuxiaowenwan","cuxiaozhekou","id",request.getParameter("id"))%>';document.form1.cuxiaozhekou.setAttribute("readOnly",'true');</script>		<tr ><td width="200">促销价格：</td><td><input name='cuxiaojiage' type='text' id='cuxiaojiage' value='' onblur='' class="form-control"  readonly='readonly' /></td></tr><script language="javascript">document.form1.cuxiaojiage.value='<%=connDbBean.readzd("cuxiaowenwan","cuxiaojiage","id",request.getParameter("id"))%>';document.form1.cuxiaojiage.setAttribute("readOnly",'true');</script>		<tr ><td width="200">购买数量：</td><td><input name='goumaishuliang' type='text' id='goumaishuliang' value='' onblur='checkform()' class="form-control" />&nbsp;<label id='clabelgoumaishuliang' style='margin-top:16px;' />必需数字型</td></tr>		<tr ><td width="200">应付金额：</td><td><input name='yingfujine' type='text' id='yingfujine' value='' onblur='' class="form-control" readonly='readonly' /> 此项不必填写，系统自动计算</td></tr>		<tr ><td width="200">买家账号：</td><td><input name='maijiazhanghao' type='text' id='maijiazhanghao' onblur='' class="form-control" value='<%=(String)request.getSession().getAttribute("username")%>' readonly="readonly" /></td></tr><script language="javascript">document.form1.maijiazhanghao.value='<%=connDbBean.readzd("maijiaxinxi","maijiazhanghao","maijiazhanghao",(String)request.getSession().getAttribute("username"))%>';document.form1.maijiazhanghao.setAttribute("readOnly",'true');</script>		<tr 0><td width="200">买家姓名：</td><td><input name='maijiaxingming' type='text' id='maijiaxingming' value='' onblur='' class="form-control" /></td></tr><script language="javascript">document.form1.maijiaxingming.value='<%=connDbBean.readzd("maijiaxinxi","maijiaxingming","maijiazhanghao",(String)request.getSession().getAttribute("username"))%>';document.form1.maijiaxingming.setAttribute("readOnly",'true');</script>		<tr 1><td width="200">买家电话：</td><td><input name='maijiadianhua' type='text' id='maijiadianhua' value='' onblur='' class="form-control" /></td></tr><script language="javascript">document.form1.maijiadianhua.value='<%=connDbBean.readzd("maijiaxinxi","maijiadianhua","maijiazhanghao",(String)request.getSession().getAttribute("username"))%>';document.form1.maijiadianhua.setAttribute("readOnly",'true');</script>		<tr 2><td width="200">收货地址：</td><td><input name='shouhuodizhi' type='text' id='shouhuodizhi' value='' onblur='' class="form-control" /></td></tr><script language="javascript">document.form1.shouhuodizhi.value='<%=connDbBean.readzd("maijiaxinxi","shouhuodizhi","maijiazhanghao",(String)request.getSession().getAttribute("username"))%>';document.form1.shouhuodizhi.setAttribute("readOnly",'true');</script>		
		
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
