package com.jumore.b2b.activity.velocity;

import org.springframework.oxm.Marshaller;

/**
 *   org.springframework.web.servlet.view.xml.MarshallingView类的locateToBeMarshalled方法
 *   接受的参数Map<String, Object> model里有2个对象分别是BindingResult和User，
 *   locateToBeMarshalled方法在返回时候先检索到BindingResult结果就返回了它而不是真正需要返回的User
 *   解决办法:
 *
 *   继承MarshallingView类重写locateToBeMarshalled方法，
 *   由于MarshallingView类没有提供marshaller,和modelKey的get方法，
 *   所以还要重写这2个属性相关的内容
 * @author fanwg
 * @date   2013-9-7 下午02:37:59 
 * @email  renntrabbit@foxmail.com
 */
public class SpringMarshallingView extends org.springframework.web.servlet.view.xml.MarshallingView{

	private Marshaller marshaller;

	  private String modelKey;

	  public Marshaller getMarshaller() {
	    return marshaller;
	  }

	  public String getModelKey() {
	    return modelKey;
	  }

	  public SpringMarshallingView() {
	    super();
	  }

	  public SpringMarshallingView(Marshaller marshaller) {
	    super(marshaller);
	    this.marshaller = marshaller;
	  }

	  @Override
	  public void setMarshaller(Marshaller marshaller) {
	    super.setMarshaller(marshaller);
	    this.marshaller = marshaller;
	  }

	  @Override
	  public void setModelKey(String modelKey) {
	    super.setModelKey(modelKey);
	    this.modelKey = modelKey;
	  }

	}
