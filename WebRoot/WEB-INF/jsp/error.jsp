<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>提示</title>
</head>
<body>
	<img src="${pageContext.request.contextPath }/image/error.jpg"
		width="50px;" height]="50px;">
		抱歉，访问异常，具体信息如下：</br>
		<h2><font color="red">${message}</font></h2>
	</br>
</body>
</html>