package com.cccctld.dao;

import com.cccctld.model.AuPartyRelation;
import com.cccctld.model.AuPartyRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuPartyRelationMapper {
    int countByExample(AuPartyRelationExample example);

    int deleteByExample(AuPartyRelationExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuPartyRelation record);

    int insertSelective(AuPartyRelation record);

    List<AuPartyRelation> selectByExample(AuPartyRelationExample example);

    AuPartyRelation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuPartyRelation record, @Param("example") AuPartyRelationExample example);

    int updateByExample(@Param("record") AuPartyRelation record, @Param("example") AuPartyRelationExample example);

    int updateByPrimaryKeySelective(AuPartyRelation record);

    int updateByPrimaryKey(AuPartyRelation record);
}