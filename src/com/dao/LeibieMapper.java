package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Leibie;

public interface LeibieMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Leibie record);

    int insertSelective(Leibie record);

    Leibie selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Leibie record);
	
    int updateByPrimaryKey(Leibie record);
	public Leibie quchongLeibie(Map<String, Object> wenwanleibie);
	public List<Leibie> getAll(Map<String, Object> map);
	public List<Leibie> getsyleibie1(Map<String, Object> map);
	public List<Leibie> getsyleibie3(Map<String, Object> map);
	public List<Leibie> getsyleibie2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Leibie> getByPage(Map<String, Object> map);
	public List<Leibie> select(Map<String, Object> map);
//	所有List
}

