<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table,table tr th, table tr td { border:1px solid rgba(41, 36, 35, 0.96); }
        #mytable{width:300px;margin: 100px auto}
        #add{width:300px;height:500px;margin: 100px auto}
    </style>
</head>
<body>
<div id="list">
    <table id="mytable">
        <thead>
        <th>id</th>
        <th>名字</th>
        <th>性别</th>
        <th>修改</th>
        <th>删除</th>
        </thead>
        <tbody>
        <c:forEach items="${us}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.sex}</td>
                <td><a href="editUI?id=${user.id}">edit</a> </td>
                <td><a href="del?id=${user.id}">delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<div id="add">
    <form action="/add">
        姓名：<input type="text" name="name" value=""/><br/>
        性别：<input type="text" name="sex" value=""/><br/>
        <button type="submit">添加</button>
    </form>
</div>


</body>
</html>