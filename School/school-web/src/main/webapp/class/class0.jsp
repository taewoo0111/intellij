<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">로그인</h2>
    <form action="login" method="post">

        <div class="form-group mt-2">
            <label for="name">이름</label>
            <input type="text" class="form-control" name="name" id="name" placeholder="이름을 입력하세요..." required/>
        </div>

        <div class="form-group mt-2">
            <label for="nickname">별명</label>
            <input type="text" class="form-control" name="nickname" id="nickname" placeholder="별명을 입력하세요..." required/>
        </div>

        <div class="form-group mt-2">
            <label for="grade">학년</label>
            <select name="grade" id="grade" class="form-control">
                <option value="1">1학년</option>
                <option value="2">2학년</option>
                <option value="3">3학년</option>
                <option value="4">4학년</option>
            </select>
        </div>

        <div class="form-group mt-2">
            <label>성별</label>
            <br/>
            <div class="form-check form-check-inline">
                <input type="radio" class="form-check-input" name="gender" id="male" value="male"/>
                <label class="form-check-label" for="male">남</label>
            </div>
            <div class="form-check form-check-inline">
                <input type="radio" class="form-check-input" name="gender" id="female" value="female"/>
                <label class="form-check-label" for="female">여</label>
            </div>
        </div>

        <div class="form-group mt-2">
            <label>수강과목</label>
            <br/>
            <div class="form-check form-check-inline">
                <input type="checkbox" class="form-check-input" name="class" id="java" value="JAVA"/>
                <label class="form-check-label" for="java">JAVA</label>
            </div>
            <div class="form-check form-check-inline">
                <input type="checkbox" class="form-check-input" name="class" id="jsp" value="JSP"/>
                <label class="form-check-label" for="jsp">JSP</label>
            </div>
            <div class="form-check form-check-inline">
                <input type="checkbox" class="form-check-input" name="class" id="c++" value="C++"/>
                <label class="form-check-label" for="c++">C++</label>
            </div>
        </div>

        <button type="submit" class="btn btn-primary mt-2">전송</button>
    </form>
</div>
</body>
</html>
