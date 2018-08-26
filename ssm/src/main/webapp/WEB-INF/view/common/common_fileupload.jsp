<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="<%=request.getContextPath()%>/static/css/dropzone.css" rel="stylesheet"/><!-- 悬浮窗文件上传CSS -->
<link href="<%=request.getContextPath()%>/static/css/jquery.fancybox.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/jquery.fileupload-ui.css" rel="stylesheet" />
<script src="<%=request.getContextPath()%>/static/js/jquery.fancybox.pack.js"></script>
<!-- BEGIN:文件上传插件js文件-->
<script src="<%=request.getContextPath()%>/static/js/jquery.ui.widget.js"></script>
<!-- 模板插件包括渲染上传/下载列表。 -->
<script src="<%=request.getContextPath()%>/static/js/tmpl.min.js"></script>
<!-- 加载图像插件包含预览图像和图像调整功能。 -->
<script src="<%=request.getContextPath()%>/static/js/load-image.min.js"></script>
<!-- 画布插件插件包含了图像调整功能。 -->
<script src="<%=request.getContextPath()%>/static/js/canvas-to-blob.min.js"></script>
<!-- iframe的运输所需的浏览器不支持XHR文件上传 -->
<script src="<%=request.getContextPath()%>/static/js/jquery.iframe-transport.js"></script>
<!-- 基本文件上传插件-->
<script src="<%=request.getContextPath()%>/static/js/jquery.fileupload.js"></script>
<!-- 文件上传文件处理插件 -->
<script src="<%=request.getContextPath()%>/static/js/jquery.fileupload-fp.js"></script>
<!-- 文件上传用户界面插件 -->
<script src="<%=request.getContextPath()%>/static/js/jquery.fileupload-ui.js"></script>
<!-- The XDomainRequest Transport is included for cross-domain file deletion for IE8+ -->
<!--[if gte IE 8]><script src="<%=request.getContextPath()%>/static/js/jquery.xdr-transport.js"></script><![endif]-->
	<!-- END:文件上传插件js文件-->
