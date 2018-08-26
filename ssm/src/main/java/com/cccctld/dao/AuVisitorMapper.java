package com.cccctld.dao;

import com.cccctld.model.AuVisitor;
import com.cccctld.model.AuVisitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuVisitorMapper {
    int countByExample(AuVisitorExample example);

    int deleteByExample(AuVisitorExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuVisitor record);

    int insertSelective(AuVisitor record);

    List<AuVisitor> selectByExample(AuVisitorExample example);

    AuVisitor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuVisitor record, @Param("example") AuVisitorExample example);

    int updateByExample(@Param("record") AuVisitor record, @Param("example") AuVisitorExample example);

    int updateByPrimaryKeySelective(AuVisitor record);

    int updateByPrimaryKey(AuVisitor record);
}