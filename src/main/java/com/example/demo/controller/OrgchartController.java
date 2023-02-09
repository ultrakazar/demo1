package com.example.demo.controller;


import com.example.demo.entity.OrgChart;
import com.example.demo.service.OrgChartService;
import jakarta.xml.ws.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @date 2023/2/2
 * @apiNote
 */
@Controller
@RequestMapping("")
public class OrgchartController {
    @Autowired
    private OrgChartService orgChartService;

    @GetMapping("/orgchart")
    public String hello() {
        return "orgchart";
    }

    @RequestMapping(value = "/getData")
    @ResponseBody
    public List<OrgChart> selectAll() {
        return orgChartService.selectAll();
    }
}
