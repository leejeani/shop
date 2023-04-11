package com.shop.ncp;

import com.shop.util.ChatBotUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class ChatBotTests {

	@Test
	void contextLoads() throws IOException {
		String str = "힘들겠네";
		String result = ChatBotUtil.chat(str);
		System.out.println(result);
	}

}
