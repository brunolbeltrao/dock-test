package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.dock.test.domain.Terminal;

class DockApplicationTests {

	@Test
	void contextLoads() {
		Terminal terminal = new Terminal();
		
		Assert.assertTrue(true);
	}

}
