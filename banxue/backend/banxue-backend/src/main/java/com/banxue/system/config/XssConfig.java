package com.banxue.system.config;

import java.util.Map;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.banxue.system.filter.XssFilter;
import com.google.common.collect.Maps;

@Configuration
public class XssConfig{

	/**
	 * xss过滤拦截器
	 */
	@Bean
	public FilterRegistrationBean xssFilterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new XssFilter());
		filterRegistrationBean.setOrder(1);
		filterRegistrationBean.setEnabled(false);
		filterRegistrationBean.addUrlPatterns("/*");
		Map<String, String> initParameters = Maps.newHashMap();
		initParameters.put("excludes", "/favicon.ico,/img/*,/js/*,/css/*");
		initParameters.put("isIncludeRichText", "true");
		filterRegistrationBean.setInitParameters(initParameters);
		return filterRegistrationBean;
	}
}
