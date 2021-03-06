package com.api.seminar.dao;

import com.api.seminar.entity.Report;
import com.api.seminar.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {

    User findByUsername(String username);

    Integer getUserReport(@Param("uid") Integer uid, @Param("rid") Integer rid);

    List<Report> listUserReport(@Param("uid") Integer uid);

    List<Integer> listUserCity(@Param("uid") Integer uid);

    List<Integer> listUserSubject(@Param("uid") Integer uid);

    int save(User user);

    int insertUserReport(@Param("uid") Integer uid, @Param("rid") Integer rid);

    int insertUserCity(@Param("uid") Integer uid, @Param("cid") Integer cid);

    int insertUserSubject(@Param("uid") Integer uid, @Param("sid") Integer sid);

    int deleteUserReport(@Param("uid") Integer uid, @Param("rid") Integer rid);

    int deleteUserCity(@Param("uid") Integer uid, @Param("cid") Integer cid);

    int deleteUserSubject(@Param("uid") Integer uid, @Param("sid") Integer sid);
}
