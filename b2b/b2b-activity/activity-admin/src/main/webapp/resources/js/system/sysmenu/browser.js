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
		url:'doBrowser.json?parentId=0',
			columns : [ [ 
			            {title : '序列',  field : 'id', width : 80,sortable : true  },
		                {title : '编码',  field : 'code', width : 80,sortable : true  },
		                {title : '名称',  field : 'name', width : 80,sortable : true  },
		                {title : '英文名称',  field : 'nameEn', width : 80,sortable : true  },
		                {title : '阶级',  field : 'ladder', width : 80,sortable : true  },
		                {title : '父节点',  field : 'parentId', width : 80,sortable : true  },
		                {title : '排序',  field : 'sort', width : 80,sortable : true  },
		                {title : '图标',  field : 'pictureId', width : 80,sortable : true  },
		                {title : 'url',  field : 'url', width : 80,sortable : true  },
		                {title : '权限ID',  field : 'authorityId',width : 80,sortable : true  }
                      ] ],
			             
			pagination : true,
			singleSelect : false,
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
						location.href = 'modify?code='+selected.code+'&id='+selected.id;
					}else{
						$.messager.alert('提示',"请选择一条记录");
					}
			}
		},'-',{
			id:'btndel',
			text:'删除',
			disabled:false,
			iconCls:'icon-remove',
			handler:function(){
				var rows = $('#grid').datagrid('getSelections');
				if (rows.length==0){
					$.messager.alert('提示',"请选择一条记录");
					return;
				}
				var data = [];
				for (var i=0 ;i<rows.length;i++){
					var sysMenu = {"id":rows[i].id};
					data.push(sysMenu);
				}
				$.ajax( {
					contentType : 'application/json',
					url : 'delete.json',     
					data :JSON.stringify(data),
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
					error : function(data) {
						console.log(data);
						$.messager.alert('提示','删除失败!','info');
					}
				});
			}
		}]
	});
});
