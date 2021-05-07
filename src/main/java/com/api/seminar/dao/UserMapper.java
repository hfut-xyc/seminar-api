package com.api.seminar.dao;

import com.api.seminar.entity.Report;
import com.api.seminar.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {

    User getUserByUsername(String username);

    List<Report> listUserReport(@Param("uid") Integer uid);

    Integer getUserReport(@Param("uid") Integer uid, @Param("rid") Integer rid);

    List<Integer> listUserCity(@Param("uid") Integer uid);

    List<Integer> listUserSubject(@Param("uid") Integer uid);

    int insertUserReport(@Param("uid") Integer uid, @Param("rid") Integer rid);

    int insertUserCity(@Param("uid") Integer uid, @Param("cid") List<Integer> cids);

    int insertUserSubject(@Param("uid") Integer uid, @Param("sid") List<Integer> sids);

    int deleteUserReport(@Param("uid") Integer uid, @Param("rid") Integer rid);

    int deleteUserCity(@Param("uid") Integer uid);

    int deleteUserSubject(@Param("uid") Integer uid);
}
