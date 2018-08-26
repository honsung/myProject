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
					<i class="icon-gift"></i> 
					<span class="title">错误页面</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a id="extra_404_option1" href="<%=request.getContextPath()%>/extra/extra_404_option1?menu=extra_404_option1">
							404页</a>
						</li>
						<li >
							<a id="extra_500_option1" href="<%=request.getContextPath()%>/extra/extra_500_option1?menu=extra_500_option1">
							500 页</a>
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
						<li>
							<a href="javascript:;">
							<i class="icon-folder-open"></i> 
							组织机构管理
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li><a href="#"><i class="icon-folder-open"></i>组织机构</a></li>
								<li><a id="employeeList" href="<%=request.getContextPath()%>/employee/list?menu=employeeList"><i class="icon-user"></i>用户档案</a></li>
							</ul>
						</li>
						<li>
							<a href="javascript:;">
							<i class="icon-folder-close"></i> 
							用户权限管理
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li><a id="userList" href="<%=request.getContextPath()%>/sys_User/list?menu=userList"><i class="icon-user"></i>用户信息管理</a></li>
								<li><a href="#"><i class="icon-user"></i>用户角色管理</a></li>
								<li><a href="#"><i class="icon-user"></i>用户权限分配</a></li>
								<li><a href="#"><i class="icon-user"></i>在线用户管理</a></li>
							</ul>
						</li>
						<li>
							<a href="javascript:;">
							<i class="icon-cogs"></i> 
							数据字典管理
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li><a href="#"><i class="icon-folder-open"></i>基础字典维护</a></li>
								<li><a href="#"><i class="icon-folder-open"></i>位置字典维护</a></li>
							</ul>
						</li>
						<li >
							<a id="main" href="<%=request.getContextPath()%>/sys_Menu/main?menu=main"><i class="icon-cogs"></i>功能菜单管理</a>
						</li>
					</ul>
				</li>
			</ul>
		<!-- 侧边栏菜单 结束 -->
	</div>
	<!-- 侧边栏 结束 -->
