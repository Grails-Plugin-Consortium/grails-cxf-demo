package grails.cxf.demo

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.grails.cxf.test.soap.interceptor.CustomLoggingInInterceptor
import org.grails.cxf.test.soap.interceptor.InjectedBean
import org.springframework.context.annotation.Bean

class Application extends GrailsAutoConfiguration {
	static void main(String[] args) {
		GrailsApp.run(Application, args)
	}

	@Bean
	public CustomLoggingInInterceptor customLoggingInInterceptor() {
		return new CustomLoggingInInterceptor(name: 'first')
	}

	@Bean
	public InjectedBean injectedBean() {
		return new InjectedBean(name: 'seconds')
	}
}