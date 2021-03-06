package com.clesun.bigdataservice.dao;

import com.clesun.bigdataservice.entity.CDept;
import com.clesun.bigdataservice.entity.CDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int countByExample(CDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int deleteByExample(CDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int deleteByPrimaryKey(Long deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int insert(CDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int insertSelective(CDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    List<CDept> selectByExampleWithBLOBs(CDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    List<CDept> selectByExample(CDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    CDept selectByPrimaryKey(Long deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExampleSelective(@Param("record") CDept record, @Param("example") CDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") CDept record, @Param("example") CDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExample(@Param("record") CDept record, @Param("example") CDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKeySelective(CDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKey(CDept record);
}