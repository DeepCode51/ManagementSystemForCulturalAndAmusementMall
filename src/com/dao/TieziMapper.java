package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Tiezi;

public interface TieziMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tiezi record);

    int insertSelective(Tiezi record);

    Tiezi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tiezi record);
	
    int updateByPrimaryKey(Tiezi record);
	public Tiezi quchongTiezi(Map<String, Object> faburen);
	public List<Tiezi> getAll(Map<String, Object> map);
	public List<Tiezi> getsytiezi1(Map<String, Object> map);
	public List<Tiezi> getsytiezi3(Map<String, Object> map);
	public List<Tiezi> getsytiezi2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Tiezi> getByPage(Map<String, Object> map);
	public List<Tiezi> select(Map<String, Object> map);
//	所有List
}

