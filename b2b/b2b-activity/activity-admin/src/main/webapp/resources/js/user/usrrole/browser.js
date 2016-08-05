var getScriptArg=function(key){//获取单个参数  
        var scripts=document.getElementsByTagName("script"),  
        script=scripts[scripts.length-1],  
        src=decodeURIComponent(script.src);  
        return (src.match(new RegExp("(?:\\?|&)"+key+"=(.*?)(?=&|$)"))||['',null])[1];  
    }; 
var _WEB_NAME=getScriptArg("webName");
var _USRROLE_STATUS_DATA=jQuery.parseJSON(getScriptArg("USRROLE_STATUS_DATA"));

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
            {title : '序列',  field : 'id', width : 80,sortable : true  },
            {title : '角色名称',  field : 'name', width : 80,sortable : true  },
            {title : '角色描述',  field : 'desc', width : 80,sortable : true  },
            {title : '角色类型',  field : 'type', width : 80,sortable : true  },
            {title : '状态',  field : 'status', width : 80,sortable : true,  
            	formatter:function(keycode){
            		return eval( "_USRROLE_STATUS_DATA.USRROLE_STATUS_"+keycode);
            	}
            },
            {title : '创建人',  field : 'createBy', width : 80,sortable : true  },
            {title : '创建时间',  field : 'createTime', width : 80,sortable : true  },
            {title : '创建人',  field : 'modifyBy', width : 80,sortable : true  },
            {title : '修改时间',  field : 'modifiedTime', width : 80,sortable : true  },
            {title : '备注',  field : 'remark',width : 80,sortable : true  }
        ] ],
		pagination : true,
		singleSelect : true,
		rownumbers : true,
		toolbar:[{
			id:'btnadd',
			text:'添加',
			iconCls:'icon-add',
			handler:function(){
				location.href="append";
			}
		},{
			id:'btncut',
			text:'修改',
			iconCls:'icon-edit',
			handler:function(){
					var selected = $('#grid').datagrid('getSelected');
					if (selected){
						location.href = 'modify?id='+selected.id+'&name='+selected.id;
						//$("#usrrole",parent.document.body).attr("src",_WEB_NAME+"/${beanModeName}/usrRole/modify?id="+selected.id);
					
					}else{
						$.messager.alert('提示',"请选择一条记录");
					}
			}
		},'-',{
			id:'btnsave',
			text:'delete',
			iconCls:'icon-remove',
			handler:function(){
				var selected = $('#grid').datagrid('getSelected');
				if (selected){					
					$.ajax( {
						url : 'delete.json',// 跳转到 action     
						data : {
						id:selected.id
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
				}else{
					$.messager.alert('提示',"请选择一条记录");
				}
			}
		}]
	});
});

