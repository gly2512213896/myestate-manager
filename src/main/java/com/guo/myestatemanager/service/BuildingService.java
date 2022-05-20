package com.guo.myestatemanager.service;

import com.github.pagehelper.Page;
import com.guo.myestatemanager.pojo.Building;

import java.util.List;
import java.util.Map;

public interface BuildingService {

    public List<Building> findAll();

    public Page<Building> search(Map searchMap);

    public Boolean add(Building building);

    public Building findById(Integer id);

    public Boolean update(Building building);

    public Boolean del(List<Integer> ids);
}
