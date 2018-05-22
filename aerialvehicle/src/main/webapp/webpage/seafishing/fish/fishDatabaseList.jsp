<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="fishDatabaseList" checkbox="true" fitColumns="false" title="鱼类百科" actionUrl="fishDatabaseController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="鱼类名称"  field="name"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="濒危等级"  field="threatLevel"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="英文名"  field="englishName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="拉丁学名"  field="latinName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属界"  field="kingdom"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属门"  field="phylum"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属亚门"  field="subPhylum"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属纲"  field="fishClass"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属亚纲"  field="subClass"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属目"  field="orders"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属亚目"  field="subOrders"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属科"  field="family"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属的属"  field="genus"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属种"  field="species"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="命名人"  field="namer"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="形态特征"  field="characteristics"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="分布区域"  field="distributionArea"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="图片"  field="pic"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="fishDatabaseController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="fishDatabaseController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="fishDatabaseController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="fishDatabaseController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="fishDatabaseController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/fish/fishDatabaseList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#fishDatabaseListtb").find("input[name='createDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#fishDatabaseListtb").find("input[name='updateDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'fishDatabaseController.do?upload', "fishDatabaseList");
}

//导出
function ExportXls() {
	JeecgExcelExport("fishDatabaseController.do?exportXls","fishDatabaseList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("fishDatabaseController.do?exportXlsByT","fishDatabaseList");
}
 </script>