<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>企业人事管理系统登录</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="shortcut icon" href="./favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./static/css/font.css">
	<link rel="stylesheet" href="./static/css/weadmin.css">

</head>
<body class="login-bg">
    
    <div class="login">
        <div class="message">企业人事管理系统登录</div>
        <div id="darkbannerwrap"></div>
        
        <form id="loginForm" method="post" class="layui-form" >
            <input name="username" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <input class="loginin"  id="login" value="登录" lay-submit lay-filter="login" style="width:100%;" type="button">
            <hr class="hr20" >
        </form>
    </div>
    <script src="/lib/layui/layui.js" charset="utf-8"></script>
    <script src="/statics/js/util/util.js"></script>
    <script src="/statics/js/jquery.1.11.3.min.js"></script>
    <script type="text/javascript">
        

    </script>  
    <!-- 底部结束 -->
</body>
</html>