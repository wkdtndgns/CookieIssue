<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="menu">
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="${R}cookie/common/index">쿠키</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li><a href="${R}cookie/common/index">Home</a></li>
	      <sec:authorize access="hasRole('ROLE_USER')">
	      	<li><a href="${R}cookie/user/eventCandidate">선착순 이벤트 참여</a></li>
	      </sec:authorize>
	      <sec:authorize access="hasRole('ROLE_ADMIN')">
	     	<li><a href="${R}cookie/admin/eventPlus">선착순 이벤트 추가</a></li>
	      	<li><a href="${R}cookie/admin/eventCookie">이벤트 쿠키 관리</a></li>
	      </sec:authorize>
	      <li><a href="${R}cookie/common/logout_process">로그아웃 </a></li>
	      <li><a><sec:authentication property="principal" />님, 환영합니다.</a></li>
	    </ul>
	  </div>
	</nav>
</div>