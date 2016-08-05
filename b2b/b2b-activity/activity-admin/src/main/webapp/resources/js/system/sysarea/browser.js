var getScriptArg=function(key){//获取单个参数  
        var scripts=document.getElementsByTagName("script"),  
        script=scripts[scripts.length-1],  
        src=decodeURIComponent(script.src);  
        return (src.match(new RegExp("(?:\\?|&)"+key+"=(.*?)(?=&|$)"))||['',null])[1];  
    }; 
var _WEB_NAME=getScriptArg("webName");

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
            {title : 'ID',  field : 'id', width : 80,sortable : true  },
                {title : '代码',  field : 'code', width : 80,sortable : true  },
                {title : '名称',  field : 'name', width : 80,sortable : true  },
                {title : '电话区号',  field : 'zipCode', width : 80,sortable : true  },
                {title : '邮编',  field : 'postCode',width : 80,sortable : true  }
        
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
						location.href = 'modify?id='+selected.id+'&code='+selected.id;
						//$("#sysarea",parent.document.body).attr("src",_WEB_NAME+"/${beanModeName}/sysArea/modify?id="+selected.id);
					
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

