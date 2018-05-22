<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="fishingSpotsList" checkbox="true" fitColumns="false" title="鱼探" actionUrl="fishingSpotsController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="探鱼人id"  field="customerId"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经度"  field="longitude"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="纬度"  field="latitude"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="探测时间"  field="discoveryTime"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="使用的无人机id"  field="droneId"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="图片"  field="pic"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="fishingSpotsController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="fishingSpotsController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="fishingSpotsController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="fishingSpotsController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="fishingSpotsController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/spot/fishingSpotsList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#fishingSpotsListtb").find("input[name='createDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#fishingSpotsListtb").find("input[name='updateDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'fishingSpotsController.do?upload', "fishingSpotsList");
}

//导出
function ExportXls() {
	JeecgExcelExport("fishingSpotsController.do?exportXls","fishingSpotsList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("fishingSpotsController.do?exportXlsByT","fishingSpotsList");
}
 </script>