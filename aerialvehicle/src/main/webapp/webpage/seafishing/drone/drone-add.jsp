<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>无人机</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="droneController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${dronePage.id }">
					<input id="createName" name="createName" type="hidden" value="${dronePage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${dronePage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${dronePage.updateName }">
					<input id="updateDate" name="updateDate" type="hidden" value="${dronePage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							无人机名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">无人机名称</label>
						</td>
				<tr>
					<td align="right">
						<label class="Validform_label">
							无人机型号型号:
						</label>
					</td>
					<td class="value">
					     	 <input id="model" name="model" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">无人机型号型号</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							无人机型号类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="droneType" name="droneType" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">无人机型号类型</label>
						</td>
				<tr>
					<td align="right">
						<label class="Validform_label">
							价格:
						</label>
					</td>
					<td class="value">
					     	 <input id="price" name="price" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">价格</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							简介:
						</label>
					</td>
					<td class="value">
					     	 <input id="brief" name="brief" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">简介</label>
						</td>
				<tr>
					<td align="right">
						<label class="Validform_label">
							功能说明:
						</label>
					</td>
					<td class="value">
					     	 <input id="detail" name="detail" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">功能说明</label>
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
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/drone/drone.js"></script>		
