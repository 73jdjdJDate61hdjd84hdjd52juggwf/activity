var getScriptArg=function(key){//获取单个参数  
        var scripts=document.getElementsByTagName("script"),  
        script=scripts[scripts.length-1],  
        src=decodeURIComponent(script.src);  
        return (src.match(new RegExp("(?:\\?|&)"+key+"=(.*?)(?=&|$)"))||['',null])[1];  
    }; 
var _WEB_NAME=getScriptArg("webName");
var _SYSMODEL_STATUS_DATA=jQuery.parseJSON(getScriptArg("SYSMODEL_STATUS_DATA"));
var tree;
$(function(){
	$('#grid').datagrid({
		fit : true,
		pageNumber : 1,
		pageList : [ 10, 20, 30 ],
		nowrap : true,
		striped : true,
		collapsible : true,
		remoteSort : false,
		url:'doBrowser.json',
			columns : [ [ 
                        {title : '父节点',  field : 'parentId',width : 80,sortable : true},
                        {title : '树阶',  field : 'ladder',width : 80,sortable : true},
                        {title : '模块编号',  field : 'modelCode',width : 80,sortable : true},
                        {title : '模块名',  field : 'name',width : 80,sortable : true},
                        {title : '模块关键字',  field : 'keyword',width : 80,sortable : true},
                        {title : '状态',  field : 'status',width : 80,sortable : true},
                        {title : '创建时间',  field : 'appendBy',width : 80,sortable : true}
            			           ] ],
			             
			pagination : true,
			singleSelect : true,
			rownumbers : true,
			toolbar:[{
				id:'btnadd',
			text:'添加',
			iconCls:'icon-add',
			handler:function(){
				location.href = 'append';
			}
		},{
			id:'btncut',
			text:'修改',
			iconCls:'icon-edit',
			handler:function(){
					var selected = $('#grid').datagrid('getSelected');
					if (selected){
						$.messager.alert('提示',"请修改本处代码[selected.productId]");
						location.href = 'modify?pid='+selected.id+'&parentId='+selected.productId;
					}else{
						$.messager.alert('提示',"请选择一条记录");
					}
			}
		},'-',{
			id:'btnsave',
			text:'delete',
			disabled:true,
			iconCls:'icon-save',
			handler:function(){
				alert('开发中..');
			}
		}]
	});
});

