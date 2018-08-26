<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>多文件上传</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@include file="/WEB-INF/view/common/global.jsp" %>
<%@include file="/WEB-INF/view/common/common_fileupload.jsp" %>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script>  
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/form-fileupload.js"></script>    
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
							多文件上传 <small>文件上传</small>
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
							<li><a href="#">文件上传</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
               
				<div class="row-fluid">

					<div class="span12">

						<blockquote>

							<p style="font-size:16px">具有多个文件选择的文件上载小部件, jQuery的拖放支持、进度条和预览图像。<br>
								支持跨域、分块和可恢复的文件上传客户端图像缩放。<br>
								任何服务器端平台（PHP，Python，Ruby在Rails上，java，Node.js，Go等），支持标准的HTML表单上传文件。
							</p>

						</blockquote>

						<br>

						<!-- 文件上载表单用作文件上传小部件的目标。-->

						<form id="fileupload" action="//jquery-file-upload.appspot.com/" method="POST" enctype="multipart/form-data">

							<!-- 将禁用JavaScript的浏览器重定向到原点页面 -->

							<noscript><input type="hidden" name="redirect" value="http://blueimp.github.com/jQuery-File-Upload/"></noscript>

							<!-- FileUpload按钮包含的按钮来添加/删除文件和启动/取消上传 -->

							<div class="row-fluid fileupload-buttonbar">

								<div class="span7">

									<!-- FileInput按钮跨度是用来设计文件输入字段按钮-->

									<span class="btn green fileinput-button">

									<i class="icon-plus icon-white"></i>

									<span>添加文件...</span>

									<input type="file" name="files[]" multiple>

									</span>

									<button type="submit" class="btn blue start">

									<i class="icon-upload icon-white"></i>

									<span>开始上传</span>

									</button>

									<button type="reset" class="btn yellow cancel">

									<i class="icon-ban-circle icon-white"></i>

									<span>取消上传</span>

									</button>

									<button type="button" class="btn red delete">

									<i class="icon-trash icon-white"></i>

									<span>删除</span>

									</button>

									<input type="checkbox" class="toggle fileupload-toggle-checkbox">

								</div>

								<!-- 全局进度信息 -->

								<div class="span5 fileupload-progress fade">

									<!-- 全局进度条-->

									<div class="progress progress-success progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100">

										<div class="bar" style="width:0%;"></div>

									</div>

									<!-- 扩展的全局进度信息 -->

									<div class="progress-extended">&nbsp;</div>

								</div>

							</div>

							<!-- 加载指示器显示在文件处理过程中。 -->

							<div class="fileupload-loading"></div>

							<br>

							<!-- 列出上载/下载可用文件的表 -->

							<table role="presentation" class="table table-striped">

								<tbody class="files" data-toggle="modal-gallery" data-target="#modal-gallery"></tbody>

							</table>

						</form>

						<br>

						<div class="well">

							<h3>示例说明</h3>

							<ul>

								<li>此演示中上传的最大文件大小是<strong>5 MB</strong>（默认文件大小是无限的）。</li>

								<li>此演示中只允许图像文件（<strong>JPG、GIF、PNG</strong>）（默认情况下没有文件类型限制）。</li>

								<li>上传文件将在<strong>5分钟</strong>后自动删除（演示设置）。</li>

								<li>你可以在这个网页上用谷歌浏览器，Mozilla Firefox和苹果Safari<strong>拖放</strong>文件。</li>

								<li>有关更多信息，请参阅<a href="https://github.com/blueimp/jQuery-File-Upload/wiki">官方插件文档</a>。  </li>

							</ul>

						</div>

					</div>

				</div>

				<div class="row-fluid">

					<div class="span12">

						<script id="template-upload" type="text/x-tmpl">

							{% for (var i=0, file; file=o.files[i]; i++) { %}

							    <tr class="template-upload fade">

							        <td class="preview"><span class="fade"></span></td>

							        <td class="name"><span>{%=file.name%}</span></td>

							        <td class="size"><span>{%=o.formatFileSize(file.size)%}</span></td>

							        {% if (file.error) { %}

							            <td class="error" colspan="2"><span class="label label-important">错误</span> {%=file.error%}</td>

							        {% } else if (o.files.valid && !i) { %}

							            <td>

							                <div class="progress progress-success progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0"><div class="bar" style="width:0%;"></div></div>

							            </td>

							            <td class="start">{% if (!o.options.autoUpload) { %}

							                <button class="btn">

							                    <i class="icon-upload icon-white"></i>

							                    <span>开始</span>

							                </button>

							            {% } %}</td>

							        {% } else { %}

							            <td colspan="2"></td>

							        {% } %}

							        <td class="cancel">{% if (!i) { %}

							            <button class="btn red">

							                <i class="icon-ban-circle icon-white"></i>

							                <span>取消</span>

							            </button>

							        {% } %}</td>

							    </tr>

							{% } %}

						</script>

						<!-- The template to display files available for download -->

						<script id="template-download" type="text/x-tmpl">

							{% for (var i=0, file; file=o.files[i]; i++) { %}

							    <tr class="template-download fade">

							        {% if (file.error) { %}

							            <td></td>

							            <td class="name"><span>{%=file.name%}</span></td>

							            <td class="size"><span>{%=o.formatFileSize(file.size)%}</span></td>

							            <td class="error" colspan="2"><span class="label label-important">错误</span> {%=file.error%}</td>

							        {% } else { %}

							            <td class="preview">

							            {% if (file.thumbnail_url) { %}

							                <a class="fancybox-button" data-rel="fancybox-button" href="{%=file.url%}" title="{%=file.name%}">

							                <img src="<%=request.getContextPath()%>/static/image/{%=file.thumbnail_url%}">

							                </a>

							            {% } %}</td>

							            <td class="name">

							                <a href="{%=file.url%}" title="{%=file.name%}" data-gallery="{%=file.thumbnail_url&&'gallery'%}" download="{%=file.name%}">{%=file.name%}</a>

							            </td>

							            <td class="size"><span>{%=o.formatFileSize(file.size)%}</span></td>

							            <td colspan="2"></td>

							        {% } %}

							        <td class="delete">

							            <button class="btn red" data-type="{%=file.delete_type%}" data-url="{%=file.delete_url%}"{% if (file.delete_with_credentials) { %} data-xhr-fields='{"withCredentials":true}'{% } %}>

							                <i class="icon-trash icon-white"></i>

							                <span>删除</span>

							            </button>

							            <input type="checkbox" class="fileupload-checkbox hide" name="delete" value="1">

							        </td>

							    </tr>

							{% } %}

						</script>

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
		FormFileUpload.init();
	});
</script>
</body>
</html>