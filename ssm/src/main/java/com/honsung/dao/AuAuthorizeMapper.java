package com.honsung.dao;

import com.honsung.model.AuAuthorize;
import com.honsung.model.AuAuthorizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuAuthorizeMapper {
    int countByExample(AuAuthorizeExample example);

    int deleteByExample(AuAuthorizeExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuAuthorize record);

    int insertSelective(AuAuthorize record);

    List<AuAuthorize> selectByExample(AuAuthorizeExample example);

    AuAuthorize selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuAuthorize record, @Param("example") AuAuthorizeExample example);

    int updateByExample(@Param("record") AuAuthorize record, @Param("example") AuAuthorizeExample example);

    int updateByPrimaryKeySelective(AuAuthorize record);

    int updateByPrimaryKey(AuAuthorize record);
}