<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="R" value="/" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link type="text/css" rel="stylesheet" href="main.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">	
    <style>
    </style>
    <title>쿠키</title>
</head>
	
<body>
	<div class="frame">
		<!-- 1번 프레임 시작  -->
		<div class="frame">
			<!-- 2번 프레임 시작  -->
			<div class="menu">
	            <%@ include file="/WEB-INF/views/menu/guest_menu.jsp" %>
			</div>
			<!-- 2번 프레임 끝  -->
	    </div>
	    <!-- 1번 프레임 끝  -->
	</div>
    <!-- 3번 프레임 시작  -->
    <div class="header" style=" padding-top: 10px;" >
        
    </div>
    <!-- 3번 프레임 끝  -->


<<<<<<< HEAD
    <!-- 4번 프레임 시작  -->
    <div class="container text-center" style="height: 10000px">
        <!--5번 프레임 시작-->
        <div class="content">
        	<img src="${R}/img/cookie.PNG" style="width: 100px; height: 100px;">
            <br/>
            <br/>
            <br/>                      
            <h1>이벤트 참여를 진행하고 싶다면 로그인을 진행하세요.</h1>
        </div>
        <!-- 5번 프레임 끝-->
	</div>
    <!-- 4번 프레임 끝  -->
=======


                    <!-- 1번 프레임 시작  -->
                      <div class="frame">


                    <!-- 1번 프레임 시작  -->
                    <div class="menu" ">

                        <center>
                        <div class="row">

                       </div>

                            <center>

                                   <nav class="navbar navbar-inverse">
                              <div class="container-fluid">
                                <div class="navbar-header">
                                  <a class="navbar-brand" href="${R}index">쿠키</a>
                                </div>
                                <ul class="nav navbar-nav">
                                  <li class="active"><a href="${R}index">Home</a></li>
                                  <li style="width: 300px;"><a href="${R}request">발급 정보 입력</a></li>
                                  <li><a href="${R}login">로그인 </a></li>
                                  <li><a href="${R}sign">회원가입 </a></li>
                                </ul>
                              </div>
                            </nav>



                            </center>

                        </div>

                    </div>

                    <!-- 1번 프레임 끝  -->

                    <!-- 1번 프레임 끝  -->


                    <!-- 2번 프레임 시작  -->
                    <div class="header" style=" padding-top: 10px;" >
                        <center>

                        </center>

                    </div>
                    <!-- 2번 프레임 끝  -->


                    <!-- 3번 프레임 시작  -->

                    <div class="container" style="height: 10000px">

                        <center>



                            <!--4번 프레임 시작-->
                            <div class="content">

                          <img src="${R}../img/cookie.PNG" style="width: 100px; height: 100px;">
                                <center>
                                   
                                   <br/>
                                   <br/>
                                   <br/>
                                   
                                   <button type="submit" class="btn btn-primary">
								      <i class="glyphicon glyphicon-ok"></i> 쿠키 발급 
								    </button>
                                   
                                   
                                </center>


                            </div>
                            <!--4번 프레임 끝-->


                    </center>

                    </div>

                <!-- 3번 프레임 끝  -->

            </div>
        </center>


>>>>>>> refs/heads/master
</body>
</html>
