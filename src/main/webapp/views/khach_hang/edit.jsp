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
<form method="Post" action="/khach-hang/update/${data.id}">
    <div>
        <label>Ma</label>
        <input type="text" name="ma" value="${data.ma}">
    </div>
    <div>
        <label>Ten</label>
        <input type="text" name="ten" value="${data.ten}">
    </div>
    <div>
        <label>SDT</label>
        <input type="text" name="sdt" value="${data.sdt}">
    </div>
    <div>
        <label>Trang Thai </label>
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
        <button>Add</button>
    </div>
</form>
</body>
</html>