<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>qq客服侧边栏导航-jq22.com</title>
<script src="https://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<style>
@charset "utf-8";
	* {
	padding:0;
	margin:0;
}
html,body {
	font-size:12px;
	font-family:"微软雅黑";
	outline:none;
	color:#666;
	background:#fff;
}
ul,ol {
	list-style:none;
}
img {
	border:none;
	outline:none;
}
a {
	color:#666;
	text-decoration:none;
	outline:none;
}
a:hover {
	color:#e8431f;
}
/*浮动客服*/
#floatDivBoxs {
	width:170px;
	background:#fff;
	position:fixed;
	top:100px;
	right:0;
	z-index:999;
}
#floatDivBoxs .floatDtt {
	width:100%;
	height:45px;
	line-height:45px;
	background:#f08326;
	color:#fff;
	font-size:18px;
	text-indent:22px;
	position:relative;
}
#floatDivBoxs .floatDqq {
	padding:0 14px;
}
#floatDivBoxs .floatDqq li {
	height:45px;
	line-height:45px;
	font-size:15px;
	border-bottom:1px solid #e3e3e3;
	padding:0 0 0 50px;
}
#floatDivBoxs .floatDtxt {
	font-size:18px;
	color:#333;
	padding:12px 14px;
}
#floatDivBoxs .floatDtel {
	padding:0 0 15px 10px;
}
#floatDivBoxs .floatDtel img {
	display:block;
}
#floatDivBoxs .floatDbg {
	width:100%;
	height:20px;
	background:url(shihuiimages/qq/qqon4.gif) no-repeat;
	box-shadow:-2px 0 3px rgba(0,0,0,0.25);
}
.floatShadow {
	background:#fff;
	box-shadow:-2px 0 3px rgba(0,0,0,0.25);
}
#rightArrow {
	width:50px;
	height:45px;
	background:url(shihuiimages/qq/qqon4.gif) no-repeat;
	position:fixed;
	top:100px;
	right:170px;
	z-index:999;
}
#rightArrow a {
	display:block;
	height:45px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"></head>
<body>
<div id="rightArrow">
    <a href="javascript:;" title="在线客户"></a>
</div>
<div id="floatDivBoxs">
    <div class="floatDtt">在线客服</div>
    <div class="floatShadow">
        <ul class="floatDqq">
            <li style="padding-left:0px;">
                <a target="_blank" href="tencent://message/?uin=429489354&amp;Site=sc.chinaz.com&amp;Menu=yes"><img src="shihuiimages/qq/qqon5.gif" align="absmiddle">&nbsp;&nbsp;1号客服</a>
            </li>
            <li style="padding-left:0px;">
                <a target="_blank" href="tencent://message/?uin=429489354&amp;Site=sc.chinaz.com&amp;Menu=yes"><img src="shihuiimages/qq/qqon5.gif" align="absmiddle">&nbsp;&nbsp;2号客服</a>
            </li>
        </ul>
      
      
    </div>
  
</div>

<script>
var flag = 1;
$('#rightArrow').click(function() {
    if (flag == 1) {
        $("#floatDivBoxs").animate({
            right: '-175px'
        }, 300);
        $(this).animate({
            right: '-5px'
        }, 300);
        $(this).css('background-position', '-50px 0');
        flag = 0;
    } else {
        $("#floatDivBoxs").animate({
            right: '0'
        }, 300);
        $(this).animate({
            right: '170px'
        }, 300);
        $(this).css('background-position', '0px 0');
        flag = 1;
    }
});
</script>

</body>
</html>
