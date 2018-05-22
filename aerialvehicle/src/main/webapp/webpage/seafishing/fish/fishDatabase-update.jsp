<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>鱼类百科</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="fishDatabaseController.do?doUpdate" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${fishDatabasePage.id }">
					<input id="createName" name="createName" type="hidden" value="${fishDatabasePage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${fishDatabasePage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${fishDatabasePage.updateName }">
					<input id="updateDate" name="updateDate" type="hidden" value="${fishDatabasePage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								鱼类名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt" datatype="*" value='${fishDatabasePage.name}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">鱼类名称</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								濒危等级:
							</label>
						</td>
						<td class="value">
						     	 <input id="threatLevel" name="threatLevel" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.threatLevel}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">濒危等级</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								英文名:
							</label>
						</td>
						<td class="value">
						     	 <input id="englishName" name="englishName" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.englishName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">英文名</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								拉丁学名:
							</label>
						</td>
						<td class="value">
						     	 <input id="latinName" name="latinName" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.latinName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">拉丁学名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								所属界:
							</label>
						</td>
						<td class="value">
						     	 <input id="kingdom" name="kingdom" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.kingdom}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属界</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								所属门:
							</label>
						</td>
						<td class="value">
						     	 <input id="phylum" name="phylum" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.phylum}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属门</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								所属亚门:
							</label>
						</td>
						<td class="value">
						     	 <input id="subPhylum" name="subPhylum" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.subPhylum}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属亚门</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								所属纲:
							</label>
						</td>
						<td class="value">
						     	 <input id="fishClass" name="fishClass" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.fishClass}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属纲</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								所属亚纲:
							</label>
						</td>
						<td class="value">
						     	 <input id="subClass" name="subClass" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.subClass}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属亚纲</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								所属目:
							</label>
						</td>
						<td class="value">
						     	 <input id="orders" name="orders" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.orders}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属目</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								所属亚目:
							</label>
						</td>
						<td class="value">
						     	 <input id="subOrders" name="subOrders" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.subOrders}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属亚目</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								所属科:
							</label>
						</td>
						<td class="value">
						     	 <input id="family" name="family" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.family}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属科</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								所属的属:
							</label>
						</td>
						<td class="value">
						     	 <input id="genus" name="genus" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.genus}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属的属</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								所属种:
							</label>
						</td>
						<td class="value">
						     	 <input id="species" name="species" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.species}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属种</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								命名人:
							</label>
						</td>
						<td class="value">
						     	 <input id="namer" name="namer" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.namer}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">命名人</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								形态特征:
							</label>
						</td>
						<td class="value">
						     	 <input id="characteristics" name="characteristics" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.characteristics}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">形态特征</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								分布区域:
							</label>
						</td>
						<td class="value">
						     	 <input id="distributionArea" name="distributionArea" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.distributionArea}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">分布区域</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								图片:
							</label>
						</td>
						<td class="value">
						     	 <input id="pic" name="pic" type="text" style="width: 150px" class="inputxt"  value='${fishDatabasePage.pic}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">图片</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/fish/fishDatabase.js"></script>		
