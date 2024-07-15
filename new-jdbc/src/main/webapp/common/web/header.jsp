<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Responsive navbar-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="#!">Start Bootstrap</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                    	<li class="nav-item"><a class="nav-link" href="#!">Trang chủ</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Blog</a></li>
                       
                        <li class="nav-item"><a class="nav-link" href="#!">Contact</a></li>

                        <c:if test="${not empty USERMODLE}">
                            <li class="nav-item"><a class="nav-link active" aria-current="page" href='#'>WellCome, ${USERMODLE.fullName}</a></li>
                            <li class="nav-item"><a class="nav-link active" aria-current="page" href='<c:url value="/thoat?action=logout"/>'>Thoát</a></li>
                        </c:if>

                        <c:if test = "${empty USERMODLE}">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href='<c:url value="/dang-nhap?action=login"/>'>Đăng nhập</a>
                            </li>
                        </c:if>


                    </ul>
                </div>
            </div>
        </nav>
        <!-- Page header with logo and tagline-->
        <header class="py-5 bg-light border-bottom mb-4">
            <div class="container">
                <div class="text-center my-5">
                    <h1 class="fw-bolder">Welcome to Blog Home!</h1>
                    <p class="lead mb-0">A Bootstrap 5 starter layout for your next blog homepage</p>
                </div>
            </div>
        </header>