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

<center>
                <div class="frame">




                    <!-- 1번 프레임 시작  -->
                    <div class="frame">
                    	<%@ include file="/WEB-INF/views/menu/guest_menu.jsp" %>
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


                                    <div align="center" margin-bottom:10px;>
                            <input type="text" name="userid" placeholder="아이디 입력" style="width:350px; padding:5px; margin-bottom:5px" />
                        </div>
                        <div align="center">
                            <input type="password" name="password" placeholder="비밀번호 입력" style="width:350px; padding:5px;margin-bottom:5px" />
                        </div>
                        <div align="center">
                      <a href="mypage.html">
                            <button type="button" id="loginButton" class="btn btn-primary" style="width: 350px; padding:5px" >로그인</button> </a>
                        </div>


                            <hr style="border: solid 1px" align="center" width="400" />
    <div align="center" style="">
        <a href="search_password.html">비밀번호 찾기</a> &nbsp;&nbsp;|&nbsp;&nbsp; <a href="sign.html">회원가입</a>
        <br>
        <br>
    </div>
                            </div>
                            <!--4번 프레임 끝-->


                    </center>

                    </div>

                <!-- 3번 프레임 끝  -->

            </div>
        </center>


</body>
</html>
