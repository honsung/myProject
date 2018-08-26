<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>可编辑表格</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@include file="/WEB-INF/view/common/global.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/select2_metro.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/DT_bootstrap.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/select2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/DT_bootstrap.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script>   
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/table-editable.js"></script>
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
							可编辑表格 <small>可编辑表格例子</small>
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
							<li><a href="#">可编辑表格</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
              	
				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN EXAMPLE TABLE PORTLET-->

						<div class="portlet box blue">

							<div class="portlet-title">

								<div class="caption"><i class="icon-edit"></i>Editable Table</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body">

								<div class="clearfix">

									<div class="btn-group">

										<button id="sample_editable_1_new" class="btn green">

										Add New <i class="icon-plus"></i>

										</button>

									</div>

									<div class="btn-group pull-right">

										<button class="btn dropdown-toggle" data-toggle="dropdown">Tools <i class="icon-angle-down"></i>

										</button>

										<ul class="dropdown-menu pull-right">

											<li><a href="#">Print</a></li>

											<li><a href="#">Save as PDF</a></li>

											<li><a href="#">Export to Excel</a></li>

										</ul>

									</div>

								</div>

								<table class="table table-striped table-hover table-bordered" id="sample_editable_1">

									<thead>

										<tr>

											<th>Username</th>

											<th>Full Name</th>

											<th>Points</th>

											<th>Notes</th>

											<th>Edit</th>

											<th>Delete</th>

										</tr>

									</thead>

									<tbody>

										<tr class="">

											<td>alex</td>

											<td>Alex Nilson</td>

											<td>1234</td>

											<td class="center">power user</td>

											<td><a class="edit" href="javascript:;">Edit</a></td>

											<td><a class="delete" href="javascript:;">Delete</a></td>

										</tr>

										<tr class="">

											<td>lisa</td>

											<td>Lisa Wong</td>

											<td>434</td>

											<td class="center">new user</td>

											<td><a class="edit" href="javascript:;">Edit</a></td>

											<td><a class="delete" href="javascript:;">Delete</a></td>

										</tr>

										<tr class="">

											<td>nick12</td>

											<td>Nick Roberts</td>

											<td>232</td>

											<td class="center">power user</td>

											<td><a class="edit" href="javascript:;">Edit</a></td>

											<td><a class="delete" href="javascript:;">Delete</a></td>

										</tr>

										<tr class="">

											<td>goldweb</td>

											<td>Sergio Jackson</td>

											<td>132</td>

											<td class="center">elite user</td>

											<td><a class="edit" href="javascript:;">Edit</a></td>

											<td><a class="delete" href="javascript:;">Delete</a></td>

										</tr>

										<tr class="">

											<td>webriver</td>

											<td>Antonio Sanches</td>

											<td>462</td>

											<td class="center">new user</td>

											<td><a class="edit" href="javascript:;">Edit</a></td>

											<td><a class="delete" href="javascript:;">Delete</a></td>

										</tr>

										<tr class="">

											<td>gist124</td>

											<td>Nick Roberts</td>

											<td>62</td>

											<td class="center">new user</td>

											<td><a class="edit" href="javascript:;">Edit</a></td>

											<td><a class="delete" href="javascript:;">Delete</a></td>

										</tr>

									</tbody>

								</table>

							</div>

						</div>

						<!-- END EXAMPLE TABLE PORTLET-->

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
		TableEditable.init();
	});
</script>
</body>
</html>