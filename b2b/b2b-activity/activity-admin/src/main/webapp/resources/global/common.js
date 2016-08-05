function createFrame(url,iframeId) {
	var s = '<iframe scrolling="auto" frameborder="0" name ="'+iframeId+'" id ="'+iframeId+'" src="'+url+'" style="width:100%;height:100%;"></iframe>';
	return s;
}

function updateCurrTab(url){
	
	var currTab =  self.parent.$('#tabs').tabs('getSelected'); //获得当前tab
	
	var content=createFrame(url);
    self.parent.$('#tabs').tabs('update', {
      tab : currTab,
      options : {
       content : content
      }
     });
}