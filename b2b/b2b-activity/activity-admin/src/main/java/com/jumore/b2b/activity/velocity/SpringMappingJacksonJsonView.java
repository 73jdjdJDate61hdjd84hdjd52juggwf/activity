package com.jumore.b2b.activity.velocity;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * 　复写以修改返回json　modelandview 包含modelname 的bug
 * 
 * @author fanwg
 * @date 2013-9-7 下午03:48:16
 * @email renntrabbit@foxmail.com
 */
public class SpringMappingJacksonJsonView extends MappingJackson2JsonView {
	@Override
	protected Object filterModel(Map<String, Object> model) {

		Map<?, ?> result = (Map<?, ?>) super.filterModel(model);

		for (Entry<?, ?> entry : result.entrySet()) {
			Object obj = entry.getValue();
			// System.out.println(obj.getClass().isAssignableFrom(CnnctResponse.class));
			// System.out.println(obj.getClass().isInstance(CnnctResponse.class));
			// System.out.println(obj.getClass().isInstance(CnnctResponse.class));
			// ICResponse
			// if (obj instanceof CnnctResponse
			// ||RestBaseService.RETURN_INTERFACE_KEY.equals(entry.getKey())){
			// return obj;
			// }
		}

		return result;
	}

}
