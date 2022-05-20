package com.guo.myestatemanager.dao;

import com.guo.myestatemanager.pojo.Building;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface BuildingMapper extends Mapper<Building> {
}
