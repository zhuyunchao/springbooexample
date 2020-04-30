<!DOCTYPE html>
<html>
<body>

<!---后台返回的map在页面的显示-->
${mp.ni}<br>
${mp.age}<br>
${mp.addr}<br>


welcome  ${mp["ni"]} to freemarker!<br/>
welcome  ${mp["age"]}  to freemarker!<br/>
welcome  ${mp["addr"]} to freemarker!<br/>

<#list  mp?keys as k>>
   ${mp[k]}<br>
</#list>
<script  type="text/javascript">
        function abc() {
            alert("test4")
        }

</script>

<!-- 自定义集合的使用-->
<#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as x>
    ${x}
</#list>
</body>
</html>