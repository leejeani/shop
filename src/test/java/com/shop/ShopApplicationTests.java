package com.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootTest
class ShopApplicationTests {

	@Test
	void contextLoads() {
		int a=100;
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println(month);

		Date date = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyyMMdd");
		System.out.println(s.format(date));
	}

}
