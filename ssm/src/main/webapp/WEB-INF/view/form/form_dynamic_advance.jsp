<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>可推荐表单</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@include file="/WEB-INF/view/common/global.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/select2_metro.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/select2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script>  
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/form-dynamic-samples.js"></script>    
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
							可推进表单 <small>表单布局和更多</small>
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
							<li><a href="#">表单布局</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
               
				<div class="row-fluid">

					<div class="span12">

						<div class="tabbable tabbable-custom boxless">
							<ul class="nav nav-tabs" id="tabs">
								<li class="active"><a class="" href="#tab_1" data-toggle="tab" data-id="tab_1">两列</a></li>
								<li><a class="" href="#tab_2" data-toggle="tab" data-id="tab_2">平行的两列</a></li>
								<li><a class="" href="#tab_3" data-toggle="tab" data-id="tab_3">两列只显示</a></li>
							</ul>

							<div class="tab-content">
								<div class="tab-pane active" id="tab_1">
									<div class="portlet box blue">
										<div class="portlet-title">
											<div class="caption"><i class="icon-reorder"></i>表单例子</div>
											<div class="tools">
												<a href="javascript:;" class="collapse"></a>
												<a href="#portlet-config" data-toggle="modal" class="config"></a>
												<a href="javascript:;" class="reload"></a>
												<a href="javascript:;" class="remove"></a>
											</div>
										</div>
										<div class="portlet-body form">
											<!-- BEGIN FORM-->
											<form action="#" class="horizontal-form">
												<h3 class="form-section">个人信息</h3>
												<div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" for="firstName">名字</label>
															<div class="controls">
																<input type="text" id="firstName" class="m-wrap span12" placeholder="Chee Kin">
																<span class="help-block">这是内联帮助</span>
															</div>
														</div>
													</div>

													<!--/span-->

													<div class="span6 ">
														<div class="control-group error">
															<label class="control-label" for="lastName">姓氏</label>
															<div class="controls">
																<input type="text" id="lastName" class="m-wrap span12" placeholder="Lim">
																<span class="help-block">这个字段有错误.</span>
															</div>
														</div>
													</div>
													<!--/span-->
												</div>
												<!--/row-->
												<div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" >性别</label>
															<div class="controls">
																<select  class="m-wrap span12">
																	<option value="">男</option>
																	<option value="">女</option>
																</select>
																<span class="help-block">选择性别.</span>
															</div>
														</div>
													</div>
													<!--/span-->
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" >出生日期</label>
															<div class="controls">
																<input type="text" class="m-wrap span12"  placeholder="dd/mm/yyyy">
															</div>
														</div>
													</div>
													<!--/span-->
												</div>
												<!--/row-->        
												<div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" >类别</label>
															<div class="controls">
																<select class="span12 select2_类别" data-placeholder="请选择一个类别" tabindex="1">
																	<option value=""></option>
																	<option value="类别 1">类别 1</option>
																	<option value="类别 2">类别 2</option>
																	<option value="类别 3">类别 3</option>
																	<option value="类别 4">类别 4</option>
																</select>
															</div>
														</div>
													</div>
													<!--/span-->
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" >会员</label>
															<div class="controls">                                                
																<label class="radio">
																<input type="radio" name="optionsRadios2" value="option1" />
																自由
																</label>
																<label class="radio">
																<input type="radio" name="optionsRadios2" value="option2" checked />
																专业
																</label>  
															</div>
														</div>
													</div>
													<!--/span-->
												</div>
												<!--/row--> 
												<h3 class="form-section">地址</h3>
												<div class="row-fluid">
													<div class="span12 ">
														<div class="control-group">
															<label class="control-label" >街道</label>
															<div class="controls">
																<input type="text" class="m-wrap span12" >
															</div>
														</div>
													</div>
												</div>
												<div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" >城市</label>
															<div class="controls">
																<input type="text"  class="m-wrap span12"> 
															</div>
														</div>
													</div>
													<!--/span-->
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" >状态</label>
															<div class="controls">
																<input type="text"  class="m-wrap span12"> 
															</div>
														</div>
													</div>
													<!--/span-->
												</div>
												<!--/row-->           
												<div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" >邮政编码</label>
															<div class="controls">
																<input type="text" class="m-wrap span12"> 
															</div>
														</div>
													</div>
													<!--/span-->
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" >国别</label>
															<div class="controls">
																<select  class="m-wrap span12"></select>
															</div>
														</div>
													</div>
													<!--/span-->
												</div>
												<div class="form-actions">
													<button type="submit" class="btn blue"><i class="icon-ok"></i> 保存</button>
													<button type="button" class="btn">取消</button>
												</div>
											</form>
											<!-- END FORM--> 
										</div>
									</div>
								</div>

								<div class="tab-pane " id="tab_2">
									<div class="portlet box green">
										<div class="portlet-title">
											<div class="caption"><i class="icon-reorder"></i>表单例子</div>
											<div class="tools">
												<a href="javascript:;" class="collapse"></a>
												<a href="#portlet-config" data-toggle="modal" class="config"></a>
												<a href="javascript:;" class="reload"></a>
												<a href="javascript:;" class="remove"></a>
											</div>
										</div>
										<div class="portlet-body form">
											<!-- BEGIN FORM-->
											<form action="#" class="form-horizontal">
												<h3 class="form-section">个人信息</h3>
												<div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">

															<label class="control-label">名字</label>

															<div class="controls">

																<input type="text" class="m-wrap span12" placeholder="Chee Kin">

																<span class="help-block">这是内联帮助</span>

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6 ">

														<div class="control-group error">

															<label class="control-label">姓氏</label>

															<div class="controls">

																<input type="text" class="m-wrap span12" placeholder="Lim">

																<span class="help-block">This field has error.</span>

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<!--/row-->

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label">性别</label>

															<div class="controls">

																<select class="m-wrap span12">

																	<option value="">男</option>

																	<option value="">女</option>

																</select>

																<span class="help-block">请选择你得性别.</span>

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >出生日期</label>

															<div class="controls">

																<input type="text" class="m-wrap span12" placeholder="dd/mm/yyyy">

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<!--/row-->        

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label">类别</label>

															<div class="controls">

																<select class="span12 select2_类别"  data-placeholder="Choose a 类别" tabindex="1">

																	<option value=""></option>

																	<option value="类别 1">类别 1</option>

																	<option value="类别 2">类别 2</option>

																	<option value="类别 3">类别 3</option>

																	<option value="类别 4">类别 4</option>

																</select>

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label">会员</label>

															<div class="controls">                                                

																<label class="radio">

																<input type="radio" name="optionsRadios2" value="option1" />

																自由

																</label>

																<label class="radio">

																<input type="radio" name="optionsRadios2" value="option2" checked />

																专业

																</label>  

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<h3 class="form-section">地址</h3>

												<!--/row-->                   

												<div class="row-fluid">

													<div class="span12 ">

														<div class="control-group">

															<label class="control-label">街道</label>

															<div class="controls">

																<input type="text" class="m-wrap span12" >

															</div>

														</div>

													</div>

												</div>

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label">城市</label>

															<div class="controls">

																<input type="text" class="m-wrap span12"> 

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >状态</label>

															<div class="controls">

																<input type="text"  class="m-wrap span12"> 

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<!--/row-->           

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label">邮政编码</label>

															<div class="controls">

																<input type="text" class="m-wrap span12"> 

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label">国别</label>

															<div class="controls">

																<select class="m-wrap span12">

																	<option>国别 1</option>

																	<option>国别 2</option>

																</select>

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<!--/row-->

												<div class="form-actions">

													<button type="submit" class="btn blue"><i class="icon-ok"></i> 保存</button>

													<button type="button" class="btn">取消</button>

												</div>

											</form>

											<!-- END FORM-->                

										</div>

									</div>

								</div>

								<div class="tab-pane " id="tab_3">

									<div class="portlet box blue">

										<div class="portlet-title">

											<div class="caption"><i class="icon-reorder"></i>表单例子</div>

											<div class="tools">

												<a href="javascript:;" class="collapse"></a>

												<a href="#portlet-config" data-toggle="modal" class="config"></a>

												<a href="javascript:;" class="reload"></a>

												<a href="javascript:;" class="remove"></a>

											</div>

										</div>

										<div class="portlet-body form">

											<!-- BEGIN FORM-->

											<div class="form-horizontal form-view">

												<h3> 显示用户信息 - 鲍勃尼尔森 </h3>

												<h3 class="form-section">个人信息</h3>

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" for="firstName">名字:</label>

															<div class="controls">

																<span class="text">鲍勃</span>

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" for="lastName">姓氏:</label>

															<div class="controls">

																<span class="text">尼尔森</span>

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<!--/row-->

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >性别:</label>

															<div class="controls">

																<span class="text">男</span> 

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >出生日期:</label>

															<div class="controls">

																<span class="text bold">20.01.1984</span>

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<!--/row-->        

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >类别:</label>

															<div class="controls">

																<span class="text bold">类别1</span>

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >会员:</label>

															<div class="controls">                                                

																<span class="text bold">自由</span>

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<!--/row-->                

												<h3 class="form-section">地址</h3>

												<div class="row-fluid">

													<div class="span12 ">

														<div class="control-group">

															<label class="control-label" >街道:</label>

															<div class="controls">

																<span class="text">#24 Sun Park Avenue, Rolton Str</span>

															</div>

														</div>

													</div>

												</div>

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >城市:</label>

															<div class="controls">

																<span class="text">New York</span>

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6">

														<div class="control-group">

															<label class="control-label" >状态:</label>

															<div class="controls">

																<span class="text">New York</span>

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<!--/row-->           

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >邮政编码:</label>

															<div class="controls">

																<span class="text">457890</span>

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >国别:</label>

															<div class="controls">

																<span class="text">USA</span>

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<div class="form-actions">

													<button type="submit" class="btn blue"><i class="icon-pencil"></i> 编辑</button>

													<button type="button" class="btn">返回</button>

												</div>

											</div>

											<!-- END FORM-->  

										</div>

									</div>

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
		FormSamples.init();
	});
</script>
</body>
</html>