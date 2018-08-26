<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单管理</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@include file="/WEB-INF/view/common/global.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/select2_metro.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/DT_bootstrap.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap-tree.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/select2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/DT_bootstrap.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/bootstrap-tree.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/ui-tree.js"></script>    
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
						<h4 class="page-title">
							功能菜单管理 <small>功能菜单管理</small>
						</h4>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">主页</a> 
								<span class="icon-angle-right"></span>
							</li>
							<li>
								<a href="javascript:void(0);">系统管理</a>
								<span class="icon-angle-right"></span>
							</li>
							<li><a href="javascript:window.location.reload();">功能菜单管理</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
             
				<div class="row-fluid">
					<div class="span4">
						<div class="portlet box grey">
							<div class="portlet-title">
								<div class="caption"><i class="icon-comments"></i>菜单树</div>
								<div class="actions">
									<a href="javascript:;" id="tree_2_collapse" class="btn blue"> 全部折叠</a>
									<a href="javascript:;" id="tree_2_expand" class="btn yellow"> 全部展开</a>
								</div>
							</div>
							<div class="portlet-body fuelux">
								<ul class="tree" id="tree_2">
									<li>
										<a href="#" data-role="branch" class="tree-toggle" data-toggle="branch" data-value="Bootstrap_Tree">Bootstrap Tree
										</a>
										<ul class="branch in">
											<li><a href="#" data-role="leaf" id="nut"><i class="icon-suitcase"></i> 文件</a></li>
											<li><a href="#" data-role="leaf"><i class="icon-plane"></i> 项目</a></li>
											<li><a href="#" data-role="leaf"><i class="icon-tasks"></i> 任务</a></li>
											<li>
												<a href="http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469" target="_blank" data-role="leaf">
												<i class="icon-share"></i> 外部链接
												</a>
											</li>
											<li>
												<a href="http://themeforest.net/item/conquer-responsive-admin-dashboard-template/3716838" target="_blank" data-role="leaf">
												<i class="icon-share"></i> 另一个外部链接
												</a>
											</li>
											<li>
												<a href="assets/plugins/bootstrap-tree/htmlexample.html" data-role="branch" class="tree-toggle closed" data-toggle="branch" data-value="HTML_Example">通过Ajax从html页面加载数据
												</a>
											</li>
											<li>
												<a href="assets/plugins/bootstrap-tree/xmlexample.xml" data-role="branch" class="tree-toggle closed" data-toggle="branch" data-value="XML_Example">通过Ajax从xml文档加载数据
												</a>
											</li>
											<li><a href="assets/plugins/bootstrap-tree/jsonexample.json" data-role="branch" class="tree-toggle closed" data-toggle="branch" data-value="JSON_Example">通过Ajax加载来自JSON的数据</a></li>
										</ul>
									</li>
								</ul>
							</div>
						</div>
					</div>
					
					<div class="span8">
					<div class="portlet box blue">
					<div class="portlet-title">
					<div class="caption"><i class="icon-comments"></i>&nbsp;</div>
					</div>
					<div class="portlet-body">
					<div class="well">
										Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet.Integer molestie lorem at massa Integer molestie lorem at massa Integer molestie lorem at massa Integer molestie lorem at massa.
									</div>
					</div>
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
		UITree.init();
	});
</script>
</body>
</html>