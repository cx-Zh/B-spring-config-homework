package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = {"levelNumber=2"})
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

@SpringBootTest(properties = {"levelNumber=1"})
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
@SpringBootTest(properties = {"levelNumber=0"})
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