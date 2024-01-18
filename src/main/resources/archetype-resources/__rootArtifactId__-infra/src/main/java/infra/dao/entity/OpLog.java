#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infra.dao.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author dreamyao
 * @title
 * @date 2021/11/14 10:26 下午
 * @since 1.0.0
 */
@Table(value = "ntocc_oplog")
public class OpLog implements Persistable<Long>, Serializable {

    private static final long serialVersionUID = 7460187435770393679L;

    // 主键ID
    @Id
    @Column(value = "id")
    private Long id;
    // 创建时间
    @CreatedDate
    @Column(value = "gmt_create")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime gmtCreate;
    // 更新时间
    @CreatedDate @Column(value = "gmt_modified")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime gmtModified;

    @Column(value = "orgroot")
    private String orgroot;
    @Column(value = "orgcode")
    private String orgcode;
    @Column(value = "log_id")
    private String logId;
    @Column(value = "one_level")
    private Integer oneLevel;
    @Column(value = "two_level")
    private Integer twoLevel;
    @Column(value = "three_level")
    private Integer threeLevel;
    @Column(value = "operator_id")
    private String operatorId;
    @Column(value = "operator_type")
    private Integer operatorType;
    @Column(value = "operator_user_name")
    private String operatorUserName;
    @Column(value = "operator_real_name")
    private String operatorRealName;
    @Column(value = "operator_org_code")
    private String operatorOrgCode;
    @Column(value = "operator_org_name")
    private String operatorOrgName;
    @Column(value = "description")
    private String description;
    @Column(value = "waybill_id")
    private String waybillId;
    @Column(value = "waybill_no")
    private String waybillNo;
    @Column(value = "handle")
    private Integer handle = 0;

    public Integer getHandle() {
        return handle;
    }

    public void setHandle(Integer handle) {
        this.handle = handle;
    }

    public String getOrgroot() {
        return orgroot;
    }

    public void setOrgroot(String orgroot) {
        this.orgroot = orgroot;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public Integer getOneLevel() {
        return oneLevel;
    }

    public void setOneLevel(Integer oneLevel) {
        this.oneLevel = oneLevel;
    }

    public Integer getTwoLevel() {
        return twoLevel;
    }

    public void setTwoLevel(Integer twoLevel) {
        this.twoLevel = twoLevel;
    }

    public Integer getThreeLevel() {
        return threeLevel;
    }

    public void setThreeLevel(Integer threeLevel) {
        this.threeLevel = threeLevel;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public String getOperatorUserName() {
        return operatorUserName;
    }

    public void setOperatorUserName(String operatorUserName) {
        this.operatorUserName = operatorUserName;
    }

    public String getOperatorRealName() {
        return operatorRealName;
    }

    public void setOperatorRealName(String operatorRealName) {
        this.operatorRealName = operatorRealName;
    }

    public String getOperatorOrgCode() {
        return operatorOrgCode;
    }

    public void setOperatorOrgCode(String operatorOrgCode) {
        this.operatorOrgCode = operatorOrgCode;
    }

    public String getOperatorOrgName() {
        return operatorOrgName;
    }

    public void setOperatorOrgName(String operatorOrgName) {
        this.operatorOrgName = operatorOrgName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    @Nullable
    public Long getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return Objects.isNull(id);
    }

    public void setId(@Nullable Long id) {
        this.id = id;
    }

    @Nullable
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(@Nullable LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Nullable
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(@Nullable LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public int hashCode() {
        return 730724695;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + getId() + ", " +
                "orgroot = " + getOrgroot() + ", " +
                "orgcode = " + getOrgcode() + ", " +
                "logId = " + getLogId() + ", " +
                "oneLevel = " + getOneLevel() + ", " +
                "twoLevel = " + getTwoLevel() + ", " +
                "threeLevel = " + getThreeLevel() + ", " +
                "operatorId = " + getOperatorId() + ", " +
                "operatorType = " + getOperatorType() + ", " +
                "operatorUserName = " + getOperatorUserName() + ", " +
                "operatorRealName = " + getOperatorRealName() + ", " +
                "operatorOrgCode = " + getOperatorOrgCode() + ", " +
                "operatorOrgName = " + getOperatorOrgName() + ", " +
                "desc = " + getDescription() + ", " +
                "waybillId = " + getWaybillId() + ", " +
                "waybillNo = " + getWaybillNo() + ", " +
                "gmtCreate = " + getGmtCreate() + ", " +
                "gmtModified = " + getGmtModified() + ")";
    }
}