<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="fishCatchesList" checkbox="true" fitColumns="false" title="鱼获" actionUrl="fishCatchesController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="鱼类百科id"  field="fishId"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="鱼的长度"  field="fishLength"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="捕获时间"  field="catchTime"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="是否参加鱼获排行榜"  field="isLeaderboard"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="捕获区域"  field="catchLocation"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="具体捕获地点"  field="detailLocation"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="释放鱼获"  field="isRelease"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="关联的钓点"  field="catchSpotId"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="使用的钓法"  field="methodId"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="使用的线组"  field="rigId"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="使用的鱼饵"  field="baitId"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="使用的鱼竿"  field="rodId"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="使用的无人机型号"  field="droneId"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="使用的诱饵"  field="lureId"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="我的心情"  field="emotion"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="fishCatchesController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="fishCatchesController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="fishCatchesController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="fishCatchesController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="fishCatchesController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/catch/fishCatchesList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#fishCatchesListtb").find("input[name='createDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#fishCatchesListtb").find("input[name='updateDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'fishCatchesController.do?upload', "fishCatchesList");
}

//导出
function ExportXls() {
	JeecgExcelExport("fishCatchesController.do?exportXls","fishCatchesList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("fishCatchesController.do?exportXlsByT","fishCatchesList");
}
 </script>