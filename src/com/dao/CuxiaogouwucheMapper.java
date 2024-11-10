package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Cuxiaogouwuche;

public interface CuxiaogouwucheMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cuxiaogouwuche record);

    int insertSelective(Cuxiaogouwuche record);

    Cuxiaogouwuche selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cuxiaogouwuche record);
	
    int updateByPrimaryKey(Cuxiaogouwuche record);
	public Cuxiaogouwuche quchongCuxiaogouwuche(Map<String, Object> maijiazhanghao);
	public List<Cuxiaogouwuche> getAll(Map<String, Object> map);
	public List<Cuxiaogouwuche> getsycuxiaogouwuche1(Map<String, Object> map);
	public List<Cuxiaogouwuche> getsycuxiaogouwuche3(Map<String, Object> map);
	public List<Cuxiaogouwuche> getsycuxiaogouwuche2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Cuxiaogouwuche> getByPage(Map<String, Object> map);
	public List<Cuxiaogouwuche> select(Map<String, Object> map);
//	所有List
}

