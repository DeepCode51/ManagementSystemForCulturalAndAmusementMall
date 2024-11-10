<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<!DOCTYPE html>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
<script type="text/javascript" src="js/popup.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<html class="no-js" lang="zxx">
<head>
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>在线论坛</title>
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
 if((String)request.getSession().getAttribute("username")==null || (String)request.getSession().getAttribute("username")=="")
{
	out.print("<script>alert('对不起,请您先登陆!');location.href='index.jsp';</script>");
	return;
}
 String bk=request.getParameter("bk");


%>

<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
	<script language=javascript src='js/ajax.js'></script>
	<script language="javascript">
function checkform()
{
	var bankuaiobj = document.getElementById("bankuai"); if(bankuaiobj.value==""){document.getElementById("clabelbankuai").innerHTML="&nbsp;&nbsp;<font color=red>请输入版块</font>";return false;}else{document.getElementById("clabelbankuai").innerHTML="  "; } 
	var biaotiobj = document.form1.biaoti; if(biaotiobj.value==""){document.getElementById("clabelbiaoti").innerHTML="&nbsp;&nbsp;<font color=red>请输入标题</font>";return false;}else{document.getElementById("clabelbiaoti").innerHTML="  "; } 
	
}
popheight="450";
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
                        <h2>在线论坛</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-12">
					<div class="content-form">
                               
                     <table width="100%" border="0" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" class="newsline" style="border-collapse:collapse">
                          <tr>
                            <td height="104" valign="top"><table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">
                                <form action="addTiezi.do" name="form1" method="post"> 
                                  <tr>
                                    <td width="10%">板块：</td>
                                    <td width="90%"><input name='bankuai' type='text' id='bankuai' value="<%=bk%>" readonly="readonly" />
                                      &nbsp;* 
                                      <label id='clabelbankuai' />
                                      </td>
                                  </tr>
                                  <tr>
                                    <td>标题：</td>
                                    <td><input name='biaoti' type='text' id='biaoti' value='' size='50'  onblur='checkform()' />
                                      &nbsp;* <label id='clabelbiaoti' /></td>
                                  </tr>
                                  <tr>
                                    <td>类型：</td>
                                    <td><input name="leixing" type="radio" value="putong" checked>
                                        <img src="bbs/putong.gif" width="18" height="18"> 普通
                                      <input type="radio" name="leixing" value="jiaji">
                                        <img src="bbs/jiaji.gif" width="18" height="18"> 加急
                                      <input type="radio" name="leixing" value="qiuzhu">
                                        <img src="bbs/qiuzhu.gif" width="18" height="18"> 求助
                                      <input type="radio" name="leixing" value="tuijian">
                                        <img src="bbs/tuijian.gif" width="15" height="17"> 推荐</td>
                                  </tr>
                                  <tr>
                                    <td>内容：</td>
                                    <td><textarea name='neirong' cols='50' rows='8' id='neirong' ></textarea> <label id='clabelneirong' /></td>
                                  </tr>
                                  <tr>
                                    <td>附件：</td>
                                    <td><input name="fujian" type="text" id="fujian" size="50">
                                     <input type='button' value='上传' onClick="up('fujian')" style='border:solid 1px #000000; color:#666666'/></td>
                                  </tr>
                                  <tr>
                                    <td>发帖人：</td>
                                    <td><input name='faburen' type='text' id='faburen' value='<%=request.getSession().getAttribute("username")%>' /></td>
                                  </tr>
                                  <tr>
                                    <td>&nbsp;</td>
                                    <td>
                                        <input type="submit" name="Submit5" value="提交" onClick="return checkform();"/><input name="fid" type="hidden" id="fid" value="0"> <input name="addtime" type="hidden" id="addtime" value="<%=connDbBean.gettime()%>" />
                                        <input type="reset" name="Submit2" value="重置" /></td>
                                  </tr>
                                </form>
                            </table></td>
                          </tr>
                          <tr>
                            <td align="right"> <a href="bbs.jsp" >返回</a></td>
                          </tr>
                        </table>
                    
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
</body>
</html>