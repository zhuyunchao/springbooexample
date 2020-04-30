<!DOCTYPE html>
<html>
<head>
    <title>这是test6的title</title>

</head>
<body>
<#list LIstq as li>
第6个列子list的显示 ${li.id} to freemarker!<br>
第6个列子list的显示 ${li.citycode} to freemarker!<br>
第6个列子list的显示 ${li.cityname} to freemarker!<br>

    <table border="5" width="60%"  hight="300px">
        <tr>
            <td>城市id</td>
            <td>城市name</td>
            <td>城市code</td>

        </tr>
        <tr>
            <td>${li.id}</td>
            <td> ${li.cityname}</td>
            <td>${li.citycode}</td>

        </tr>
    </table>


</#list>
<!---后台返回的map在页面的显示-->
${mp.CY.id}<br>
${mp.CY.citycode}<br>
${mp.CY.cityname}<br>
welcome  ${mp["CY"].id} to freemarker!<br/>
welcome  ${mp["CY"].citycode}  to freemarker!<br/>
welcome  ${mp["CY"].cityname} to freemarker!<br/>
<#list  mp?keys as k>>
    ${mp[k].id}<br>
    ${mp[k].citycode}<br>
    ${mp[k].cityname}<br>

</#list>

<!-- 自定义集合的使用-->
<#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as x>
    ${x}
</#list>


<#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as n>
    <#if n != "星期一">
        ${n}
    </#if>
<br>
</#list>
<#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as n>
    <#if (n_index) ==1 || (n_index) ==3>
        ${n}      ----  星期天  <br>
    <#else>
        ${n}       ---- 工作日<br>
    </#if>
</#list>



${date?date}<br>
${date?datetime}<br>
${date?time}
<script type="text/javascript">
   zhu=function(){
        alert("这是test6的弹出层");
    }
    zhu()
</script>




</body>
</html>