<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>悬浮窗文件上传</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@include file="/WEB-INF/view/common/global.jsp" %>
<%@include file="/WEB-INF/view/common/common_fileupload.jsp" %>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script>  
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/dropzone.js"></script>    
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
							悬浮窗文件上传 <small>文件上传</small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">主页</a> 
								<span class="icon-angle-right"></span>
							</li>
							<li>
								<a href="#">表单</a>
								<span class="icon-angle-right"></span>
							</li>
							<li><a href="#">悬浮窗文件上传</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
               
				<div class="row-fluid">
					<div class="span12">
						<p>
							<span class="label label-important">说明:</span>&nbsp;
							这个插件只适用于最新的Chrome浏览器，火狐，Safari，Opera和Internet Explorer 10。
						</p>
						<form action="assets/plugins/dropzone/upload.php" class="dropzone" id="my-awesome-dropzone"></form>
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