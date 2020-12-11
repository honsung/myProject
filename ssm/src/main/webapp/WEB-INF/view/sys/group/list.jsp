<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@include file="/WEB-INF/view/common/global.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/select2_metro.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/DT_bootstrap.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap-tree.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/select2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/DT_bootstrap.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script>   
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/bootstrap-tree.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/ui-tree.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/sys/group/list.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/sys/group/ui-tree.js"></script> 
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
                            系统管理 <small>组织机构维护</small>
                        </h3>
                        <ul class="breadcrumb">
                            <li>
                                <i class="icon-home"></i>
                                <a href="index.html">主页</a> 
                                <span class="icon-angle-right"></span>
                            </li>
                            <li>
                                <a href="#">系统管理</a>
                                <span class="icon-angle-right"></span>
                            </li>
                            <li><a href="#">组织机构维护</a></li>
                        </ul>
                        <!-- 页面导航级别显示 结束-->
                    </div>
                </div>
                <!-- 页面主内容区域 头部 结束-->
                <div class="row-fluid">
                   <div class="span3">
                        <div class="portlet box grey">
                            <div class="portlet-title">
                                <div class="caption"><i class="icon-comments"></i>组织机构树</div>
                            </div>
                            <div class="portlet-body fuelux">
                                <ul class="tree" id="tree_1">
                                    <li>
                                        <a href="#" data-role="branch" class="tree-toggle" data-toggle="branch" data-value="Bootstrap_Tree">
                                        Bootstrap Tree
                                        </a>
                                        <ul class="branch in">
                                            <li>
                                                <a href="#" class="tree-toggle" data-toggle="branch" data-value="Bootstrap_Tree" id="nut1">
                                                Documents
                                                </a>
                                                <ul class="branch in">
                                                    <li>
                                                        <a href="#" class="tree-toggle closed" data-toggle="branch" data-value="Bootstrap_Tree" id="nut2">
                                                        Finance
                                                        </a>
                                                        <ul class="branch">
                                                            <li><a href="#" data-role="leaf"><i class="icon-suitcase"></i> Sale Revenue</a></li>
                                                            <li><a href="#" data-role="leaf"><i class="icon-signal"></i> Promotions</a></li>
                                                            <li><a href="#" data-role="leaf"><i class="icon-sitemap"></i> IPO</a></li>
                                                        </ul>
                                                    </li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-signal"></i> ICT</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-sitemap"></i> Human Resources</a></li>
                                                </ul>
                                            </li>
                                            <li>
                                                <a href="#" class="tree-toggle closed" data-toggle="branch" data-value="Bootstrap_Tree" id="nut3">
                                                Projects
                                                </a>
                                                <ul class="branch">
                                                    <li><a href="#" data-role="leaf"><i class="icon-glass"></i> Internal</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-group"></i> Client Base</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-retweet"></i> Product Base</a></li>
                                                </ul>
                                            </li>
                                            <li>
                                                <a href="#" class="tree-toggle" data-toggle="branch" data-value="Bootstrap_Tree" id="nut4">
                                                Tasks
                                                </a>
                                                <ul class="branch in">
                                                    <li><a href="#" data-role="leaf"><i class="icon-suitcase"></i> Internal Projects</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-cloud-download"></i> Outsourcing</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-sitemap"></i> Bug Tracking</a></li>
                                                </ul>
                                            </li>
                                            <li>
                                                <a href="#" class="tree-toggle closed" data-toggle="branch" data-value="Bootstrap_Tree" id="nut6">
                                                Customers
                                                </a>
                                                <ul class="branch">
                                                    <li><a href="#" data-role="leaf"><i class="icon-suitcase"></i> Finance</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-signal"></i> ICT</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-sitemap"></i> Human Resources</a></li>
                                                </ul>
                                            </li>
                                            <li>
                                                <a href="#" class="tree-toggle closed" data-toggle="branch" data-value="Bootstrap_Tree" id="nut8">
                                                Reports
                                                </a>
                                                <ul class="branch">
                                                    <li><a href="#" data-role="leaf"><i class="icon-suitcase"></i> Finance</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-signal"></i> ICT</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-sitemap"></i> Human Resources</a></li>
                                                </ul>
                                            </li>
                                            <li>
                                                <a href="http://www.baidu.com" target="_blank" role="branch" class="tree-toggle closed" data-toggle="branch" data-value="Bootstrap_Tree" id="nut10">
                                                <i class="icon-sitemap"></i> 百度
                                                </a>
                                                <ul class="branch">
                                                    <li><a href="#" data-role="leaf"><i class="icon-sitemap"></i> 百度知道</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-sitemap"></i> 百度新闻</a></li>
                                                    <li><a href="#" data-role="leaf"><i class="icon-sitemap"></i> 百度贴吧</a></li>
                                                </ul>
                                            </li>
                                            <li>
                                                <a href="http://themeforest.net/item/conquer-responsive-admin-dashboard-template/3716838" target="_blank" data-role="leaf">
                                                <i class="icon-share"></i> Another External Link
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                   <div class="span9">
                        <div class="portlet box grey">
                                        <div class="portlet-title">
                                            <div class="caption"><i class="icon-reorder"></i>表单例子</div>
                                            <div class="actions tools">
                                                <a href="javascript:;" class="btn green"><i class="icon-plus"></i> 添加</a>
                                                <a href="javascript:;" class="btn green"><i class="icon-pencil"></i> 修改</a>
                                                <a href="javascript:;" class="btn green"><i class="icon-sort"></i> 排序</a>
                                                <a href="javascript:;" class="collapse"></a>
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
                                            </div>
                                            <!-- END FORM-->  
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
        UITree.init();
    });
</script>
</body>
</html>