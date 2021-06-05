package com.example.demo;

import com.example.demo.model.Mcase;
import com.example.demo.repository.McaseRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	McaseRepository mcaseRepository;

	@Test
	void contextLoads() {

		Mcase mcase = Mcase.builder().build();
		mcase = mcaseRepository.save(mcase);
		mcase.setName("test");
		mcase = mcaseRepository.save(mcase);

	    return;

	}


}
