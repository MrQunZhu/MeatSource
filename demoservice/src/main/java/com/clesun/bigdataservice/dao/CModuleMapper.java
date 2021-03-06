package com.clesun.bigdataservice.dao;

import com.clesun.bigdataservice.entity.CModule;
import com.clesun.bigdataservice.entity.CModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int countByExample(CModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int deleteByExample(CModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int deleteByPrimaryKey(Long modId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int insert(CModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int insertSelective(CModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    List<CModule> selectByExample(CModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    CModule selectByPrimaryKey(Long modId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExampleSelective(@Param("record") CModule record, @Param("example") CModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExample(@Param("record") CModule record, @Param("example") CModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKeySelective(CModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_module
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKey(CModule record);
}