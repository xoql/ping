<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>signUp회원가입</title>
</head>
<body>
	<form action="signup.do" method="post">
		<h3>회원가입</h3>
			<input id="id" 		 type="text" 		name="id" 		placeholder="ID" ><p>
			<input id="password" type="password" 	name="password" placeholder="PASSWORD" ><p>
			<input id="name"	 type="text" 		name="name" 	placeholder="NAME" ><p>
			<select id="tel1" name="tel1">
				<option name="tel1" value="010">010</option>
				<option name="tel1" value="011">011</option>
				<option name="tel1" value="016">016</option>
				<option name="tel1" value="017">017</option>
				<option name="tel1" value="018">018</option>
				<option name="tel1" value="019">019</option>
			</select>
			- <input id="tel2" type="text" name="tel2" >
			- <input id="tel3" type="text" name="tel3" ><p>
			<input id="email1" type="text" name="email1" placeholder="EMAIL" >
			@ <input id="email2" type="text" name="email2" ><p>
			<select id="adress1" name="adress1">
				<option name="adress1" value="서울시">서울시</option>
				<option name="adress1" value="부산시">부산시</option>
			</select>
			<select id="adress2" name="adress2">
				<option name="adress2" value="강남구">강남구</option>
				<option name="adress2" value="중구">중구</option>
			</select>
			<select id="adress3" name="adress3">
				<option name="adress3" value="역삼동">역삼동</option>
				<option name="adress3" value="삼성동">삼성동</option>
			</select><p>
		<input type="submit" value="가입하기">
	</form>
</body>
</html>