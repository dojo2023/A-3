<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/TRex/css/common.css" rel="stylesheet">
<title>C²A</title>
</head>
<body>
<h1>C²A</h1>
<h2><c:out value="${result.title}" /></h2>
<hr class="hr1">
<p><c:out value="${result.message}" /></p>
<a href="${result.backTo}"><button class="button-038">MENU</button></a>
</body>
</html>
