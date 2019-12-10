<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        #edit{width:300px;height:500px;margin: 100px auto}
    </style>
</head>
<body>
<div id="edit">
    <form action="/update">
        姓名：<input type="text" name="name" value="${user.name}"/><br/>
        性别：<input type="text" name="sex" value="${user.sex}"/><br/>
        <input type="hidden" value="${user.id}" name="id">
        <button type="submit" value="">修改</button>
    </form>
</div>
</body>
</html>