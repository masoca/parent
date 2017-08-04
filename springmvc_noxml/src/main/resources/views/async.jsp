<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<div id="msg">

</div>
<script src="assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script type="text/javascript">

    deferred();
    var s = '';
    function deferred() {
        $.get('defer',function (data) {
            console.log(data);
            s += data + "<br>";
            $("#msg").html(s);
            deferred();
        })
    }

</script>
</body>
</html>