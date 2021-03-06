<%--
  Created by IntelliJ IDEA.
  User: wanghaiyuan
  Date: 2019/1/7
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>Register t=ier</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/a3common.css" rel="stylesheet">
    <link rel="stylesheet" href="css/font_43459_lbtux0zjkr6yldi.css">
    <link rel="stylesheet" href="css/register.css">
</head>

<body>

<div id="main" class="main-warp">
    <div class="main-content">
        <div class="formDiv">

            <h2 class="title text-center">注册</h2>



            <div class="switch">
                <a id="switch" current="normal" href="javascript:;" class="link">
                    在钉钉上使用表单大师?
                </a>
            </div>

            <form id="registerForm" role="form" class="form-horizontal " action="" method="post">
                <div class="form-item">
                    <div class="input-warp">
                        <span class="input-icon iconfont icon-yonghu1"></span><input id="userName" name="userName" placeholder="手机号码" type="text" class="inputs" value=""/>
                    </div>
                    <p id="userNameErr" class="errMsg"></p>
                </div>
                <div class="form-item">
                    <div class="input-warp s">
                        <span class="input-icon iconfont icon-yanzhengma"></span>
                        <input id="kaptcha" name="kaptcha" placeholder="验证码" type="text" class="inputs" value=""/>
                        <div id="popup-captcha" style="display: none"></div>
                    </div>
                    <div class="pull-right">
                        <button id="btnSendCode" class="btn lgbtn blue">获取验证码</button>
                    </div>
                    <p id="kaptchaErr" class="errMsg"></p>
                </div>

                <div class="form-item">
                    <div class="input-warp">
                        <span class="input-icon iconfont icon-baomi"></span>
                        <input id="pwd" type="password" placeholder="至少6位字母或数字" maxlength="20" name="password" value=""
                               class="inputs"/>
                    </div>
                    <p id="passwordErr" class="errMsg"></p>
                </div>
                <div class="form-item">
                    <div class="input-warp">
                        <span class="input-icon iconfont icon-baomi"></span>
                        <input id="repwd" type="password" placeholder="至少6位字母或数字" maxlength="20" name="password2" value=""
                               class="inputs"/>
                    </div>
                    <p id="passwordErr2" class="errMsg"></p>
                </div>
                <div class="form-item">
                    <div class="input-warp">
                        <span class="input-icon iconfont icon-youxiangbangding"></span><input id="email" name="email" placeholder="邮箱地址" type="text" class="inputs" value=""/>
                    </div>
                    <p id="emailErr" class="errMsg"></p>
                </div>
                <div class="btn-warp">
                    <div class="text-center">
                        <button type="button" id="btnSubmit"  class="btn lgbtn blue btn-block">注册</button>
                        <input id="appName" name="appName" type="hidden" value="jsform"/>
                    </div>
                </div>
                <div class="agreement gap">
                    <div class="text-right">
                        <div class="pull-left">已有账号，<a href="index.jsp" class="link">登录</a></div><p>注册即代表您已阅读并同意《<a href="javascript:;" target="_blank" class="link">使用协议</a>》</p>
                    </div>
                </div>
            </form>

        </div>
    </div>
</div>


</body>
</html>

