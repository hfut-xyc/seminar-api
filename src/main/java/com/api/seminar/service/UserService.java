package com.api.seminar.service;

import com.api.seminar.dao.UserMapper;
import com.api.seminar.entity.Report;
import com.api.seminar.exception.CommonException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<Report> listUserReport(Integer uid) {
        return userMapper.listUserReport(uid);
    }

    public Integer getUserReport(Integer uid, Integer rid) {
        return userMapper.getUserReport(uid, rid);
    }

    public int insertUserReport(Integer uid, Integer rid) throws CommonException {
        int res = userMapper.insertUserReport(uid, rid);
        if (res == 0) {
            throw new CommonException("收藏失败");
        }
        return res;
    }

    public int insertUserCity(Integer uid, List<Integer> cids) throws CommonException {
        int res = userMapper.insertUserCity(uid, cids);
        if (res == 0) {
            throw new CommonException("关注失败");
        }
        return res;
    }

    public int insertUserSubject(Integer uid, List<Integer> sids) throws CommonException {
        int res = userMapper.insertUserSubject(uid, sids);
        if (res == 0) {
            throw new CommonException("关注失败");
        }
        return res;
    }

    public int deleteUserReport(Integer uid, Integer rid)  throws CommonException{
        int res = userMapper.deleteUserReport(uid, rid);
        if (res == 0) {
            throw new CommonException("取消收藏失败");
        }
        return res;
    }

    public int deleteUserCity(Integer uid)  throws CommonException{
        int res = userMapper.deleteUserCity(uid);
        if (res == 0) {
            throw new CommonException("关注失败");
        }
        return res;
    }

    public int deleteUserSubject(Integer uid)  throws CommonException{
        int res = userMapper.deleteUserSubject(uid);
        if (res == 0) {
            throw new CommonException("关注失败");
        }
        return res;
    }

}
