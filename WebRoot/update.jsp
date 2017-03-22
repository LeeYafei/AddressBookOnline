<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
   	<s:form action="modify" method="post">
   		<s:iterator value="#cs">
   			序号:<input name="con.id" value='<s:property value="id"/>'><br/>
   			姓名:<input name="con.cname" value="<s:property value="cname"/>"><br/>
   			手机:<input name="con.moble" value="<s:property value="moble"/>"><br/>
   			Q Q:<input name="con.qq" value="<s:property value="qq"/>"><br/>
   			Email:<input name="con.email" value="<s:property value="email"/>"><br/>
   			地址:<input name="con.address" value="<s:property value="address"/>">
   			<s:submit value="保存"></s:submit><s:reset value="重置"></s:reset>
   		</s:iterator>
   	</s:form>
  </body>
</html>
