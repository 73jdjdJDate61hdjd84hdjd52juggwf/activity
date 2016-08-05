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
            {title : '用户ID',  field : 'id', width : 80,sortable : true },
                {title : '账户名',  field : 'name', width : 80,sortable : true },
                {title : '密码',  field : 'pwd', width : 80,sortable : true },
                {title : '是否有效',  field : 'enabled', width : 80,sortable : true },
                {title : '是否锁定',  field : 'locked', width : 80,sortable : true },
                {title : '锁定时间',  field : 'lockTime', width : 80,sortable : true },
                {title : '登录时间',  field : 'loginTime', width : 80,sortable : true },
                {title : '手机',  field : 'mobile', width : 80,sortable : true },
                {title : '电邮',  field : 'email', width : 80,sortable : true },
                {title : '登录错误次数',  field : 'loginFailureCount', width : 80,sortable : true },
                {title : '添加人',  field : 'appendBy', width : 80,sortable : true },
                {title : '修改人',  field : 'modifyBy', width : 80,sortable : true },
                {title : '添加时间',  field : 'appendTime', width : 80,sortable : true },
                {title : '最后修改时间',  field : 'modifyTime', width : 80,sortable : true },
                {title : '调挤',  field : 'salt', width : 80,sortable : true },
                {title : '状态',  field : 'status', width : 80,sortable : true },
                {title : '头像',  field : 'pictureId',width : 80,sortable : true }
        
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
						//$("#sysadmin",parent.document.body).attr("src",_WEB_NAME+"/${beanModeName}/sysAdmin/modify?id="+selected.id);
					
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

