<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "/common/taglib.jsp"%>
<c:url var="APIurl" value="/api-admin-new"/>
<c:url var="NewURL" value="/admin-new"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chỉnh sửa bài viết</title>
</head>
<body>
<div class="main-content">
			<div class="main-content-inner">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
						</li>
						<li class="active">Dashboard</li>
						<li class="active">Chỉnh sửa bài viết</li>
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
                            <form id="formSubmit">
                                <div class="form-group">
                                    <label class="col-sm-3 control-lable no-padding-right">Thể loại</label>
                                    <div class="col-sm-9">
                                        <select class="form-select" id="categoryCode" name="categoryCode">
                                            <c:if test="${empty modle.categoryCode}">
                                                <option value="">Chọn loại bài viết</option>
                                                <c:forEach var="item" items="${categories}">
                                                    <option value="${item.code}">${item.name}</option>
                                                </c:forEach>
                                            </c:if>
                                            <c:if test="${not empty modle.categoryCode}">
                                                <option value="">Chọn loại bài viết</option>
                                                <c:forEach var="item" items="${categories}">
                                                    <c:if test="${item.code == modle.categoryCode}">
                                                    </c:if>
                                                    <option value="${item.code}" <c:if test="${item.code == modle.categoryCode}">
                                                        selected="selected"</c:if>>${item.name}</option>
                                                </c:forEach>
                                            </c:if>
                                        </select>
                                    </div>
                                </div>
                                <br>
                                <br>
                                <div class="form-group">
                                    <label class="col-sm-3 control-lable no-padding-right">Tiêu đề</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" id="title" name="title" value="${modle.title}">
                                    </div>
                                </div>
                                <br>
                                <br>
                                <div class="form-group">
                                    <label class="col-sm-3 control-lable no-padding-right">Hình đại diện</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" id="thumbnail" name="thumbnail" value="">
                                    </div>
                                </div>
                                <br>
                                <br>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right">Mô tả ngắn</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" id="shortDescription" name="shortDescription" value="${modle.shortDescription}">
                                    </div>
                                </div>
                                <br>
                                <br>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right">Nội dung</label>
                                    <div class="col-sm-9">
                                        <textarea name="content" id="content" cols="125" rows="12">${modle.content}</textarea>
                                    </div>
                                </div><br>
                                <br>
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <c:if test="${not empty modle.id}">
                                            <input type="button" class="btn btn-white btn-warning" value="Cập nhật bài viết" id="btnAddOrUpdateNew">
                                        </c:if>
                                        <c:if test="${empty modle.id}">
                                            <input type="button" class="btn btn-white btn-warning" value="Thêm mới bài viết" id="btnAddOrUpdateNew">
                                        </c:if>
                                    </div>
                                </div>
<%--                                name của nó là id để get id được--%>
                                <input type="hidden" value="${modle.id}" name="id" id="id">
                            </form>

						</div>
					</div>
				</div>
			</div>
</div>
<script>
    var editor = '';
    $(document).ready(function(){
        editor = CKEDITOR.replace('content');
    });

    $('#btnAddOrUpdateNew').click(function(e){
        // để submit đúng
        e.preventDefault();
        var data = {};
        var formData = $('#formSubmit').serializeArray();
        $.each(formData, function (i, v) {
            data[""+v.name+""] = v.value
        });
        var id = $('#id').val();
        if(id == ""){
            addNew(data);
        }else{
            updateNew(data);
        }
    });
    function addNew(data){
        $.ajax({
            //API gọi về phải thông qua c:url
            url: '${APIurl}',
            //kiểu dữ liệu mapping với API
            type: 'POST',
            //kiểu dữ liệu gửi từ client về server
            contentType: 'application/json',
            //chuyển data của client sang json(tại vì trong client thì data đang ở dạng object script)
            data: JSON.stringify(data),
            //kiểu dữ liệu từ server nhận vể
            dataType: 'json',
            //trường hợp trả về
            success: function (result) {
                window.location.href = "${NewURL}?type=edit&id="+result.id+"&message=INSERT_SUCCESS";
            },
            error: function (error) {
                window.location.href = "${NewURL}?type=list&page=1&maxPageItem=2&message=ERROR_SYSTEM";
            }
        });
    }
    function updateNew(data){
        $.ajax({
            url: '${APIurl}',
            type: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            success: function (result) {
                window.location.href = "${NewURL}type=list&id="+result.id+"&message=UPDATE_SUCCESS";
            },
            error: function (error) {
                window.location.href = "${NewURL}?type=list&page=1&maxPageItem=2&message=UPDATE_SYSTEM";
            }
        });
    }
</script>
</body>
</html>