<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>鱼获</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="fishCatchesController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${fishCatchesPage.id }">
					<input id="createName" name="createName" type="hidden" value="${fishCatchesPage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${fishCatchesPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${fishCatchesPage.updateName }">
					<input id="updateDate" name="updateDate" type="hidden" value="${fishCatchesPage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							鱼类百科id:
						</label>
					</td>
					<td class="value">
					     	 <input id="fishId" name="fishId" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">鱼类百科id</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							鱼的长度:
						</label>
					</td>
					<td class="value">
					     	 <input id="fishLength" name="fishLength" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">鱼的长度</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							捕获时间:
						</label>
					</td>
					<td class="value">
					     	 <input id="catchTime" name="catchTime" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">捕获时间</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							是否参加鱼获排行榜:
						</label>
					</td>
					<td class="value">
					     	 <input id="isLeaderboard" name="isLeaderboard" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否参加鱼获排行榜</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							捕获区域:
						</label>
					</td>
					<td class="value">
					     	 <input id="catchLocation" name="catchLocation" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">捕获区域</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							具体捕获地点:
						</label>
					</td>
					<td class="value">
					     	 <input id="detailLocation" name="detailLocation" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">具体捕获地点</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							释放鱼获:
						</label>
					</td>
					<td class="value">
					     	 <input id="isRelease" name="isRelease" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">释放鱼获</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							关联的钓点:
						</label>
					</td>
					<td class="value">
					     	 <input id="catchSpotId" name="catchSpotId" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">关联的钓点</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							使用的钓法:
						</label>
					</td>
					<td class="value">
					     	 <input id="methodId" name="methodId" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">使用的钓法</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							使用的线组:
						</label>
					</td>
					<td class="value">
					     	 <input id="rigId" name="rigId" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">使用的线组</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							使用的鱼饵:
						</label>
					</td>
					<td class="value">
					     	 <input id="baitId" name="baitId" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">使用的鱼饵</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							使用的鱼竿:
						</label>
					</td>
					<td class="value">
					     	 <input id="rodId" name="rodId" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">使用的鱼竿</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							使用的无人机型号:
						</label>
					</td>
					<td class="value">
					     	 <input id="droneId" name="droneId" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">使用的无人机型号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							使用的诱饵:
						</label>
					</td>
					<td class="value">
					     	 <input id="lureId" name="lureId" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">使用的诱饵</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							我的心情:
						</label>
					</td>
					<td class="value">
					     	 <input id="emotion" name="emotion" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">我的心情</label>
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
  <script src = "webpage/com/jeecg/catch/fishCatches.js"></script>		
