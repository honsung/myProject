package com.honsung.dao;

import com.honsung.model.AuDepartment;
import com.honsung.model.AuDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuDepartmentMapper {
    int countByExample(AuDepartmentExample example);

    int deleteByExample(AuDepartmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuDepartment record);

    int insertSelective(AuDepartment record);

    List<AuDepartment> selectByExample(AuDepartmentExample example);

    AuDepartment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuDepartment record, @Param("example") AuDepartmentExample example);

    int updateByExample(@Param("record") AuDepartment record, @Param("example") AuDepartmentExample example);

    int updateByPrimaryKeySelective(AuDepartment record);

    int updateByPrimaryKey(AuDepartment record);
}