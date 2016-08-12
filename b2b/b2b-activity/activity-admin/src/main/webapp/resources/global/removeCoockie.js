//登录面页始终在顶层打开
$(function(){	
	alert(12);
});

function removeCoockie(){
	var date = new Date();
    date.setTime(date.getTime() - 10000); 
	var aCookie = document.cookie.split(";");
	var re = '';
	for (var i = 0; i < aCookie.length; i++) {
	    var aCrumb = aCookie[i].split("=");
	    if (aCrumb[0] =='JSESSIONID'){
	    	continue;
	    }
	    delCookie(aCrumb[0],date);
	}
}

function delCookie(name,date){//为了删除指定名称的cookie，可以将其过期时间设定为一个过去的时间 
    document.cookie = name + "=a; expires=" + date.toGMTString(); 
} 
