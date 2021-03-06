package com.honsung.dao;

import com.honsung.model.AuUser;
import com.honsung.model.AuUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface AuUserMapper {
    int countByExample(AuUserExample example);

    int deleteByExample(AuUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuUser record);

    int insertSelective(AuUser record);

    List<AuUser> selectByExample(AuUserExample example);

    AuUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuUser record, @Param("example") AuUserExample example);

    int updateByExample(@Param("record") AuUser record, @Param("example") AuUserExample example);

    int updateByPrimaryKeySelective(AuUser record);

    int updateByPrimaryKey(AuUser record);
    
    public AuUser login(AuUser record);
}