<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>注册的用户</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="customerController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${customerPage.id }">
					<input id="createName" name="createName" type="hidden" value="${customerPage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${customerPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${customerPage.updateName }">
					<input id="updateDate" name="updateDate" type="hidden" value="${customerPage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							名字:
						</label>
					</td>
					<td class="value">
					     	 <input id="firstName" name="firstName" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">名字</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							姓氏:
						</label>
					</td>
					<td class="value">
					     	 <input id="lastName" name="lastName" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">姓氏</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							邮箱地址:
						</label>
					</td>
					<td class="value">
					     	 <input id="email" name="email" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">邮箱地址</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							密码:
						</label>
					</td>
					<td class="value">
					     	 <input id="passwd" name="passwd" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">密码</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							图像名:
						</label>
					</td>
					<td class="value">
					     	 <input id="icon" name="icon" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">图像名</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							性别:
						</label>
					</td>
					<td class="value">
					     	 <input id="gender" name="gender" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">性别</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出生日期:
						</label>
					</td>
					<td class="value">
					     	 <input id="birth" name="birth" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">出生日期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							所处城市:
						</label>
					</td>
					<td class="value">
					     	 <input id="city" name="city" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所处城市</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							经验值:
						</label>
					</td>
					<td class="value">
					     	 <input id="experience" name="experience" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经验值</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							积分:
						</label>
					</td>
					<td class="value">
					     	 <input id="points" name="points" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">积分</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							等级:
						</label>
					</td>
					<td class="value">
					     	 <input id="ranking" name="ranking" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">等级</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							累计飞行总里程数:
						</label>
					</td>
					<td class="value">
					     	 <input id="totalDistance" name="totalDistance" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">累计飞行总里程数</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/customer/customer.js"></script>		
