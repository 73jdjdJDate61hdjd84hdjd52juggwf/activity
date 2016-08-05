//登录面页始终在顶层打开
$(function(){	
	if(top != self) {
		if(top.location != self.location) {
			top.location = self.location;
		}
	}
});