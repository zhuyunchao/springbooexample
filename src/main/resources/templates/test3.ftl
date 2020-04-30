<!DOCTYPE html>
<html>
<body>

<!-- 3.返回的list的的实现-->
<#list listqq as li>
第三个列子list的显示 ${li} to freemarker!<br>
</#list>

<br>
<!-- 自定义集合的使用-->
<#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as x>
    ${x}
</#list>
</body>
</html>