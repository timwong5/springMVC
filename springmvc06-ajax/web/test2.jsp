<%--
  Created by IntelliJ IDEA.
  User: timwong5
  Date: 2022-06-02
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                // console.log(1111);
                // 点击后去取数据
                $.post("${pageContext.request.contextPath}/a2",function(data){
                    console.log(data);
                    let html = "";
                    for(let i=0; i<data.length; i++){
                        html+= "<tr>" +
                            "<td>" + data[i].name + "</td>" +
                            "<td>" + data[i].age + "</td>" +
                            "<td>" + data[i].sex + "</td>" +
                            "</tr>"
                    }
                    $("#content").html(html);
                });
            })
        })
    </script>

</head>
<body>

<input type="button" id="btn" value="getData"/>
<table width="80%" align="center">
    <tr>
        <td>name</td>
        <td>age</td>
        <td>sex</td>
    </tr>
    <tbody id="content">
    </tbody>
</table>

</body>
</html>