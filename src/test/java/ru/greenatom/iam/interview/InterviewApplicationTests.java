package ru.greenatom.iam.interview;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InterviewApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(DigestUtils.sha256Hex("pass"));
		System.out.println(DigestUtils.sha256Hex("pass"));
		System.out.println(DigestUtils.sha256Hex("pass"));
	}

}
