package com.honsung.dao;

import com.honsung.model.AuRole;
import com.honsung.model.AuRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuRoleMapper {
    int countByExample(AuRoleExample example);

    int deleteByExample(AuRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuRole record);

    int insertSelective(AuRole record);

    List<AuRole> selectByExample(AuRoleExample example);

    AuRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuRole record, @Param("example") AuRoleExample example);

    int updateByExample(@Param("record") AuRole record, @Param("example") AuRoleExample example);

    int updateByPrimaryKeySelective(AuRole record);

    int updateByPrimaryKey(AuRole record);
}