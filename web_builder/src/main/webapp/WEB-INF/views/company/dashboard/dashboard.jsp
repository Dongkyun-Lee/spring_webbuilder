<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dashboard</title>
</head>
<body>
<div id="nav"><%@ include file="/WEB-INF/views/company/companynavbar/companynav.jsp" %></div>
	<p>${member.userid}님의 사이트 목록</p>

	<c:forEach items="${dtos}" var="dtos">
		<c:choose>
			<c:when test="${dtos.getStatus() eq 'store' }">
				<p>
					<a href="/modifysite?siteid=${dtos.getSiteid()}">${dtos.getSitename()}</a> <a href="/deletesite?siteid=${dtos.getSiteid()}&status=${dtos.getStatus()}&sitename=${dtos.getSitename()}">삭제</a>
				</p>
			</c:when>
			<c:when
				test="${dtos.getStatus() eq 'deploy' && dtos.getCategory() eq 'product'}">
				<p>
					<a href="/product/${dtos.getSitename()}">${dtos.getSitename()}</a> <a href="/deletesite?siteid=${dtos.getSiteid()}&status=${dtos.getStatus()}&sitename=${dtos.getSitename()}">삭제</a>
				</p>
			</c:when>
			<c:when
				test="${dtos.getStatus() eq 'deploy' && dtos.getCategory() eq 'location'}">
				<p>
					<a href="/location/${dtos.getSitename()}">${dtos.getSitename()}</a> <a href="/deletesite?siteid=${dtos.getSiteid()}&status=${dtos.getStatus()}&sitename=${dtos.getSitename()}">삭제</a>
				</p>
			</c:when>
			<c:when
				test="${dtos.getStatus() eq 'deploy' && dtos.getCategory() eq 'people'}">
				<p>
					<a href="/people/${dtos.getSitename()}">${dtos.getSitename()}</a> <a href="/deletesite?siteid=${dtos.getSiteid()}&status=${dtos.getStatus()}&sitename=${dtos.getSitename()}">삭제</a>
				</p>
			</c:when>
		</c:choose>
	</c:forEach>

	<a href="/createsite">사이트 생성</a> <br/>
	<a href ="/">메인으로</a>
</body>
</html>