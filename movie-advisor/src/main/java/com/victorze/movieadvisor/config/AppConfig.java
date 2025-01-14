package com.victorze.movieadvisor.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.victorze.movieadvisor")
@PropertySource("classpath:/movieadvisor.properties")
public class AppConfig {

	@Value("${file.path}")
	public String file;

	@Value("${file.csv.separator}")
	public String separator;

	@Value("${file.csv.list_separator}")
	public String listSeparator;

	public String getFile() {
		return file;
	}

	public String getSeparator() {
		return separator;
	}

	public String getListSeparator() {
		return listSeparator;
	}

}