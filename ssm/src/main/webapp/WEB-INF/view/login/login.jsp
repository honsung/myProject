<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/view/common/global.jsp" %>
<%@include file="/WEB-INF/view/common/common_login.jsp" %>
<link href="<%=request.getContextPath() %>/static/css/login.css" rel="stylesheet" type="text/css"/>
<title>登录</title>
</head>
<body class="login">
	<!-- BEGIN LOGO -->
	<div class="logo">
		<img src="<%=request.getContextPath()%>/static/image/logo-big.png" alt="" />
	</div>
	<!-- END LOGO -->
	<!-- BEGIN LOGIN -->
	<div class="content">
		<!-- BEGIN LOGIN FORM -->
		<form class="form-vertical login-form" action="<%=baseDir%>/loginGap" method="post">
			<h3 class="form-title">登录您的账户</h3>
			<div class="alert alert-error hide">
				<button class="close" data-dismiss="alert"></button>
				<span>输入任何用户名和密码</span>
			</div>
			<div class="control-group">
				<!--IE8，IE9不支持HTML5的占位符，所以我们只是显示为字段标题-->
				<label class="control-label visible-ie8 visible-ie9">用户名</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-user"></i> <input class="m-wrap placeholder-no-fix" type="text" placeholder="用户名" name="loginId" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">密码</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-lock"></i><input class="m-wrap placeholder-no-fix"type="password" placeholder="密码" name="password" />
					</div>
				</div>
			</div>

			<div class="form-actions">
				<label class="checkbox"> <input type="checkbox" name="remember" value="1" /> 记住我 </label>
				<button type="submit" class="btn green pull-right">
					登录 <i class="m-icon-swapright m-icon-white"></i>
				</button>
			</div>
			<div class="forget-password">
				<h4>忘记的密码 ?</h4>
				<p>
					不用担心，点击 <a href="javascript:;" class=""id="forget-password">这儿</a> 重置密码。
				</p>
			</div>

			<div class="create-account">
				<p>
					还没有帐号 ?&nbsp; <a href="javascript:;"id="register-btn" class="">创建一个账号</a>
				</p>
			</div>
		</form>
		<!-- END LOGIN FORM -->

		<!-- BEGIN FORGOT PASSWORD FORM -->
		<form class="form-vertical forget-form" action="index.html">
			<h3 class="">忘记密码 ?</h3>
			<p>输入您的电子邮件地址下面重置您的密码.</p>
			<div class="control-group">
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-envelope"></i> <input
							class="m-wrap placeholder-no-fix" type="text" placeholder="邮箱"
							name="email" />
					</div>
				</div>
			</div>
			<div class="form-actions">
				<button type="button" id="back-btn" class="btn">
					<i class="m-icon-swapleft"></i> 返回
				</button>
				<button type="submit" class="btn green pull-right">
					提交 <i class="m-icon-swapright m-icon-white"></i>
				</button>
			</div>
		</form>
		<!-- END FORGOT PASSWORD FORM -->

		<!-- BEGIN REGISTRATION FORM -->
		<form class="form-vertical register-form" action="index.html">
			<h3 class="">注册</h3>
			<p>输入您的帐户详情如下:</p>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">用户名</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-user"></i><input class="m-wrap placeholder-no-fix" type="text" placeholder="用户名" name="username" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">密码</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-lock"></i> <input class="m-wrap placeholder-no-fix"type="password" id="register_password" placeholder="密码"name="password" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">重新输入您的密码</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-ok"></i> <input class="m-wrap placeholder-no-fix"type="password" placeholder="重新输入密码" name="rpassword" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
				<label class="control-label visible-ie8 visible-ie9">邮箱</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-envelope"></i> <input
							class="m-wrap placeholder-no-fix" type="text" placeholder="邮箱"
							name="email" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<label class="checkbox"> <input type="checkbox" name="tnc" />
						我同意 <a href="#">服务条款</a> 和 <a href="#">隐私政策</a>
					</label>
					<div id="register_tnc_error"></div>
				</div>
			</div>
			<div class="form-actions">
				<button id="register-back-btn" type="button" class="btn">
					<i class="m-icon-swapleft"></i> 返回
				</button>
				<button type="submit" id="register-submit-btn"
					class="btn green pull-right">
					注册 <i class="m-icon-swapright m-icon-white"></i>
				</button>
			</div>
		</form>
		<!-- END REGISTRATION FORM -->
	</div>
	<!-- END LOGIN -->
	<!-- BEGIN COPYRIGHT -->
	<div class="copyright">2013 &copy; Metronic. 管理员登录.</div>
	<!-- END COPYRIGHT -->
	<script>
		jQuery(document).ready(function() {     
		  App.init();
		  Login.init();
		});
	</script>
	<!-- END JAVASCRIPTS -->
</body>
</html>