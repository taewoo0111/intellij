<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Naver, Daum, Google 페이지 이동</title>
</head>
<body>
<h2>이동 페이지</h2>
<form action="move">
    <label for="site">사이트 고르기</label>
    <select name="site" id="site">
        <option value="naver">네이버</option>
        <option value="daum">다음</option>
        <option value="google">구글</option>
    </select>
    <button type="submit">이동</button>
</form>
</body>
</html>
