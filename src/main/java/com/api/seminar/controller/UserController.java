package com.api.seminar.controller;

import com.api.seminar.entity.Report;
import com.api.seminar.entity.User;
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
    public Object getUserInfo(Authentication authentication) {
        return authentication.getPrincipal();
    }

    @GetMapping("/{uid}/report/collect")
    public Boolean getUserReport(@PathVariable Integer uid, @RequestParam Integer rid) {
        Integer id = userService.getUserReport(uid, rid);
        return id != null;
    }

    @GetMapping("/{uid}/report/fav")
    public List<Report> findFavReport(@PathVariable Integer uid) {
        return userService.listUserReport(uid);
    }

    @GetMapping("/{uid}/city/fav")
    public List<Integer> findFavCity(@PathVariable Integer uid) {
        return userService.listUserCity(uid);
    }

    @GetMapping("/{uid}/subject/fav")
    public List<Integer> findFavSubject(@PathVariable Integer uid) {
        return userService.listUserSubject(uid);
    }

    @PostMapping("/register")
    public Integer register(@RequestBody User user) throws Exception {
        int res = userService.insertUser(user);
        return res;
    }

    @PostMapping("/{uid}/report/fav")
    public Integer favReport(@PathVariable Integer uid, @RequestParam Integer rid) throws Exception {
        int res = userService.insertUserReport(uid, rid);
        return res;
    }

    @PostMapping("/{uid}/city/fav")
    public Integer favCity(@PathVariable Integer uid, @RequestParam Integer cid) throws Exception {
        int res = userService.insertUserCity(uid, cid);
        return res;
    }

    @PostMapping("/{uid}/subject/fav")
    public Integer favSubject(@PathVariable Integer uid, @RequestParam Integer sid) throws Exception {
        int res = userService.insertUserSubject(uid, sid);
        return res;
    }

    @DeleteMapping("/{uid}/report/fav")
    public Integer disfavReport(@PathVariable Integer uid, @RequestParam Integer rid) throws Exception {
        int res = userService.deleteUserReport(uid, rid);
        return res;
    }

    @DeleteMapping("/{uid}/city/fav")
    public Integer disfavCity(@PathVariable Integer uid, @RequestParam Integer cid) throws Exception {
        int res = userService.deleteUserCity(uid, cid);
        return res;
    }

    @DeleteMapping("/{uid}/subject/fav")
    public Integer disfavSubject(@PathVariable Integer uid, @RequestParam Integer sid) throws Exception {
        int res = userService.deleteUserSubject(uid, sid);
        return res;
    }
}
