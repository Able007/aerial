<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>鱼探</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="fishingSpotsController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${fishingSpotsPage.id }">
					<input id="createName" name="createName" type="hidden" value="${fishingSpotsPage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${fishingSpotsPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${fishingSpotsPage.updateName }">
					<input id="updateDate" name="updateDate" type="hidden" value="${fishingSpotsPage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							探鱼人id:
						</label>
					</td>
					<td class="value">
					     	 <input id="customerId" name="customerId" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">探鱼人id</label>
						</td>
				<tr>
					<td align="right">
						<label class="Validform_label">
							经度:
						</label>
					</td>
					<td class="value">
					     	 <input id="longitude" name="longitude" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经度</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							纬度:
						</label>
					</td>
					<td class="value">
					     	 <input id="latitude" name="latitude" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">纬度</label>
						</td>
				<tr>
					<td align="right">
						<label class="Validform_label">
							探测时间:
						</label>
					</td>
					<td class="value">
					     	 <input id="discoveryTime" name="discoveryTime" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">探测时间</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							使用的无人机id:
						</label>
					</td>
					<td class="value">
					     	 <input id="droneId" name="droneId" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">使用的无人机id</label>
						</td>
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
  <script src = "webpage/com/jeecg/spot/fishingSpots.js"></script>		
