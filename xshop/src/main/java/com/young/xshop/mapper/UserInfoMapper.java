package com.young.xshop.mapper;

import com.young.xshop.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface UserInfoMapper extends Mapper<UserInfo> {

    List<UserInfo> findByName(@Param("name") String name);
}
