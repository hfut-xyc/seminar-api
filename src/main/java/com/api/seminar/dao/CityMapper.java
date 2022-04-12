package com.api.seminar.dao;

import com.api.seminar.entity.City;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityMapper {

    @Select("select id, name from city")
    List<City> findAll();
}
