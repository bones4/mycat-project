package com.didispace.web.jdbc.mapper;

import com.didispace.web.jdbc.po.MycatUser;

public interface MycatUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MycatUser record);

    int insertSelective(MycatUser record);

    MycatUser selectByPrimaryKey(Integer id);

    MycatUser selectByNumber(Integer number);

    int updateByPrimaryKeySelective(MycatUser record);

    int updateByPrimaryKey(MycatUser record);
}