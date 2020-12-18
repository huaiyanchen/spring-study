package com.chy.service.impl;

import com.chy.Mapper.CityMapper;
import com.chy.dao.City;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class CityServiceImpl extends SqlSessionDaoSupport implements CityMapper {

//    private SqlSessionTemplate sqlSession;
//
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }

    @Override
    public List<City> selectAll() {
        return getSqlSession().getMapper(CityMapper.class).selectAll();
    }
}
