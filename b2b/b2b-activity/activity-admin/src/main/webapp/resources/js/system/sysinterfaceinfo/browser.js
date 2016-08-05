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
                        {title : '产品ID',  field : 'productId',width : 80,sortable : true},
                        {title : '接口编号',  field : 'serialNo',width : 80,sortable : true},
                        {title : '接口名称',  field : 'name',width : 80,sortable : true},
                        {title : '状态',  field : 'status',width : 80,sortable : true},
                        {title : '权限编码',  field : 'code',width : 80,sortable : true},
                        {title : '请求方式',  field : 'method',width : 80,sortable : true},
                        {title : 'URL',  field : 'url',width : 80,sortable : true},
                        {title : '参数',  field : 'datadetail',width : 80,sortable : true},
                        {title : '返回值',  field : 'results',width : 80,sortable : true},
                        {title : '备注',  field : 'remark',width : 80,sortable : true}
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
						location.href = 'modify?id='+selected.id+'&productId='+selected.productId+'&code='+selected.code;
					}else{
						$.messager.alert('提示',"请选择一条记录");
					}
			}
		},'-',{
			id:'btntest',
			text:'测试',
			iconCls:'icon-save',
			handler:function(){
				location.href = 'toquery';
			}
		}]
	});
});

