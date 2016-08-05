var getScriptArg=function(key){//获取单个参数  
        var scripts=document.getElementsByTagName("script"),  
        script=scripts[scripts.length-2],  
        src=script.src;  
        return (src.match(new RegExp("(?:\\?|&)"+key+"=(.*?)(?=&|$)"))||['',null])[1];  
    }; 
var parentId="";	
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
			            {title : '序列',  field : 'pid',sortable : true},
                        {title : '父节点',  field : 'parentId',width : 80,sortable : true},
                        {title : '树阶',  field : 'ladder',width : 80,sortable : true},
                        {title : '选项名称',  field : 'itemCode',width : 80,sortable : true},
                        {title : '选项描述',  field : 'itemComments',width : 80,sortable : true},
                        {title : '状态',  field : 'status',width : 80,sortable : true},
                        {title : '编码',  field : 'keyCode',width : 80,sortable : true},
                        {title : '值',  field : 'keyValue',width : 80,sortable : true},
                        {title : '排序',  field : 'sort',width : 80,sortable : true},
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
				var node=tree.getSelectedNode();
				location.href='append?parentId='+node.data.id+'&ladder='+node.data.level;
		
			}
		},{
			id:'btncut',
			text:'修改',
			iconCls:'icon-edit',
			handler:function(){
					var selected = $('#grid').datagrid('getSelected');
					if (selected){
						var node=tree.getSelectedNode();
						location.href='modify?parentId='+node.data.id+'&id='+selected.id;
					
					}else{
						$.messager.alert('提示',"请选择一条记录");
					}
			}
		},'-',{
			id:'btnddel',
			text:'delete',
			iconCls:'icon-remove',
			handler:function(){
				
				var selected = $('#grid').datagrid('getSelected');
				var pid="";
				if (selected){			
					pid=selected.id;
				}else{
					pid=parentId;
				}
				
				$.ajax( {
					url : 'delete.json',// 跳转到 action     
					data : {
					pid:pid
					},
					type : 'post',
					dataType:'text',
					success : function(data) {
					 if (data.id!=0){
						$.messager.alert('提示','删除成功!','info');
					 }else{
						$.messager.alert('提示','删除失败!','info');
					 }
					 $('#grid').datagrid("reload");
					},
					error : function() {
						$.messager.alert('提示','删除失败!','info');
					}
				});
			}
		}]
	});
});

