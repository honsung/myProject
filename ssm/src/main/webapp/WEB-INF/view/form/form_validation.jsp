<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表单验证</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@include file="/WEB-INF/view/common/global.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/select2_metro.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/chosen.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/additional-methods.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/select2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/chosen.jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script>  
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/form-validation.js"></script>    
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
							表单验证 <small>表单验证状态</small>
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
							<li><a href="#">表单验证</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
				
				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN VALIDATION STATES-->

						<div class="portlet box blue">

							<div class="portlet-title">

								<div class="caption"><i class="icon-reorder"></i>验证状态</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body form">

								<h3 class="block">基本的验证状态</h3>

								<!-- BEGIN FORM-->

								<form action="#" class="form-horizontal">

									<div class="control-group warning">

										<label class="control-label" for="inputWarning">输入与警告</label>

										<div class="controls">

											<input type="text" class="span6 m-wrap" id="inputWarning" />

											<span class="help-inline">可能出了差错</span>

										</div>

									</div>

									<div class="control-group error">

										<label class="control-label" for="inputError">输入与错误</label>

										<div class="controls">

											<input type="text" class="span6 m-wrap" id="inputError" />

											<span class="help-inline">请修正错误</span>

										</div>

									</div>

									<div class="control-group success">

										<label class="control-label" for="inputSuccess">输入与成功</label>

										<div class="controls">

											<input type="text" class="span6 m-wrap" id="inputSuccess" />

											<span class="help-inline ok"></span>

										</div>

									</div>

									<div class="control-group warning">

										<label class="control-label">输入与警告</label>

										<div class="controls input-icon">

											<input type="text" class="span6 m-wrap" />                                 

											<span class="input-warning tooltips" data-original-title="please write a valid email">

											<i class="icon-warning-sign"></i>

											</span>

										</div>

									</div>

									<div class="control-group error">

										<label class="control-label">输入与错误</label>

										<div class="controls input-icon">

											<input type="text" class="span6 m-wrap" />

											<span class="input-error tooltips" data-original-title="please write a valid email">

											<i class="icon-exclamation-sign"></i>

											</span>

										</div>

									</div>

									<div class="control-group success">

										<label class="control-label">输入与成功</label>

										<div class="controls input-icon">

											<input type="text" class="span6 m-wrap" />

											<span class="input-success tooltips" data-original-title="Success input!">

											<i class="icon-ok"></i>

											</span>

										</div>

									</div>

									<div class="form-actions">

										<button type="submit" class="btn blue">保存</button>

										<button type="button" class="btn">取消</button>

									</div>

								</form>

								<!-- END FORM-->

							</div>

						</div>

						<!-- END VALIDATION STATES-->

					</div>

				</div>

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN VALIDATION STATES-->

						<div class="portlet box purple">

							<div class="portlet-title">

								<div class="caption"><i class="icon-reorder"></i>基本验证</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body form">

								<!-- BEGIN FORM-->

								<form action="#" id="form_sample_1" class="form-horizontal">

									<div class="alert alert-error hide">

										<button class="close" data-dismiss="alert"></button>

										你有一些形式错误。请检查以下。

									</div>

									<div class="alert alert-success hide">

										<button class="close" data-dismiss="alert"></button>

										表单验证成功！

									</div>

									<div class="control-group">

										<label class="control-label">名称<span class="required">*</span></label>

										<div class="controls">

											<input type="text" name="name" data-required="1" class="span6 m-wrap"/>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">邮箱<span class="required">*</span></label>

										<div class="controls">

											<input name="email" type="text" class="span6 m-wrap"/>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">URL<span class="required">*</span></label>

										<div class="controls">

											<input name="url" type="text" class="span6 m-wrap"/>

											<span class="help-block">e.g: http://www.demo.com or http://demo.com</span>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">数<span class="required">*</span></label>

										<div class="controls">

											<input name="number" type="text" class="span6 m-wrap"/>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">数字<span class="required">*</span></label>

										<div class="controls">

											<input name="digits" type="text" class="span6 m-wrap"/>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">信用卡<span class="required">*</span></label>

										<div class="controls">

											<input name="creditcard" type="text" class="span6 m-wrap"/>

											<span class="help-block">e.g: 5500 0000 0000 0004</span>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">职业&nbsp;&nbsp;</label>

										<div class="controls">

											<input name="occupation" type="text" class="span6 m-wrap"/>

											<span class="help-block">可选字段</span>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">类别<span class="required">*</span></label>

										<div class="controls">

											<select class="span6 m-wrap" name="category">

												<option value="">请选择...</option>

												<option value="Category 1">类别 1</option>

												<option value="Category 2">类别 2</option>

												<option value="Category 3">类别 5</option>

												<option value="Category 4">类别 4</option>

											</select>

										</div>

									</div>

									<div class="form-actions">

										<button type="submit" class="btn purple">验证</button>

										<button type="button" class="btn">取消</button>

									</div>

								</form>

								<!-- END FORM-->

							</div>

						</div>

						<!-- END VALIDATION STATES-->

					</div>

				</div>

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN VALIDATION STATES-->

						<div class="portlet box green">

							<div class="portlet-title">

								<div class="caption"><i class="icon-reorder"></i>提前验证</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body form">

								<!-- BEGIN FORM-->

								<h3>自定义单选按钮，复选框和下拉菜单选择预先验证</h3>

								<form action="#" id="form_sample_2" class="form-horizontal">

									<div class="alert alert-error hide">

										<button class="close" data-dismiss="alert"></button>

										你有一些形式错误。请检查以下。

									</div>

									<div class="alert alert-success hide">

										<button class="close" data-dismiss="alert"></button>

										表单验证成功！

									</div>

									<div class="control-group">

										<label class="control-label">名称<span class="required">*</span></label>

										<div class="controls">

											<input type="text" name="name" data-required="1" class="span6 m-wrap"/>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">邮箱<span class="required">*</span></label>

										<div class="controls">

											<input name="email" type="text" class="span6 m-wrap"/>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">职业&nbsp;&nbsp;</label>

										<div class="controls">

											<input name="occupation" type="text" class="span6 m-wrap"/>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">类别<span class="required">*</span></label>

										<div class="controls">

											<select class="span6 m-wrap" name="category">

												<option value="">请选择...</option>

												<option value="Category 1">类别 1</option>

												<option value="Category 2">类别 2</option>

												<option value="Category 3">类别 5</option>

												<option value="Category 4">类别 4</option>

											</select>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">选择下拉菜单<span class="required">*</span></label>

										<div class="controls chzn-controls">

											<select id="form_2_chosen" class="span6 chosen" data-with-diselect="1" name="options1" data-placeholder="选择一个选项" tabindex="1">

												<option value=""></option>

												<option value="Option 1">选项 1</option>

												<option value="Option 2">选项 2</option>

												<option value="Option 3">选项 3</option>

												<option value="Option 4">选项 4</option>

											</select>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">Select2 下拉框<span class="required">*</span></label>

										<div class="controls select2-wrapper">

											<select id="form_2_select2" class="span6" name="options2">

												<option value=""></option>

												<option value="Option 1">选项 1</option>

												<option value="Option 2">选项 2</option>

												<option value="Option 3">选项 3</option>

												<option value="Option 4">选项 4</option>

											</select>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">会员<span class="required">*</span></label>

										<div class="controls">

											<label class="radio line">

											<input type="radio" name="membership" value="1" />

											自由

											</label>

											<label class="radio line">

											<input type="radio" name="membership" value="2" />

											专业

											</label> 

											<div id="form_2_membership_error"></div>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">服务<span class="required">*</span></label>

										<div class="controls">

											<label class="checkbox line">

											<input type="checkbox" value="1" name="service"/> 服务 1

											</label>

											<label class="checkbox line">

											<input type="checkbox" value="2" name="service"/> 服务 2

											</label>

											<label class="checkbox line">

											<input type="checkbox" value="3" name="service"/> 服务 3

											</label>

											<span class="help-block">(至少选择两个)</span>

											<div id="form_2_service_error"></div>

										</div>

									</div>

									<div class="form-actions">

										<button type="submit" class="btn green">验证</button>

										<button type="button" class="btn">取消</button>

									</div>

								</form>

								<!-- END FORM-->

							</div>

						</div>

						<!-- END VALIDATION STATES-->

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
		FormValidation.init();
	});
</script>
</body>
</html>