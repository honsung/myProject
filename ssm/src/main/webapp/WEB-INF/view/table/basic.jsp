<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基本表格</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@include file="/WEB-INF/view/common/global.jsp" %>
<script src="<%=request.getContextPath()%>/static/js/app.js"></script>   
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
							基本表 <small>基本表格例子</small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">主页</a> 
								<span class="icon-angle-right"></span>
							</li>
							<li>
								<a href="#">数据表</a>
								<span class="icon-angle-right"></span>
							</li>
							<li><a href="#">基本表格</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
               	<div class="row-fluid">

					<div class="span6">

						<!-- BEGIN SAMPLE TABLE PORTLET-->

						<div class="portlet box red">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>Simple Table</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body">

								<table class="table table-hover">

									<thead>

										<tr>

											<th>#</th>

											<th>First Name</th>

											<th>Last Name</th>

											<th class="hidden-480">Username</th>

											<th>Status</th>

										</tr>

									</thead>

									<tbody>

										<tr>

											<td>1</td>

											<td>Mark</td>

											<td>Otto</td>

											<td class="hidden-480">makr124</td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr>

											<td>2</td>

											<td>Jacob</td>

											<td>Nilson</td>

											<td class="hidden-480">jac123</td>

											<td><span class="label label-info">Pending</span></td>

										</tr>

										<tr>

											<td>3</td>

											<td>Larry</td>

											<td>Cooper</td>

											<td class="hidden-480">lar</td>

											<td><span class="label label-warning">Suspended</span></td>

										</tr>

										<tr>

											<td>3</td>

											<td>Sandy</td>

											<td>Lim</td>

											<td class="hidden-480">sanlim</td>

											<td><span class="label label-danger">Blocked</span></td>

										</tr>

									</tbody>

								</table>

							</div>

						</div>

						<!-- END SAMPLE TABLE PORTLET-->

					</div>

					<div class="span6">

						<!-- BEGIN BORDERED TABLE PORTLET-->

						<div class="portlet box yellow">

							<div class="portlet-title">

								<div class="caption"><i class="icon-coffee"></i>Bordered Table</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body">

								<table class="table table-bordered table-hover">

									<thead>

										<tr>

											<th>#</th>

											<th>First Name</th>

											<th>Last Name</th>

											<th class="hidden-480">Username</th>

											<th>Status</th>

										</tr>

									</thead>

									<tbody>

										<tr>

											<td>1</td>

											<td>Mark</td>

											<td>Otto</td>

											<td class="hidden-480">makr124</td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr>

											<td>2</td>

											<td>Jacob</td>

											<td>Nilson</td>

											<td class="hidden-480">jac123</td>

											<td><span class="label label-info">Pending</span></td>

										</tr>

										<tr>

											<td>3</td>

											<td>Larry</td>

											<td>Cooper</td>

											<td class="hidden-480">lar</td>

											<td><span class="label label-warning">Suspended</span></td>

										</tr>

										<tr>

											<td>3</td>

											<td>Sandy</td>

											<td>Lim</td>

											<td class="hidden-480">sanlim</td>

											<td><span class="label label-danger">Blocked</span></td>

										</tr>

									</tbody>

								</table>

							</div>

						</div>

						<!-- END BORDERED TABLE PORTLET-->

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