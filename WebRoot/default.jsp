<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.util.db"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<!doctype html>
<html class="no-js" lang="zxx">
<head>
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>文玩商城</title>
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
</head>
<body>
    <jsp:include page="qttop.jsp"></jsp:include>
<main>
	<jsp:include page="bht.jsp"></jsp:include>
    	<div class="best-selling section-bg">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-7 col-lg-8">
                    <div class="section-tittle text-center mb-55">
                        <h2>促销文玩推荐</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-12">
                    <div class="selling-active">
					
					<%
		 int spi=0;
		 %>
		 <c:forEach items="${sycuxiaowenwan}" var="a">
		 <%
		 	spi++;
			if(spi<=8)
			{
		 %>
                        <div class="properties pb-20">
                            <div class="properties-card">
                                <div class="properties-img">
                                    <a href="cxwwDetail.do?id=${a.id}"><img src="${a.wenwantupian}" style="height:200px;"></a>
                                </div>
                                <div class="properties-caption">
                                   <h3><a href="cxwwDetail.do?id=${a.id}">${a.wenwanmingcheng}</a></h3>
                                   <div class="properties-footer d-flex justify-content-between align-items-center">
										<div class="review">
											<div class="rating">
												<i class="fas fa-star"></i>
												<i class="fas fa-star"></i>
												<i class="fas fa-star"></i>
												<i class="fas fa-star"></i>
												<i class="fas fa-star-half-alt"></i>
											</div>
										</div>
									</div>
                            	</div>
                        </div>
                    </div>
                   					    
		<%
			}
			%>
		</c:forEach>	
					


</div>
</div>
</div>
</div>
</div>
	<section class="our-client section-padding best-selling">
    <div class="container">
        <div class="row justify-content-between">
            <div class="col-xl-5 col-lg-5 col-md-12">
                <div class="section-tittle  mb-40">
                    <h2>新品文玩</h2>
                </div> 
            </div>
            <div class="col-xl-7 col-lg-7 col-md-12">
                <div class="nav-button mb-40">
                    <nav>
                        <div class="nav nav-tabs" id="nav-tab" role="tablist">
                            <a class="nav-link active" id="nav-one-tab" data-bs-toggle="tab" href="#nav-one" role="tab" aria-controls="nav-one" aria-selected="true" onclick="javascript:location.href='xpwwList.do';">所有</a>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="tab-content" id="nav-tabContent">
            <div class="tab-pane fade show active" id="nav-one" role="tabpanel" aria-labelledby="nav-one-tab">
                <div class="row">
				<%
		 int txi=0;
		 %>
       <c:forEach items="${syxinpinwenwan}" var="b">
	   <%
		 	txi++;
			if(txi<=6)
			{
		 %>
                    <div class="col-xl-2 col-lg-3 col-md-4 col-sm-6">
                        <div class="properties pb-30">
                            <div class="properties-card">
                                <div class="properties-img">
                                    <a href="xpwwDetail.do?id=${b.id}"><img src="${b.wenwantupian}" alt=""></a>
                                </div>
                                <div class="properties-caption properties-caption2">
                                    <h3><a href="xpwwDetail.do?id=${b.id}">${b.wenwanmingcheng}</a></h3>
                                    <div class="properties-footer d-flex justify-content-between align-items-center">
                                        <div class="review">
                                            <div class="rating">
                                                <i class="fas fa-star"></i>
                                                <i class="fas fa-star"></i>
                                                <i class="fas fa-star"></i>
                                                <i class="fas fa-star"></i>
                                                <i class="fas fa-star-half-alt"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
					 <%
			}
			%>
		</c:forEach>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-xl-12">
                <div class="more-btn text-center mt-15">
                    <a href="xpwwList.do" class="border-btn border-btn2 more-btn2">浏览更多</a></div>
            </div>
        </div>
    </div>
</section>

	<jsp:include page="sidebufen2.jsp"></jsp:include>
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
    <jsp:include page="qqkefu.jsp"></jsp:include>
