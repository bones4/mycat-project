package com.didispace.web.jdbc.mapper;

import com.didispace.web.jdbc.po.MycatPaper;

public interface MycatPaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MycatPaper record);

    int insertSelective(MycatPaper record);

    MycatPaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MycatPaper record);

    int updateByPrimaryKey(MycatPaper record);
}