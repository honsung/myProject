package com.cccctld.dao;

import com.cccctld.model.AuPartyType;
import com.cccctld.model.AuPartyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuPartyTypeMapper {
    int countByExample(AuPartyTypeExample example);

    int deleteByExample(AuPartyTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuPartyType record);

    int insertSelective(AuPartyType record);

    List<AuPartyType> selectByExampleWithBLOBs(AuPartyTypeExample example);

    List<AuPartyType> selectByExample(AuPartyTypeExample example);

    AuPartyType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuPartyType record, @Param("example") AuPartyTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") AuPartyType record, @Param("example") AuPartyTypeExample example);

    int updateByExample(@Param("record") AuPartyType record, @Param("example") AuPartyTypeExample example);

    int updateByPrimaryKeySelective(AuPartyType record);

    int updateByPrimaryKeyWithBLOBs(AuPartyType record);

    int updateByPrimaryKey(AuPartyType record);
}