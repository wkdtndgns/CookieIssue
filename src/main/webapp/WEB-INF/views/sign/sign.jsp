<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url var="R" value="/" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
   <title>쿠키</title>
</head>

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
    <div class="container" style="height: 10000px">
    	<!--4번 프레임 시작-->
        <div class="content">
        	<div class="application" style="text-align: left;" >
            	<form:form method="post" modelAttribute="signInfo">
	                <div class="control-group">
	                  <div class="form-group floating-label-form-group controls">
	                    <label>이름: </label>
	                    <input type="text" class="form-control" placeholder="이름" id="name" >
	                    <p class="help-block text-danger"></p>
	                  </div>
	                </div>
                    <br/>
					<div class="control-group">
                      <div class="form-group floating-label-form-group controls">
                        <label>아이디: </label>
                        <input type="text" class="form-control" placeholder="아이디" id="loginId" >
                        <p class="help-block text-danger"></p>
                      </div>
                    </div>
					<br/>
                    <div class="control-group">
                      <div class="form-group floating-label-form-group controls">
                        <label>비밀번호:  </label>
                        <input type="password" class="form-control" placeholder="비밀번호" id="password_1" >
                        <p class="help-block text-danger"></p>
                      </div>
                    </div>        
                    <br/>
					<div class="control-group">
	                    <div class="form-group floating-label-form-group controls">
	                      <label>비밀번호 확인:  </label>
	                      <input type="password" class="form-control" placeholder="비밀번호" id="password_2" >
	                      <p class="help-block text-danger"></p>
	                    </div>
                    </div>
					<br/>
					<div class="control-group">
                      <div class="form-group floating-label-form-group controls">
                        <label>주소 </label>
                        <input type="text" class="form-control" placeholder="주소" id="address" >
                        <p class="help-block text-danger"></p>
                      </div>
                    </div>
				    <div style="margin-top: 40px">
				        <h3>회원가입을 신청하시려면 밑에 신청 버튼을 눌러 주세요.</h3>
					</div>
      				<button type="submit" class="btn btn-primary"><i class="glyphicon glyphicon-ok"> 신청</i></button>
      					<a href="index">
      						<button type="button" class="btn btn-primary">
      							<i class="glyphicon glyphicon-remove"> 취소</i>
      						</button>
    					</a>
      			</form:form>
      		</div>
		</div>
	</div>
</body>
</html>
