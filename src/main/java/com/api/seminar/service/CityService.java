package com.api.seminar.service;

import com.api.seminar.dao.CityMapper;
import com.api.seminar.entity.City;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityService {

    @Resource
    private CityMapper cityMapper;

    public List<City> listCity() {
        return cityMapper.findAll();
    }
}
