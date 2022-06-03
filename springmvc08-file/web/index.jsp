<%--
  Created by IntelliJ IDEA.
  User: timwong5
  Date: 2022-06-03
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <title>upload</title>
</head>
<body>


  <%--前端表单要求：为了能上传文件，必须将表单的method设置为POST，
  并将enctype设置为multipart/form-data。
  只有在这样的情况下，浏览器才会把用户选择的文件以二进制数据发送给服务器；--%>

<h1>方式1</h1>
<form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
  <input type="file" name="file"/>
  <input type="submit" value="upload">
</form>

<h1>采用file.Transto 来保存上传的文件</h1>
<form action="${pageContext.request.contextPath}/upload2" enctype="multipart/form-data" method="post">
  <input type="file" name="file"/>
  <input type="submit" value="upload">
</form>

<a href="${pageContext.request.contextPath}/download">点击下载</a>

</body>
</html>