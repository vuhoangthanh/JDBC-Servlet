<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "/common/taglib.jsp"%>
<c:url var="APIurl" value="/api-admin-new"/>
<c:url var="NewURL" value="/admin-new"/>
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
							<c:if test="${not empty messageResponse}">
								<div class="alert alert-${alert}">
										${messageResponse}
								</div>
							</c:if>
						    <div class="widget-box table filter">
                                  <div class="table-btn-controls">
                                        <div class="pull-right tableTools-container">
                                            <div class="dt-buttons btn-overlap btn-group">
                                                <a flag="info"
                                                class= "dt-button buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="tooltip"
                                                title='Thêm bài viết' href='<c:url value="/admin-new?type=edit"/>'>
                                                    <span>
                                                        <i class="fa fa-plus-circle bigger-110 purple"></i>
                                                    </span>
                                                </a>
												<button id="btnDelete" type="button"
												 class= "dt-button buttons-html5 btn btn-white btn-primary btn-bold" data-toggle="tooltip" title='Xóa bài viết'>
													 <span>
                                                        <i class="fa fa-trash-o bigger-110 pink"></i>
                                                     </span>
												</button>
                                            </div>
                                        </div>
                                  </div>
						    </div>
							<div class="row">
								<div class="col-xs-12">
									<div class="table-responsive">
										<table class="table">
											<thead class="thead-light">
												<tr>

													<th scope="col"><input type="checkbox" id="checkAll"></th>
													<th scope="col">Tên bài viết</th>
													<th scope="col">Mô tả ngắn</th>
													<th scope="col">Hành động</th>

												</tr>
											</thead>
											<tbody>
												<c:forEach var="item" items="${modle.listResult}">
													<tr>
														<td><input type="checkbox" id="checkbox_${item.id}" value="${item.id}"></td>
														<td>${item.title }</td>
														<td>${item.shortDescription }</td>
														<td>
														    <c:url var="editURL" value="/admin-new">
                                                                <c:param name="type" value="edit"/>
                                                                <c:param name="id" value="${item.id}"/>
														    </c:url>
														    <a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip"
														        title="Cập nhất bài viết" href='${editURL}'>
														        <i class="fa fa-pencil-square-o" aria-hidden="true"></i>
														    </a>
														</td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
										<ul id="pagination-demo" class="pagination-lg"></ul>
										<input type="hidden" value="" id="page" name="page"/>
										<input type="hidden" value="" id="maxPageItem" name="maxPageItem"/>
										<input type="hidden" value="" id="sortName" name="sortName"/>
										<input type="hidden" value="" id="sortBy" name="sortBy"/>
										<input type="hidden" value="" id="type" name="type"/>
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
	    		$('#type').val('list');
	    		$('#formSubmit').submit();
	    	    //window.location.href = "/new-jdbc/admin-new?page=" + page + "&maxPageItem=" + limit+"&sortName=title&sortBy=desc";
	    	}
	    }
	});

	$("#btnDelete").click(function () {
		var data ={};
		var ids = $('tbody input[type=checkbox]:checked').map(function(){
			return $(this).val();
		}).get();
		data['ids'] = ids;
		deleteNew(data);
	});

	function deleteNew(data){
		$.ajax({
			url: '${APIurl}',
			type: 'DELETE',
			contentType: 'application/json',
			data: JSON.stringify(data),
			success: function (result) {
				window.location.href = "${NewURL}?page=1&maxPageItem=2&sortName=title&sortBy=desc&type=list&message=DELETE_SUCCESS";
			},
			error: function (error) {
				window.location.href = "${NewURL}?type=list&page=1&maxPageItem=2&message=ERROR_SYSTEM";
			}
		});
	}
	</script>
</body>
</html>