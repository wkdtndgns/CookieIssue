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
	            <%@ include file="/WEB-INF/views/menu/user_menu.jsp" %>
			</div>
			<!-- 2번 프레임 끝  -->
	    </div>
	    <!-- 1번 프레임 끝  -->
	</div>
    <!-- 3번 프레임 시작  -->
    <div class="header" style=" padding-top: 10px;" >
        
    </div>
    <!-- 3번 프레임 끝  -->


    <!-- 4번 프레임 시작  -->
    <div class="container text-center" style="height: 10000px">
        <!--5번 프레임 시작-->
        <div class="content">
        <c:forEach var="event" items="${ events }">
            <div class="panel panel-default">
			  <div class="panel-body"> 
				  <div class="row">
				    <div class="col-md-4">
				    	<img src="${R}/img/cookie_monster.jpg" class="img-thumbnail" width="210" height="139" />
				    </div>
				    <div class="col-md-8">
				    	<h1>${ event.name }</h1>
				    	<p>${event.start} - ${event.end}</p>
				    	<p>개인 참여 가능 횟수 : ${event.personal}</p>
				    	<p>총 참여 가능 횟수 : ${event.total}</p>
				    </div>
				  </div>
			  
			  </div>
			</div>
			</c:forEach>                      
        </div>
        <!-- 5번 프레임 끝-->
	</div>
    <!-- 4번 프레임 끝  -->
</body>
</html>