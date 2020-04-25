<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
    <a href="/download?filename=1.jpg">下载1.jpg</a>

    <form method="post" action="/upload" enctype="multipart/form-data">
        <input type="file" name="fileName" value="上传"/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
