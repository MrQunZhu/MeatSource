package com.clesun.bigdataservice.dao;

import com.clesun.bigdataservice.entity.CDeptRole;
import com.clesun.bigdataservice.entity.CDeptRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDeptRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int countByExample(CDeptRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int deleteByExample(CDeptRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int insert(CDeptRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int insertSelective(CDeptRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    List<CDeptRole> selectByExample(CDeptRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    CDeptRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExampleSelective(@Param("record") CDeptRole record, @Param("example") CDeptRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExample(@Param("record") CDeptRole record, @Param("example") CDeptRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKeySelective(CDeptRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_dept_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKey(CDeptRole record);
}