package com.chy.service.impl;

import com.chy.Mapper.CityMapper;
import com.chy.dao.City;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class CityServiceImpl implements CityMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<City> selectAll() {
        return sqlSession.getMapper(CityMapper.class).selectAll();
    }
}
