<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
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
                    <small>英雄列表 —— 显示所有英雄</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${path}/toAddHero">新增</a>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>英雄编号</th>
                    <th>英雄名字</th>
                    <th>英雄速度</th>
                    <th>英雄力量</th>
                    <th>英雄血量</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="lol" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${lol.hid}</td>
                        <td>${lol.hero}</td>
                        <td>${lol.hspeed}</td>
                        <td>${lol.hpower}</td>
                        <td>${lol.hblood}</td>
                        <td>
                            <a href="${path}/toUpdateHero?hid=${lol.hid}">更改</a>
                            <a href="<%=appPath%>/del/${lol.hid}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>