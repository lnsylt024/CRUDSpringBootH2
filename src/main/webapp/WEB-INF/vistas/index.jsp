<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>CROD SPRING BOOT H2</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        </head>

        <body>
            <div class="contrainer mt-4">
                <a href="/append" class="btn btn-success">新規</a>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Index</th>
                            <th>名称</th>
                            <th>動作</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="persona" items="${personas}">
                            <tr>
                                <td>${persona.id}</td>
                                <td>${persona.name}</td>
                                <td>
                                    <a href="/edit/${persona.id}" class="btn btn-warning">編集</a>
                                    <a href="/delete/${persona.id}" class="btn btn-danger">削除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </body>

        </html>