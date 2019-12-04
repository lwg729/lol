<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>lol列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    基于SSM框架的管理系统：简单实现增、删、改、查。
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改lol列表</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="" name="userForm">
        <input type="hidden" name="hid" value="${lol.hid}"/>
        英雄名字：<input type="text" name="hero" value="${lol.hero}"/>
        英雄速度：<input type="text" name="hspeed" value="${lol.hspeed}"/>
        英雄力量：<input type="text" name="hpower" value="${lol.hpower }"/>
        英雄血量：<input type="text" name="hblood" value="${lol.hblood }"/>
        <input type="button" value="提交" onclick="updateHero()"/>
    </form>
    <script type="text/javascript">
        function updateHero() {
            var form = document.forms[0];
            form.action = "<%=basePath %>/updateHero";
            form.method = "post";
            form.submit();
        }
    </script>
</div>