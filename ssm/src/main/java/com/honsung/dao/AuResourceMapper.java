package com.honsung.dao;

import com.honsung.model.AuResource;
import com.honsung.model.AuResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuResourceMapper {
    int countByExample(AuResourceExample example);

    int deleteByExample(AuResourceExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuResource record);

    int insertSelective(AuResource record);

    List<AuResource> selectByExample(AuResourceExample example);

    AuResource selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuResource record, @Param("example") AuResourceExample example);

    int updateByExample(@Param("record") AuResource record, @Param("example") AuResourceExample example);

    int updateByPrimaryKeySelective(AuResource record);

    int updateByPrimaryKey(AuResource record);
}