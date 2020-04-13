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
            <div class="container mt-4">
                <form action="/add" method="POST" class="col-sm-5">
                    <div class="card">
                        <div class="card-header">
                            <h4>新規　名称</h4>
                        </div>
                        <div class="card-body">
                            <div class="fomr-group">
                                <label for="">名称</label>
                                <input type="text" name="name" class="form-control">
                            </div>
                        </div>
                        <div class="card-footer">
                            <input type="submit" value="追加" class="btn btn-info">
                            <a href="/init" class="btn btn-link">戻る</a>
                        </div>
                    </div>
                </form>
            </div>

        </body>

        </html>