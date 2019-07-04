package com.clesun.bigdataservice.entity;

import java.util.Date;

public class CDept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_dept.dept_id
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    private Long deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_dept.parent_id
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_dept.dept_name
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    private String deptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_dept.farm_id
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    private Long farmId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_dept.create_time
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_dept.update_time
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_dept.remark
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_dept.dept_id
     *
     * @return the value of c_dept.dept_id
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_dept.dept_id
     *
     * @param deptId the value for c_dept.dept_id
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_dept.parent_id
     *
     * @return the value of c_dept.parent_id
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_dept.parent_id
     *
     * @param parentId the value for c_dept.parent_id
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_dept.dept_name
     *
     * @return the value of c_dept.dept_name
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_dept.dept_name
     *
     * @param deptName the value for c_dept.dept_name
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_dept.farm_id
     *
     * @return the value of c_dept.farm_id
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public Long getFarmId() {
        return farmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_dept.farm_id
     *
     * @param farmId the value for c_dept.farm_id
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public void setFarmId(Long farmId) {
        this.farmId = farmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_dept.create_time
     *
     * @return the value of c_dept.create_time
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_dept.create_time
     *
     * @param createTime the value for c_dept.create_time
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_dept.update_time
     *
     * @return the value of c_dept.update_time
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_dept.update_time
     *
     * @param updateTime the value for c_dept.update_time
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_dept.remark
     *
     * @return the value of c_dept.remark
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_dept.remark
     *
     * @param remark the value for c_dept.remark
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}