/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity.tables.records;


import com.luzhiqing.bamboo.constants.enums.ExpressCompanyType;
import com.luzhiqing.bamboo.constants.enums.OrderType;
import com.luzhiqing.bamboo.entity.tables.TExpressOrder;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExpressOrderRecord extends UpdatableRecordImpl<TExpressOrderRecord> {

    private static final long serialVersionUID = 886864800;

    /**
     * Setter for <code>dev.t_express_order.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dev.t_express_order.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dev.t_express_order.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>dev.t_express_order.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>dev.t_express_order.express_number</code>.
     */
    public void setExpressNumber(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dev.t_express_order.express_number</code>.
     */
    public String getExpressNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dev.t_express_order.express_company_name</code>.
     */
    public void setExpressCompanyName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>dev.t_express_order.express_company_name</code>.
     */
    public String getExpressCompanyName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dev.t_express_order.express_company</code>.
     */
    public void setExpressCompany(ExpressCompanyType value) {
        set(4, value);
    }

    /**
     * Getter for <code>dev.t_express_order.express_company</code>.
     */
    public ExpressCompanyType getExpressCompany() {
        return (ExpressCompanyType) get(4);
    }

    /**
     * Setter for <code>dev.t_express_order.phone</code>.
     */
    public void setPhone(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>dev.t_express_order.phone</code>.
     */
    public String getPhone() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dev.t_express_order.address</code>.
     */
    public void setAddress(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>dev.t_express_order.address</code>.
     */
    public String getAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dev.t_express_order.student_name</code>.
     */
    public void setStudentName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>dev.t_express_order.student_name</code>.
     */
    public String getStudentName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dev.t_express_order.access_day</code>.
     */
    public void setAccessDay(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>dev.t_express_order.access_day</code>.
     */
    public LocalDateTime getAccessDay() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>dev.t_express_order.access_number</code>.
     */
    public void setAccessNumber(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>dev.t_express_order.access_number</code>.
     */
    public String getAccessNumber() {
        return (String) get(9);
    }

    /**
     * Setter for <code>dev.t_express_order.order_type</code>.
     */
    public void setOrderType(OrderType value) {
        set(10, value);
    }

    /**
     * Getter for <code>dev.t_express_order.order_type</code>.
     */
    public OrderType getOrderType() {
        return (OrderType) get(10);
    }

    /**
     * Setter for <code>dev.t_express_order.order_type_name</code>.
     */
    public void setOrderTypeName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>dev.t_express_order.order_type_name</code>.
     */
    public String getOrderTypeName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>dev.t_express_order.remark</code>.
     */
    public void setRemark(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>dev.t_express_order.remark</code>.
     */
    public String getRemark() {
        return (String) get(12);
    }

    /**
     * Setter for <code>dev.t_express_order.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>dev.t_express_order.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>dev.t_express_order.create_user</code>.
     */
    public void setCreateUser(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>dev.t_express_order.create_user</code>.
     */
    public Integer getCreateUser() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>dev.t_express_order.create_user_name</code>.
     */
    public void setCreateUserName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>dev.t_express_order.create_user_name</code>.
     */
    public String getCreateUserName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>dev.t_express_order.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>dev.t_express_order.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>dev.t_express_order.update_user</code>.
     */
    public void setUpdateUser(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>dev.t_express_order.update_user</code>.
     */
    public Integer getUpdateUser() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>dev.t_express_order.update_user_name</code>.
     */
    public void setUpdateUserName(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>dev.t_express_order.update_user_name</code>.
     */
    public String getUpdateUserName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>dev.t_express_order.delete_time</code>.
     */
    public void setDeleteTime(LocalDateTime value) {
        set(19, value);
    }

    /**
     * Getter for <code>dev.t_express_order.delete_time</code>.
     */
    public LocalDateTime getDeleteTime() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>dev.t_express_order.delete_user</code>.
     */
    public void setDeleteUser(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>dev.t_express_order.delete_user</code>.
     */
    public Integer getDeleteUser() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>dev.t_express_order.delete_user_name</code>.
     */
    public void setDeleteUserName(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>dev.t_express_order.delete_user_name</code>.
     */
    public String getDeleteUserName() {
        return (String) get(21);
    }

    /**
     * Setter for <code>dev.t_express_order.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(22, value);
    }

    /**
     * Getter for <code>dev.t_express_order.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(22);
    }

    /**
     * Setter for <code>dev.t_express_order.data_version</code>.
     */
    public void setDataVersion(LocalDateTime value) {
        set(23, value);
    }

    /**
     * Getter for <code>dev.t_express_order.data_version</code>.
     */
    public LocalDateTime getDataVersion() {
        return (LocalDateTime) get(23);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TExpressOrderRecord
     */
    public TExpressOrderRecord() {
        super(TExpressOrder.T_EXPRESS_ORDER);
    }

    /**
     * Create a detached, initialised TExpressOrderRecord
     */
    public TExpressOrderRecord(Integer id, Integer userId, String expressNumber, String expressCompanyName, ExpressCompanyType expressCompany, String phone, String address, String studentName, LocalDateTime accessDay, String accessNumber, OrderType orderType, String orderTypeName, String remark, LocalDateTime createTime, Integer createUser, String createUserName, LocalDateTime updateTime, Integer updateUser, String updateUserName, LocalDateTime deleteTime, Integer deleteUser, String deleteUserName, Byte enabled, LocalDateTime dataVersion) {
        super(TExpressOrder.T_EXPRESS_ORDER);

        set(0, id);
        set(1, userId);
        set(2, expressNumber);
        set(3, expressCompanyName);
        set(4, expressCompany);
        set(5, phone);
        set(6, address);
        set(7, studentName);
        set(8, accessDay);
        set(9, accessNumber);
        set(10, orderType);
        set(11, orderTypeName);
        set(12, remark);
        set(13, createTime);
        set(14, createUser);
        set(15, createUserName);
        set(16, updateTime);
        set(17, updateUser);
        set(18, updateUserName);
        set(19, deleteTime);
        set(20, deleteUser);
        set(21, deleteUserName);
        set(22, enabled);
        set(23, dataVersion);
    }
}
