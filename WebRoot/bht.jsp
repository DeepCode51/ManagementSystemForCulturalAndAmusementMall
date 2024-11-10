<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<div >
 
  <link href="qtimages/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
           <section>
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
      <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
		<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		<li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
		<li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
		
      </ol>
      <div class="carousel-inner">
	   <%
			int xxbhti=0;
			String sqlbht="select id, shouyetupian,biaoti from xinwentongzhi where leibie='变幻图'  order by id desc limit 0,5";
			ResultSet RS_resultbht=connDbBean.executeQuery(sqlbht);
while(RS_resultbht.next())
{
	xxbhti++;
		%>
	  
        <div class="carousel-item <% if(xxbhti==1) { out.print("active");}%>">
          <img class="d-block w-100" src="<%=RS_resultbht.getString("shouyetupian")%>" style="width:1920px; height:680px; "  >
        </div>
<%
		}
		%>
		
      </div>
      <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
  </section>
  <script src="qtimages/lib/jquery/jquery.min.js"></script>
  <script src="qtimages/lib/bootstrap/js/bootstrap.min.js"></script>
        </div>
