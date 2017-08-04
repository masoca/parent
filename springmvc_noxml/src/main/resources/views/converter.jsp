<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <div id="resp">
    </div>
    <input type="button" onclick="req()" value="转换">
<script src="assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
    function req() {
        $.ajax({
            url:"convert",
            data:"2-马颂超",
            type:"POST",
            contentType:"application/x-msc",//2自定义的媒体类型x-msc
            success:function (data) {
                $("#resp").html(data);
            }
        })
    }

</script>
</body>
</html>