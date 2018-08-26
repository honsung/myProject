<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>响应表格</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@include file="/WEB-INF/view/common/global.jsp" %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/DT_bootstrap.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script> 
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
							响应表格 <small>响应表格例子</small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">主页</a> 
								<span class="icon-angle-right"></span>
							</li>
							<li>
								<a href="#">数据表</a>
								<span class="icon-angle-right"></span>
							</li>
							<li><a href="#">响应表格</a></li>
						</ul>
						<!-- 页面导航级别显示 结束-->
					</div>
				</div>
				<!-- 页面主内容区域 头部 结束-->
               <div class="row-fluid">
					<div class="span12">
						<div class="alert alert-success">
							<button class="close" data-dismiss="alert"></button>
							请尝试重新调整您的浏览器窗口，以便以响应模式查看表。
							<span class="label label-important">注:</span>&nbsp;这个特性得到了Internet Explorer 10、最新Firefox、Chrome、Opera和Safari的支持。
						</div>
						
						<!-- BEGIN SAMPLE TABLE PORTLET-->
						<div class="portlet box green">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Flip Scroll</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>

							<div class="portlet-body flip-scroll">
								<table class="table-bordered table-striped table-condensed flip-content">
									<thead class="flip-content">
										<tr>
											<th>Code</th>
											<th>Company</th>
											<th class="numeric">Price</th>
											<th class="numeric">Change</th>
											<th class="numeric">Change %</th>
											<th class="numeric">Open</th>
											<th class="numeric">High</th>
											<th class="numeric">Low</th>
											<th class="numeric">Volume</th>
										</tr>
									</thead>

									<tbody>

										<tr>

											<td>AAC</td>

											<td>AUSTRALIAN AGRICULTURAL COMPANY LIMITED.</td>

											<td class="numeric">$1.38</td>

											<td class="numeric">-0.01</td>

											<td class="numeric">-0.36%</td>

											<td class="numeric">$1.39</td>

											<td class="numeric">$1.39</td>

											<td class="numeric">$1.38</td>

											<td class="numeric">9,395</td>

										</tr>

										<tr>

											<td>AAD</td>

											<td>ARDENT LEISURE GROUP</td>

											<td class="numeric">$1.15</td>

											<td class="numeric">  +0.02</td>

											<td class="numeric">1.32%</td>

											<td class="numeric">$1.14</td>

											<td class="numeric">$1.15</td>

											<td class="numeric">$1.13</td>

											<td class="numeric">56,431</td>

										</tr>

										<tr>

											<td>AAX</td>

											<td>AUSENCO LIMITED</td>

											<td class="numeric">$4.00</td>

											<td class="numeric">-0.04</td>

											<td class="numeric">-0.99%</td>

											<td class="numeric">$4.01</td>

											<td class="numeric">$4.05</td>

											<td class="numeric">$4.00</td>

											<td class="numeric">90,641</td>

										</tr>

										<tr>

											<td>ABC</td>

											<td>ADELAIDE BRIGHTON LIMITED</td>

											<td class="numeric">$3.00</td>

											<td class="numeric">  +0.06</td>

											<td class="numeric">2.04%</td>

											<td class="numeric">$2.98</td>

											<td class="numeric">$3.00</td>

											<td class="numeric">$2.96</td>

											<td class="numeric">862,518</td>

										</tr>

										<tr>

											<td>ABP</td>

											<td>ABACUS PROPERTY GROUP</td>

											<td class="numeric">$1.91</td>

											<td class="numeric">0.00</td>

											<td class="numeric">0.00%</td>

											<td class="numeric">$1.92</td>

											<td class="numeric">$1.93</td>

											<td class="numeric">$1.90</td>

											<td class="numeric">595,701</td>

										</tr>

										<tr>

											<td>ABY</td>

											<td>ADITYA BIRLA MINERALS LIMITED</td>

											<td class="numeric">$0.77</td>

											<td class="numeric">  +0.02</td>

											<td class="numeric">2.00%</td>

											<td class="numeric">$0.76</td>

											<td class="numeric">$0.77</td>

											<td class="numeric">$0.76</td>

											<td class="numeric">54,567</td>

										</tr>

										<tr>

											<td>ACR</td>

											<td>ACRUX LIMITED</td>

											<td class="numeric">$3.71</td>

											<td class="numeric">  +0.01</td>

											<td class="numeric">0.14%</td>

											<td class="numeric">$3.70</td>

											<td class="numeric">$3.72</td>

											<td class="numeric">$3.68</td>

											<td class="numeric">191,373</td>

										</tr>

										<tr>

											<td>ADU</td>

											<td>ADAMUS RESOURCES LIMITED</td>

											<td class="numeric">$0.72</td>

											<td class="numeric">0.00</td>

											<td class="numeric">0.00%</td>

											<td class="numeric">$0.73</td>

											<td class="numeric">$0.74</td>

											<td class="numeric">$0.72</td>

											<td class="numeric">8,602,291</td>

										</tr>

										<tr>

											<td>AGG</td>

											<td>ANGLOGOLD ASHANTI LIMITED</td>

											<td class="numeric">$7.81</td>

											<td class="numeric">-0.22</td>

											<td class="numeric">-2.74%</td>

											<td class="numeric">$7.82</td>

											<td class="numeric">$7.82</td>

											<td class="numeric">$7.81</td>

											<td class="numeric">148</td>

										</tr>

										<tr>

											<td>AGK</td>

											<td>AGL ENERGY LIMITED</td>

											<td class="numeric">$13.82</td>

											<td class="numeric">  +0.02</td>

											<td class="numeric">0.14%</td>

											<td class="numeric">$13.83</td>

											<td class="numeric">$13.83</td>

											<td class="numeric">$13.67</td>

											<td class="numeric">846,403</td>

										</tr>

										<tr>

											<td>AGO</td>

											<td>ATLAS IRON LIMITED</td>

											<td class="numeric">$3.17</td>

											<td class="numeric">-0.02</td>

											<td class="numeric">-0.47%</td>

											<td class="numeric">$3.11</td>

											<td class="numeric">$3.22</td>

											<td class="numeric">$3.10</td>

											<td class="numeric">5,416,303</td>

										</tr>

									</tbody>

								</table>

							</div>

						</div>

						<!-- END SAMPLE TABLE PORTLET-->

						<!-- BEGIN SAMPLE TABLE PORTLET-->

						<div class="portlet box blue">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>No More Tables</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body no-more-tables">

								<table class="table-bordered table-striped table-condensed cf">

									<thead class="cf">

										<tr>

											<th>Code</th>

											<th>Company</th>

											<th class="numeric">Price</th>

											<th class="numeric">Change</th>

											<th class="numeric">Change %</th>

											<th class="numeric">Open</th>

											<th class="numeric">High</th>

											<th class="numeric">Low</th>

											<th class="numeric">Volume</th>

										</tr>

									</thead>

									<tbody>

										<tr>

											<td data-title="Code">AAC</td>

											<td data-title="Company">AUSTRALIAN AGRICULTURAL COMPANY LIMITED.</td>

											<td data-title="Price" class="numeric">$1.38</td>

											<td data-title="Change" class="numeric">-0.01</td>

											<td data-title="Change %" class="numeric">-0.36%</td>

											<td data-title="Open" class="numeric">$1.39</td>

											<td data-title="High" class="numeric">$1.39</td>

											<td data-title="Low" class="numeric">$1.38</td>

											<td data-title="Volume" class="numeric">9,395</td>

										</tr>

										<tr>

											<td data-title="Code">AAD</td>

											<td data-title="Company">ARDENT LEISURE GROUP</td>

											<td data-title="Price" class="numeric">$1.15</td>

											<td data-title="Change" class="numeric">  +0.02</td>

											<td data-title="Change %" class="numeric">1.32%</td>

											<td data-title="Open" class="numeric">$1.14</td>

											<td data-title="High" class="numeric">$1.15</td>

											<td data-title="Low" class="numeric">$1.13</td>

											<td data-title="Volume" class="numeric">56,431</td>

										</tr>

										<tr>

											<td data-title="Code">AAX</td>

											<td data-title="Company">AUSENCO LIMITED</td>

											<td data-title="Price" class="numeric">$4.00</td>

											<td data-title="Change" class="numeric">-0.04</td>

											<td data-title="Change %" class="numeric">-0.99%</td>

											<td data-title="Open" class="numeric">$4.01</td>

											<td data-title="High" class="numeric">$4.05</td>

											<td data-title="Low" class="numeric">$4.00</td>

											<td data-title="Volume" class="numeric">90,641</td>

										</tr>

										<tr>

											<td data-title="Code">ABC</td>

											<td data-title="Company">ADELAIDE BRIGHTON LIMITED</td>

											<td data-title="Price" class="numeric">$3.00</td>

											<td data-title="Change" class="numeric">  +0.06</td>

											<td data-title="Change %" class="numeric">2.04%</td>

											<td data-title="Open" class="numeric">$2.98</td>

											<td data-title="High" class="numeric">$3.00</td>

											<td data-title="Low" class="numeric">$2.96</td>

											<td data-title="Volume" class="numeric">862,518</td>

										</tr>

										<tr>

											<td data-title="Code">ABP</td>

											<td data-title="Company">ABACUS PROPERTY GROUP</td>

											<td data-title="Price" class="numeric">$1.91</td>

											<td data-title="Change" class="numeric">0.00</td>

											<td data-title="Change %" class="numeric">0.00%</td>

											<td data-title="Open" class="numeric">$1.92</td>

											<td data-title="High" class="numeric">$1.93</td>

											<td data-title="Low" class="numeric">$1.90</td>

											<td data-title="Volume" class="numeric">595,701</td>

										</tr>

										<tr>

											<td data-title="Code">ABY</td>

											<td data-title="Company">ADITYA BIRLA MINERALS LIMITED</td>

											<td data-title="Price" class="numeric">$0.77</td>

											<td data-title="Change" class="numeric">  +0.02</td>

											<td data-title="Change %" class="numeric">2.00%</td>

											<td data-title="Open" class="numeric">$0.76</td>

											<td data-title="High" class="numeric">$0.77</td>

											<td data-title="Low" class="numeric">$0.76</td>

											<td data-title="Volume" class="numeric">54,567</td>

										</tr>

										<tr>

											<td data-title="Code">ACR</td>

											<td data-title="Company">ACRUX LIMITED</td>

											<td data-title="Price" class="numeric">$3.71</td>

											<td data-title="Change" class="numeric">  +0.01</td>

											<td data-title="Change %" class="numeric">0.14%</td>

											<td data-title="Open" class="numeric">$3.70</td>

											<td data-title="High" class="numeric">$3.72</td>

											<td data-title="Low" class="numeric">$3.68</td>

											<td data-title="Volume" class="numeric">191,373</td>

										</tr>

										<tr>

											<td data-title="Code">ADU</td>

											<td data-title="Company">ADAMUS RESOURCES LIMITED</td>

											<td data-title="Price" class="numeric">$0.72</td>

											<td data-title="Change" class="numeric">0.00</td>

											<td data-title="Change %" class="numeric">0.00%</td>

											<td data-title="Open" class="numeric">$0.73</td>

											<td data-title="High" class="numeric">$0.74</td>

											<td data-title="Low" class="numeric">$0.72</td>

											<td data-title="Volume" class="numeric">8,602,291</td>

										</tr>

										<tr>

											<td data-title="Code">AGG</td>

											<td data-title="Company">ANGLOGOLD ASHANTI LIMITED</td>

											<td data-title="Price" class="numeric">$7.81</td>

											<td data-title="Change" class="numeric">-0.22</td>

											<td data-title="Change %" class="numeric">-2.74%</td>

											<td data-title="Open" class="numeric">$7.82</td>

											<td data-title="High" class="numeric">$7.82</td>

											<td data-title="Low" class="numeric">$7.81</td>

											<td data-title="Volume" class="numeric">148</td>

										</tr>

										<tr>

											<td data-title="Code">AGK</td>

											<td data-title="Company">AGL ENERGY LIMITED</td>

											<td data-title="Price" class="numeric">$13.82</td>

											<td data-title="Change" class="numeric">  +0.02</td>

											<td data-title="Change %" class="numeric">0.14%</td>

											<td data-title="Open" class="numeric">$13.83</td>

											<td data-title="High" class="numeric">$13.83</td>

											<td data-title="Low" class="numeric">$13.67</td>

											<td data-title="Volume" class="numeric">846,403</td>

										</tr>

										<tr>

											<td data-title="Code">AGO</td>

											<td data-title="Company">ATLAS IRON LIMITED</td>

											<td data-title="Price" class="numeric">$3.17</td>

											<td data-title="Change" class="numeric">-0.02</td>

											<td data-title="Change %" class="numeric">-0.47%</td>

											<td data-title="Open" class="numeric">$3.11</td>

											<td data-title="High" class="numeric">$3.22</td>

											<td data-title="Low" class="numeric">$3.10</td>

											<td data-title="Volume" class="numeric">5,416,303</td>

										</tr>

									</tbody>

								</table>

							</div>

						</div>

						<!-- END SAMPLE TABLE PORTLET-->

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
	});
</script>
</body>
</html>