package com.eqp.tasklogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTaskloggerApplication {

	public static void main(String[] args) {
		SpringApplication.from(TaskloggerApplication::main).with(TestTaskloggerApplication.class).run(args);
	}

}
