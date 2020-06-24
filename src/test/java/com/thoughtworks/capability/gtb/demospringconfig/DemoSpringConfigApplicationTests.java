package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest()
@TestPropertySource(properties = {"levelNumber=2"})
class DemoSpringConfigApplicationTests {

	@Autowired
	private LevelController levelController;

	@Test
	void contextLoads() {
		String result = levelController.getLevel();
		String expect = "basic";
		assertThat(result.equals(expect));
	}

}

@SpringBootTest()
@TestPropertySource(properties = {"levelNumber=1"})
class extend1 extends DemoSpringConfigApplicationTests {

	@Autowired
	private LevelController levelController;

	@Test
	void contextLoads() {
		String result = levelController.getLevel();
		String expect = "basic";
		assertThat(result.equals(expect));
	}

}

@TestPropertySource(properties = {"levelNumber=0"})
@SpringBootTest()
class extend2 extends DemoSpringConfigApplicationTests {

	@Autowired
	private LevelController levelController;

	@Test
	void contextLoads() {
		String result = levelController.getLevel();
		String expect = "advanced";
		assertThat(result.equals(expect));
	}

}