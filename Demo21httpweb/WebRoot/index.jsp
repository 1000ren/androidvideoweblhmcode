<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  </head>
  
  <body>
  	<form method="post" action="http://192.168.1.102:8080/http/ManageServlet" enctype="multipart/form-data"> 
  	标题：<input name="title" type="text"/><br/>
  	时长：<input name="timelength" type="text"/><br/>
  	文件：<input name="videofile" type="file""/><br/>
  	<input type="submit" value="提交"/>
  	</form>
  </body>
</html>
