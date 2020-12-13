<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String baseDir = request.getContextPath();
    pageContext.setAttribute("APP_PATH",baseDir);
%> 
	<!-- STATR GLOBAL MANDATORY STYLES -->
	<link href="<%=baseDir%>/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="<%=baseDir%>/static/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
	<link href="<%=baseDir%>/static/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link href="<%=baseDir%>/static/css/style-metro.css" rel="stylesheet" type="text/css"/>
	<link href="<%=baseDir%>/static/css/style.css" rel="stylesheet" type="text/css"/>
	<link href="<%=baseDir%>/static/css/style-responsive.css" rel="stylesheet" type="text/css"/>
	<link href="<%=baseDir%>/static/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>
	<link href="<%=baseDir%>/static/css/uniform.default.css" rel="stylesheet" type="text/css"/>
	<!-- END GLOBAL MANDATORY STYLES -->
	<link rel="shortcut icon" href="<%=baseDir%>/static/image/favicon.ico" />

	
	
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<!-- BEGIN CORE PLUGINS -->
	<script src="<%=baseDir%>/static/js/jquery-1.10.1.min.js" type="text/javascript"></script>
	<script src="<%=baseDir%>/static/js/jquery-migrate-1.2.1.min.js"
		type="text/javascript"></script>
	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
	<script src="<%=baseDir%>/static/js/jquery-ui-1.10.1.custom.min.js"
		type="text/javascript"></script>
	<script src="<%=baseDir%>/static/js/bootstrap.min.js" type="text/javascript"></script>
	<!--[if lt IE 9]>
	<script src="<%=baseDir%>/static/js/excanvas.min.js"></script>
	<script src="<%=baseDir%>/static/js/respond.min.js"></script>  
	<![endif]-->
	<script src="<%=baseDir%>/static/js/jquery.slimscroll.min.js" type="text/javascript"></script>
	<script src="<%=baseDir%>/static/js/jquery.blockui.min.js" type="text/javascript"></script>
	<script src="<%=baseDir%>/static/js/jquery.cookie.min.js" type="text/javascript"></script>
	<script src="<%=baseDir%>/static/js/jquery.uniform.min.js" type="text/javascript"></script>
	<!-- END CORE PLUGINS -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/common/menu.js"></script> 
	<script>
	  var baseDir = "<%=baseDir%>";
	</script>