<!DOCTYPE html>
<html>
<head>
    <title>这是test5的title的模板</title>

</head>
<body>

<#list LIstq as li>
第5个列子list的显示 ${li.id} to freemarker!<br>
第5个列子list的显示 ${li.citycode} to freemarker!<br>
第5个列子list的显示 ${li.cityname} to freemarker!<br>
</#list>
<!---后台返回的map在页面的显示-->
${mp.CY.id}<br>
${mp.CY.citycode}<br>
${mp.CY.cityname}<br>
welcome  ${mp["CY"].id} to freemarker!<br/>
welcome  ${mp["CY"].citycode}  to freemarker!<br/>
welcome  ${mp["CY"].cityname} to freemarker!<br/>
<#list  mp?keys as k>>
    ${mp[k]}<br>
</#list>
<!-- 自定义集合的使用-->
<#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as x>
    ${x}
</#list>

</body>
</html>