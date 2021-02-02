
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Calculator</title>
</head>
<body>
<form method="post" action="/calculator">
  <h5>Số thứ nhất</h5>
  <input name="sothunhat">

  <h5>Số thứ hai</h5>
  <input name="sothuhai"><br>
  <select name="operator">
    <option>+</option>
    <option>-</option>
    <option>x</option>
    <option>/</option>
  </select>
  <input value="Tính" type="submit">
</form>
<input value="${result}">
</body>

</html>