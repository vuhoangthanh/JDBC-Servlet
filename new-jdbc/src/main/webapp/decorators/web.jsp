<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file = "/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><dec:title default="Trang chủ" /></title>
	<!-- css -->	
	<link href="<c:url value='/template/web/assets/favicon.ico'/>"  rel="icon" type="image/x-icon" />	
	<link href="<c:url value='/template/web/css/styles.css'/>" rel="stylesheet" type="text/css" media="all"/>
	
	
</head>
<body>
	<!-- header -->	
	<%@ include file = "/common/web/header.jsp" %>
	<!-- header -->	

	<div class="container">
		<dec:body/>
	</div>

	<!-- footer -->	
	<%@ include file = "/common/web/footer.jsp" %>
	<!-- footer -->	

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript" src="<c:url value='/template/web/js/scripts.js'/>"></script>
	
	
</body>
</html>