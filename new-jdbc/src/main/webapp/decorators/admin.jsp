<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<title><dec:title default="Trang chủ" /></title>
		<link rel="stylesheet" href="<c:url value='/template/admin/assets/css/bootstrap.min.css'/>" />
		<link rel="stylesheet" href="<c:url value='/template/admin/assets/font-awesome/4.5.0/css/font-awesome.min.css'/>" />		
		<link rel="stylesheet" href="<c:url value='/template/admin/assets/css/fonts.googleapis.com.css'/>" />
		<link rel="stylesheet" href="<c:url value='/template/admin/assets/css/ace.min.css'/>"/>
		<link rel="stylesheet" href="<c:url value='/template/admin/assets/css/ace-skins.min.css'/>" />
		<link rel="stylesheet" href="<c:url value='/template/admin/assets/css/ace-rtl.min.css'/>" />	
		<script src="<c:url value='/template/admin/assets/js/ace-extra.min.js'/>"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
        <script src="<c:url value='/template/paging/jquery.twbsPagination.js'/>"></script>
		<script src="<c:url value='/ckeditor/ckeditor.js'/>"></script>

</head>
<body class="no-skin">

	<!-- header -->	
	<%@ include file = "/common/admin/header.jsp" %>
	<!-- header -->	

	<div class="main-container" id="main-container">
		<script type="text/javascript">
				try{ace.settings.loadState('main-container')}catch(e){}
		</script>
		<%@ include file = "/common/admin/menu.jsp" %>	
		<dec:body/>
	</div>

	

	<!-- footer -->	
	<%@ include file = "/common/admin/footer.jsp" %>
	<!-- footer -->	
		
	<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
		<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
	</a>


		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='<c:url value='/template/admin/assets/js/jquery.mobile.custom.min.js'/>'>"+"<"+"/script>");
		</script>
		<script src="<c:url value='/template/admin/assets/js/bootstrap.min.js'/>"></script>
		<script src="<c:url value='/template/admin/assets/js/jquery-ui.custom.min.js'/>"></script>
		<script src="<c:url value='/template/admin/assets/js/jquery.ui.touch-punch.min.js'/>"></script>
		<script src="<c:url value='/template/admin/assets/js/jquery.easypiechart.min.js'/>"></script>
		<script src="<c:url value='/template/admin/assets/js/jquery.sparkline.index.min.js'/>"></script>
		<script src="<c:url value='/template/admin/assets/js/jquery.flot.min.js'/>"></script>
		<script src="<c:url value='/template/admin/assets/js/jquery.flot.pie.min.js'/>"></script>
		<script src="<c:url value='/template/admin/assets/js/jquery.flot.resize.min.js'/>"></script>
		<script src="<c:url value='/template/admin/assets/js/ace-elements.min.js'/>"></script>
		<script src="<c:url value='/template/admin/assets/js/ace.min.js'/>"></script>
</body>
</html>