package com.cccctld.dao;

import com.cccctld.model.AuCompany;
import com.cccctld.model.AuCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuCompanyMapper {
    int countByExample(AuCompanyExample example);

    int deleteByExample(AuCompanyExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuCompany record);

    int insertSelective(AuCompany record);

    List<AuCompany> selectByExample(AuCompanyExample example);

    AuCompany selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuCompany record, @Param("example") AuCompanyExample example);

    int updateByExample(@Param("record") AuCompany record, @Param("example") AuCompanyExample example);

    int updateByPrimaryKeySelective(AuCompany record);

    int updateByPrimaryKey(AuCompany record);
}