 <li class="active">
	<a class="" href="#">
	  <i class="icon_house_alt"></i>
	  <span>控制面板</span>
  </a>
  </li>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%request.setCharacterEncoding("utf-8");%>
<li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg1"></i>
			  <span>系统用户管理</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='allusersList.do' target='hsgmain'>管理员用户</a></li><li><a class='' href='mod.jsp' target='hsgmain'>修改密码</a></li>
</ul>
</li><li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg2"></i>
			  <span>新闻数据管理</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='xinwentongzhi_add.jsp?lb=站内新闻' target='hsgmain'>站内新闻添加</a></li><li><a class='' href='xinwentongzhiList.do?lb=站内新闻' target='hsgmain'>站内新闻查询</a></li><li><a class='' href='xinwentongzhi_add.jsp?lb=促销公告' target='hsgmain'>促销公告添加</a></li><li><a class='' href='xinwentongzhiList.do?lb=促销公告' target='hsgmain'>促销公告查询</a></li>
</ul>
</li><li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg3"></i>
			  <span>系统简介设置</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='dx.jsp?lb=系统简介' target='hsgmain'>系统简介设置</a></li><li><a class='' href='dx.jsp?lb=关于我们' target='hsgmain'>关于我们设置</a></li><li><a class='' href='dx.jsp?lb=联系方式' target='hsgmain'>联系方式设置</a></li>
</ul>
</li><li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg4"></i>
			  <span>留言管理</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='liuyanbanList.do' target='hsgmain'>留言管理</a></li>
</ul>
</li><li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg5"></i>
			  <span>友情连接管理</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='youqinglianjie_add.jsp' target='hsgmain'>友情连接添加</a></li><li><a class='' href='youqinglianjieList.do' target='hsgmain'>友情连接查询</a></li>
</ul>
</li><li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg6"></i>
			  <span>变幻图管理</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='xinwentongzhi_add.jsp?lb=变幻图' target='hsgmain'>变幻图添加</a></li><li><a class='' href='xinwentongzhiList.do?lb=变幻图' target='hsgmain'>变幻图查询</a></li>
</ul>
</li><li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg7"></i>
			  <span>类别管理</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='leibie_add.jsp' target='hsgmain'>类别添加</a></li><li><a class='' href='leibieList.do' target='hsgmain'>类别查询</a></li>
</ul>
</li><li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg8"></i>
			  <span>买家管理</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='maijiaxinxi_add.jsp' target='hsgmain'>买家添加</a></li><li><a class='' href='maijiaxinxiList.do' target='hsgmain'>买家查询</a></li>
</ul>
</li><li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg9"></i>
			  <span>文玩管理</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='xinpinwenwan_add.jsp' target='hsgmain'>新品文玩添加</a></li><li><a class='' href='xinpinwenwanList.do' target='hsgmain'>新品文玩查询</a></li>

	<li><a class='' href='cuxiaowenwan_add.jsp' target='hsgmain'>促销文玩添加</a></li><li><a class='' href='cuxiaowenwanList.do' target='hsgmain'>促销文玩查询</a></li>
</ul>
</li><li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg11"></i>
			  <span>文玩购物车管理</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='cuxiaogouwucheList.do' target='hsgmain'>促销文玩购物车查询</a></li>	<li><a class='' href='xinpingouwucheList.do' target='hsgmain'>新品文玩购物车查询</a></li>

</ul>
</li><li class="sub-menu">
<a href="javascript:;" class="">
			  <i class="icon_hsg8"></i>
			  <span>文玩讨论管理</span>
			  <span class="menu-arrow arrow_carrot-right"></span>
		  </a>
<ul class="sub">
	<li><a class='' href='bankuai_add.jsp' target='hsgmain'>讨论板块添加</a></li>
<li><a class='' href='bankuaiList.do' target='hsgmain'>讨论板块管理</a></li>
<li><a class='' href='tieziList.do' target='hsgmain'>贴子管理</a></li>

</ul>
</li>




         


