package com.api.seminar.mapper;

import com.api.seminar.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {

    User getUserByUsername(String username);

    int insertUserCity(@Param("uid") Integer uid, @Param("cid") Integer cid);

    int insertUserSubject(@Param("uid") Integer uid, @Param("sid") Integer sid);

    int insertUserReport(@Param("uid") Integer uid, @Param("rid") Integer rid);


}
