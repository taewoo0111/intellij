<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Hello World</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" />
</head>
<body>
  <h1>인덱스 페이지</h1>
    <p><a href="hello">오늘의 인사</a></p>

  <h2>입력 페이지</h2>
   <form action="gender">
     <input type="text" name="name" placeholder="이름을 입력하세요..." required />
     <input type="text" name="jumin" placeholder="주민번호를 입력하세요..." required />
     <button type="submit">전송</button>
   </form>

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

  <div class="container mt-5">
    <h2 class="mb-4">로그인</h2>
    <form action="login" method="post">

      <div class="form-group mt-2">
        <label for="name">이름</label>
        <input type="text" class="form-control" name="name" id="name" placeholder="이름을 입력하세요..." required />
      </div>

      <div class="form-group mt-2">
        <label for="nickname">별명</label>
        <input type="text" class="form-control" name="nickname" id="nickname" placeholder="별명을 입력하세요..." required />
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
        <br />
        <div class="form-check form-check-inline">
          <input type="radio" class="form-check-input" name="gender" id="male" value="male" />
          <label class="form-check-label" for="male">남</label>
        </div>
        <div class="form-check form-check-inline">
          <input type="radio" class="form-check-input" name="gender" id="female" value="female" />
          <label class="form-check-label" for="female">여</label>
        </div>
      </div>

      <div class="form-group mt-2">
        <label>수강과목</label>
        <br />
        <div class="form-check form-check-inline">
          <input type="checkbox" class="form-check-input" name="class" id="java" value="JAVA" />
          <label class="form-check-label" for="java">JAVA</label>
        </div>
        <div class="form-check form-check-inline">
          <input type="checkbox" class="form-check-input" name="class" id="jsp" value="JSP" />
          <label class="form-check-label" for="jsp">JSP</label>
        </div>
        <div class="form-check form-check-inline">
          <input type="checkbox" class="form-check-input" name="class" id="c++" value="C++" />
          <label class="form-check-label" for="c++">C++</label>
        </div>
      </div>

      <button type="submit" class="btn btn-primary mt-2">전송</button>
    </form>
  </div>
</body>
</html>