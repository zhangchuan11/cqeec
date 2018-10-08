package com.cqeec.is.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.cqeec.is.config.ApplicationConfig;
import com.cqeec.is.config.SpringMvcConfig;

public class IsInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// Spring上下文配置文件类
		return new Class[] { ApplicationConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// SpringMVC配置文件类
		return new Class[] { SpringMvcConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
