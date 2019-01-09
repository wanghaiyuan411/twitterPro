<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wanghaiyuan
  Date: 2019/1/9
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="main" class="main-warp">
    <a>当前用户:${userSession.username}</a>
</div>
<div>
    <table>
        <thead>
        <tr class="double-line-text">
            <th style="width: 1%">序号</th>
            <th style="width: 7%">姓名</th>
            <th style="width: 7%">推文</th>
            <th style="width: 7%">日期</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${not empty pageInfo}">
            <c:forEach items="${pageInfo}" var="twitter" varStatus="sun">
                <tr>
                    <td>${sun.index + 1}</td>
                    <td>${twitter.userId}</td>
                    <td>${twitter.content}</td>
                    <td>${twitter.createTime}</td>
                </tr>
            </c:forEach>

        </c:if>
        </tbody>
    </table>
</div>

</body>
</html>
