package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Cuxiaowenwan;

public interface CuxiaowenwanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cuxiaowenwan record);

    int insertSelective(Cuxiaowenwan record);

    Cuxiaowenwan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cuxiaowenwan record);
	
    int updateByPrimaryKey(Cuxiaowenwan record);
	public Cuxiaowenwan quchongCuxiaowenwan(Map<String, Object> wenwanbianhao);
	public List<Cuxiaowenwan> getAll(Map<String, Object> map);
	public List<Cuxiaowenwan> getsycuxiaowenwan1(Map<String, Object> map);
	public List<Cuxiaowenwan> getsycuxiaowenwan3(Map<String, Object> map);
	public List<Cuxiaowenwan> getsycuxiaowenwan2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Cuxiaowenwan> getByPage(Map<String, Object> map);
	public List<Cuxiaowenwan> select(Map<String, Object> map);
//	所有List
}

