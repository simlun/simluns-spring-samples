package se.simlun.springsamples.springmvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import se.simlun.springsamples.springmvc.daos.PersonDao;
import se.simlun.springsamples.springmvc.daos.mocks.PersonDaoStaticMock;

@Configuration
public class ApplicationContext {

	@Bean
	public PersonDao personDao() {
		return new PersonDaoStaticMock();
	}

}
