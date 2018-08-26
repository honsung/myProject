<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <script type="text/javascript">
  var menu = '${menuId}';//为menu.js中menuId接受后台值
</script>
    <!-- 此部分为菜单栏部分 -->
    <!-- 侧边栏 开始  -->
	<div class="page-sidebar nav-collapse collapse">
		<!-- 侧边栏菜单 开始 -->        
		<ul class="page-sidebar-menu">
				<li>
					<!--侧边栏显示开关按钮 开始 -->
					<div class="sidebar-toggler hidden-phone"></div>
					<!--侧边栏显示开关按钮 结束 -->
				</li>
				<li>
					<!-- 响应快速搜索表单 开始 -->
					<form class="sidebar-search">
						<div class="input-box">
							<a href="javascript:;" class="remove"></a>
							<input type="text" placeholder="搜索..." />
							<input type="button" class="submit" value=" " />
						</div>
					</form>
					<!-- 响应快速搜索表单 结束 -->
				</li>
				<li class="start">
					<a href="<%=request.getContextPath()%>/index">
					<i class="icon-home"></i> 
					<span class="title">首页</span>
					<!-- <span class="selected"></span> -->
					</a>
				</li>
				<li >
					<a href="javascript:;">
					<i class="icon-cogs"></i> 
					<span class="title">布局</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="layout_horizontal_sidebar_menu.html">
							水平 & 侧边栏菜单</a>
						</li>
						<li>
							<a href="layout_horizontal_menu1.html">
							水平菜单 1</a>
						</li>
						<li>
							<a href="layout_horizontal_menu2.html">
							水平菜单 2</a>
						</li>
						<li >
							<a href="layout_promo.html">
							促销页面</a>
						</li>
						<li >
							<a href="layout_email.html">
							电子邮件模板</a>
						</li>
						<li >
							<a href="layout_ajax.html">
							通过ajax加载内容</a>
						</li>
						<li >
							<a href="layout_sidebar_closed.html">
							侧边栏关闭页面</a>
						</li>
						<li >
							<a id="layout_blank" href="<%=request.getContextPath()%>/layout/blank?menu=layout_blank">
							空白页</a>
						</li>
						<li >
							<a href="layout_boxed_page.html">
							盒装页</a>
						</li>
						<li >
							<a href="layout_boxed_not_responsive.html">
							无响应装箱布局</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-bookmark-empty"></i> 
					<span class="title">用户界面功能</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="ui_general.html">
							一般</a>
						</li>
						<li >
							<a href="ui_buttons.html">
							按钮</a>
						</li>
						<li >
							<a id="layout_modals" href="<%=request.getContextPath()%>/layout/modals?menu=layout_modals">
							弹出框</a>
						</li>
						<li >
							<a href="ui_tabs_accordions.html">
							标签 & 手风琴</a>
						</li>
						<li >
							<a href="ui_jqueryui.html">
							jQuery UI组件</a>
						</li>
						<li >
							<a href="ui_sliders.html">
							滑块</a>
						</li>
						<li >
							<a href="ui_tiles.html">
							瓷砖</a>
						</li>
						<li >
							<a href="ui_typography.html">
							排版</a>
						</li>
						<li >
							<a href="ui_tree.html">
							树视图</a>
						</li>
						<li >
							<a href="ui_nestable.html">
							嵌套的列表</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-table"></i> 
					<span class="title">表单填充</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a id="form_layout" href="<%=request.getContextPath()%>/form/layout?menu=form_layout">
							表单布局</a>
						</li>
						<li >
							<a id="form_advance" href="<%=request.getContextPath()%>/form/advance?menu=form_advance">
							表单例子</a>
						</li>
						<li >
							<a id="form_dynamicAdvance" href="<%=request.getContextPath()%>/form/dynamicAdvance?menu=form_dynamicAdvance">
							动态多页签表单列子</a>
						</li>
						<li >
							<a id="form_component" href="<%=request.getContextPath()%>/form/component?menu=form_component">
							表单组件</a>
						</li>
						<li >
							<a href="form_wizard.html">
							表单向导</a>
						</li>
						<li >
							<a id="form_validation" href="<%=request.getContextPath()%>/form/validation?menu=form_validation">
							表单验证</a>
						</li>
						<li >
							<a id="form_multiple_file_upload" href="<%=request.getContextPath()%>/form/multiple_file_upload?menu=form_multiple_file_upload">
							多文件上传</a>
						</li>
						<li >
							<a id="form_dropzone" href="<%=request.getContextPath()%>/form/dropzone?menu=form_dropzone">
							悬浮窗文件上传</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-briefcase"></i> 
					<span class="title">网页</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="page_timeline.html">
							<i class="icon-time"></i>
							时间表</a>
						</li>
						<li >
							<a href="page_coming_soon.html">
							<i class="icon-cogs"></i>
							倒计时</a>
						</li>
						<li >
							<a href="page_blog.html">
							<i class="icon-comments"></i>
							博客</a>
						</li>
						<li >
							<a href="page_blog_item.html">
							<i class="icon-font"></i>
							博文</a>
						</li>
						<li >
							<a href="page_news.html">
							<i class="icon-coffee"></i>
							新闻</a>
						</li>
						<li >
							<a href="page_news_item.html">
							<i class="icon-bell"></i>
							新闻预览</a>
						</li>
						<li >
							<a href="page_about.html">
							<i class="icon-group"></i>
							关于我们</a>
						</li>
						<li >
							<a href="page_contact.html">
							<i class="icon-envelope-alt"></i>
							联系我们</a>
						</li>
						<li >
							<a href="page_calendar.html">
							<i class="icon-calendar"></i>
							日历</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-gift"></i> 
					<span class="title">其他</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="extra_profile.html">
							用户配置文件</a>
						</li>
						<li >
							<a href="extra_lock.html">
							锁屏</a>
						</li>
						<li >
							<a href="extra_faq.html">
							常见问题解答(FAQ)</a>
						</li>
						<li >
							<a href="inbox.html">
							收件箱</a>
						</li>
						<li >
							<a href="extra_search.html">
							搜索结果</a>
						</li>
						<li >
							<a href="extra_invoice.html">
							发票联</a>
						</li>
						<li >
							<a href="extra_pricing_table.html">
							定价表</a>
						</li>
						<li >
							<a href="extra_image_manager.html">
							图像管理</a>
						</li>
						<li >
							<a id="extra_404_option1" href="<%=request.getContextPath()%>/extra/extra_404_option1?menu=extra_404_option1">
							404页的选项 1</a>
						</li>
						<li >
							<a href="extra_404_option2.html">
							404页的选项 2</a>
						</li>
						<li >
							<a href="extra_404_option3.html">
							404页的选项 3</a>
						</li>
						<li >
							<a id="extra_500_option1" href="<%=request.getContextPath()%>/extra/extra_500_option1?menu=extra_500_option1">
							500 页的选项 1</a>
						</li>
						<li >
							<a href="extra_500_option2.html">
							500 页的选项 2</a>
						</li>
					</ul>
				</li>
				<li>
					<a class="active" href="javascript:;">
					<i class="icon-sitemap"></i> 
					<span class="title">3 级菜单</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="javascript:;">
							Item 1
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li><a href="#">示例链接 1</a></li>
								<li><a href="#">示例链接 2</a></li>
								<li><a href="#">示例链接 3</a></li>
							</ul>
						</li>
						<li>
							<a href="javascript:;">
							Item 1
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li><a href="#">示例链接 1</a></li>
								<li><a href="#">示例链接 1</a></li>
								<li><a href="#">示例链接1</a></li>
							</ul>
						</li>
						<li>
							<a href="#">
							Item 3
							</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-folder-open"></i> 
					<span class="title">4 级菜单</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="javascript:;">
							<i class="icon-cogs"></i> 
							Item 1
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li>
									<a href="javascript:;">
									<i class="icon-user"></i>
									示例链接 1
									<span class="arrow"></span>
									</a>
									<ul class="sub-menu">
										<li><a href="#"><i class="icon-remove"></i> 示例链接 1</a></li>
										<li><a href="#"><i class="icon-pencil"></i>示例链接  1</a></li>
										<li><a href="#"><i class="icon-edit"></i> 示例链接 1</a></li>
									</ul>
								</li>
								<li><a href="#"><i class="icon-user"></i>  示例链接1</a></li>
								<li><a href="#"><i class="icon-external-link"></i>  示例链接 2</a></li>
								<li><a href="#"><i class="icon-bell"></i>  示例链接 3</a></li>
							</ul>
						</li>
						<li>
							<a href="javascript:;">
							<i class="icon-globe"></i> 
							Item 2
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li><a href="#"><i class="icon-user"></i>  示例链接 1</a></li>
								<li><a href="#"><i class="icon-external-link"></i>  示例链接 1</a></li>
								<li><a href="#"><i class="icon-bell"></i> 示例链接 1</a></li>
							</ul>
						</li>
						<li>
							<a href="#">
							<i class="icon-folder-open"></i>
							Item 3
							</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-user"></i> 
					<span class="title">登录选项</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="login.html">
							登录表单 1</a>
						</li>
						<li >
							<a href="login_soft.html">
							登录表单 2</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-th"></i> 
					<span class="title">数据表</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a id="table_basic" href="<%=request.getContextPath()%>/table/basic?menu=table_basic">
							基本表格</a>
						</li>
						<li >
							<a id="table_responsive" href="<%=request.getContextPath()%>/table/responsive?menu=table_responsive">
							响应表</a>
						</li>
						<li >
							<a id="table_managed" href="<%=request.getContextPath()%>/table/managed?menu=table_managed">
							管理表</a>
						</li>
						<li >
							<a id="table_editable" href="<%=request.getContextPath()%>/table/editable?menu=table_editable">
							可编辑的表格</a>
						</li>
						<li >
							<a id="table_advanced" href="<%=request.getContextPath()%>/table/advanced?menu=table_advanced">
							推进的表格</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-file-text"></i> 
					<span class="title">组件</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="portlet_general.html">
							一般组件</a>
						</li>
						<li >
							<a href="portlet_draggable.html">
							可拖动的组件</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-map-marker"></i> 
					<span class="title">地图</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="maps_baidu.html">
							百度地图</a>
						</li>
						<li>
							<a href="maps_amap.html">
							高德地图</a>
						</li>
						<li >
							<a href="maps_google.html">
							谷歌地图</a>
						</li>
						<li >
							<a href="maps_vector.html">
							矢量地图</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-bar-chart"></i> 
					<span class="title">图表</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="charts.html">
							直观图表</a>
						</li>
						<li >
							<a href="echart.html">
							百度图表</a>
						</li>
					</ul>
				</li>
				<li class="last">
					<a href="javascript:;">
					<i class="icon-cogs"></i> 
					<span class="title">系统管理</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a id="userList" href="<%=request.getContextPath()%>/sys_User/list?menu=userList">
							用户管理</a>
						</li>
					</ul>
				</li>
			</ul>
		<!-- 侧边栏菜单 结束 -->
	</div>
	<!-- 侧边栏 结束 -->
