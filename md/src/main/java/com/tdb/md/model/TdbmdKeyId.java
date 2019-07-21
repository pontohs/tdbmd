package com.tdb.md.model;

import java.io.Serializable;

public class TdbmdKeyId implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private Integer moduleOrder;

    public String getUserId() { return userId; }
    public void setUserId(String val){ this.userId = val; }
    public Integer getModuleOrder() { return moduleOrder; }
    public void setModuleOrder(Integer val){ this.moduleOrder = val; }
    
}