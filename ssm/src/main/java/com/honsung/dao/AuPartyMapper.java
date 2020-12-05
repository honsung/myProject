package com.honsung.dao;

import com.honsung.model.AuParty;
import com.honsung.model.AuPartyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuPartyMapper {
    int countByExample(AuPartyExample example);

    int deleteByExample(AuPartyExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuParty record);

    int insertSelective(AuParty record);

    List<AuParty> selectByExample(AuPartyExample example);

    AuParty selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuParty record, @Param("example") AuPartyExample example);

    int updateByExample(@Param("record") AuParty record, @Param("example") AuPartyExample example);

    int updateByPrimaryKeySelective(AuParty record);

    int updateByPrimaryKey(AuParty record);
}