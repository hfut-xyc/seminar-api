package com.api.seminar.controller;

import com.api.seminar.entity.City;
import com.api.seminar.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CityController {

    @Resource
    private CityService cityService;

    @GetMapping("/city/list")
    public List<City> findAll() {
        return cityService.listCity();
    }
}

