<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Vendor</title>
</head>
<body>

<form action="saveVendor" method="post">
      <pre>
Id: <input type="text" name="id"/>
Code: <input type="text" name="code"/>
Name: <input type="text" name="name"/>
Type: <select>
            <option name="type" value="Regular">Regular</option>
            <option name="type" value="Fixed">Fixed</option>
      </select>
Email: <input type="text" name="email"/>
Address: <textarea name="address" rows="4" cols="50"></textarea>
<input type="submit" value="save"/>
      </pre>
</form>

${msg}

<a href="displayVendors">View All</a>

</body>
</html>