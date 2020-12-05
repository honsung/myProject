package com.honsung.dao;

import com.honsung.model.AuPartyRelationType;
import com.honsung.model.AuPartyRelationTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuPartyRelationTypeMapper {
    int countByExample(AuPartyRelationTypeExample example);

    int deleteByExample(AuPartyRelationTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuPartyRelationType record);

    int insertSelective(AuPartyRelationType record);

    List<AuPartyRelationType> selectByExample(AuPartyRelationTypeExample example);

    AuPartyRelationType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuPartyRelationType record, @Param("example") AuPartyRelationTypeExample example);

    int updateByExample(@Param("record") AuPartyRelationType record, @Param("example") AuPartyRelationTypeExample example);

    int updateByPrimaryKeySelective(AuPartyRelationType record);

    int updateByPrimaryKey(AuPartyRelationType record);
}