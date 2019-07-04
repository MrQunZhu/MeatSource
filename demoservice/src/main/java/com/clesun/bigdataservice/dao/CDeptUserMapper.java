package com.clesun.bigdataservice.dao;

import com.clesun.bigdataservice.entity.CDeptUser;
import com.clesun.bigdataservice.entity.CDeptUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDeptUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int countByExample(CDeptUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int deleteByExample(CDeptUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int insert(CDeptUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int insertSelective(CDeptUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    List<CDeptUser> selectByExample(CDeptUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    CDeptUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExampleSelective(@Param("record") CDeptUser record, @Param("example") CDeptUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExample(@Param("record") CDeptUser record, @Param("example") CDeptUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKeySelective(CDeptUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_user
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKey(CDeptUser record);
}