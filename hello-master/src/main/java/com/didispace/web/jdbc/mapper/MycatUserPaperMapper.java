package com.didispace.web.jdbc.mapper;

import com.didispace.web.jdbc.po.MycatUserPaper;

public interface MycatUserPaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MycatUserPaper record);

    int insertSelective(MycatUserPaper record);

    MycatUserPaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MycatUserPaper record);

    int updateByPrimaryKey(MycatUserPaper record);
}