<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Vendor</title>
</head>
<body>

<form action="updateVendor" method="post">
      <pre>
Id: <input type="text" name="id" value="${vendor.id} readonly" />
Code: <input type="text" name="code" value="vendor.code" />
Name: <input type="text" name="name" value="vendor.name" />
Type: <select>
            <option name="type" value="Regular" ${vendor.type=='Regular'?'selected':''} >Regular</option>
            <option name="type" value="Fixed" ${vendor.type=='Fixed'?'selected':''}>Fixed</option>
      </select>
Email: <input type="text" name="email" value="${vendor.email}"/>
Address: <textarea name="address" rows="4" cols="50" value="${vendor.address}"></textarea>
<input type="submit" value="save"/>
      </pre>
</form>


</body>
</html>