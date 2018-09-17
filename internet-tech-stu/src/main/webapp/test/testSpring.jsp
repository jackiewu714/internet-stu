<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="org.springframework.context.ApplicationContext, org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="study.spring.test.HelloSpringService, com.cw.stu.internet.tech.platform.util.SpringUtils" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%
	//ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
	HelloSpringService hws = (HelloSpringService)SpringUtils.getBean("helloSpringService");
	out.println(hws.sayHello("Jackie Wu"));
  %>
  <body>
    This is my JSP page. <br>
  </body>
</html>
