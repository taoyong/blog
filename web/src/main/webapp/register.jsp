<%--
  Created by IntelliJ IDEA.
  User: taoyong
  Date: 15/12/26
  Time: 下午3:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="user/register" method="post">
    <input type="hidden" name="user.userType" value="2"/>
    <table align="center" border="1" style="border-collapse: collapse;">
        <tr>
            <td colspan="2">用户注册</td>
        </tr>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="user.userAccount" value=""/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="user.userPwd" value=""/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="注册" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>


<%--
<s:iterator id="task" value="#request.tasks">
    <tr class="table_header">
        <td><s:property value="#task.tname"/></td>
        <td><s:property value="#task.tuid"/></td>
        <td><s:property value="#task.tstartTime"/></td>
        <td><s:property value="#task.tendTime"/></td>
        <td><s:property value="#task.tstate"/></td>
        <td><input type="radio" id="choose" name="choose" onclick="getId(this.value)" value="<s:property value='#task.tid'/>"/></td>
    </tr>
</s:iterator>--%>
