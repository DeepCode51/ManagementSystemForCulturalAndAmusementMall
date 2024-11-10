<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<header>
    <div class="header-area">
         <div class="main-header ">
             <div class="header-top ">
                <div class="container">
                   <div class="row">
                    <div class="col-xl-12">
                        <div class="d-flex justify-content-between align-items-center flex-sm">
                            <div class="header-info-left d-flex align-items-center">
                                <div class="logo">
                                    <a href="index.do"><img src="qtimages/img/logo/logo.png" alt=""><font color="#000000" size="3"><strong>文玩商城</strong></font></a>
                                </div>
                                <form action='xpgwcList.do' method="post" class="form-box" id="topsearch">
                                    <input type="text" name='wenwanbianhao' placeholder="搜索..">
                                    <div class="search-icon"><i class="ti-search" onclick="document.forms['topsearch'].submit();" ></i></div>
                                </form>
                            </div>
                            <div class="header-info-right d-flex align-items-center">
                                <ul>                                   
                                    <%
if((String)request.getSession().getAttribute("username")==null || (String)request.getSession().getAttribute("username")==""){
 %>       
                                    <li><a href="maijiaxinxiadd.jsp" class="btn header-btn">注册</a></li>
									<li><a href="userlog.jsp" class="btn header-btn">登陆</a></li>
									 <%}else{ %>
				<font color="#000000" >当前用户：<%=request.getSession().getAttribute("username")%>,[<%=request.getSession().getAttribute("cx")%>]</font>&nbsp; <a href="logout.jsp" class="btn header-btn" onclick="return confirm('确定要退出？')" ><font color="#000000">退出</font></a> <font color="#000000">|</font> <a href="main.jsp" class="btn header-btn" ><font color="000000">个人中心</font></a>
				<%} %>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="header-bottom  header-sticky">
			 <div class="container">
				 <div class="row align-items-center">
					<div class="col-xl-12">
						<div class="logo2">
							<a href="index.do"><img src="qtimages/img/logo/logo.png" alt=""></a>
						</div>
						<div class="main-menu text-center d-none d-lg-block">
							<nav>                                                
								<ul id="navigation">    
	<li><a href="index.do">网站首页</a></li>
	
	<li><a href="#">买家信息</a>
	<ul class="submenu">
		<li><a href="mjxxListtp.do">买家信息</a></li> <li><a href="maijiaxinxiadd.jsp">买家注册</a></li> 
	</ul>
</li><li><a href="#">文玩信息</a>
	<ul class="submenu">
		<li><a href="xpwwListtp.do">新品文玩</a></li> 
				<li><a href="cxwwListtp.do">促销文玩</a></li> 
		
		
	</ul>
</li>
<li><a href="#">文玩讨论</a>
	<ul class="submenu">
				<li><a href="bbs.jsp">文玩讨论</a></li> 
		
		
	</ul>
</li>
<li><a href="#">新闻信息</a>
	<ul class="submenu">
		<li><a href="xwtzList.do?lb=站内新闻">站内新闻</a></li> <li><a href="xwtzList.do?lb=促销公告">促销公告</a></li> 
	</ul>
</li><li><a href="#">系统概要</a>
	<ul class="submenu">
		<li><a href="dx_detail.jsp?lb=系统简介">系统简介</a></li> <li><a href="dx_detail.jsp?lb=关于我们">关于我们</a></li> <li><a href="dx_detail.jsp?lb=联系方式">联系方式</a></li> 
	</ul>
</li><li><a href="#">在线留言</a>
	<ul class="submenu">
		<li><a href="lyb.jsp">在线留言</a></li> <li><a href="lybList.do">查看留言</a></li> 
	</ul>
</li><!--yoxulixuyaxn-->
	<li><a href="login.jsp">后台管理</a></li>
</ul>
							</nav>
						</div>
					</div> 
					<div class="col-xl-12">
						<div class="mobile_menu d-block d-lg-none"></div>
					</div>
				</div>
			</div>                         
    	</div>
	</div>
	</div>
</header>