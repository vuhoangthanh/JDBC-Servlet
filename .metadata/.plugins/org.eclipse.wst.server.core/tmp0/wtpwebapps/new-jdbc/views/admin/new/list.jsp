<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách bài viết</title>
</head>
<body>
<div class="main-content">
		<form action="<c:url value='/admin-new'/>" id="formSubmit" method="get">
			<div class="main-content-inner">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
						</li>
						<li class="active">Dashboard</li>
					</ul>
					<!-- /.breadcrumb -->

					<div class="nav-search" id="nav-search">
						<form class="form-search">
							<span class="input-icon"> <input type="text"
								placeholder="Search ..." class="nav-search-input"
								id="nav-search-input" autocomplete="off" /> <i
								class="ace-icon fa fa-search nav-search-icon"></i>
							</span>
						</form>
					</div>
					<!-- /.nav-search -->
				</div>
				<div class="page-content">
					<div class="row">
						<div class="col-xs-12">
							<div class="row">
								<div class="col-xs-12">
									<div class="table-responsive">
										<table class="table">
											<thead class="thead-light">
												<tr>

													<th scope="col">Tên bài viết</th>
													<th scope="col">Mô tả ngắn</th>

												</tr>
											</thead>
											<tbody>
												<c:forEach var="item" items="${modle.listResult}">
													<tr>
														<td>${item.title }</td>
														<td>${item.shortDescription }</td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
										<ul id="pagination-demo" class="pagination-lg"></ul>
										<intput type="text" value="" id="page" name="page"/>
										<intput type="text" value="" id="maxPageItem" name="maxPageItem"/>
										<intput type="text" value="" id="sortName" name="sortName"/>
										<intput type="text" value="" id="sortBy" name="sortBy"/>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
	</form>
</div>
	<script>
	var totalPages = ${modle.totalPage};
	var currentPage = ${modle.page};
	var limit = 2;
	
		$('#pagination-demo').twbsPagination({
	    totalPages: totalPages,
	    visiblePages: 10,
	    startPage: currentPage,
	    onPageClick: function (event, page) {
	    	
	    	if(currentPage != page){
	    		$('#maxPageItem').val(limit);
	    		$('#page').val(page);
	    		$('#sortName').val('title');
	    		$('#sortBy').val('desc');
	    		$('#formSubmit').submit();
	    	    //window.location.href = "/new-jdbc/admin-new?page=" + page + "&maxPageItem=" + limit+"&sortName=title&sortBy=desc";	    		
	    	}
	    }
	});
	</script>
</body>
</html>