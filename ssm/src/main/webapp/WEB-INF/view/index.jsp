<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!--><html class="no-js"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="<%=request.getContextPath() %>/static/css/jquery.gritter.css" rel="stylesheet" type="text/css"/>
	<link href="<%=request.getContextPath() %>/static/css/daterangepicker.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath() %>/static/css/fullcalendar.css" rel="stylesheet" type="text/css"/>
	<link href="<%=request.getContextPath() %>/static/css/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
<%@include file="/WEB-INF/view/common/global.jsp" %>
<title>主页</title>
</head>
<body class="page-header-fixed">
	<%@include file="/WEB-INF/view/head.jsp" %>
    <div class="copyrights">收集 <a href="http://www.cssmoban.com/" >网页模板</a></div>
	<!-- 容器 开始 -->
	<div class="page-container">
		<%@include file="/WEB-INF/view/menuTree.jsp" %>

		<!-- 页面内容区域(右侧) 开始-->
		<div class="page-content">
			<%@include file="/WEB-INF/view/portlet_config.jsp"%>

			<!-- 页面主内容 开始-->
			<div class="container-fluid">
				<!-- 页面主内容区域 头部 开始-->
				<div class="row-fluid">
					<div class="span12">
						<%@include file="/WEB-INF/view/theme_color.jsp" %>     
						<!-- 页面导航级别显示 开始-->
						<h3 class="page-title">
							仪表板 <small>统计和比较</small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">主页</a> 
								<i class="icon-angle-right"></i>
							</li>
							<li><a href="#">仪表板</a></li>
							<li class="pull-right no-text-shadow">
								<div id="dashboard-report-range" class="dashboard-date-range tooltips no-tooltip-on-touch-device responsive" data-tablet="" data-desktop="tooltips" data-placement="top" data-original-title="Change dashboard date range">
									<i class="icon-calendar"></i>
									<span></span>
									<i class="icon-angle-down"></i>
								</div>
							</li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
				
				
				
					<div class="clearfix"></div>
					<div class="row-fluid">
						<div class="span6">
							<!-- 日历 开始-->
							<div class="portlet box blue calendar">
								<div class="portlet-title">
									<div class="caption"><i class="icon-calendar"></i>日历</div>
								</div>
								<div class="portlet-body light-grey">
									<div id="calendar">
									</div>
								</div>
							</div>
							<!-- 日历 结束-->
						</div>
						<div class="span6">
							<!-- 聊天部分-->
							<div class="portlet">
								<div class="portlet-title line">
									<div class="caption"><i class="icon-comments"></i>聊天</div>
									<div class="tools">
										<a href="" class="collapse"></a>
										<a href="#portlet-config" data-toggle="modal" class="config"></a>
										<a href="" class="reload"></a>
										<a href="" class="remove"></a>
									</div>
								</div>
								<div class="portlet-body" id="chats">
									<div class="scroller" data-height="435px" data-always-visible="1" data-rail-visible1="1">
										<ul class="chats">
											<li class="out">
												<img class="avatar" alt="" src="<%=request.getContextPath() %>/static/image/avatar2.jpg" />
												<div class="message">
													<span class="arrow"></span>
													<a href="#" class="name">王一</a>
													<span class="datetime">在2012年11月25日 09点</span>
													<span class="body">
													打麻将
													</span>
												</div>
											</li>
											<li class="in">
												<img class="avatar" alt="" src="<%=request.getContextPath() %>/static/image/avatar1.jpg" />
												<div class="message">
													<span class="arrow"></span>
													<a href="#" class="name">王一</a>
													<span class="datetime">在2012年11月25日 09点</span>
													<span class="body">
													打麻将
													</span>
												</div>
											</li>
											<li class="out">
												<img class="avatar" alt="" src="<%=request.getContextPath() %>/static/image/avatar3.jpg" />
												<div class="message">
													<span class="arrow"></span>
													<a href="#" class="name">王二</a>
													<span class="datetime">在2012年11月25日 09点</span>
													<span class="body">
													斗地主
													</span>
												</div>
											</li>
											<li class="in">
												<img class="avatar" alt="" src="<%=request.getContextPath() %>/static/image/avatar3.jpg" />
												<div class="message">
													<span class="arrow"></span>
													<a href="#" class="name">王二</a>
													<span class="datetime">在2012年11月25日 09点</span>
													<span class="body">
打麻将
													</span>
												</div>
											</li>
											<li class="out">
												<img class="avatar" alt="" src="<%=request.getContextPath() %>/static/image/avatar1.jpg" />
												<div class="message">
													<span class="arrow"></span>
													<a href="#" class="name">王一</a>
													<span class="datetime">在2012年11月25日 09点</span>
													<span class="body">
斗地主
													</span>
												</div>
											</li>
										</ul>
									</div>
									<div class="chat-form">
										<div class="input-cont">   
											<input class="m-wrap" type="text" placeholder="Type a message here..." />
										</div>
										<div class="btn-cont"> 
											<span class="arrow"></span>
											<a href="" class="btn blue icn-only"><i class="icon-ok icon-white"></i></a>
										</div>
									</div>
								</div>
							</div>
							<!-- 聊天 结束-->
						</div>
					</div>
				</div>
			</div>
			<!-- 页面主内容 结束-->    
		</div>
		<!-- 页面内容区域(右侧) 结束-->
<%@include file="/WEB-INF/view/footer.jsp"%>

	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script src="<%=request.getContextPath() %>/static/js/jquery.flot.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath() %>/static/js/jquery.flot.resize.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath() %>/static/js/jquery.pulsate.min.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath() %>/static/js/date.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath() %>/static/js/daterangepicker.js" type="text/javascript"></script> 
	<script src="<%=request.getContextPath() %>/static/js/jquery.gritter.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath() %>/static/js/fullcalendar.min.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath() %>/static/js/jquery.easy-pie-chart.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath() %>/static/js/jquery.sparkline.min.js" type="text/javascript"></script>   
	<!-- END PAGE LEVEL PLUGINS -->

	<script src="<%=request.getContextPath() %>/static/js/app.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath() %>/static/js/index.js" type="text/javascript"></script>        
	<script>
		jQuery(document).ready(function() {   
		   Menu.init();
		   App.init(); // initlayout and core plugins
		   Index.init();
		   //Index.initJQVMAP(); 加载地图
		   Index.initCalendar(); // init index page's custom scripts
		   Index.initCharts(); // init index page's custom scripts
		   Index.initChat();
		   Index.initMiniCharts();
		   Index.initDashboardDaterange();
		   Index.initIntro();
		   
		   
		   App.handleSidebarMenu();
		   
		});

	</script>

	<!-- END JAVASCRIPTS -->

</body>
</html>