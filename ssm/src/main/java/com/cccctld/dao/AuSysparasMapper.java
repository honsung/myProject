package com.cccctld.dao;

import com.cccctld.model.AuSysparas;
import com.cccctld.model.AuSysparasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuSysparasMapper {
    int countByExample(AuSysparasExample example);

    int deleteByExample(AuSysparasExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuSysparas record);

    int insertSelective(AuSysparas record);

    List<AuSysparas> selectByExample(AuSysparasExample example);

    AuSysparas selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuSysparas record, @Param("example") AuSysparasExample example);

    int updateByExample(@Param("record") AuSysparas record, @Param("example") AuSysparasExample example);

    int updateByPrimaryKeySelective(AuSysparas record);

    int updateByPrimaryKey(AuSysparas record);
}