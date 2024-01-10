package com.example.accessingdatamysql;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AccessingDataMysqlApplicationTests {

	@Autowired
	private UserRepository r;
	@Test
	void contextLoads() {
	}

	@Test
	void testAdd() {
		User u = new User();
		u.setName("John");
		u.setEmail("john@aol.com");
		r.save(u);
		Assertions.assertThat(u.getId()).isGreaterThan(0);
	}

}
