//七牛图片上传
if (window.Qiniu){
	$.fn.previewImage = {};
	$.fn.previewImage.defaults = {
		container : '.rd-previewImage-container',//container : 预览图片容器选择器
		replace : true,//replace:替换容器中的内容还是追加，默认替换；
		newInput : true,//当replace 为true时，此参数无效
		deletable : true,//deletable：预览的图片是否可删除，默认不可删除
		deleteInput : true,//当iniImages的图片被删除时，是否向表单添加标志,默认添加
		deleteInputName : 'deleteImage',
		wrap : '<div></div>',
		imageClass : 'rd-previewImage-image',
		wrapClass : 'rd-previewImage-wrap',
		delClass : 'rd-previewImage-del',
		delIconSrc : '',
		proxy : '',//代理按钮
		iniImages : [],//初始图片
		isBase64 : false,//图片url是否为base64,
		relativePath : true,//图片url是否为相对路径
		imageUrlField : 'imageUrl',//图片url对应的field


		onClose : function(){}
	};

	(function($){

		domain = 'http://7xlqs5.com1.z0.glb.clouddn.com/';

		function guid() {
	        return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
	            var r = Math.random()*16|0, v = c == 'x' ? r : (r&0x3|0x8);
	            return v.toString(16);
	        });
	    }

	    function ini(target){
			var opts = $.data(target, 'qnUpload').options;
			var $previewContainer = $('#' + opts.previewContainer);
			$previewContainer.html('');
			if (opts.iniImages){
				!(opts.iniImages instanceof Array) && (opts.iniImages = [opts.iniImages]);
				
				$.each(opts.iniImages,function(i,item){
					var delIconSrc,$pic,$input,$wrap;
					if (typeof item == 'object'){
						item = item[opts.imageUrlField];
					}
						
					$pic = $('<img alt="图片预览" />').addClass(opts.imageClass).click(function(e){
						//预览图片
						var $zoom = $('<div class="rd-previewImage-zoom"><div class="head"><img class="del" /></div><div class="content"><img /></div></div>');
						var $del = $zoom.find('.del').click(function(){
							$zoom.remove();
						}).attr('src','data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAABGdBTUEAALGPC/xhBQAAACBjSFJNAAB6JgAAgIQAAPoAAACA6AAAdTAAAOpgAAA6mAAAF3CculE8AAABp1BMVEUAAADwRUjyWVrtJC3yWVnwREjtQUT1j3v2lHrze3PqJC3zfHP2k3r2j3rsREH0clPyZET0gWTydm7mHifnJS3yfHT0gGTyZEXzcFLrQT3iGyLsRznzaUryYkTzel/wbmjiHyfiIyzxenH0e2DyYkPrRjjiGSDeGCDpRDfyY0bxXUDzd1zvdm7fKDDfJS7weHD0d13yYkXoPTPdFyHZGCDnQjXzX0LxWT3zblXyf3PyfnPzblbzXkLkOjHZFh/UFx/kPjHxWD7wUznyXkXyX0XwUzrwVz7jOjDTFR/OFB3mQDLyVDzwUDjwTzjyVDvpRTTOFR3MIyzpUUXxTTXvTDbwTTXqUULNIyvGISfmZ2LyVkPwRDDySDTvRDDyVULlZmHEGiLCISblamXzVkfwPSzxQTDkNivwPS3zWUrgX12/GSG7HSTjZmXzU0jvNCnyOy/ZKya6ExrvNCjzUkffYV+6HSS2HCLhYmLzS0TvLSbyMyzXJiOzEhj0TUfIOj32SEbxJSTzKyrUISGtDxS1Gh/pIiXxIyfRGx+mDhOuDhS4ERehCxD///8JFiWeAAAAAXRSTlMAQObYZgAAAAFiS0dEjGwL0kMAAADhSURBVBjTY2BgZGJmgAJmFlYGBjZ2Dk4uCJ+Lm4eXjYGPX0BQSBjEFxEVE5eQZJCSlpGVk1dgYFBUUlaRUVVjYFDX0NTS1tHV0zfQMjQyBik1MTUzt7C0sja3sbWDGGbv4Ojk7OLq5u4Bs87Ty9vH188/AMZnCAwKDgkJDQuH8SMio6JjYmLj4hMg/MSk5JTUtLTU9IzMLBA/Oyc3L7+gsLAgv6i4pJSBoay8orKquoaBoaa6qrK2vIyhrr6hsakZpLS5qbGhvo6hpbWtvQNiWEd7W2sLA0NnVzfMuu6uTgYAAQszdEHjezoAAAAldEVYdGRhdGU6Y3JlYXRlADIwMTMtMDQtMDNUMTc6MTg6MDMrMDg6MDBF2AH3AAAAJXRFWHRkYXRlOm1vZGlmeQAyMDEyLTAzLTE5VDIyOjM1OjA2KzA4OjAwhGKssQAAAE10RVh0c29mdHdhcmUASW1hZ2VNYWdpY2sgNi44LjgtNyBRMTYgeDg2XzY0IDIwMTQtMDItMjggaHR0cDovL3d3dy5pbWFnZW1hZ2ljay5vcmdZpF9/AAAAGHRFWHRUaHVtYjo6RG9jdW1lbnQ6OlBhZ2VzADGn/7svAAAAF3RFWHRUaHVtYjo6SW1hZ2U6OkhlaWdodAAxNh2vXm8AAAAWdEVYdFRodW1iOjpJbWFnZTo6V2lkdGgAMTblAJ7iAAAAGXRFWHRUaHVtYjo6TWltZXR5cGUAaW1hZ2UvcG5nP7JWTgAAABd0RVh0VGh1bWI6Ok1UaW1lADEzMzIxNjc3MDZkb4HqAAAAEXRFWHRUaHVtYjo6U2l6ZQA3NDdCQoago8YAAABidEVYdFRodW1iOjpVUkkAZmlsZTovLy9ob21lL2Z0cC8xNTIwL2Vhc3lpY29uLmNuL2Vhc3lpY29uLmNuL2Nkbi1pbWcuZWFzeWljb24uY24vcG5nLzEwNjA5LzEwNjA5MDUucG5nz/AIzwAAAABJRU5ErkJggg==');
						$zoom.find('.content img').attr('src',domain + item + '?imageView2/1/w/800/h/800' );
						$zoom.appendTo('body'); 
					}).attr('src',domain + item + '?imageView2/1/w/100/h/100');
					
					$wrap = opts.wrap ? $pic.wrap(opts.wrap).parent().addClass(opts.wrapClass) : $pic;
					$input = $('<input type="hidden" name="'+ opts.fileName +'" value="'+ item +'" />').appendTo($wrap);
					if (opts.deletable && !opts.replace){
						$wrap.css('position','relative');
						var $del = $('<a href="javascript:;"><img alt="删除"/></a>').addClass(opts.delClass).css({
							position : 'absolute',
							right : 5,
							top : 5,
							width : 16,
							height : 16
						}).appendTo($wrap).click(function(){
							opts.onClose.call(target);
							$wrap.remove();
						});
						delIconSrc = opts.delIconSrc ? opts.delIconSrc : 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAABGdBTUEAALGPC/xhBQAAACBjSFJNAAB6JgAAgIQAAPoAAACA6AAAdTAAAOpgAAA6mAAAF3CculE8AAABp1BMVEUAAADwRUjyWVrtJC3yWVnwREjtQUT1j3v2lHrze3PqJC3zfHP2k3r2j3rsREH0clPyZET0gWTydm7mHifnJS3yfHT0gGTyZEXzcFLrQT3iGyLsRznzaUryYkTzel/wbmjiHyfiIyzxenH0e2DyYkPrRjjiGSDeGCDpRDfyY0bxXUDzd1zvdm7fKDDfJS7weHD0d13yYkXoPTPdFyHZGCDnQjXzX0LxWT3zblXyf3PyfnPzblbzXkLkOjHZFh/UFx/kPjHxWD7wUznyXkXyX0XwUzrwVz7jOjDTFR/OFB3mQDLyVDzwUDjwTzjyVDvpRTTOFR3MIyzpUUXxTTXvTDbwTTXqUULNIyvGISfmZ2LyVkPwRDDySDTvRDDyVULlZmHEGiLCISblamXzVkfwPSzxQTDkNivwPS3zWUrgX12/GSG7HSTjZmXzU0jvNCnyOy/ZKya6ExrvNCjzUkffYV+6HSS2HCLhYmLzS0TvLSbyMyzXJiOzEhj0TUfIOj32SEbxJSTzKyrUISGtDxS1Gh/pIiXxIyfRGx+mDhOuDhS4ERehCxD///8JFiWeAAAAAXRSTlMAQObYZgAAAAFiS0dEjGwL0kMAAADhSURBVBjTY2BgZGJmgAJmFlYGBjZ2Dk4uCJ+Lm4eXjYGPX0BQSBjEFxEVE5eQZJCSlpGVk1dgYFBUUlaRUVVjYFDX0NTS1tHV0zfQMjQyBik1MTUzt7C0sja3sbWDGGbv4Ojk7OLq5u4Bs87Ty9vH188/AMZnCAwKDgkJDQuH8SMio6JjYmLj4hMg/MSk5JTUtLTU9IzMLBA/Oyc3L7+gsLAgv6i4pJSBoay8orKquoaBoaa6qrK2vIyhrr6hsakZpLS5qbGhvo6hpbWtvQNiWEd7W2sLA0NnVzfMuu6uTgYAAQszdEHjezoAAAAldEVYdGRhdGU6Y3JlYXRlADIwMTMtMDQtMDNUMTc6MTg6MDMrMDg6MDBF2AH3AAAAJXRFWHRkYXRlOm1vZGlmeQAyMDEyLTAzLTE5VDIyOjM1OjA2KzA4OjAwhGKssQAAAE10RVh0c29mdHdhcmUASW1hZ2VNYWdpY2sgNi44LjgtNyBRMTYgeDg2XzY0IDIwMTQtMDItMjggaHR0cDovL3d3dy5pbWFnZW1hZ2ljay5vcmdZpF9/AAAAGHRFWHRUaHVtYjo6RG9jdW1lbnQ6OlBhZ2VzADGn/7svAAAAF3RFWHRUaHVtYjo6SW1hZ2U6OkhlaWdodAAxNh2vXm8AAAAWdEVYdFRodW1iOjpJbWFnZTo6V2lkdGgAMTblAJ7iAAAAGXRFWHRUaHVtYjo6TWltZXR5cGUAaW1hZ2UvcG5nP7JWTgAAABd0RVh0VGh1bWI6Ok1UaW1lADEzMzIxNjc3MDZkb4HqAAAAEXRFWHRUaHVtYjo6U2l6ZQA3NDdCQoago8YAAABidEVYdFRodW1iOjpVUkkAZmlsZTovLy9ob21lL2Z0cC8xNTIwL2Vhc3lpY29uLmNuL2Vhc3lpY29uLmNuL2Nkbi1pbWcuZWFzeWljb24uY24vcG5nLzEwNjA5LzEwNjA5MDUucG5nz/AIzwAAAABJRU5ErkJggg==';
						$del.children('img').attr('src',delIconSrc);
					}
					$previewContainer.append($wrap);
				});			
			}
		}
		function bindEvents(target){
			var opts = $.data(target, 'qnUpload').options;
			Qiniu.uploader($.extend(true,{
		        init:{
		        	'FileUploaded': function(up, file, info) {
			            var res = $.parseJSON(info);		            
						var $previewContainer = $('#' + opts.previewContainer),delIconSrc,$file,$pic,$wrap,$input;
			            $file = $(target).children('input').val(res.key).validatebox();
			            //添加图片
						$pic = $('<img path="'+res.key+'" src="'+ domain+res.key+'?imageView2/1/w/100/h/100">').addClass(opts.imageClass).click(function(e){
							//放大图片
							var $zoom = $('<div class="rd-previewImage-zoom"><div class="head"><img class="del" /></div><div class="content"><img /></div></div>');
							var $del = $zoom.find('.del').click(function(){
								$zoom.remove();
							}).attr('src','data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAABGdBTUEAALGPC/xhBQAAACBjSFJNAAB6JgAAgIQAAPoAAACA6AAAdTAAAOpgAAA6mAAAF3CculE8AAABp1BMVEUAAADwRUjyWVrtJC3yWVnwREjtQUT1j3v2lHrze3PqJC3zfHP2k3r2j3rsREH0clPyZET0gWTydm7mHifnJS3yfHT0gGTyZEXzcFLrQT3iGyLsRznzaUryYkTzel/wbmjiHyfiIyzxenH0e2DyYkPrRjjiGSDeGCDpRDfyY0bxXUDzd1zvdm7fKDDfJS7weHD0d13yYkXoPTPdFyHZGCDnQjXzX0LxWT3zblXyf3PyfnPzblbzXkLkOjHZFh/UFx/kPjHxWD7wUznyXkXyX0XwUzrwVz7jOjDTFR/OFB3mQDLyVDzwUDjwTzjyVDvpRTTOFR3MIyzpUUXxTTXvTDbwTTXqUULNIyvGISfmZ2LyVkPwRDDySDTvRDDyVULlZmHEGiLCISblamXzVkfwPSzxQTDkNivwPS3zWUrgX12/GSG7HSTjZmXzU0jvNCnyOy/ZKya6ExrvNCjzUkffYV+6HSS2HCLhYmLzS0TvLSbyMyzXJiOzEhj0TUfIOj32SEbxJSTzKyrUISGtDxS1Gh/pIiXxIyfRGx+mDhOuDhS4ERehCxD///8JFiWeAAAAAXRSTlMAQObYZgAAAAFiS0dEjGwL0kMAAADhSURBVBjTY2BgZGJmgAJmFlYGBjZ2Dk4uCJ+Lm4eXjYGPX0BQSBjEFxEVE5eQZJCSlpGVk1dgYFBUUlaRUVVjYFDX0NTS1tHV0zfQMjQyBik1MTUzt7C0sja3sbWDGGbv4Ojk7OLq5u4Bs87Ty9vH188/AMZnCAwKDgkJDQuH8SMio6JjYmLj4hMg/MSk5JTUtLTU9IzMLBA/Oyc3L7+gsLAgv6i4pJSBoay8orKquoaBoaa6qrK2vIyhrr6hsakZpLS5qbGhvo6hpbWtvQNiWEd7W2sLA0NnVzfMuu6uTgYAAQszdEHjezoAAAAldEVYdGRhdGU6Y3JlYXRlADIwMTMtMDQtMDNUMTc6MTg6MDMrMDg6MDBF2AH3AAAAJXRFWHRkYXRlOm1vZGlmeQAyMDEyLTAzLTE5VDIyOjM1OjA2KzA4OjAwhGKssQAAAE10RVh0c29mdHdhcmUASW1hZ2VNYWdpY2sgNi44LjgtNyBRMTYgeDg2XzY0IDIwMTQtMDItMjggaHR0cDovL3d3dy5pbWFnZW1hZ2ljay5vcmdZpF9/AAAAGHRFWHRUaHVtYjo6RG9jdW1lbnQ6OlBhZ2VzADGn/7svAAAAF3RFWHRUaHVtYjo6SW1hZ2U6OkhlaWdodAAxNh2vXm8AAAAWdEVYdFRodW1iOjpJbWFnZTo6V2lkdGgAMTblAJ7iAAAAGXRFWHRUaHVtYjo6TWltZXR5cGUAaW1hZ2UvcG5nP7JWTgAAABd0RVh0VGh1bWI6Ok1UaW1lADEzMzIxNjc3MDZkb4HqAAAAEXRFWHRUaHVtYjo6U2l6ZQA3NDdCQoago8YAAABidEVYdFRodW1iOjpVUkkAZmlsZTovLy9ob21lL2Z0cC8xNTIwL2Vhc3lpY29uLmNuL2Vhc3lpY29uLmNuL2Nkbi1pbWcuZWFzeWljb24uY24vcG5nLzEwNjA5LzEwNjA5MDUucG5nz/AIzwAAAABJRU5ErkJggg==');
							var $image = $zoom.find('.content img');
							$image.attr('src',domain + res.key + '?imageView2/1/w/800/h/800');
							$zoom.appendTo('body'); 

						});
						opts.replace && $previewContainer.children('.' + opts.wrapClass).remove();
						$wrap = opts.wrap ? $pic.wrap(opts.wrap).parent().addClass(opts.wrapClass) : $pic;
						$input = $('<input type="hidden" name="'+ opts.fileName +'" value="'+ res.key +'" />').appendTo($wrap);
						$previewContainer.append($wrap);

						//添加删除箭头
						if (opts.deletable && !opts.replace){
							$wrap.css('position','relative');
							var $del = $('<a href="javascript:;"><img alt="删除"/></a>').addClass(opts.delClass).css({
								position : 'absolute',
								right : 5,
								top : 5,
								width : 16,
								height : 16
							}).appendTo($wrap).click(function(){
								opts.onClose.call(target);
								$wrap.remove();
							});
							delIconSrc = opts.delIconSrc ? opts.delIconSrc : 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAABGdBTUEAALGPC/xhBQAAACBjSFJNAAB6JgAAgIQAAPoAAACA6AAAdTAAAOpgAAA6mAAAF3CculE8AAABp1BMVEUAAADwRUjyWVrtJC3yWVnwREjtQUT1j3v2lHrze3PqJC3zfHP2k3r2j3rsREH0clPyZET0gWTydm7mHifnJS3yfHT0gGTyZEXzcFLrQT3iGyLsRznzaUryYkTzel/wbmjiHyfiIyzxenH0e2DyYkPrRjjiGSDeGCDpRDfyY0bxXUDzd1zvdm7fKDDfJS7weHD0d13yYkXoPTPdFyHZGCDnQjXzX0LxWT3zblXyf3PyfnPzblbzXkLkOjHZFh/UFx/kPjHxWD7wUznyXkXyX0XwUzrwVz7jOjDTFR/OFB3mQDLyVDzwUDjwTzjyVDvpRTTOFR3MIyzpUUXxTTXvTDbwTTXqUULNIyvGISfmZ2LyVkPwRDDySDTvRDDyVULlZmHEGiLCISblamXzVkfwPSzxQTDkNivwPS3zWUrgX12/GSG7HSTjZmXzU0jvNCnyOy/ZKya6ExrvNCjzUkffYV+6HSS2HCLhYmLzS0TvLSbyMyzXJiOzEhj0TUfIOj32SEbxJSTzKyrUISGtDxS1Gh/pIiXxIyfRGx+mDhOuDhS4ERehCxD///8JFiWeAAAAAXRSTlMAQObYZgAAAAFiS0dEjGwL0kMAAADhSURBVBjTY2BgZGJmgAJmFlYGBjZ2Dk4uCJ+Lm4eXjYGPX0BQSBjEFxEVE5eQZJCSlpGVk1dgYFBUUlaRUVVjYFDX0NTS1tHV0zfQMjQyBik1MTUzt7C0sja3sbWDGGbv4Ojk7OLq5u4Bs87Ty9vH188/AMZnCAwKDgkJDQuH8SMio6JjYmLj4hMg/MSk5JTUtLTU9IzMLBA/Oyc3L7+gsLAgv6i4pJSBoay8orKquoaBoaa6qrK2vIyhrr6hsakZpLS5qbGhvo6hpbWtvQNiWEd7W2sLA0NnVzfMuu6uTgYAAQszdEHjezoAAAAldEVYdGRhdGU6Y3JlYXRlADIwMTMtMDQtMDNUMTc6MTg6MDMrMDg6MDBF2AH3AAAAJXRFWHRkYXRlOm1vZGlmeQAyMDEyLTAzLTE5VDIyOjM1OjA2KzA4OjAwhGKssQAAAE10RVh0c29mdHdhcmUASW1hZ2VNYWdpY2sgNi44LjgtNyBRMTYgeDg2XzY0IDIwMTQtMDItMjggaHR0cDovL3d3dy5pbWFnZW1hZ2ljay5vcmdZpF9/AAAAGHRFWHRUaHVtYjo6RG9jdW1lbnQ6OlBhZ2VzADGn/7svAAAAF3RFWHRUaHVtYjo6SW1hZ2U6OkhlaWdodAAxNh2vXm8AAAAWdEVYdFRodW1iOjpJbWFnZTo6V2lkdGgAMTblAJ7iAAAAGXRFWHRUaHVtYjo6TWltZXR5cGUAaW1hZ2UvcG5nP7JWTgAAABd0RVh0VGh1bWI6Ok1UaW1lADEzMzIxNjc3MDZkb4HqAAAAEXRFWHRUaHVtYjo6U2l6ZQA3NDdCQoago8YAAABidEVYdFRodW1iOjpVUkkAZmlsZTovLy9ob21lL2Z0cC8xNTIwL2Vhc3lpY29uLmNuL2Vhc3lpY29uLmNuL2Nkbi1pbWcuZWFzeWljb24uY24vcG5nLzEwNjA5LzEwNjA5MDUucG5nz/AIzwAAAABJRU5ErkJggg==';
							$del.children('img').attr('src',delIconSrc);
						}                    
			        }
		    	}
		        
		    },opts));  

		}

		$.fn.qnUpload = function(options, param){

			if (typeof options == 'string'){
				return $.fn.qnUpload.methods[options](this, param);
			}
			
			options = options || {};
			return this.each(function(){
				var state = $.data(this, 'qnUpload');
				if (state){
					$.extend(state.options, options);
				} else {
					$.data(this, 'qnUpload', {
						options: $.extend({}, $.fn.qnUpload.defaults, $.parser.parseOptions(this), options)
					});				
				}
				ini(this);
				bindEvents(this);

			});
		}

		$.fn.qnUpload.defaults = $.extend(true,{},$.fn.previewImage.defaults,{
			fileName: 'borrowImageUrl',
			runtimes: 'html5,flash,html4',
	        browse_button: 'pickfiles',
	        container: 'qn_container',
	        drop_element: 'qn_container',
	        previewContainer: 'rd_previewImage_container',//container : 预览图片容器选择器
	        max_file_size: '100mb',
	        flash_swf_url: 'resources/plugins/plupload/Moxie.swf',
	        dragdrop: true,
	        chunk_size: '4mb',
	        uptoken_url: '/7niu/uptoken.json',        
	        domain: domain,
	        unique_names: false,
	        save_key: false,        
	        auto_start: true,
	        filters: {
                mime_types : [
                    { title : "Image files", extensions : "jpg,gif,png,jpeg" }
                ]
            },
	        init: {
	            'FilesAdded': function(up, files) {
	            },
	            'BeforeUpload': function(up, file) {
	            },
	            'UploadProgress': function(up, file) {
	            },
	            'UploadComplete': function() {
	            },
	            
	            'Error': function(up, err, errTip) {           
	            },
	            'Key': function(up, file) {
	                var key = "", date = new Date();
	                key = date.getTime()+guid();
	                return key
	            }
	        }
		});

		$.parser.plugins.push('qnUpload');

	})(jQuery);
}
	