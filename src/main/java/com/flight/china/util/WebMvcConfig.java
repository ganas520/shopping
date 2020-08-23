package com.flight.china.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

 
	@Configuration
	public class WebMvcConfig implements WebMvcConfigurer {
	 
		@Value("${mogu.picture.upload}")
	    private String uploadUrl;	
		
	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    	registry.addResourceHandler("/infoImages/**").addResourceLocations("file:"+uploadUrl+"/");
	    }
	}
