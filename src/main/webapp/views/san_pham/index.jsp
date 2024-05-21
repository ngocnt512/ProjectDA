<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>index</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Ma SP</th>
        <th>Ten SP</th>
        <th>Trang Thai</th>
        <th>Thao Tac</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="sp">
    <tr>
        <td>${sp.id}</td>
        <td>${sp.ma}</td>
        <td>${sp.ten}</td>
        <td>${sp.trangThai==1 ? "Dang Hoat Dong":"Dung hoat dong"}</td>
        <td>
        <a href="/san-pham/edit/${sp.id}">Update</a>
        </td>
        <td>
        <a href="/san-pham/delete/${sp.id}">Remove</a>
        </td>
        </c:forEach>
    </tr>
    </tbody>
</table>
</body>
</html>
