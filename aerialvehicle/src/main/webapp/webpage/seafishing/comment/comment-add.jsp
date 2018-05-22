<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>对鱼获的评论</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="commentController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${commentPage.id }">
					<input id="createName" name="createName" type="hidden" value="${commentPage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${commentPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${commentPage.updateName }">
					<input id="updateDate" name="updateDate" type="hidden" value="${commentPage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							评论的内容:
						</label>
					</td>
					<td class="value">
					     	 <input id="content" name="content" type="text" style="width: 150px" class="inputxt"  datatype="*">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">评论的内容</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							评论时间:
						</label>
					</td>
					<td class="value">
					     	 <input id="commentTime" name="commentTime" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">评论时间</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							相关鱼获的id:
						</label>
					</td>
					<td class="value">
					     	 <input id="catchesId" name="catchesId" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">相关鱼获的id</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							评论人id:
						</label>
					</td>
					<td class="value">
					     	 <input id="customerId" name="customerId" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">评论人id</label>
						</td>
				</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/comment/comment.js"></script>		
