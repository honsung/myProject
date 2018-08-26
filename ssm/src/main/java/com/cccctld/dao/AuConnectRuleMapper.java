package com.cccctld.dao;

import com.cccctld.model.AuConnectRule;
import com.cccctld.model.AuConnectRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuConnectRuleMapper {
    int countByExample(AuConnectRuleExample example);

    int deleteByExample(AuConnectRuleExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuConnectRule record);

    int insertSelective(AuConnectRule record);

    List<AuConnectRule> selectByExample(AuConnectRuleExample example);

    AuConnectRule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuConnectRule record, @Param("example") AuConnectRuleExample example);

    int updateByExample(@Param("record") AuConnectRule record, @Param("example") AuConnectRuleExample example);

    int updateByPrimaryKeySelective(AuConnectRule record);

    int updateByPrimaryKey(AuConnectRule record);
}