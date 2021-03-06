<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url var="R" value="/" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link type="text/css" rel="stylesheet" href="main.css"/>
    <link type="text/css" rel="stylesheet" href="heart.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
	<!-- 3번 프레임 시작-->
    <div class="container" style="height: 10000px">
		<!-- 4번 프레임 시작-->
        <div class="content">
        	<form method="post" action="login_process">
	        	<div align="center" style="margin-bottom:10px;">
	            	<input type="text" name="loginId" placeholder="아이디 입력" style="width:350px; padding:5px; margin-bottom:5px" />
	            </div>
	            <div align="center">
	                <input type="password" name="passwd" placeholder="비밀번호 입력" style="width:350px; padding:5px;margin-bottom:5px" />
	            </div>
	            <div align="center">
	                <button type="submit" id="loginButton" class="btn btn-primary" style="width: 350px; padding:5px" >로그인</button>
	            </div>
	            <div align="center">
	            	<hr style="border: solid 1px" align="center" width="400" />
	            </div>
            </form>
    		<div align="center" style="">
        		<a href="sign">회원가입</a>
        		<br/>
        		<br/>
    		</div>
		</div>
		<!-- 4번 프레임 끝-->
	</div>
    <!-- 3번 프레임 끝-->
</body>
</html>
