package com.example.demo.mapper;


import com.example.demo.entity.OrgChart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @date 2023/2/2
 * @apiNote
 */
@Repository
@Mapper
public interface OrgChartMapper {

    List<OrgChart> selectAll();
}
