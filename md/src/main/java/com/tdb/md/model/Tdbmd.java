package com.tdb.md.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tdbmd")
@IdClass(value=TdbmdKeyId.class)
@JsonIgnoreProperties({"userId"})
public class Tdbmd {

    @Id
    @Column(name="UserId")
    private String userId;
    @Id
    @Column(name="ModuleOrder")
    private Integer moduleOrder;
    @Column(name="ModuleName")
    private String moduleName;

    public String getUserId(){ return userId; }
    public void setUserId(String val){ this.userId = val; }
    public Integer getModuleOrder(){ return moduleOrder; }
    public void setModuleOrder(Integer val){ this.moduleOrder = val; }
    public String getModuleName(){ return moduleName; }
    public void setModuleName(String val){ this.moduleName = val; }

}