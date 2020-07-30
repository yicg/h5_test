package com.yilutong.model;

import java.util.Date;

public class ElementInfoTable {
    private Integer id;

    private String projectName;

    private String elementKey;

    private String elementValue;

    private String type;

    private String pageObjectDesc;

    private String elementDesc;

    private Date creatTime;

    private Date updateTime;

    private Integer sleepTime;

    @Override
    public String toString() {
        return "ElementInfoTable{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", elementKey='" + elementKey + '\'' +
                ", elementValue='" + elementValue + '\'' +
                ", type='" + type + '\'' +
                ", pageObjectDesc='" + pageObjectDesc + '\'' +
                ", elementDesc='" + elementDesc + '\'' +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", sleepTime=" + sleepTime +
                '}';
    }

    public ElementInfoTable(Integer id, String projectName, String elementKey, String elementValue, String type, String pageObjectDesc, String elementDesc, Date creatTime, Date updateTime, int sleepTime) {
        this.id = id;
        this.projectName = projectName;
        this.elementKey = elementKey;
        this.elementValue = elementValue;
        this.type = type;
        this.pageObjectDesc = pageObjectDesc;
        this.elementDesc = elementDesc;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
        this.sleepTime = sleepTime;
    }

    public ElementInfoTable() {
        super();
    }

    public Integer getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(Integer sleepTime) {
        this.sleepTime = sleepTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getElementKey() {
        return elementKey;
    }

    public void setElementKey(String elementKey) {
        this.elementKey = elementKey == null ? null : elementKey.trim();
    }

    public String getElementValue() {
        return elementValue;
    }

    public void setElementValue(String elementValue) {
        this.elementValue = elementValue == null ? null : elementValue.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPageObjectDesc() {
        return pageObjectDesc;
    }

    public void setPageObjectDesc(String pageObjectDesc) {
        this.pageObjectDesc = pageObjectDesc == null ? null : pageObjectDesc.trim();
    }

    public String getElementDesc() {
        return elementDesc;
    }

    public void setElementDesc(String elementDesc) {
        this.elementDesc = elementDesc == null ? null : elementDesc.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}