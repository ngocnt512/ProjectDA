<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>San Pham</title>
</head>
<body>
<h2> Quan Ly San Pham</h2>
<form action="/san-pham/update/${data.id}" method="post">
    <div>
        <hr>
        <div>
        <label>Ma</label>
            <input type="text" name="ma" value="${data.ma}">
        </div>
        <div >
        <label>Ten</label>
            <input type="text" name="ten" value="${data.ten}">
        </div>
        <div >
        <label>Trang Thai</label>
        <select name="trangThai">
            <option value="1"
            ${data.trangThai ==1?"select":""}
            >dang hoat dong</option>
            <option value="0"
            ${data.trangThai ==0?"select":""}
            >Khong hoat dong</option>
        </select>
        </div>
        <div>
            <button>Luu</button>
        </div>
    </div>
</form>
</body>
</html>