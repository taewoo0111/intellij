<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    List<String> classList = (List<String>) request.getAttribute("list");
    String classString = String.join(", ", classList);
%>
<html>
<head>
    <title>로그인 결과 확인 페이지</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div class="container mt-5">
    <h2>로그인 정보</h2>
    <form>
        <div class="mb-3">
            <label for="name" class="form-label">이름</label>
            <input type="text" class="form-control" id="name" value="${name}" readonly/>
        </div>
        <div class="mb-3">
            <label for="nickname" class="form-label">별명</label>
            <input type="text" class="form-control" id="nickname" value="${nickname}" readonly/>
        </div>
        <div class="mb-3">
            <label for="grade" class="form-label">학년</label>
            <input type="text" class="form-control" id="grade" value="${grade}" readonly/>
        </div>
        <div class="mb-3">
            <label for="gender" class="form-label">성별</label>
            <input type="text" class="form-control" id="gender" value="${gender}" readonly/>
        </div>
        <div class="mb-3">
            <label for="classType" class="form-label">수강과목</label>
            <input type="text" class="form-control" id="classType" value="<%= classString %>" readonly/>
        </div>
    </form>
</div>
</body>
</html>
