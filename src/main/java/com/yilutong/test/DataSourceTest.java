package com.yilutong.test;

import com.yilutong.config.DataSourceConfig;
import com.yilutong.dao.ElementInfoTableMapper;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

/**
 * @Author: yicg
 * @Date: 2020/6/9 18:33
 * @Version 1.0
 */
public class DataSourceTest {
    SqlSession sqlSession;
    ElementInfoTableMapper elementInfoTableMapper;

    @Test
    public void dataDemo(){
        sqlSession=DataSourceConfig.getSqlSession("databaseConfig.xml");
        elementInfoTableMapper=sqlSession.getMapper(ElementInfoTableMapper.class);
        System.out.println(elementInfoTableMapper.selectByPrimaryKey(1));
    }
}
