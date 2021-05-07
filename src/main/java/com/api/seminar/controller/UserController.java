package com.api.seminar.controller;

import com.api.seminar.dto.CommonResponse;
import com.api.seminar.entity.Report;
import com.api.seminar.exception.CommonException;
import com.api.seminar.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("user/{uid}/report/fav")
    public CommonResponse<List<Report>> listFavReport(@PathVariable Integer uid) {
        List<Report> reportList = userService.listUserReport(uid);
        return CommonResponse.success("查询成功", reportList);
    }

    @PostMapping("/user/{uid}/report/fav")
    public CommonResponse favReport(@PathVariable Integer uid, @RequestParam Integer rid) throws CommonException {
        int res = userService.insertUserReport(uid, rid);
        return CommonResponse.success("收藏成功");
    }

    @DeleteMapping("/user/{uid}/report/fav")
    public CommonResponse disfavReport(@PathVariable Integer uid, @RequestParam Integer rid) throws CommonException {
        int res = userService.deleteUserReport(uid, rid);
        return CommonResponse.success("取消收藏成功");
    }

}
