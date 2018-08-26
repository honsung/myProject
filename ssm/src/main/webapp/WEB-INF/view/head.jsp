<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!-- 头部开始 -->
	<div class="header navbar navbar-inverse navbar-fixed-top">
		<!-- 顶部导航栏菜单 开始 -->
		<div class="navbar-inner">
			<div class="container-fluid">
				<!-- Logo开始 -->
				<a class="brand" href="index.html">
				<img src="<%=request.getContextPath() %>/static/image/logo.png" alt="logo"/>
				</a>
				<!-- Logo结束 -->
				
				<!-- BEGIN HORIZANTAL MENU -->
				<div class="navbar hor-menu hidden-phone hidden-tablet">
					<div class="navbar-inner">
						<ul class="nav">
							<li class="visible-phone visible-tablet">
								<!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
								<form class="sidebar-search">
									<div class="input-box">
										<a href="javascript:;" class="remove"></a>
										<input type="text" placeholder="搜索..." />            
										<input type="button" class="submit" value=" " />
									</div>
								</form>
								<!-- END RESPONSIVE QUICK SEARCH FORM -->
							</li>
							<!-- <li class="active">
								<a href="index.html">
								首页
								<span class="selected"></span>
								</a>
							</li> -->
							<li>
								<a href="">流程管理</a>                      
							</li>
							<li>
								<a href="">系统管理</a>                      
							</li>
							<li>
								<a href="">代码生成器</a>
							</li>
							<li>
								<a data-toggle="dropdown" class="dropdown-toggle" href="">其他
								<span class="arrow"></span>
								</a>
								<ul class="dropdown-menu">
									<li><a href="index.html">关于我们</a></li>
									<li><a href="index.html">常见问题</a></li>
								</ul>
								<b class="caret-out"></b>                        
							</li>
							<li>
								<span class="hor-menu-search-form-toggler">&nbsp;</span>
								<div class="search-form hidden-phone hidden-tablet">
									<form class="form-search">
										<div class="input-append">
											<input type="text" placeholder="搜索..." class="m-wrap">
											<button type="button" class="btn"></button>
										</div>
									</form>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<!-- END HORIZANTAL MENU -->
				
				<!-- BEGIN RESPONSIVE MENU TOGGLER -->
				<a href="javascript:;" class="btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse">
				<img src="<%=request.getContextPath() %>/static/image/menu-toggler.png" alt="" />
				</a>          
				<!-- END RESPONSIVE MENU TOGGLER --> 
				           
				<!-- 头部菜单 -->              
				<ul class="nav pull-right">
					<!-- 通知开始 -->   
					<li class="dropdown" id="header_notification_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-warning-sign"></i>
						<span class="badge">6</span>
						</a>
						<ul class="dropdown-menu extended notification">
							<li>
								<p>您有14个新通知</p>
							</li>
							<li>
								<a href="#">
								<span class="label label-success"><i class="icon-plus"></i></span>
							新用户注册 
								<span class="time">刚刚</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-important"><i class="icon-bolt"></i></span>
								12号服务器超负载. 
								<span class="time">15 分钟</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-warning"><i class="icon-bell"></i></span>
								2号服务器没有响应.
								<span class="time">22分钟</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-info"><i class="icon-bullhorn"></i></span>
								应用程序错误
								<span class="time">40分钟</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-important"><i class="icon-bolt"></i></span>
								数据库负载 68%. 
								<span class="time">2小时</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-important"><i class="icon-bolt"></i></span>
								2个用户IP阻塞
								<span class="time">5 小时</span>
								</a>
							</li>
							<li class="external"> 
								<a href="#">查看更多消息 <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- 通知结束 -->

					<!-- 新消息开始-->
					<li class="dropdown" id="header_inbox_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-envelope"></i>
						<span class="badge">5</span>
						</a>
						<ul class="dropdown-menu extended inbox">
							<li>
								<p>你有12条新消息</p>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo"><img src="<%=request.getContextPath() %>/static/image/avatar2.jpg" alt="" /></span>
								<span class="subject">
								<span class="from">张三</span>
								<span class="time">现在</span>
								</span>
								<span class="message">
								老王找打麻将
								</span>  
								</a>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo"><img src="<%=request.getContextPath() %>/static/image/avatar3.jpg" alt="" /></span>
								<span class="subject">
								<span class="from">李四</span>
								<span class="time">16 分钟</span>
								</span>
								<span class="message">
								几点钟
								</span>  
								</a>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo"><img src="<%=request.getContextPath() %>/static/image/avatar1.jpg" alt="" /></span>
								<span class="subject">
								<span class="from">王五</span>
								<span class="time">2 小时</span>
								</span>
								<span class="message">
								只有晚上有时间
								</span>  
								</a>
							</li>
							<li class="external">
								<a href="inbox.html">查看全部信息 <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- 新消息结束 -->

					<!-- 待办任务 开始 -->
					<li class="dropdown" id="header_task_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-tasks"></i>
						<span class="badge">5</span>
						</a>
						<ul class="dropdown-menu extended tasks">
							<li>
								<p>你有12个待办任务</p>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">新版本v1.2</span>
								<span class="percent">30%</span>
								</span>
								<span class="progress progress-success ">
								<span style="width: 30%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">应用程序部署</span>
								<span class="percent">65%</span>
								</span>
								<span class="progress progress-danger progress-striped active">
								<span style="width: 65%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">移动应用程序发布</span>
								<span class="percent">98%</span>
								</span>
								<span class="progress progress-success">
								<span style="width: 98%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">数据库迁移</span>
								<span class="percent">10%</span>
								</span>
								<span class="progress progress-warning progress-striped">
								<span style="width: 10%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Web服务器升级</span>
								<span class="percent">58%</span>
								</span>
								<span class="progress progress-info">
								<span style="width: 58%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">移动开发</span>
								<span class="percent">85%</span>
								</span>
								<span class="progress progress-success">
								<span style="width: 85%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li class="external">
								<a href="#">查看全部待办任务 <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- 待办任务结束 -->

					<!-- 登录用户下拉菜单  开始-->
					<li class="dropdown user">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<img alt="" src="<%=request.getContextPath() %>/static/image/avatar1_small.jpg" />
						<span class="username">赵六</span>
						<i class="icon-angle-down"></i>
						</a>
						<ul class="dropdown-menu">
							<li><a href="extra_profile.html"><i class="icon-user"></i> 个人资料</a></li>
							<li><a href="page_calendar.html"><i class="icon-calendar"></i> 日历</a></li>
							<li><a href="inbox.html"><i class="icon-envelope"></i> 收件箱(3)</a></li>
							<li><a href="#"><i class="icon-tasks"></i> 我的待办任务</a></li>
							<li class="divider"></li>
							<li><a href="extra_lock.html"><i class="icon-lock"></i> 锁屏</a></li>
							<li><a href="login.html"><i class="icon-key"></i> 注销</a></li>
						</ul>
					</li>
					<!-- 登录用户下拉菜单  结束 -->
				</ul>
				<!-- 顶部导航菜单 结束 --> 
			</div>
		</div>
		<!-- 顶端导航条 结束 -->
	</div>
	<!-- 头部结束 -->