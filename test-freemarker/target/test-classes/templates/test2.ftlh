<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Hello World!</title>
</head>
<body>

遍历map集合<br/>
方法一(中括号中写map的key)：<br/>
姓名: ${stuMap['stu1'].name}<br/>
年龄: ${stuMap['stu1'].age}<br/>

方法二(直接点出map的key)：<br/>
姓名: ${stuMap.stu1.name}<br/>
年龄: ${stuMap.stu1.age}<br/>

方法三(遍历map的key):<br/>
<#list stuMap?keys as key>
    姓名:<span <#if stuMap[key].name=='小明'>style="background-color: aqua" </#if>>${stuMap[key].name}</span><br/>
    年龄:<span <#if (stuMap[key].age gt 18)>style="background-color: red" </#if>> ${stuMap[key].age}</span><br/>
</#list>

</body>

</html>