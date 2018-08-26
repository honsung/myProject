<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>500 option1</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<link href="<%=request.getContextPath()%>/static/css/error.css" rel="stylesheet" type="text/css"/>
<%@include file="/WEB-INF/view/common/global.jsp" %>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script> 
</head>
<body class="page-header-fixed">
<%@include file="/WEB-INF/view/head.jsp" %>
<div class="page-container">
<%@include file="/WEB-INF/view/menuTree.jsp" %>
   <!-- 页面内容区域(右侧) 开始-->
   <div class="page-content">
   <%@include file="/WEB-INF/view/portlet_config.jsp" %>
   <div class="container-fluid">
   <!-- 页面主内容区域 头部 开始-->
			<div class="row-fluid">
				<div class="span12">
						<%@include file="/WEB-INF/view/theme_color.jsp" %>   
						<!-- 页面导航级别显示 开始-->
						<h3 class="page-title">
							特殊页面 <small>500错误页</small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">主页</a> 
								<span class="icon-angle-right"></span>
							</li>
							<li>
								<a href="#">特殊页面</a>
								<span class="icon-angle-right"></span>
							</li>
							<li><a href="#">500错误页</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
			</div>
			<div class="row-fluid">
					<div class="span12 page-500">
						<div class=" number">
							500
						</div>
						<div class=" details">
							<h3>哎呀, 出错了.</h3>
							<p>
								我们正在处理中。!<br />
								请稍后重试。<br /><br />
							</p>
						</div>
					</div>
				</div>
   </div>
</div>
</div>
<%@include file="/WEB-INF/view/footer.jsp"%>
<script type="text/javascript">
	jQuery(document).ready(function() {   
		Menu.init();
		App.init();
	});
</script>
</body>
</html>