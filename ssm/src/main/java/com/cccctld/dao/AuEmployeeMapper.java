package com.cccctld.dao;

import com.cccctld.model.AuEmployee;
import com.cccctld.model.AuEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuEmployeeMapper {
    int countByExample(AuEmployeeExample example);

    int deleteByExample(AuEmployeeExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuEmployee record);

    int insertSelective(AuEmployee record);

    List<AuEmployee> selectByExample(AuEmployeeExample example);

    AuEmployee selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuEmployee record, @Param("example") AuEmployeeExample example);

    int updateByExample(@Param("record") AuEmployee record, @Param("example") AuEmployeeExample example);

    int updateByPrimaryKeySelective(AuEmployee record);

    int updateByPrimaryKey(AuEmployee record);
    
    public List<AuEmployee> list(AuEmployeeExample example);
}