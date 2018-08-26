package com.cccctld.dao;

import com.cccctld.model.AuPosition;
import com.cccctld.model.AuPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuPositionMapper {
    int countByExample(AuPositionExample example);

    int deleteByExample(AuPositionExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuPosition record);

    int insertSelective(AuPosition record);

    List<AuPosition> selectByExample(AuPositionExample example);

    AuPosition selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuPosition record, @Param("example") AuPositionExample example);

    int updateByExample(@Param("record") AuPosition record, @Param("example") AuPositionExample example);

    int updateByPrimaryKeySelective(AuPosition record);

    int updateByPrimaryKey(AuPosition record);
}