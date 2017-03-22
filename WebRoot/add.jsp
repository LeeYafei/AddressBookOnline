<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <body>
    <s:form action="add" method="post">
    	<s:textfield name="con.cname" label="姓名" ></s:textfield>
    	<s:textfield name="con.moble" label="电话"></s:textfield>
    	<s:textfield name="con.qq" label="QQ"></s:textfield>
    	<s:textfield name="con.email" label="Email"></s:textfield>
    	<s:textfield name="con.address" label="地址"></s:textfield>
		<s:submit value="保存"></s:submit>
    	<s:reset value="重置"></s:reset>
    </s:form>
  </body>
</html>
