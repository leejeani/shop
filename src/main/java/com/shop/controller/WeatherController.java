package com.shop.controller;

import com.shop.dto.CustDTO;
import com.shop.service.CustService;
import com.shop.util.WeatherUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class WeatherController {

    @RequestMapping("/wt")
    public String wt(Model model){
        model.addAttribute("center","wt");
        return "main";
    }

    @RequestMapping("/wtimpl")
    public String wtimpl(Model model, String loc) throws Exception {
        String result = WeatherUtil.getWeatherInfo(loc);
        model.addAttribute("result",result);
        model.addAttribute("center","wt");
        return "main";
    }

}
