package com.cccctld.dao;

import com.cccctld.model.AuDepartment;
import com.cccctld.model.AuDepartmentExample;
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