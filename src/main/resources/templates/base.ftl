<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>
           <@block name="title">这个父模板的title</@block>

    </title>

</head>
<body>


${name!"没有值的话显示空值"}<br>

<h1>
    h1标签<br>
     <@block name="h11">这个父模板的h1的标签
</@block>
    <br>

       <@block name="h12">

       <h2>
           这是父模板h2的标签
       </h2>
       </@block>

</h1>

</body>
</html>
