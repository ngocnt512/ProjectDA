<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Khach Hang</title>
</head>
<body>
<h2> Quan Ly Khach Hang</h2>
<form method="Post" action="/kich-thuoc/update/${data.id}">
    <div>
        <label>Ma</label>
        <input type="text" name="ma">
    </div>
    <div>
        <label>Ten</label>
        <input type="text" name="ten">
    </div>
    <div>
        <label>Trang Thai </label>
        <select name="trangThai">
            <option value="1">Dang Hoat Dong</option>
            <option value="0">Dung Hoat Dong</option>
        </select>
    </div>
    <div>
        <button>Add</button>
    </div>
</form>
</body>
</html>