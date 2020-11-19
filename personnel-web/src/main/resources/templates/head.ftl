<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>头部</title>
	<link rel="stylesheet" type="text/css" href="lon/css/public.css" />
	<script type="text/javascript" src="lon/js/jquery.js"></script>
	<script type="text/javascript">
		$(function () {
			var date=new Date();
			var  Y=date.getFullYear();
			var M=date.getMonth()+1;
			var  d=date.getDate();
			var H=date.getHours();
			var m=date.getMinutes();
			var week=date.getDay();
			var weekSry;
			switch (week) {
				case 0:
					weekSry="日";
					break;
				case 1:
					weekSry="一";
					break;
				case 2:
					weekSry="二";
					break;
				case 3:
					weekSry="三";
					break;
				case 4:
					weekSry="四";
					break;
				case 5:
					weekSry="五";
					break;
				case 6:
					weekSry="六";
					break;
			}
			var  sty=Y+"年"+M+"月"+d+"日"+H+":"+m+" 星期"+weekSry;
			$("#time").html(sty);
			//判断当前小时
			var hstr;
			if (6>H){
				hstr="凌晨好!";
			}else if (12>H){
				hstr="上午好!";
			}else  if (15>H){
				hstr="中午好!";
			}else  if (18>H){
				hstr="下午好!";
			}else if (21>H){
				hstr="晚上好!";
			}else {
				hstr="深夜好!";
			}
			$("#hStr").html(hstr);
		})
	</script>
</head>

<body>
<div class="head">
	<div class="headL">
		<img class="headLogo" src="lon/img/logLOGO.png"/>
	</div>
	<div class="headR">
		<span style="color:#FFF">欢迎：${employees.firstName}</span>
		<section class="publicTime">
			<span id="time">2015年1月1日 11:11  星期一</span>
		</section>
	</div>
</div>

</body>
</html>