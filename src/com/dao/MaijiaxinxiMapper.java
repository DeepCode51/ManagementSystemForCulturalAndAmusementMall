package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Maijiaxinxi;

public interface MaijiaxinxiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Maijiaxinxi record);

    int insertSelective(Maijiaxinxi record);

    Maijiaxinxi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Maijiaxinxi record);
	
    int updateByPrimaryKey(Maijiaxinxi record);
	public Maijiaxinxi quchongMaijiaxinxi(Map<String, Object> maijiazhanghao);
	public List<Maijiaxinxi> getAll(Map<String, Object> map);
	public List<Maijiaxinxi> getsymaijiaxinxi1(Map<String, Object> map);
	public List<Maijiaxinxi> getsymaijiaxinxi3(Map<String, Object> map);
	public List<Maijiaxinxi> getsymaijiaxinxi2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Maijiaxinxi> getByPage(Map<String, Object> map);
	public List<Maijiaxinxi> select(Map<String, Object> map);
//	所有List
}

