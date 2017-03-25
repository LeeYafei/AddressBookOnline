<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
   		<s:form action="init!findLike" method="post"> 
   			<tr>
   				<td colspan="6"><h3 align="center">在线通讯录</h3></td>
   			</tr>
   			<tr>
   				<td>
   				查找联系人：<input name="con.cname"/>
				<input type="submit" value="查找"/>
				<s:a href="add.jsp">添加联系人</s:a>
   				</td>
   			</tr>
   		</s:form>
   		<s:form action="init" method="post">
   		<table border="1px" cellpadding="0" cellspacing="0">
   			
   			<tr align="center">
   				<td>序号</td>
   				<td>姓名</td>
   				<td>手机</td>
   				<td>qq</td>
   				<td>Email</td>
   				<td>地址</td>
   			</tr>
   			<s:iterator value="#cs" status="c">
	   			<tr align="center" 
	   					id="<s:property value='id'/>" 
	   					bgcolor="<s:property value="%{#c.index%2==0?'#c9cdd2':'#e7eaee'}"/>">
	   				
	   				<td><s:property value="id"/></td>
	   				<td><a href="findOne?con.id=<s:property value="id"/>">
					<s:property value="cname"/></a></td>
	   				<td><s:property value="moble"/></td>
	   				<td><s:property value="qq"/></td>
	   				<td><s:property value="email"/></td>
	   				<td><s:property value="address"/></td>
	   			</tr>
   			</s:iterator>
   		</table>
   	</s:form>
  </body>
</html>
