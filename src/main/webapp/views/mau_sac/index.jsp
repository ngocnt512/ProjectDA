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
</head>
<body>
<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>Ma</th>
        <th>ten</th>
        <th>Trang Thai</th>
        <th>Thao Tac</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="d">
        <tr>
            <td>${d.id}</td>
            <td>${d.ma}</td>
            <td>${d.ten}</td>
            <td>${d.trangThai == 1 ? "Dang Hoat Dong":"Dung Hoat Dong"}</td>
            <td>
                <a href="/mau-sac/edit/${d.id}">Update</a>
            </td>
            <td>
                <a href="/mau-sac/delete/${d.id}">Remove</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>