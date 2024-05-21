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
<form>
    <table class="table table-striped">
        <thead>
            <tr>
            <th>ID</th>
            <th>Ma</th>
            <th>Ten</th>
            <th>SDT</th>
            <th>Thang Thai</th>
            <th>Thao Tác</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${kh}" var="k">
            <tr>
                <td>${k.id}</td>
                <td>${k.ma}</td>
                <td>${k.ten}</td>
                <td>${k.sdt}</td>
                <td>${k.trangThai==1 ? "Dang Hoat Dong" : "Dung Hoat Dong" }</td>
                <td>
                    <a href="/khach-hang/edit/${k.id}">Update</a>
                </td>
                <td>
                    <a href="/khach-hang/delete/${k.id}">Remove</a>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</form>
</body>
</html>