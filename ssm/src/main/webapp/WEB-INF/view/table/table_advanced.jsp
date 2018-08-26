<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>可推进表格</title>
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
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/table-advanced.js"></script>
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
							可推进表格 <small>可推进表格例子</small>
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
							<li><a href="#">推进表格</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
              	
				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN EXAMPLE TABLE PORTLET-->

						<div class="portlet box green">

							<div class="portlet-title">

								<div class="caption"><i class="icon-globe"></i>Responsive Table With Expandable details</div>

								<div class="tools">

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body">

								<table class="table table-striped table-bordered table-hover table-full-width" id="sample_1">

									<thead>

										<tr>

											<th>Rendering engine</th>

											<th>Browser</th>

											<th class="hidden-480">Platform(s)</th>

											<th class="hidden-480">Engine version</th>

											<th class="hidden-480">CSS grade</th>

										</tr>

									</thead>

									<tbody>

										<tr>

											<td>Trident</td>

											<td>Internet

												Explorer 4.0

											</td>

											<td class="hidden-480">Win 95+</td>

											<td class="hidden-480">4</td>

											<td class="hidden-480">X</td>

										</tr>

										<tr >

											<td>Trident</td>

											<td>Internet

												Explorer 5.0

											</td>

											<td class="hidden-480">Win 95+</td>

											<td class="hidden-480">5</td>

											<td class="hidden-480">C</td>

										</tr>

										<tr >

											<td>Trident</td>

											<td>Internet

												Explorer 5.5

											</td>

											<td class="hidden-480">Win 95+</td>

											<td class="hidden-480">5.5</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Trident</td>

											<td>Internet

												Explorer 6

											</td>

											<td class="hidden-480">Win 98+</td>

											<td class="hidden-480">6</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Trident</td>

											<td>Internet Explorer 7</td>

											<td class="hidden-480">Win XP SP2+</td>

											<td class="hidden-480">7</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Trident</td>

											<td>AOL browser (AOL desktop)</td>

											<td class="hidden-480">Win XP</td>

											<td class="hidden-480">6</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Firefox 1.0</td>

											<td class="hidden-480">Win 98+ / OSX.2+</td>

											<td class="hidden-480">1.7</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Firefox 1.5</td>

											<td class="hidden-480">Win 98+ / OSX.2+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Firefox 2.0</td>

											<td class="hidden-480">Win 98+ / OSX.2+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Firefox 3.0</td>

											<td class="hidden-480">Win 2k+ / OSX.3+</td>

											<td class="hidden-480">1.9</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Camino 1.0</td>

											<td class="hidden-480">OSX.2+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Camino 1.5</td>

											<td class="hidden-480">OSX.3+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Netscape 7.2</td>

											<td class="hidden-480">Win 95+ / Mac OS 8.6-9.2</td>

											<td class="hidden-480">1.7</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Netscape Browser 8</td>

											<td class="hidden-480">Win 98SE+</td>

											<td class="hidden-480">1.7</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Netscape Navigator 9</td>

											<td class="hidden-480">Win 98+ / OSX.2+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.0</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.1</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.1</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.2</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.2</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.3</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.3</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.4</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.4</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.5</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.5</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.6</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.6</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.7</td>

											<td class="hidden-480">Win 98+ / OSX.1+</td>

											<td class="hidden-480">1.7</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.8</td>

											<td class="hidden-480">Win 98+ / OSX.1+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Seamonkey 1.1</td>

											<td class="hidden-480">Win 98+ / OSX.2+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Epiphany 2.20</td>

											<td class="hidden-480">Gnome</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>Safari 1.2</td>

											<td class="hidden-480">OSX.3</td>

											<td class="hidden-480">125.5</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>Safari 1.3</td>

											<td class="hidden-480">OSX.3</td>

											<td class="hidden-480">312.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>Safari 2.0</td>

											<td class="hidden-480">OSX.4+</td>

											<td class="hidden-480">419.3</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>Safari 3.0</td>

											<td class="hidden-480">OSX.4+</td>

											<td class="hidden-480">522.1</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>OmniWeb 5.5</td>

											<td class="hidden-480">OSX.4+</td>

											<td class="hidden-480">420</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>iPod Touch / iPhone</td>

											<td class="hidden-480">iPod</td>

											<td class="hidden-480">420.1</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>S60</td>

											<td class="hidden-480">S60</td>

											<td class="hidden-480">413</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 7.0</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 7.5</td>

											<td class="hidden-480">Win 95+ / OSX.2+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 8.0</td>

											<td class="hidden-480">Win 95+ / OSX.2+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 8.5</td>

											<td class="hidden-480">Win 95+ / OSX.2+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 9.0</td>

											<td class="hidden-480">Win 95+ / OSX.3+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 9.2</td>

											<td class="hidden-480">Win 88+ / OSX.3+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 9.5</td>

											<td class="hidden-480">Win 88+ / OSX.3+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera for Wii</td>

											<td class="hidden-480">Wii</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Nokia N800</td>

											<td class="hidden-480">N800</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Nintendo DS browser</td>

											<td class="hidden-480">Nintendo DS</td>

											<td class="hidden-480">8.5</td>

											<td class="hidden-480">C/A<sup>1</sup></td>

										</tr>

									</tbody>

								</table>

							</div>

						</div>

						<!-- END EXAMPLE TABLE PORTLET-->

						<!-- BEGIN EXAMPLE TABLE PORTLET-->

						<div class="portlet box blue">

							<div class="portlet-title">

								<div class="caption"><i class="icon-globe"></i>Show/Hide Columns</div>

								<div class="actions">

									<div class="btn-group">

										<a class="btn" href="#" data-toggle="dropdown">

										Columns

										<i class="icon-angle-down"></i>

										</a>

										<div id="sample_2_column_toggler" class="dropdown-menu hold-on-click dropdown-checkboxes pull-right">

											<label><input type="checkbox" checked data-column="0">Rendering engine</label>

											<label><input type="checkbox" checked data-column="1">Browser</label>

											<label><input type="checkbox" checked data-column="2">Platform(s)</label>

											<label><input type="checkbox" checked data-column="3">Engine version</label>

											<label><input type="checkbox" checked data-column="4">CSS grade</label>

										</div>

									</div>

								</div>

							</div>

							<div class="portlet-body">

								<table class="table table-striped table-bordered table-hover table-full-width" id="sample_2">

									<thead>

										<tr>

											<th>Rendering engine</th>

											<th>Browser</th>

											<th class="hidden-480">Platform(s)</th>

											<th class="hidden-480">Engine version</th>

											<th class="hidden-480">CSS grade</th>

										</tr>

									</thead>

									<tbody>

										<tr>

											<td>Trident</td>

											<td>Internet

												Explorer 4.0

											</td>

											<td class="hidden-480">Win 95+</td>

											<td class="hidden-480">4</td>

											<td class="hidden-480">X</td>

										</tr>

										<tr >

											<td>Trident</td>

											<td>Internet

												Explorer 5.0

											</td>

											<td class="hidden-480">Win 95+</td>

											<td class="hidden-480">5</td>

											<td class="hidden-480">C</td>

										</tr>

										<tr >

											<td>Trident</td>

											<td>Internet

												Explorer 5.5

											</td>

											<td class="hidden-480">Win 95+</td>

											<td class="hidden-480">5.5</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Trident</td>

											<td>Internet

												Explorer 6

											</td>

											<td class="hidden-480">Win 98+</td>

											<td class="hidden-480">6</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Trident</td>

											<td>Internet Explorer 7</td>

											<td class="hidden-480">Win XP SP2+</td>

											<td class="hidden-480">7</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Trident</td>

											<td>AOL browser (AOL desktop)</td>

											<td class="hidden-480">Win XP</td>

											<td class="hidden-480">6</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Firefox 1.0</td>

											<td class="hidden-480">Win 98+ / OSX.2+</td>

											<td class="hidden-480">1.7</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Firefox 1.5</td>

											<td class="hidden-480">Win 98+ / OSX.2+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Firefox 2.0</td>

											<td class="hidden-480">Win 98+ / OSX.2+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Firefox 3.0</td>

											<td class="hidden-480">Win 2k+ / OSX.3+</td>

											<td class="hidden-480">1.9</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Camino 1.0</td>

											<td class="hidden-480">OSX.2+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Camino 1.5</td>

											<td class="hidden-480">OSX.3+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Netscape 7.2</td>

											<td class="hidden-480">Win 95+ / Mac OS 8.6-9.2</td>

											<td class="hidden-480">1.7</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Netscape Browser 8</td>

											<td class="hidden-480">Win 98SE+</td>

											<td class="hidden-480">1.7</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Netscape Navigator 9</td>

											<td class="hidden-480">Win 98+ / OSX.2+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.0</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.1</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.1</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.2</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.2</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.3</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.3</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.4</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.4</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.5</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.5</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.6</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">1.6</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.7</td>

											<td class="hidden-480">Win 98+ / OSX.1+</td>

											<td class="hidden-480">1.7</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Mozilla 1.8</td>

											<td class="hidden-480">Win 98+ / OSX.1+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Seamonkey 1.1</td>

											<td class="hidden-480">Win 98+ / OSX.2+</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Gecko</td>

											<td>Epiphany 2.20</td>

											<td class="hidden-480">Gnome</td>

											<td class="hidden-480">1.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>Safari 1.2</td>

											<td class="hidden-480">OSX.3</td>

											<td class="hidden-480">125.5</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>Safari 1.3</td>

											<td class="hidden-480">OSX.3</td>

											<td class="hidden-480">312.8</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>Safari 2.0</td>

											<td class="hidden-480">OSX.4+</td>

											<td class="hidden-480">419.3</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>Safari 3.0</td>

											<td class="hidden-480">OSX.4+</td>

											<td class="hidden-480">522.1</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>OmniWeb 5.5</td>

											<td class="hidden-480">OSX.4+</td>

											<td class="hidden-480">420</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>iPod Touch / iPhone</td>

											<td class="hidden-480">iPod</td>

											<td class="hidden-480">420.1</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Webkit</td>

											<td>S60</td>

											<td class="hidden-480">S60</td>

											<td class="hidden-480">413</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 7.0</td>

											<td class="hidden-480">Win 95+ / OSX.1+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 7.5</td>

											<td class="hidden-480">Win 95+ / OSX.2+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 8.0</td>

											<td class="hidden-480">Win 95+ / OSX.2+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 8.5</td>

											<td class="hidden-480">Win 95+ / OSX.2+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 9.0</td>

											<td class="hidden-480">Win 95+ / OSX.3+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 9.2</td>

											<td class="hidden-480">Win 88+ / OSX.3+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera 9.5</td>

											<td class="hidden-480">Win 88+ / OSX.3+</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Opera for Wii</td>

											<td class="hidden-480">Wii</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Nokia N800</td>

											<td class="hidden-480">N800</td>

											<td class="hidden-480">-</td>

											<td class="hidden-480">A</td>

										</tr>

										<tr >

											<td>Presto</td>

											<td>Nintendo DS browser</td>

											<td class="hidden-480">Nintendo DS</td>

											<td class="hidden-480">8.5</td>

											<td class="hidden-480">C/A<sup>1</sup></td>

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
		TableAdvanced.init();
	});
</script>
</body>
</html>