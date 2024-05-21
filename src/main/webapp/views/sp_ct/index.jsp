<%@page pageEncoding="utf-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<form method="get" action="/sp-ct/index">
<h2> Quản Lý Sản Phẩm</h2>
<div>
<lable>Sản Phẩm</lable>
<select name="ma">
    <c:forEach items="${sp}" var="s">
        <option value="${s.id}">${s.ten}</option>
    </c:forEach>

</select>
    <button>Tìm</button>
</div>
</form>
<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>Ma</th>
        <th>Màu Sac</th>
        <th>Kích Thước</th>
        <th>Số Lượng</th>
        <th>Đơn Giá</th>
        <th>Trạng Thái</th>
        <th>Thao Tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="sp">
    <tr>
        <td>${sp.id}</td>
        <td>${sp.ma}</td>
        <td>${sp.ms}</td>
        <td>${sp.kt}</td>
        <td>${sp.sl}</td>
        <td>${sp.dg}</td>
        <td>${sp.trangThai ==1 ? "Đang Hoạt Động":"Dừng Hoạt Động"}</td>
        <td>
            <a href="#">Update</a>
        </td>
        <td>
            <a href="#">Remove</a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>

</body>

</html>