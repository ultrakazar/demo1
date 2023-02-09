package com.example.demo.service;


import com.example.demo.entity.OrgChart;
import com.example.demo.mapper.OrgChartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2023/2/2
 * @apiNote
 */
@Service
public class OrgChartService {
    @Autowired
    private OrgChartMapper orgChartMapper;

    public List<OrgChart> selectAll() {
        return orgChartMapper.selectAll();
    }
}
