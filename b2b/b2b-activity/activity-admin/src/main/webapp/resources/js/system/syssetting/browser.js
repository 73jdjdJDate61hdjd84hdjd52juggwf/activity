
$(function(){
	$('.portlet-body').on('click','li > a',function(e){
		
         var menuContainer = $('.tabbable ul');
         menuContainer.children('li.active').removeClass('active');
         $(this).parents('li').addClass('active');

         var url = $(this).attr("href");
         $(".tab-content .active").removeClass('active');
         $(".tab-content "+url).addClass('active');
	});
	
    
});

