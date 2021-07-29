package com.api.seminar.controller;

import com.api.seminar.dto.CommonResponse;
import com.api.seminar.entity.Report;
import com.api.seminar.entity.User;
import com.api.seminar.exception.CommonException;
import com.api.seminar.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/info")
    public CommonResponse<Object> getUserInfo(Authentication authentication) {
        return CommonResponse.success("查询成功", authentication.getPrincipal());
    }

    @GetMapping("/{uid}/report/collect")
    public CommonResponse<Boolean> getUserReport(@PathVariable Integer uid, @RequestParam Integer rid) {
        Integer id = userService.getUserReport(uid, rid);
        Boolean isCollected = id != null;
        return CommonResponse.success("查询成功", isCollected);
    }

    @GetMapping("/{uid}/report/fav")
    public CommonResponse<List<Report>> listFavReport(@PathVariable Integer uid) {
        List<Report> reportList = userService.listUserReport(uid);
        return CommonResponse.success("查询成功", reportList);
    }

    @GetMapping("/{uid}/city/fav")
    public CommonResponse<List<Integer>> listFavCity(@PathVariable Integer uid) {
        List<Integer> cityList = userService.listUserCity(uid);
        return CommonResponse.success("查询成功", cityList);
    }

    @GetMapping("/{uid}/subject/fav")
    public CommonResponse<List<Integer>> listFavSubject(@PathVariable Integer uid) {
        List<Integer> subjectList = userService.listUserSubject(uid);
        return CommonResponse.success("查询成功", subjectList);
    }

    @PostMapping("/register")
    public CommonResponse register(@RequestBody User user) throws CommonException {
        int res = userService.insertUser(user);
        return CommonResponse.success("注册成功");
    }

    @PostMapping("/{uid}/report/fav")
    public CommonResponse favReport(@PathVariable Integer uid, @RequestParam Integer rid) throws CommonException {
        int res = userService.insertUserReport(uid, rid);
        return CommonResponse.success("收藏成功");
    }

    @PostMapping("/{uid}/city/fav")
    public CommonResponse favCity(@PathVariable Integer uid, @RequestParam Integer cid) throws CommonException {
        int res = userService.insertUserCity(uid, cid);
        return CommonResponse.success("关注成功");
    }

    @PostMapping("/{uid}/subject/fav")
    public CommonResponse favSubject(@PathVariable Integer uid, @RequestParam Integer sid) throws CommonException {
        int res = userService.insertUserSubject(uid, sid);
        return CommonResponse.success("关注成功");
    }

    @DeleteMapping("/{uid}/report/fav")
    public CommonResponse disfavReport(@PathVariable Integer uid, @RequestParam Integer rid) throws CommonException {
        int res = userService.deleteUserReport(uid, rid);
        return CommonResponse.success("取消收藏成功");
    }

    @DeleteMapping("/{uid}/city/fav")
    public CommonResponse disfavCity(@PathVariable Integer uid, @RequestParam Integer cid) throws CommonException {
        int res = userService.deleteUserCity(uid, cid);
        return CommonResponse.success("取消关注成功");
    }

    @DeleteMapping("/{uid}/subject/fav")
    public CommonResponse disfavSubject(@PathVariable Integer uid, @RequestParam Integer sid) throws CommonException {
        int res = userService.deleteUserSubject(uid, sid);
        return CommonResponse.success("取消关注成功");
    }
}
