package se.simlun.springsamples.springmvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ResourceBundleMessageSource;

import se.simlun.springsamples.springmvc.NoOpSpringBasePackageMarker;

@Configuration
@ComponentScan(basePackageClasses = { NoOpSpringBasePackageMarker.class }, excludeFilters = @ComponentScan.Filter(Configuration.class))
@Import({ SpringMvc.class, ApplicationContext.class })
public class SpringContext {

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
		resourceBundleMessageSource.setBasename("messages");
		return resourceBundleMessageSource;
	}

}