<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>钓法</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="methodController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${methodPage.id }">
					<input id="createName" name="createName" type="hidden" value="${methodPage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${methodPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${methodPage.updateName }">
					<input id="updateDate" name="updateDate" type="hidden" value="${methodPage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							钓法名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">钓法名称</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							详情:
						</label>
					</td>
					<td class="value">
					     	 <input id="detail" name="detail" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">详情</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发布时间:
						</label>
					</td>
					<td class="value">
					     	 <input id="publishTime" name="publishTime" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">发布时间</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							图片:
						</label>
					</td>
					<td class="value">
					     	 <input id="pic" name="pic" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">图片</label>
						</td>
				</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/method/method.js"></script>		
