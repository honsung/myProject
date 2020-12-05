package com.honsung.dao;

import com.honsung.model.AuFunctree;
import com.honsung.model.AuFunctreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuFunctreeMapper {
    int countByExample(AuFunctreeExample example);

    int deleteByExample(AuFunctreeExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuFunctree record);

    int insertSelective(AuFunctree record);

    List<AuFunctree> selectByExample(AuFunctreeExample example);

    AuFunctree selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuFunctree record, @Param("example") AuFunctreeExample example);

    int updateByExample(@Param("record") AuFunctree record, @Param("example") AuFunctreeExample example);

    int updateByPrimaryKeySelective(AuFunctree record);

    int updateByPrimaryKey(AuFunctree record);
}