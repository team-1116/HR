<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>企业人事管理系统登录</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="statics/css/font.css">
	<link rel="stylesheet" href="statics/css/weadmin.css">
    <script src="lib/layui/layui.js" charset="utf-8"></script>
    <script src="statics/js/util/util.js"></script>
    <script src="statics/js/jquery.1.11.3.min.js"></script>
</head>
<body class="login-bg">
    
    <div class="login">
        <div class="message">企业人事管理系统登录</div>
        <div id="darkbannerwrap"></div>
        <form id="loginForm" class="layui-form" >
            <input name="userName" placeholder="用户名" id="userName"  type="text" lay-verify="required" class="layui-input" >
            <div class="layui-form-mid layui-word-aux" id="msgname"  style="display:none;">用户名错误</div>
            <hr class="hr30">
            <input name="password" id="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">

            <div class="layui-form-mid layui-word-aux" id="passwordmsg"  style="display:none;">密码错误</div>
            <hr class="hr30">
            <input class="layui-btn layui-btn-danger" value="登录" lay-submit lay-filter="login" style="width:100%;" type="button" onclick="login()">
            <hr class="hr20" >
        </form>
    </div>
    <!-- 底部结束 -->
</body>
<script>
    layui.use(['element', 'form'], function(){
        var element = layui.element,
            form = layui.form;
    });

    function login() {
        var userName=$("#userName").val();
        var password=$("#password").val();
        if (userName==null||userName==''){
            alert("登录名不能为空");
            return false;
        }else  if (password==null||password==''){
            alert("密码不能为空");
            return false;
        }
        else {
            $.ajax({
                url:"/login",
                type:"post",
                data:{
                    "userName":userName,
                    "password":password,
                },
                dataType:"text",
                success:function (data) {
                    if (data=="ok"){
                       alert("ok");
                       window.location.href="/toindex";
                    }else if (data=="no") {
                        $("#msgname").css('display','block');
                        $("#passwordmsg").css('display','none');
                        return;
                    }else if (data=="nop"){
                        $("#passwordmsg").css('display','block');
                        $("#msgname").css('display','none');
                        return;
                    }
                }

            });
        }
    }
</script>
</html>