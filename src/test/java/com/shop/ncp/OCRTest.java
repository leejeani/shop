package com.shop.ncp;

import com.shop.util.OCRUtil;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OCRTest {

	@Value("${imglocation}")
	String imgpath;
	@Test
	void contextLoads() throws ParseException {
		String imgname = "bl02.jpg";
		String result = OCRUtil.getText(imgpath,imgname);
		System.out.println(result);

		JSONParser jsonparser = new JSONParser();
		JSONObject global = (JSONObject)jsonparser.parse(result);

		JSONArray images = (JSONArray) global.get("images");
		JSONObject jo1 = (JSONObject) images.get(0);

		JSONArray fields = (JSONArray) jo1.get("fields");
		JSONObject obj = (JSONObject) fields.get(0);
		String name = (String)obj.get("inferText");
		System.out.println(name);


		JSONObject title = (JSONObject) jo1.get("title");
		String num = (String)title.get("inferText");
		System.out.println(num);

	}

}
