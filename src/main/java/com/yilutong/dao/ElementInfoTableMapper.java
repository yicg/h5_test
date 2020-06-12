package com.yilutong.dao;

import com.yilutong.model.ElementInfoTable;

public interface ElementInfoTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ElementInfoTable record);

    int insertSelective(ElementInfoTable record);

    ElementInfoTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ElementInfoTable record);

    int updateByPrimaryKey(ElementInfoTable record);

    ElementInfoTable selectByKey(String key);
}