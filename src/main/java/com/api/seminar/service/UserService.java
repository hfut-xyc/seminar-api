package com.api.seminar.service;

import com.api.seminar.dao.UserMapper;
import com.api.seminar.entity.Report;
import com.api.seminar.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userMapper.findByUsername(username);
    }

    public Integer getUserReport(Integer uid, Integer rid) {
        return userMapper.getUserReport(uid, rid);
    }

    public List<Report> listUserReport(Integer uid) {
        return userMapper.listUserReport(uid);
    }

    public List<Integer> listUserCity(Integer uid) {
        return userMapper.listUserCity(uid);
    }

    public List<Integer> listUserSubject(Integer uid) {
        return userMapper.listUserSubject(uid);
    }

    public int insertUser(User user) throws Exception {
        UserDetails temp = loadUserByUsername(user.getUsername());
        if (temp != null) {
            throw new Exception("用户名重复");
        }
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        int res = userMapper.save(user);
        if (res == 0) {
            throw new Exception("注册失败");
        }
        return res;
    }

    public int insertUserReport(Integer uid, Integer rid) throws Exception {
        int res = userMapper.insertUserReport(uid, rid);
        if (res == 0) {
            throw new Exception("收藏失败");
        }
        return res;
    }

    public int insertUserCity(Integer uid, Integer cid) throws Exception {
        int res = userMapper.insertUserCity(uid, cid);
        if (res == 0) {
            throw new Exception("关注失败");
        }
        return res;
    }

    public int insertUserSubject(Integer uid, Integer sid) throws Exception {
        int res = userMapper.insertUserSubject(uid, sid);
        if (res == 0) {
            throw new Exception("关注失败");
        }
        return res;
    }

    public int deleteUserReport(Integer uid, Integer rid)  throws Exception{
        int res = userMapper.deleteUserReport(uid, rid);
        if (res == 0) {
            throw new Exception("取消收藏失败");
        }
        return res;
    }

    public int deleteUserCity(Integer uid, Integer cid)  throws Exception{
        int res = userMapper.deleteUserCity(uid, cid);
        if (res == 0) {
            throw new Exception("取消关注失败");
        }
        return res;
    }

    public int deleteUserSubject(Integer uid, Integer sid)  throws Exception{
        int res = userMapper.deleteUserSubject(uid, sid);
        if (res == 0) {
            throw new Exception("取消关注失败");
        }
        return res;
    }
}
