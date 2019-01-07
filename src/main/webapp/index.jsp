<%--
  Created by IntelliJ IDEA.
  User: wanghaiyuan
  Date: 2019/1/7
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Welcome to twitter</title>
    <link rel="stylesheet" type="text/css" href="css/dmaku.css" />
    <script src="js/jquery.min.js"></script>
</head>
<body>

<div class="wrap flex-c-c">
    <form action="" method="" class="flex-c-c">
        <ul class="select__list">
            <li id="js-usr-rtn" class="select__label">登录</li>
            <li id="js-usr-new" class="select__label select__label--active">注册</li>
            <li id="js-usr-rst" class="select__label">忘记密码</li>
        </ul>
        <span class="pointer"></span>
        <input type="email" placeholder="用户名" class="ui-field" id="js-field__email" />
        <input type="password" placeholder="密码" class="ui-field" id="js-field__pass" />
        <input type="password" placeholder="确认密码" class="ui-field" id="js-field__r-pass" />
        <button id="js-btn" class="ui-button --usr-new"></button>
    </form>
</div>

<script>
//to-do. dry-up & remove jq
$('.select__label').click(function() {
  $('.select__label').removeClass('select__label--active');
  $(this).addClass('select__label--active');
});

$('#js-usr-rtn').click(function() {
  $('#js-btn, .pointer, #js-field__pass').removeClass('--usr-new --usr-rst ui-field--hidden');
  $('#js-btn, .pointer').addClass('--usr-rtn');
  $('#js-field__r-pass').addClass('ui-field--hidden');
});
$('#js-usr-new').click(function() {
  $('#js-btn, .pointer, #js-field__r-pass, #js-field__pass').removeClass('--usr-rtn --usr-rst ui-field--hidden');
  $('#js-btn').addClass('--usr-new');
});
$('#js-usr-rst').click(function() {
  $('#js-btn, .pointer').removeClass('--usr-rtn --usr-new');
  $('#js-btn, .pointer').addClass('--usr-rst');
  $('#js-field__r-pass, #js-field__pass').addClass('ui-field--hidden');
});
</script>
</body>
</html>

