<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="customerList" checkbox="true" fitColumns="false" title="注册的用户" actionUrl="customerController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="名字"  field="firstName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="姓氏"  field="lastName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="邮箱地址"  field="email"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="密码"  field="passwd"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="图像名"  field="icon"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="性别"  field="gender"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="出生日期"  field="birth"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所处城市"  field="city"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经验值"  field="experience"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="积分"  field="points"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="等级"  field="ranking"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="累计飞行总里程数"  field="totalDistance"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="customerController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="customerController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="customerController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="customerController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="customerController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/customer/customerList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#customerListtb").find("input[name='createDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#customerListtb").find("input[name='updateDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'customerController.do?upload', "customerList");
}

//导出
function ExportXls() {
	JeecgExcelExport("customerController.do?exportXls","customerList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("customerController.do?exportXlsByT","customerList");
}
 </script>