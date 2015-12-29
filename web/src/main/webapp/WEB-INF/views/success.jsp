<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: taoyong
  Date: 15/12/12
  Time: 下午7:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
   用户:<s:property value='user.userAccount' />,注册成功页面！<br/>
   <s:property value='#request.msg' />,您到密码是: <s:property value='#request.pwd' />,轻牢记!

</body>
</html>
