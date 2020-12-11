<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
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
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/sys/employee/listEmployee.js"></script> 
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
							用户档案 <small>组织机构管理</small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">主页</a> 
								<span class="icon-angle-right"></span>
							</li>
							<li>
								<a href="#">系统管理</a>
								<span class="icon-angle-right"></span>
							</li>
							<li>
							    <a href="#">用户管理</a>
							    <span class="icon-angle-right"></span>
							</li>
							<li>
							    <a href="#">用户档案</a>
							</li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
				<div class="row-fluid">
					<div class="span12 responsive" data-tablet="span12 fix-offset" data-desktop="span12">
						<!-- BEGIN EXAMPLE TABLE PORTLET-->
						<div class="portlet box grey">
							<div class="portlet-title">
								<div class="caption"><i class="icon-user"></i>用户信息</div>
								<div class="actions">
									<a href="#" class="btn blue"><i class="icon-pencil"></i> 添加</a>
									<div class="btn-group">
										<a class="btn green" href="#" data-toggle="dropdown">
										<i class="icon-cogs"></i> 操作
										<i class="icon-angle-down"></i>
										</a>
										<ul class="dropdown-menu pull-right">
											<li><a href="#"><i class="icon-pencil"></i> 编辑</a></li>
											<li><a id="delete" href="#"><i class="icon-trash"></i> 删除</a></li>
											<li><a href="#"><i class="icon-ban-circle"></i> 禁用</a></li>
											<li><a href="#"><i class="icon-print"></i> 打印</a></li>
											<li><a href="#">另存为PDF</a></li>
											<li><a href="#">导出Excel</a></li>
											<li class="divider"></li>
											<li><a href="#"><i class="i"></i> Make admin</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="portlet-body">
								<table class="table table-striped table-bordered table-hover" id="listEmployee">
									<thead>
										<tr>
											<th style="width:8px;"><input type="checkbox" class="group-checkable" data-set="#listEmployee .checkboxes" /></th>
											<th>姓名</th>
											<th class="hidden-480">性别</th>
											<th class="hidden-480">单位名称</th>
											<th class="hidden-480">部门名称</th>
											<th class="hidden-480">岗位名称</th>
											<th class="hidden-480">移动电话</th>
											<th class="hidden-480">状态</th>
											<th class="hidden-480">创建时间</th>
										</tr>
									</thead>
									<tbody>
									<c:forEach var="employee" items="${pageInfo.list}" varStatus="status">
										<tr class="odd gradeX">
											<td><input type="checkbox" class="checkboxes" value="${employee.id}" /></td>
											<td>${employee.personNo}</td>
											<td class="hidden-480">${employee.personName}</td>
											<td class="hidden-480"><a href="mailto:${employee.email}">${employee.email}</a></td>
											<td class="hidden-480">${employee.personName}</td>
                                            <td class="hidden-480">${employee.personName}</td>
                                            <td class="hidden-480"><a href="mailto:${employee.email}">${employee.email}</a></td>
                                            <td class="hidden-480"><a href="mailto:${employee.email}">${employee.email}</a></td>
                                            <td class="hidden-480">${employee.personName}</td>
											<td><span class="label label-success">${employee.enableStatus}</span></td>
										</tr>
									</c:forEach>
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
		List_Employee.init();
	});
</script>
</body>
</html>