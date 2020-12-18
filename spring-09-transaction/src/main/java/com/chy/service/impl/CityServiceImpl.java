package com.chy.service.impl;


import com.chy.dao.City;
import com.chy.mapper.CityMapper;
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
        getSqlSession().getMapper(CityMapper.class).deleteCity(1);
        return getSqlSession().getMapper(CityMapper.class).selectAll();
    }

    @Override
    public void deleteCity(int id) {
        getSqlSession().getMapper(CityMapper.class).deleteCity(id);
    }
}
