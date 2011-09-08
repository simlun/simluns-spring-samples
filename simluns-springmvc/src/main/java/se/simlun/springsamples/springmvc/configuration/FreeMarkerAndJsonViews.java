package se.simlun.springsamples.springmvc.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

@Configuration
public class FreeMarkerAndJsonViews {

	@Bean
	public ContentNegotiatingViewResolver viewResolver() {
		ContentNegotiatingViewResolver contentNegotiatingViewResolver = new ContentNegotiatingViewResolver();

		Map<String, String> mediaTypes = new HashMap<String, String>();
		mediaTypes.put("html", "text/html");
		mediaTypes.put("json", "application/json");
		contentNegotiatingViewResolver.setMediaTypes(mediaTypes);

		List<ViewResolver> viewResolvers = new ArrayList<ViewResolver>();
		viewResolvers.add(createFreeMarkerViewResolver());
		contentNegotiatingViewResolver.setViewResolvers(viewResolvers);

		List<View> defaultViews = new ArrayList<View>();
		defaultViews.add(new MappingJacksonJsonView());
		contentNegotiatingViewResolver.setDefaultViews(defaultViews);

		return contentNegotiatingViewResolver;
	}

	private ViewResolver createFreeMarkerViewResolver() {
		FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
		freeMarkerViewResolver.setPrefix("");
		freeMarkerViewResolver.setSuffix(".ftl");
		return freeMarkerViewResolver;
	}

	@Bean
	public FreeMarkerConfigurer freeMarkerConfigurer() {
		FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
		freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/freemarker/");
		freeMarkerConfigurer.setDefaultEncoding("UTF-8");
		return freeMarkerConfigurer;
	}
}
