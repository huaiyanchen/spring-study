package com.chy.mapper;

import com.chy.dao.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {

    List<City> selectAll();

    void deleteCity(@Param("id") int id);
}
