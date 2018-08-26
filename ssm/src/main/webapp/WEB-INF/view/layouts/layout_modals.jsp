<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UI Modals</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@include file="/WEB-INF/view/common/global.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/jquery-ui-1.10.1.custom.min.css"/>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap-modal.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/bootstrap-modal.js" type="text/javascript" ></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/bootstrap-modalmanager.js" type="text/javascript" ></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/ui-modals.js"></script>     
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
							jQuery UI组件 <small>jQuery UI组件</small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">主页</a> 
								<span class="icon-angle-right"></span>
							</li>
							<li>
								<a href="#">用户界面功能</a>
								<span class="icon-angle-right"></span>
							</li>
							<li><a href="#">jQuery UI组件</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
		</div>
       <!-- 页面主内容区域 头部 结束-->
        <div class="row-fluid">
			<div class="span12">
						<!-- BEGIN PORTLET-->   
						<div class="portlet box green">
							<div class="portlet-title">
								<div class="caption"><i class="icon-reorder"></i>Bootstrap 扩展模态框</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="javascript:;" class="reload"></a>
								</div>
							</div>
							<div class="portlet-body form">
								<table class="table table-hover table-striped table-bordered">
									<tr>
										<td>响应式模态框</td>
										<td><a class="btn blue" data-toggle="modal" href="#responsive">显示</a></td>
									</tr>
									<tr>
										<td>可堆叠</td>
										<td><a class=" btn green" data-toggle="modal" href="#stack1">显示</a></td>
									</tr>
									<tr>
										<td>ajax（通过jQuery加载）</td>
										<td><a class=" btn red" id="modal_ajax_demo_btn" data-toggle="modal">显示</a></td>
									</tr>
									<tr>
										<td>静态背景与动画</td>
										<td><a class=" btn yellow" data-toggle="modal" href="#static">显示</a></td>
									</tr>
									<tr>
										<td>全宽度</td>
										<td><a class=" btn purple btn-large" data-toggle="modal" href="#full-width">显示</a></td>
									</tr>
									<tr>
										<td>长模式</td>
										<td><a class=" btn blue btn-large" data-toggle="modal" href="#long">显示</a></td>
									</tr>
								</table>

								<div id="responsive" class="modal hide fade" tabindex="-1" data-width="760">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
										<h3>响应式模态框</h3>
									</div>
									<div class="modal-body">
										<div class="row-fluid">
											<div class="span6">
												<h4>输入项</h4>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
											</div>
											<div class="span6">
												<h4>更多输入项</h4>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
												<p><input type="text" class="span12 m-wrap"></p>
											</div>
										</div>
									</div>

									<div class="modal-footer">
										<button type="button" data-dismiss="modal" class="btn">关闭</button>
										<button type="button" class="btn blue">保存更改</button>
									</div>
								</div>

								<div id="stack1" class="modal hide fade" tabindex="-1" data-focus-on="input:first">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
										<h3>第一个弹出</h3>
									</div>
									<div class="modal-body">
										<p>One fine body…</p>
										<p>One fine body…</p>
										<p>One fine body…</p>
										<input type="text" class="m-wrap" data-tabindex="1">
										<input type="text" class="m-wrap" data-tabindex="2">
										<a class="btn green" data-toggle="modal" href="#stack2">启动模式</a>
									</div>
									<div class="modal-footer">
										<button type="button" data-dismiss="modal" class="btn">关闭</button>
										<button type="button" class="btn red">确定</button>
									</div>
								</div>
								<div id="stack2" class="modal hide fade" tabindex="-1" data-focus-on="input:first">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
										<h3>第二个弹出</h3>
									</div>
									<div class="modal-body">
										<p>One fine body…</p>
										<p>One fine body…</p>
										<input type="text" class="m-wrap" data-tabindex="1">
										<input type="text" class="m-wrap" data-tabindex="2">
										<a class="btn red" data-toggle="modal" href="#stack3">启动模式</a>
									</div>
									<div class="modal-footer">
										<button type="button" data-dismiss="modal" class="btn">关闭</button>
										<button type="button" class="btn yellow">确定</button>
									</div>
								</div>
								<div id="stack3" class="modal hide fade" tabindex="-1" data-focus-on="input:first">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
										<h3>第三个弹出</h3>
									</div>
									<div class="modal-body">
										<p>One fine body…</p>
										<input type="text" class="m-wrap" data-tabindex="1">
										<input type="text" class="m-wrap" data-tabindex="2">
									</div>
									<div class="modal-footer">
										<button type="button" data-dismiss="modal" class="btn">关闭</button>
										<button type="button" class="btn purple">确定</button>
									</div>
								</div>
								<div id="static" class="modal hide fade" tabindex="-1" data-backdrop="static" data-keyboard="false">
									<div class="modal-body">
										<p>是否继续执行任意任务?</p>
									</div>
									<div class="modal-footer">
										<button type="button" data-dismiss="modal" class="btn">取消</button>
										<button type="button" data-dismiss="modal" class="btn green">跳过任务</button>
									</div>
								</div>
								<div id="full-width" class="modal container hide fade" tabindex="-1">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
										<h3>全宽度</h3>
									</div>
									<div class="modal-body">
										<p>此模式将将自身大小调整为与容器类相同的维度。</p>
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sollicitudin ipsum ac ante fermentum suscipit. In ac augue non purus accumsan lobortis id sed nibh. Nunc egestas hendrerit ipsum, et porttitor augue volutpat non. Aliquam erat volutpat. Vestibulum scelerisque lobortis pulvinar. Aenean hendrerit risus neque, eget tincidunt leo. Vestibulum est tortor, commodo nec cursus nec, vestibulum vel nibh. Morbi elit magna, ornare placerat euismod semper, dignissim vel odio. Phasellus elementum quam eu ipsum euismod pretium.</p>
									</div>
									<div class="modal-footer">
										<button type="button" data-dismiss="modal" class="btn">关闭</button>
										<button type="button" class="btn green">保存更改</button>
									</div>
								</div>
								<div id="long" class="modal hide fade" tabindex="-1" data-replace="true">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
										<h3>相当长的模态框</h3>
									</div>
									<div class="modal-body">
										<a class="btn red" data-toggle="modal" href="#notlong" alt="" style="position: absolute; top: 50%; right: 12px">不那么长的模态框</a>
										<img style="height: 800px" src="<%=request.getContextPath()%>/static/image/KwPYo.jpg">
									</div>
									<div class="modal-footer">
										<button type="button" data-dismiss="modal" class="btn">关闭</button>
									</div>
								</div>
								<div id="notlong" class="modal hide fade" tabindex="-1" data-replace="true">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
										<h3>不长的模态框</h3>
									</div>
									<div class="modal-body">
										<a class="btn red" data-toggle="modal" href="#long" style="position: absolute; top: 50%; right: 12px">长模态框</a>
										<img style="height: 300px" src="<%=request.getContextPath()%>/static/image/KwPYo.jpg" alt="">
									</div>
									<div class="modal-footer">
										<button type="button" data-dismiss="modal" class="btn">关闭</button>
									</div>
								</div>
								<div id="ajax-modal" class="modal hide fade" tabindex="-1"></div>
							</div>
						</div>
						<!-- END PORTLET-->
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
		UIModals.init();
	});
</script>
</body>
</html>