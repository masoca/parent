<%@page import="com.msc.test.springmvc.constant.BankType"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
    <title></title>
</head>
<body>
	
  	<h1>test</h1>
  	s:property标签访问静态数据:<s:property value="@com.msc.test.springmvc.constant.BankType@BANKTYPE_ICBC.displayName"/>
	<hr>
	s:property标签调用静态方法:<s:property value="@com.msc.test.springmvc.constant.BankType@parseOf('0105').displayName" />
	<hr>
	jsp页面获取list大小:${fn:length(list)}
	<hr>
	c标签遍历枚举及静态数据访问:
	<c:set var="flowTypes" value="<%= com.msc.test.springmvc.constant.BankType.values() %>"/>
	<c:forEach var="type" items="${flowTypes}">
	    <option value="${type.value}" >${type}-----${type.value}-----${type.displayName}</option>
	</c:forEach>
	${fn:length(flowTypes)}<!-- 9 -->
	<c:set var="isMobPay" value="<%= BankType.getAbc() %>"></c:set>
	${isMobPay}	<!-- abc -->
	<%= BankType.isMobilePayment("0906") %>	<!-- true -->
	<c:set var="isMobPay" value='<%= BankType.isMobilePayment("0906") %>'></c:set>
	${isMobPay}	<!-- true -->
	<hr>
	
</body>
</html>
